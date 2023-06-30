package alura.conversorMoneda;

import java.util.Iterator;

import javax.swing.JOptionPane;

public class ConversorMoneda {

	public static void main(String[] args) {
		
		opcionesConversion();
		continuar();
		
	}
	
	public static void opcionesConversion() {
		String[] monedas = {
				"De Dólar a Pesos Mexicanos", 
				"De Dólar a Euros", 
				"De Dólar a Libras Esterlinas", 
				"De Dólar a Yen", 
				"De Dólar a Won"};
		
		String respuesta = (String) JOptionPane.showInputDialog(null, "Elige la opcion de conversion",
				"Moneda", JOptionPane.DEFAULT_OPTION, null, monedas, monedas[0]);
		
		
		double valorInicial = validacionValorIngresado();
		conversionMoneda(respuesta, valorInicial);
	}

	private static void continuar() {
		int n = JOptionPane.showConfirmDialog(null, "¿DESEA CONTINUAR?",
		        "Opciones", JOptionPane.YES_NO_CANCEL_OPTION);
		if(n==JOptionPane.YES_OPTION)
		{
			JOptionPane.showMessageDialog(null, "A comenzar de nuevo");
			opcionesConversion();
		}
		if(n==JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Haaaa gueno adios");
			System.exit(0);
		}
		if(n==JOptionPane.CANCEL_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Haaaa gueno adios x2");
			System.exit(0);
		}
		
	}

	private static void mostrarResultado(double valorConversion) {

		JOptionPane.showMessageDialog(null, "El valo de la conversion es: " + valorConversion);
		
	}
	
	public static double validacionValorIngresado()
	{
		boolean canContinue = false;
		double valorInicial = 0;
		do {
            String userResponse = JOptionPane.showInputDialog(null, "Ingresa la cantidad de dinero que deseas convertir.");
 
            try {
            	valorInicial = Double.parseDouble(userResponse);
                canContinue = true;
            }
            catch (NumberFormatException e) {
            	
                JOptionPane.showMessageDialog(null, "Valor no valido\nIngrese nuevamente el valor", "Error", JOptionPane.ERROR_MESSAGE);
                canContinue = false;
            }
        } while (!canContinue);
		
		return valorInicial;
	}
	
	public static void conversionMoneda(String respuesta, double valorInicial)
	{
		double valorConversion = 0;
		
		if(respuesta == "De Dólar a Pesos Mexicanos") {
			valorConversion = valorInicial * 17.128741;
			mostrarResultado(valorConversion);
		}
		if(respuesta == "De Dólar a Euros") {
			valorConversion = valorInicial * 0.91666946;
			mostrarResultado(valorConversion);
		}
		if(respuesta == "De Dólar a Libras Esterlinas") {
			valorConversion = valorInicial * 0.7877107;
			mostrarResultado(valorConversion);
		}
		if(respuesta == "De Dólar a Yen") {
			valorConversion = valorInicial * 144.33952;
			mostrarResultado(valorConversion);
		}
		if(respuesta == "De Dólar a Won") {
			valorConversion = valorInicial * 1316.253;
			mostrarResultado(valorConversion);
		}
	}
	
	

}
