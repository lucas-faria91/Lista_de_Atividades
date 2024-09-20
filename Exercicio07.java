package Lista_Atividades;
import java.util.*;

public class Exercicio07 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Double nota1, nota2, nota3, nota4, media;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com a primeira nota do aluno: ");
        nota1 = input.nextDouble();
        
        System.out.println("Entre com a segunda nota do aluno: ");
        nota2 = input.nextDouble();
        
        System.out.println("Entre com a terceira nota do aluno: ");
        nota3 = input.nextDouble();
        
        System.out.println("Entre com a quarta nota do aluno: ");
        nota4 = input.nextDouble();
        
        media = ((nota1 * 3) + (nota2 * 4) + (nota3 * 5) + (nota4 * 6)) / (3 + 4 + 5 + 6);
        
        System.out.println("A nota ponderada do aluno é: ");
        
        if (media <= 3.9) 
            System.out.format("A média do aluno é: %.2f - Reprovado", media);
        
        else if (media <= 5.9) 
            System.out.format("A média do aluno é: %.2f - Prova Final", media);
    
        else if (media >= 6.0)
            System.out.format("A média do aluno é: %.2f - Aprovado", media);
    
        input.close();
    }
}
