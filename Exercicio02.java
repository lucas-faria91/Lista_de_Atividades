package Lista_Atividades;
import java.util.*;

public class Exercicio02 {

    public static void main(String[] args) {
        String nome;

        Scanner input = new Scanner(System.in);

        System.out.println("Você quer ver os dados do Lucas ou do João? ");
        nome = input.next();

        switch(nome) {
        case "Lucas": 
            System.out.println("O Lucas tem 31 anos, 1,87 de altura, pesa 97kg, mora com a mãe e tem um irmão."); 
            break;
        case "João": 
            System.out.println("O João tem 20 anos, 1,67 de altura, pesa 70kg, mora sozinho e não tem irmãos."); 
            break;
        default: 
            System.out.println("Entrada inválida, digite \"Lucas\" ou \"João\".");
        }

        input.close();
    }
}

