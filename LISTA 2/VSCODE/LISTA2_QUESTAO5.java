import java.util.Scanner;

public class LISTA2_QUESTAO5 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o preço de cada viagem e a quantidade de pessoas para cada destino
        System.out.print("Digite o preço da viagem para a Alemanha: R$ ");
        double precoAlemanha = scanner.nextDouble();
        System.out.print("Digite a quantidade de pessoas que irão para a Alemanha: ");
        int pessoasAlemanha = scanner.nextInt();

        System.out.print("Digite o preço da viagem para Portugal: R$ ");
        double precoPortugal = scanner.nextDouble();
        System.out.print("Digite a quantidade de pessoas que irão para Portugal: ");
        int pessoasPortugal = scanner.nextInt();

        System.out.print("Digite o preço da viagem para a Itália: R$ ");
        double precoItalia = scanner.nextDouble();
        System.out.print("Digite a quantidade de pessoas que irão para a Itália: ");
        int pessoasItalia = scanner.nextInt();

        // Calcula o valor total da viagem para cada destino
        double totalAlemanha = precoAlemanha * pessoasAlemanha;
        double totalPortugal = precoPortugal * pessoasPortugal;
        double totalItalia = precoItalia * pessoasItalia;

        // Calcula o valor total de todas as viagens
        double valorTotal = totalAlemanha + totalPortugal + totalItalia;

        // Exibe o valor total das viagens
        System.out.println("\nValor total da viagem para cada destino:");
        System.out.println("1º Alemanha: R$ " + totalAlemanha);
        System.out.println("2º Portugal: R$ " + totalPortugal);
        System.out.println("3º Itália: R$ " + totalItalia);

        System.out.println("\nValor total de todas as viagens: R$ " + valorTotal);

        // Fecha o scanner
        scanner.close();
    }
}
