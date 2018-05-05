import Finiteautomaton.java

public class FA_algorithms {

/**
   * Constructor.
*/
	FA_algorithms() {}

/**
   * Convert the finite automaton into a grammar
   * @return regular grammar equivalent
*/
	public Grammar onRegularGrammar(FiniteAutomaton f) {

	}

/**
   * @return Is deterministic?
*/
	public boolean isDeterministic(FiniteAutomaton f) {

	}

/**
   * @return finite automaton deterministic
*/
	public FiniteAutomaton determinize(FiniteAutomaton f) {

	}

/**
   * @return finite automaton minimum
*/
	public FiniteAutomaton minimize(FiniteAutomaton f) {
		if (!isdeterministic(f))
			determinize(f)
		remove_unreachable(f)
		remove_dead(f)
		equivalent_state(f)
	}

/**
   * @return finite automaton without unreachable states
*/
	public FiniteAutomaton remove_unreachable(FiniteAutomaton f) {

	}

/**
   * @return finite automaton without dead states
*/
	public FiniteAutomaton remove_dead(FiniteAutomaton f) {

	}

/**
   * @return finite automaton withot equivalent states
*/
	public FiniteAutomaton equivalent_state(FiniteAutomaton f) {

	}
/**
   * Used in intersection() and difference()
   * @return Finite automaton resulting from the union
*/
	public FiniteAutomaton union(FiniteAutomaton fa, FiniteAutomaton fb) {
	
	}

/**
   * Used in intersection() and difference()
   * @return Finite Automaton resulting from the complement
*/
	public FiniteAutomaton complement(FiniteAutomaton fa) {

	}

/**
   * @return Finite Automaton resulting from the intersection
*/
	public FiniteAutomaton intersection(FiniteAutomaton fa, FiniteAutomaton fb) {
		return complement(union(complement(fa), complement(fb)));
	}

/**
   * @return Finite Automaton resulting from the difference
*/
	public FiniteAutomaton difference(FiniteAutomaton fa, FiniteAutomaton fb) {
		return intersection(fa, complement(fb));
	}

/**
   * @return Finite Automaton resulting from the reverse
*/
	public FiniteAutomaton reverse(FiniteAutomaton fa) {

	}
}
