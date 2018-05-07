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
