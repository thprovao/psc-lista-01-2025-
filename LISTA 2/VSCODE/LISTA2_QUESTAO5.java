import java.util.Scanner;

public class LISTA2_QUESTAO5 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede o valor total da viagem
        System.out.print("Digite o valor total da viagem (Eurotrip): R$ ");
        double valorViagem = scanner.nextDouble();

        // Solicita o número de amigos no grupo
        System.out.print("Digite o número de amigos que vão viajar: ");
        int numeroDeAmigos = scanner.nextInt();

        // Calcula o valor que cada amigo vai pagar
        double valorPorAmigo = valorViagem / numeroDeAmigos;

        // Exibe o valor a ser pago por cada amigo
        System.out.println("\nA Eurotrip será realizada para os seguintes destinos:");
        System.out.println("1. Alemanha");
        System.out.println("2. Portugal");
        System.out.println("3. Itália");
        System.out.println("\nCada amigo deverá pagar R$ " + valorPorAmigo + " pela viagem.");

        // Fecha o scanner
        scanner.close();
    }
}
