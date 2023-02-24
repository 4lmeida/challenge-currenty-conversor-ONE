package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Currency;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int wantContinue = 2;
		Object[] items = { "Conversor de Moeda", "Conversor de temperatura" };
		Object selectedValue;

		do {
			selectedValue = JOptionPane.showInputDialog(null, "Escolha uma Opção", "Menu",
					JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);

			if (selectedValue == "Conversor de Moeda") {
				try {
					String strValue = JOptionPane.showInputDialog("Insira um valor:");

					while (!strValue.matches("^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?$") || strValue.isBlank()
							|| strValue == null) {

						JOptionPane.showMessageDialog(null, "Informe apenas numeros");
						strValue = JOptionPane.showInputDialog("Insira um valor:");
					}
					
					double inputValue = Double.parseDouble(strValue);

					Currency crr = new Currency();

					Object[] option = { "De Reais a Dólares", "De Reais a Euros", "De Reias a Libras",
							"De Reais a Yenes", "De Reais a Won Coreano", "De Dólares a Reais", "De Euros a Reis",
							"De Libras a Reais", "De  Yenes a  Reais", "De Won  Coreano a Reias" };

					Object currency = JOptionPane.showInputDialog(null,
							"Escolha a  moeda para a qual " + "você deseja girar seu dinheiro", "Moedas",
							JOptionPane.WARNING_MESSAGE, null, option, option[0]);

					crr.currencyConverter(currency, inputValue);

					JOptionPane.showMessageDialog(null, crr.toString());

					wantContinue = JOptionPane.showConfirmDialog(null, "Deseja continuar?");


				} 
				catch (NullPointerException e) {
					System.out.println("Valor digitado inválido: " + e.getMessage());
				}

			} 
			else if (selectedValue == "Conversor de temperatura") {

			}
		} while (wantContinue == 0 && selectedValue != null);

		if (wantContinue == 1) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
		} 
		else {
			JOptionPane.showMessageDialog(null, "Programa concluído");
		}
	}

}
