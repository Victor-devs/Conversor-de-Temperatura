package conversorTemperatura;

import java.util.Scanner;

public class ConversorTemperatura {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Por favor, digite uma temperatura em graus Celcius: ");
		double celsius = scanner.nextDouble();
		
		
		double fahrenheit = converterParaFahrenheit(celsius);
		double kelvin = converterParaKelvin(celsius);
		
		System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus farenheit e " + kelvin + " graus kelvin.");
	}
	
	public static double converterParaFahrenheit(double celsius) {
		double farenheit = (celsius * 9/5) + 32;
		return farenheit;
	}
	
	public static double converterParaKelvin(double celsius) {
		double kelvin = (celsius + 273.15);
		return kelvin;
	}
}
