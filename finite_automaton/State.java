public class State {

	protected String name;
	protected boolean isFinal;

/**
   * Constructor.
*/
	State(String name) {
		this.name = name;

	public String getName() {
		return name;
	}

	public String setName(String name) {
		this.name = name;
	}

	public boolean getIsFinal() {
		return isFinal;
	}

	public boolean setIsFinal(String name) {
		this.isFinal = isFinal;
	}
}
