package entities;

public class Currency {

	private String symbol;
	private Double value;
	
	private Object[] option = { "De Reais a Dólares", "De Reais a Euros", "De Reias a Libras",
			"De Reais a Peso Chileno", "De Reais a Peso Argentino", "De Dólares a Reais", "De Euros a Reis",
			"De Libras a Reais", "De Peso Chileno a Reais", "De Peso Argentino a Reias" };

	public Currency() {
	}

	public Currency(String symbol, Double value) {
		this.symbol = symbol;
		this.value = value;
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
	

	public Object[] getOption() {
		return option;
	}

	public void setOption(Object[] option) {
		this.option = option;
	}

	public double currencyConverter(Object obj, double quantity) {


		switch (obj.toString()) {
		case "De Reais a Dólares":
			value = quantity * 0.19;
			symbol = "US$";
			break;
		case "De Reais a Euros":
			value = quantity * 0.18;
			symbol = "€";
			break;
		case "De Reias a Libras":
			value = quantity * 0.16;
			symbol = "£";
			break;
		case "De Reais a Peso Chileno":
			value = quantity * 160.47;
			symbol = "$";
			break;
		case "De Reais a Peso Argentino":
			value = quantity * 38.04;
			symbol = "Arg$";
			break;
		case "De Dólares a Reais":
			value = quantity * 5.18;
			break;
		case "De Euros a Reis":
			value = quantity * 5.50;
			break;
		case "De Libras a Reais":
			value = quantity * 6.25;
			break;
		case "De Peso Chileno a Reais":
			value = quantity * 0.038;
			break;
		case "De Peso Argentino a Reias":
			value = quantity * 0.063;
			break;
		}

		return value;
	}

	@Override
	public String toString() {
		String str; 
		
		if (symbol != null) {
			str =  "O valor da conversão é de " + symbol + " ";
		}
		else {
			str = "O valor da conversão é de R$ ";
		}	
		return str + String.format("%.2f", value); 
	}
}
