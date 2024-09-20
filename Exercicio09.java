package Lista_Atividades;
import java.util.*;

public class Exercicio09 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double valorAno, valorHora, valorMes;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o valor que você recebe por ano de salário? ");
        valorAno = input.nextDouble();
        
        valorMes = valorAno / 12;
        
        System.out.println("Você recebe: " + valorMes + " por mês");        
        
        valorHora = (valorMes / (8 * 22));
        
        System.out.println("Você recebe " + valorHora + " por hora");
        
        input.close();
    }
}
