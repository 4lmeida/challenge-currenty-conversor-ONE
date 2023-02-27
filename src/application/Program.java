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
		Currency crr  = new Currency();

		do {
			selectedValue = JOptionPane.showInputDialog(null, "Escolha uma Opção", "Menu",
					JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);

			if (selectedValue == "Conversor de Moeda") {
				String strValue = JOptionPane.showInputDialog("Insira um valor:");

				while (!strValue.matches("^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?$") || strValue.isBlank()
						|| strValue == null) {

					JOptionPane.showMessageDialog(null, "Informe apenas numeros");
					strValue = JOptionPane.showInputDialog("Insira um valor:");
				}

				double inputValue = Double.parseDouble(strValue);

				Object currency = JOptionPane.showInputDialog(null,
						"Escolha a  moeda para a qual " + "você deseja girar seu dinheiro", "Moedas",
						JOptionPane.WARNING_MESSAGE, null, crr.getOption(), crr.getOption());

				if (currency != null) {
					crr.currencyConverter(currency, inputValue);
					JOptionPane.showMessageDialog(null, crr.toString());
				}

				wantContinue = JOptionPane.showConfirmDialog(null, "Deseja continuar?");

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
