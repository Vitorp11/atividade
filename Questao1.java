import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner receber = new Scanner(System.in);
        System.out.println("digite o primeiro numero: ");
        double num1 = receber.nextDouble();

        System.out.println("digite o segundo numero(Caso queira a radiação do primeiro numero digite um valor aleatório): ");
        double num2 = receber.nextDouble();

        System.out.println("operador (+, -, *, /, ^, R, C): ");
        char operador = receber.next().charAt(0);

        double resultado;
        switch(operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                break;
            case 'R':
                resultado = Math.sqrt(num1);
                break;
            case 'C':
                resultado = Math.cbrt(num1);
                break;
            default:
                System.out.println("operador invalido");
                return;
        }
      System.out.println("resultado: " + resultado);
    }
}