import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	public RegularGrammar onRegularGrammar(FiniteAutomaton f) {
		RegularGrammar grammar = new RegularGrammar();
		grammar.initialSymbol = f.initial;		
		for (Transition (qa, symbol, qb) : f.transitions) {
			t = new Production(qa, symbol + qb);
			grammar.production.add(t);
			if(qb.getIsFinal()) {
				t = new Transitions(qa, symbol);
				grammar.production.add(t);
			}
		}
		return grammar;
	}

/**
   * @return Is deterministic?
*/
	public boolean isDeterministic(FiniteAutomaton f) {
		for(State s : fa.states) {
			for(char letter : fa.alphabeth) {
				if(length(fa.transitions(s, letter, _)) > 1) {
					return false;
				}
			}
		}
		return true;
	}

/**
   * @return finite automaton deterministic
*/
	public FiniteAutomaton determinize(FiniteAutomaton f) {
		if (isDetreministic(f))
			return;
		ArrayList<State> det_state = new ArrayList();
		ArrayList<Transition> help = new ArrayList();
		while (length(state) != length(f.transition.key())){
			for(State s : f.states) [
				det_state.add(s);
				for(Transition (qa, symbol, qb) : f.transitions) {
					if (qa == s) {
						help.add((qa, symbol, qb));
					}
				}
			}
			
		}

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
	public FiniteAutomaton complement(FiniteAutomaton f) {
		FiniteAutomaton automaton == new FiniteAutomaton(); 
		automaton.initial = f.initial;
		automaton.name = "";
		automaton.alphabet.addAll(f.alphabet);
		automaton.transitions.addAll(f.transitions);

		for (State s : f.states) {
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
	public FiniteAutomaton reverse(FiniteAutomaton f) {
		FiniteAutomaton automaton = new FiniteAutomaton();
		automaton.initial = new State("new", true);
		automaton.states.add(automaton.initial);
		automaton.alphabet.addAll(f.alphabet);
		for(State end : f.finals) {
			if (f.initial.getIsFinal()) { 	
				end.isFinal = true;
			} else {
				end.isFinal = false;
			}
			ta = new Transition(initial, &, f.end);
			automaton.transitions.add(ta);
			automaton.states.add(fend);
		}
		for(State s : fa.states) {
			if (!automaton.states.contains(s)) {
				automaton.satates.add(s);
			}
		}
		for(Transition (qa, s, qb) : fa.transitions){
			ta = new Transition (qb, s, qa);
			automaton.transitions.add(ta);
		}
		return automaton;
	}

/**
   * @return Finite Automaton to recognize sentence?
*/
	public boolean recognize(FiniteAutomaton f, String sentence) {
		boolean r = false;
		char [] letter = sentence.toCharArray();
		current_state = f.initial;
		for(char l : letter) {
			for(Transition (qa, symbol, qb) : fa.transitions){
				if(qa == current_state && symbol == l) {
					current_state = qb;
				}
			}
		}
		if(current_state.getIsFinal()) {
			r = true;
		}
		return r;
	}

/**
   * @return Finite Automaton to recognize sentence in size?
*/
	public int enumeration(FiniteAutomaton fa, String sentence) {
		int size = null;
		if (recognize(f, sentence)){
			char [] letter = sentence.toCharArray();
			letter.length();
		}
	}
}
