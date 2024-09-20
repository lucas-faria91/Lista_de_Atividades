package Lista_Atividades;
import java.util.*;

public class Exercicio08 {
    public static void main(String args[]){
        double horaNormal, horaExtra, valorHora, calculoHora;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantas horas normais você trabalhou esse mês? ");
        horaNormal = input.nextDouble();
        
        System.out.print("Quantas horas extras você trabalhou esse mês? ");
        horaExtra = input.nextDouble();

        System.out.println("Qual o valor você recebe por hora trabalhada? ");
        valorHora = input.nextDouble();
        
        calculoHora = ((valorHora * 50) / 100) + valorHora;
        
        System.out.println("Você irá receber: " + ((horaExtra * calculoHora) + (horaNormal * valorHora)));
        
        input.close();
    }
}


	


