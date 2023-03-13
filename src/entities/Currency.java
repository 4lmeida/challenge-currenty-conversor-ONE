package entities;

public class Currency extends Convert implements ConvertType {
	
	private static final Object[] OPTION = { "De Reais a Dólares", "De Reais a Euros", "De Reias a Libras",
		"De Reais a Peso Chileno", "De Reais a Peso Argentino", "De Dólares a Reais", "De Euros a Reis",
		"De Libras a Reais", "De Peso Chileno a Reais", "De Peso Argentino a Reias" };
	
	public Currency() {
		super();
		super.setOption(OPTION); 
		super.setType("Moeda");
		super.setMessage("Escolha a moeda para qual você deseja girar seu dinheiro");
	}
	

	public double convertTypes(Object obj, double quantity) {

		switch (obj.toString()) {
		case "De Reais a Dólares":
			setValue(quantity * 0.19); 
			setSymbol("US$");
			break;
		case "De Reais a Euros":
			setValue(quantity * 0.18); 
			setSymbol("€");
			break;
		case "De Reias a Libras":
			setValue(quantity * 0.16); 
			setSymbol("£");
			break;
		case "De Reais a Peso Chileno":
			setValue(quantity * 160.47); 
			setSymbol("$");
			break;
		case "De Reais a Peso Argentino":
			setValue(quantity * 38.04); 
			setSymbol("Arg$");
			break;
		case "De Dólares a Reais":
			setValue(quantity * 5.18);
			break;
		case "De Euros a Reis":
			setValue(quantity * 5.50);
			break;
		case "De Libras a Reais":
			setValue(quantity * 6.25);
			break;
		case "De Peso Chileno a Reais":
			setValue(quantity * 0.038);
			break;
		case "De Peso Argentino a Reias":
			setValue(quantity * 0.063);
			break;
		}

		return getValue();
	}

	@Override
	public String toString() {
		String str; 
		
		if (getSymbol() != null) {
			str =  "O valor da conversão é de " + getSymbol() + " ";
		}
		else {
			str = "O valor da conversão é de R$ ";
		}	
		return str + String.format("%.2f", getValue()); 
	}





}

