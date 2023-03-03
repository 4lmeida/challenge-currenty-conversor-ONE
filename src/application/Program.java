package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Convert;
import entities.Currency;
import entities.Temperature;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		int wantContinue = 2;
		Object[] items = { "Conversor de Moeda", "Conversor de temperatura" };
		Object selectedValue;	
		Convert convert = null;
		do {
			selectedValue = JOptionPane.showInputDialog(null, "Escolha uma Opção", "Menu",
					JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);
			
				String strValue = JOptionPane.showInputDialog("Insira um valor:");
				
				while (!strValue.matches("^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?$") || strValue.isBlank()|| strValue == null) {

					JOptionPane.showMessageDialog(null, "Informe apenas numeros");
					strValue = JOptionPane.showInputDialog("Insira um valor:");
				}	
				
				double inputValue = Double.parseDouble(strValue);
				
				if (selectedValue == "Conversor de Moeda") {
					convert = new Currency();
				}
				else if (selectedValue == "Conversor de temperatura") {
					convert = new Temperature();
				}
				
				Object strObj = JOptionPane.showInputDialog(null,
						convert.getMessage(), convert.getType(),
						JOptionPane.WARNING_MESSAGE, null, convert.getOption(), convert.getOption());


				if (strObj != null) {
					convert.convertTypes(strObj, inputValue);
					JOptionPane.showMessageDialog(null, convert.toString());
				}

				wantContinue = JOptionPane.showConfirmDialog(null, "Deseja continuar?"); 

		} while (wantContinue == 0 && selectedValue != null);

		if (wantContinue == 1) {
			JOptionPane.showMessageDialog(null, "Programa Finalizado");
		} 
		else {
			JOptionPane.showMessageDialog(null, "Programa concluído");
		}
	}

}
