package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Currency;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Object[] items = { "Conversor de Moeda", "Conversor de temperatura" };

		Object selectedValue = JOptionPane.showInputDialog(null, "Escolha uma Opção", "Menu",
				JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);

		if (selectedValue == "Conversor de Moeda") {
			String inputValue = JOptionPane.showInputDialog("Insira um valor:");

			while (inputValue.isEmpty()) {

				inputValue = JOptionPane.showInputDialog("Insira um novo valor:");
			}

			try {
				Currency crr = new Currency();
				
				Object[] option = { "De Reais a Dólares", "De Reais a Euros", "De Reias a Libras",
						"De Reais a Yenes", "De Reais a Won Coreano", "De Dólares a Reais", 
						"De Euros a Reis", "De Libras a Reais", "De  Yenes a  Reais", 
						"De Won  Coreano a Reias" };
				
				Object currency = JOptionPane.showInputDialog(null, "Escolha a  moeda para a qual "
						+ "você deseja girar seu dinheiro", "Moedas", JOptionPane.WARNING_MESSAGE,
						null, option, option[0]);
				
				double value = crr.currencyConverter(currency, Double.parseDouble(inputValue));
				
				JOptionPane.showMessageDialog(null, crr);
				
				
				System.out.println("Valor convertido para $: " + String.format("%.2f", value));
			} 
			catch (NumberFormatException e) {
				System.out.println("Valor digitado inválido: " + e.getMessage());
			}

			System.out.println(inputValue);

		} 
		else if (selectedValue == "Conversor de temperatura") {

		} 
		else {
			System.out.println("Volte sempre! \nprograma finalizado");
		}

	}

}
