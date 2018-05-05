import RegularExpression.java;

public class RE_Algorithms{

/**
   * Constructor.
*/
	RE_Algorithms() {}

/**
   * Convert the regular expression into a finite automaton
   * @return finite automaton equivalent
*/
	public FiniteAutomaton DeSimone(RegularExpression r) {

	}

/**
   * Used in intersection() and difference()
   * @return Regular expression resulting from the union
*/
	public RegularExpression union(RegularExpression ra, RegularExpression rb) {
	
	}

/**
   * Used in intersection() and difference()
   * @return Regular expression resulting from the complement
*/
	public RegularExpression complement(RegularExpression ra) {

	}

/**
   * @return Regular expression resulting from the intersection
*/
	public RegularExpression intersection(RegularExpression ra, RegularExpression rb) {
		return complement(union(complement(ra), complement(rb)));
	}

/**
   * @return Regular expression resulting from the difference
*/
	public RegularExpression difference(RegularExpression ra, RegularExpression rb) {
		return intersection(ra, complement(rb));
	}

/**
   * @return Regular expression resulting from the reverse
*/
	public RegularExpression reverse(RegularExpression ra) {

	}

}
