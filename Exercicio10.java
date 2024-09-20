package Lista_Atividades;
import java.util.*;

public class Exercicio10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double valorLitro, kmMes, kmLitro, reaisKm, trocaOleo, seguro, ipva, custos;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Qual o valor do litro da gasolina: ");
        valorLitro = input.nextDouble();
        
        System.out.println("Quantos km você roda por mês? ");
        kmMes = input.nextDouble();
        
        System.out.println("Quantos km seu carro faz por litro? ");
        kmLitro = input.nextDouble();
        
        reaisKm = (valorLitro / kmLitro);
        
        System.out.println("Qual o valor da troca de óleo? ");
        trocaOleo = input.nextDouble();
        
        System.out.println("Quanto você paga por ano de seguro? ");
        seguro = input.nextDouble();
        
        System.out.println("Quanto você paga de IPVA por ano? ");
        ipva = input.nextDouble();
        
        System.out.println("Digite o valor gasto com revisões e outros custos por ano: ");
        custos = input.nextDouble();
        
        System.out.println("O valor médio para se manter seu carro por mês é de: ");
        System.out.println(((kmMes * 12) * (reaisKm) + (trocaOleo * 2) + (seguro + ipva + custos)) / 12);
    
        input.close();
    }
}

