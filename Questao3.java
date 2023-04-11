import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        if(sobrenome.equalsIgnoreCase("Wayne")) {
            System.out.println("Acesso liberado, Sr. Wayne");
        }else if(sobrenome.equalsIgnoreCase("Kent")) {
            System.out.println("Saí daí, mané!");
        }else if(nome.equalsIgnoreCase("Diana")) {
            System.out.println("Bem-vinda, Princesa de Themyscara");
        }else{
            System.out.println("Cai fora!");
        }
    }
}