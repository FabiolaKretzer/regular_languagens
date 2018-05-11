package finite_automaton;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class State {

	protected String name;
	protected boolean isFinal;
        protected Map<Character, ArrayList<State>> transition;
        
/**
   * Constructor.
*/
	State(String name, boolean isFinal) {
                this.transition = new HashMap<>();
		this.name = name;
                this.isFinal = isFinal;
        }
        
        public void setNewTransition(char c, ArrayList<State> list) {
            transition.put(c, list);
        }
        
        public ArrayList<State> getListStates(char c) {
            return transition.get(c);
        }
        
	public String getName() {
            return name;
	}

	public void setName(String name) {
            this.name = name;
	}

	public boolean getIsFinal() {
            return isFinal;
	}

	public void setIsFinal(String name) {
            this.isFinal = isFinal;
	}
}
