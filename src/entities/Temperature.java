package entities;

public class Temperature extends Convert implements ConvertType {
	
	private static final Object[] OPTION = {"De celsius a Fahrenheit", "De Celsius a Kelvin", "De Fahreneit a Celsius", 
			"De Kelvin a Celsius", "De Kelvin a Fahrenheit", "De Fahrenheit a Kelvin"}; 
	
	public Temperature() {
		super();
		super.setOption(OPTION);
		super.setType("Temperatura");
		super.setMessage("Escolha uma escala para qual você desaja converte a temperatura");
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
	

}
