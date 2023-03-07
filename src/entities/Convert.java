package entities;

public abstract class Convert {
	
	private String symbol;
	private Double value;
	protected Object[] option;
	
	public Convert() {
	}


	public Convert(String symbol, Double value) {
		this.symbol = symbol;
		this.value = value;
	}
	
	public static Object[] items = { "Conversor de Moeda", "Conversor de temperatura" };

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public abstract String getType();

	public abstract String getMessage();

	public abstract Object[] getOption();
	
	public abstract double convertTypes(Object obj, double value);
	
	public abstract String toString();
	
}
