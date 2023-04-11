import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            double raizCubica = Math.cbrt(numero);
            System.out.println("Raiz cúbica é = " + raizCubica);
        } else if(numero % 2 != 0){
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("Raiz quadrada é = " + raizQuadrada);
        }else{
          System.out.println("numero invalido");
        }
    }
}