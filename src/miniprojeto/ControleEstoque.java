package miniprojeto;
import java.util.Scanner;
import java.util.Locale;

public class ControleEstoque {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: R$ ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade inicial em estoque: ");
        int estoqueInicial = scanner.nextInt();

        System.out.print("Digite a quantidade vendida: ");
        int quantidadeVendida = scanner.nextInt();

        System.out.println("\n------------------------------------");

        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
        System.out.println("Estoque antes da venda: " + estoqueInicial + " unidades");

        if (quantidadeVendida > estoqueInicial) {
            System.out.println("Estoque insuficiente para realizar a venda.");
        } else {
            int estoqueAtualizado = estoqueInicial - quantidadeVendida;
            System.out.println("Venda realizada: " + quantidadeVendida + " unidades");
            System.out.println("Estoque atualizado: " + estoqueAtualizado + " unidades");
        }

        System.out.println("------------------------------------");

        scanner.close();
    }
}