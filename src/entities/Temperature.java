package entities;

public class Temperature extends Convert{
	
	private Object[] option = {"De celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahreneit a Celsius", 
			"De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Fahrenheit a Kelvin"};
	
	public Temperature() {
		super();
	}

	public Object[] getOption() {
		return option;
	}

	public void setOption(Object[] option) {
		this.option = option;
	}

	@Override
	public double convertTypes(Object obj, double value) {
		
		switch(obj.toString()) {
		case "De Celsius a Fahrenheit":
			setValue((value * 9/5) + 32); 
			setSymbol("°F ");
			break;
		case "De Celsius a Kelvin":
			setValue(value + 273.15); 
			setSymbol("K ");
			break;
		case "De Fahreneit a Celsius":
			setValue((value - 32) * 5/9); 
			setSymbol("°C ");
			break;
		case "De Fahrenheit a Kelvin":
			setValue((value - 32) * 5/9  + 273.15); 
			setSymbol("K ");
			break;
		case "De Kelvin a Celsius":
			setValue(value - 273.15); 
			setSymbol("°C ");
			break;
		case "De Kelvin a Fahrenheit":
			setValue((value - 273.15) * 9/5 + 32); 
			setSymbol("°F ");
			break;
		}	
		
		return getValue();
	}

	@Override
	public String toString() {
		
		return String.format(" Valor da conversão é de  %.2f  ", getValue()) + getSymbol();
	}

	@Override
	public String getType() {
		return "Temperatura";
	}

	@Override
	public String getMessage() {
		return "Escolha a escala para a qual você deseja converte sua temperatura" ;
	}
	

}
