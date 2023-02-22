package entities;

public class Currency {

	private String name;
	private Double value;

	public Currency() {
	}

	public Currency(String name, Double value) {
		this.name = name;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public double currencyConverter(Object obj, double quantity) {


		switch (obj.toString()) {
		case "De Reais a Dólares":
			value = quantity / 5.17;
			break;
		case "De Reais a Euros":
			value = quantity / 5.52;
			break;
		case "De Reias a Libras":
			value = quantity / 6.24;
			break;
		case "De Reais a Yenes":
			value = quantity / 0.038;
			break;
		case "De Reais a Won Coreano":
			value = quantity / 0.0040;
			break;
		case "De Dólares a Reais":
			value = quantity * 5.17;
			break;
		case "De Euros a Reis":
			value = quantity * 5.52;
			break;
		case "De Libras a Reais":
			value = quantity * 6.24;
			break;
		case "De  Yenes a  Reais":
			value = quantity * 0.038;
			break;
		case "De Won  Coreano a Reias":
			value = quantity * 0.0040;
			break;
		}

		return value;
	}

	@Override
	public String toString() {
		return  "O valor da conversão é de R$ " + String.format("%.2f", value); 
	}
}
