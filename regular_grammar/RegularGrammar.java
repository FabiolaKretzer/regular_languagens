import java.util.ArrayList;

public class RegularGrammar{

	protected char initialSymbol;
	protected ArrayList<Production> productions;
	protected char noTerminal;
	protected char terminal;

/**
   * Constructor.
*/
	RegularGrammar(char initialSymbol, ArrayList<Production> productions, char noTerminal, char terminal) {
		this.initialSymbol = initialSymbol;
		this.productions = productions;
		this.noTerminal = noTerminal;
		this.terminal = terminal;
	}
}
