import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();
        System.out.print("Digite a escala da temperatura (C, F, K): ");
        String escala = scanner.next();

        double Celsius;
        switch (escala.toUpperCase()) {
            case "C":
                Celsius = temperatura;
                break;
            case "F":
                Celsius = (temperatura - 32) * 5/9;
                break;
            case "K":
                Celsius = temperatura - 273.15;
                break;
            default:
                System.out.println("Escala inválida!");
                scanner.close();
                return;
        }
        double Fahrenheit = (Celsius * 9/5) + 32;
        double Kelvin = Celsius + 273.15;

        System.out.println("Celsius: " + Celsius);
        System.out.println("Fahrenheit: " + Fahrenheit);
        System.out.println("Kelvin: " + Kelvin);
    }
}