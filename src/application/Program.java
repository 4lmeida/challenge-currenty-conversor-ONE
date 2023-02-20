package application;

import javax.swing.JOptionPane;

import entities.Currency;

public class Program {

	public static void main(String[] args) {
		
		Object[] items = { "Conversor de Moeda", "Conversor de temperatura" };
		
		Object selectedValue = JOptionPane.showInputDialog(null, "Escolha uma Opção", "Menu", 
				JOptionPane.INFORMATION_MESSAGE, null, items, items[0]);
		
		
		if(selectedValue == "Conversor de Moeda")  {
			String inputValue = JOptionPane.showInputDialog("Insira um valor:");
			while(inputValue.isEmpty()) {
				
				inputValue = JOptionPane.showInputDialog("Insira um novo valor:");
				
			}
			
			try {
				Currency crr = new Currency();
				double value = crr.currencyConverter(Double.parseDouble(inputValue));
				System.out.println("Valor convertido para $: " + String.format("%.2f", value));
				
			}
			catch (NumberFormatException e) {
				System.out.println("Valor digitado inválido: " +  e.getMessage());
			}

			
			
			System.out.println(inputValue);
			
			
		}
		else if(selectedValue == "Conversor de temperatura") {
			
		}
		else {
			System.out.println("Volte sempre, programa finalizado");
		}
		
		
		
		
	}

}
