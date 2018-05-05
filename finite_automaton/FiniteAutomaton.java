import java.util.ArrayList;

public class FiniteAutomaton{

	protected ArrayList<State> states;
	protected ArrayList<char> alphabet;
	protected ArrayList<Transition> transitions;
	protected State initial;
	protected ArrayList<State> last;
	public String name = "";

/**
   * Constructor.
*/
	FiniteAutomaton(ArrayList<State> states, ArrayList<char> alphabet, ArrayList<Transition> transitions, State initial, ArrayList<State> last) {
		this.states = states;
		this.alphabet = alphabet;
		this.transitions = transitions
		this.initial = initial;
		this.last = last;
	}
}
