import java.util.HashMap;
import java.util.Map;

public class Transition{

	Map<State, char, State> transition;

/**
   * Constructor.
*/
	Transition(){
		this.transition = new HashMap<State, char, State>();
	}
