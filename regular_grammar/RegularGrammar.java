public class RegularGrammar{

	protected char initialSymbol;
	protected ArrayList<Production> productions;

/**
   * Constructor.
*/
	RegularGrammar(char initialSymbol, ArrayList<Production> productions) {
		this.initialSymbol = initialSymbol;
		this.productions = productions;
	}
}
