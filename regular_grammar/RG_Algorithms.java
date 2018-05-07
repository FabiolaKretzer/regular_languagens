import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Grammar.java;

public class RG_Algorithms{

/**
   * Constructor.
*/
	RG_Algorithms() {}

/**
   * Convert the grammar into a finite automaton
   * @return finite automaton equivalent
*/
	public FiniteAutomaton onFiniteautomaton(RegularGrammar g) {
		FiniteAutomaton automaton = new FiniteAutomaton();
		automaton.initial = g.initialSymbol;
		for(Production (st, sl) : g.productions) {
			if(automaton.states.contains(st)) {
				automaton.states.add(st){
			}
			char [] letter = sl.toCharArray();
			automato.alphabet.add(letter[0]);
			if(length(letter) == 1) {
				automaton.last.add(st);
				st.getIsFinal();
			} else {
				automaton.states.add(letter[1]);
				t = new Transition(st, letter[0], letter[1]);
				automaton.transitions.add(t);
			}
			if(Production(st, sl) == Production(initialSymbol, '&')) [
				automaton.last.add(st);
				st.getIsFinal();
			}
		}
	}


/**
   * @return Regular grammar resulting from the union
*/
	public RegularGrammar union(RegularGrammar ga, RegularGrammar gb) {
		
	}

/**
   * @return Regular grammar resulting from the concatenation
*/
	public RegularGrammar concatenation(RegularGrammar ga, RegularGrammar gb) {

	}

/**
   * @return Regular grammar resulting from the closure
*/
	public RegularGrammar closure(RegularGrammar ga) {

	}

/**
   * Used in intersection() and difference()
   * @return Regular grammar resulting from the complement
*/
	public RegularGrammar complement(RegularGrammar ga) {

	}

/**
   * @return Regular grammar resulting from the intersection
*/
	public RegularGrammar intersection(RegularGrammar ga, RegularGrammar gb) {
		return complement(union(complement(ga), complement(gb)));
	}

/**
   * @return Regular grammar resulting from the difference
*/
	public RegularGrammar difference(RegularGrammar ga, RegularGrammar gb) {
		return intersection(ga, complement(gb));
	}

/**
   * @return Regular grammar resulting from the reverse
*/
	public RegularGrammar reverse(RegularGrammar ga) {

	}
}
