import java.util.Scanner;

public class LISTA2_QUESTAO1 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para digitar um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Exibe a mensagem com o número informado
        System.out.println("O número informado foi " + numero + ".");

        // Fecha o scanner
        scanner.close();
    }
}
