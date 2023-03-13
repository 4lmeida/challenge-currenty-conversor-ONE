package entities;

public class Convert implements ConvertType {
	
	private String symbol;
	private Double value;
	private String type;
	private String message;
	private Object[] option;
	private Object[] converters;
	
	public Convert() {
		this.converters = new Object[] { "Conversor de Moeda", "Conversor de temperatura" };
		this.message = "Escolha uma Opção";
		this.type = "Menu";
	}


	public Convert(String symbol, Double value) {
		this.symbol = symbol;
		this.value = value;
	}
	
	

	public void setOption(Object[] option) {
		this.option = option;
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
	

	public Object[] getConverters() {
		return converters;
	}
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Object[] getOption() {
		return option;
	}


	public void setConverters(Object[] converters) {
		this.converters = converters;
	}


	@Override
	public double convertTypes(Object obj, double value) {
		// TODO Auto-generated method stub
		return 0;
	}




	
	
}
