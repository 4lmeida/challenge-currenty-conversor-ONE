package entities;

public class Temperature {
	
	private String symbol;
	private Double value;
	
	private Object[] option = {"De celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahreneit a Celsius", 
			"De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Fahrenheit a Kelvin"};
	
	public Temperature() {
	}

	public Temperature(String symbol, Double value) {
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

	public double converter(Object obj, double value) {
		
		switch(obj.toString()) {
		case "De celsius a Fahrenheit":
			this.value = (value * 9/5) + 32;
			symbol = "°F ";
			break;
		case "De Celsius a Kelvin":
			this.value  = value + 273.15;
			symbol = "K ";
			break;
		case "De Fahreneit a Celsius":
			this.value = (value - 32) * 5/9;
			symbol = "°C ";
			break;
		case "De Fahrenheit a Kelvin":
			this.value = (value - 32) * 5/9  + 273.15;
			symbol = "K ";
			break;
		case "De Kelvin a Celsius":
			this.value = (value - 273.15);
			symbol = "°C ";
			break;
		case "De Kelvin a Fahrenheit":
			this.value = (value - 273.15) * 9/5 + 32;
			symbol = "°F ";
			break;
		}	
		
		return this.value;
	}
	
	@Override
	public String toString() {
		String str;
		
		if(symbol == "°F") {
			str = "Valor da conversão é de " + symbol + value;
		}
		else if (symbol == "°C") {
			str = "Valor da conversão é de " + symbol + value;
		}
		else {
			str = "Valor da conversão é de " + symbol + value;
		}
		
		return str;
	}
}
