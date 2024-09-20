package Lista_Atividades;
import java.util.*;

public class Exercicio04 {

    public static void main(String[] args) {
        Double valorDaCompra, desconto, prazo;
        int escolha, quantDeParcelas;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor total da sua compra: ");
        valorDaCompra = input.nextDouble();

        System.out.println("Digite: \n 1 - se você quer pagar à vista. \n 2 - se quer parcelar");
        escolha = input.nextInt();

        switch (escolha) {
        case 1:
            System.out.println("Para pagamento à vista você terá um desconto de 10%.");
            desconto = (valorDaCompra * 10) / 100;
            System.out.format("O valor total a pagar será de R$%.2f", valorDaCompra - desconto);
            break;

        case 2:
            System.out.println("Para o valor a prazo há um acréscimo de 20% no valor total.");
            System.out.println("Digite a quantidade de parcelas que deseja: ");
            quantDeParcelas = input.nextInt();
            prazo = (valorDaCompra * 20) / 100;
            System.out.format("O valor total a pagar será de R$%.2f", (valorDaCompra + prazo));
            System.out.println("\nEsse valor será dividido em: " + quantDeParcelas + " vezes de R$" 
            + (valorDaCompra + prazo) / quantDeParcelas);
            
            input.close();
        }
    }
}

