package entities;

public abstract class Convert {
	
	private String symbol;
	private Double value;
	private String type;
	private String message;
	
	public Convert() {
	}


	public Convert(String symbol, Double value, String type, String message) {
		this.symbol = symbol;
		this.value = value;
		this.type = type;
		this.message = message;
	}

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
	
	
	public void setType(String type) {
		this.type = type;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public abstract String getType();

	public abstract String getMessage();

	public abstract Object[] getOption();
	
	public abstract double convertTypes(Object obj, double value);
	
	public abstract String toString();
	
}
