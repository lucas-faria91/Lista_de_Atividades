package Lista_Atividades;
import java.util.*;

public class Exercicio06 {

    public static void main(String[] args) {
        Double gasolina, alcool;

        Scanner input = new Scanner(System.in);
        
        // Pergunta apenas os valores dos combustíveis
        System.out.println("Qual o valor da gasolina?");
        gasolina = input.nextDouble();
        
        System.out.println("Qual o valor do álcool?");
        alcool = input.nextDouble();
        
        // Cálculo da proporção entre álcool e gasolina
        double proporcaoPreco = alcool / gasolina;

        // Decisão com base na regra dos 70%
        if (proporcaoPreco < 0.70) {
            System.out.println("É mais vantajoso abastecer com álcool.");
        } else {
            System.out.println("É mais vantajoso abastecer com gasolina.");
        }
        
        input.close();
    }   
}
