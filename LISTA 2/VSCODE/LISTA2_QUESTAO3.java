import java.util.Scanner;

public class LISTA2_QUESTAO3 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Pede ao usuário para digitar o preço do litro da gasolina
        System.out.print("Digite o preço do litro da gasolina: R$ ");
        double precoPorLitro = scanner.nextDouble();

        // Pede ao usuário para digitar a quantidade de litros vendidos
        System.out.print("Digite a quantidade de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        // Calcula o valor total que o cliente deverá pagar
        double valorTotal = precoPorLitro * litrosVendidos;

        // Exibe o valor total
        System.out.println("O cliente deverá pagar: R$ " + valorTotal);

        // Fecha o scanner
        scanner.close();
    }
}
