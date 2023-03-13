package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import entities.Convert;
import entities.ConvertType;
import entities.Currency;
import entities.Temperature;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		int wantContinue = 2;
		Object selectedValue;	
		ConvertType convert = new Convert();
		do {
			selectedValue = JOptionPane.showInputDialog(null, convert.getMessage(), convert.getType(),
					JOptionPane.INFORMATION_MESSAGE, null, convert.getConverters(), convert.getConverters());
			
				String strValue = JOptionPane.showInputDialog("Insira um valor:");
				
				try  {
					while (!strValue.matches("^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?$") || strValue.isBlank()|| strValue == null) {
	
						JOptionPane.showMessageDialog(null, "Informe apenas numeros");
						strValue = JOptionPane.showInputDialog("Insira um valor:");
					}	
				}
				catch (NullPointerException e) {
					System.out.println(e.getMessage());
				}
				if(strValue == null) break;
				
				double inputValue = Double.parseDouble(strValue);
				
				if (selectedValue == "Conversor de Moeda") {
					convert = new Currency();
				}
				else{
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
