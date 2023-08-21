package temperatura;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Escolha a direção da conversão (1/2): ");
        int choice = scanner.nextInt();

        double temperature;
        double convertedTemperature;

        if (choice == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            temperature = scanner.nextDouble();
            convertedTemperature = celsiusToFahrenheit(temperature);
            System.out.println("A temperatura em Fahrenheit é: " + convertedTemperature);
        } else if (choice == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperature = scanner.nextDouble();
            convertedTemperature = fahrenheitToCelsius(temperature);
            System.out.println("A temperatura em Celsius é: " + convertedTemperature);
        } else {
            System.out.println("Escolha inválida.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}
