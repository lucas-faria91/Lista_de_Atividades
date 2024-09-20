package Lista_Atividades;
import java.util.*;

public class Exercicio11 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int x = 1 + new Random().nextInt(100);
        int tentativa;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Você tem 10 tentativas para acertar qual número estou pensando.");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Vamos à %dª tentativa, digite um número de 1 a 100: ", i);
            tentativa = input.nextInt();
            
            if (tentativa > 100 || tentativa < 1) {
                System.out.println("Número inválido.");
                continue;
            }
            
            if (tentativa == x) {
                System.out.println("Parabéns, você ganhou!");
                break;
            } else {
                System.out.println("Que pena, tente novamente!");
            }
        }
        
        System.out.println("Suas tentativas acabaram.");
        input.close();
    }
}