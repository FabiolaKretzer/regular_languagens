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
		initialSymbol = f.initial;
		for (int i = 0; i < length(f.transition); i++) {

		}

		return;
	}

/**
   * @return Is deterministic?
*/
	public boolean isDeterministic(FiniteAutomaton f) {
		return false;
	}

/**
   * @return finite automaton deterministic
*/
	public FiniteAutomaton determinize(FiniteAutomaton f) {
		if (isDetreministic(f))
			return;

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
		FiniteAutomaton automaton == new FiniteAutomaton(); 
		automaton.initial = new State("new", false);
		automaton.states.add(automaton..initial);
		automaton.name = "";
		ta = new Transition(initial, &, fa.initial);
		tb = new Transition(initial, &, fb.initial);
		automaton.transitions.add(ta);
		automaton.transitions.add(tb);
		automaton.alphabeth.addAll(fa.alphabet);
		automaton.alphabet.addAll(fb.alphabet);
		automaton.transitions.addAll(fa.transitions);
		automaton.transitions.addAll(fb.transitions);
		automaton.states.addAll(fa.states);
		automaton.states.addAll(fb.states);
		automaton.last.addAll(fa.last);
		automaton.last.addAll(fb.last);
		return automaton;
	}

/**
   * Used in intersection() and difference()
   * @return Finite Automaton resulting from the complement
*/
	public FiniteAutomaton complement(FiniteAutomaton fa) {
		FiniteAutomaton automaton == new FiniteAutomaton(); 
		automaton.initial = fa.initial;
		automaton.name = "";
		automaton.alphabet.addAll(fa.alphabet);
		automaton.transitions.addAll(fa.transitions);

		for (State s : fa.states) {
			automaton.states.add(s);
			if(getIsFinal()) {
				s.setIsFinal(!getIsFinal());
				automaton.last.remove(s);
			else {
				s.setIsFinal(!getIsFinal());
				automaton.last.add(s);
			} 
		}
			
		return automaton;
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
		FiniteAutomaton automaton = new FiniteAutomaton();
		automaton.initial = new State("new", true);
		automaton.states.add(automaton.initial);
		automaton.alphabet.addAll(fa.alphabet);
		for(State f : fa.finals) {
			if (fa.initial.getIsFinal()) { 	
				f.isFinal = true;
			} else {
				f.isFinal = false;
			}
			ta = new Transition(initial, &, fa.f);
			automaton.transitions.add(ta);
			automaton.states.add(f);
		}
		for(State s : fa.states) {
			if (!automaton.states.contains(f)) {
				automaton.satates.add(s);
			}
		}
		for(Transition (qa, s, qb) : fa.transitions){
			ta = new Transition (qb, s, qa);
			automaton.transitions.add(ta);
		}
		return automaton;
	}
}
