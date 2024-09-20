package Lista_Atividades;
import java.util.*;

public class Exercicio05 {

    public static void main(String[] args) {
        Double quadrado, base, altura, raio;
        int escolha;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual figura geométrica você quer calcular?");
        System.out.println("Digite:\n1 - quadrado\n2 - retângulo\n3 - triângulo\n4 - círculo\n5 - SAIR");
        escolha = input.nextInt();

        switch (escolha) {
        case 1:
            System.out.print("Qual o valor do lado do quadrado? ");
            quadrado = input.nextDouble();
            System.out.println("A área do quadrado é: " + quadrado * quadrado);
            System.out.println("O perímetro do quadrado é: " + quadrado * 4);
            break;

        case 2:
            System.out.println("Digite os valores dos lados do retângulo: ");
            base = input.nextDouble();
            altura = input.nextDouble();
            System.out.println("O valor da área do retângulo é: " + base * altura);
            System.out.println("O valor do perímetro do retângulo é: " + ((base * 2) + (altura * 2)));
            break;

        case 3:
            System.out.println("Digite o valor da base do triângulo: ");
            base = input.nextDouble();
            System.out.println("Digite o valor da altura do triângulo: ");
            altura = input.nextDouble();
            System.out.println("O valor da área do triângulo é: " + (base * altura) / 2);
            break;

        case 4:
            System.out.println("Digite o valor do raio do círculo: ");
            raio = input.nextDouble();
            System.out.format("A área do círculo é: %.2f", Math.PI * Math.pow(raio, 2));
            System.out.format("\nO perímetro do círculo é: %.2f", 2 * Math.PI * raio);
            break;

        case 5:
            System.out.println("Você saiu do sistema.");
            break;

        default:
            System.out.println("Entrada inválida.");
            
        input.close();
        }
    }
}
