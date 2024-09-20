package Lista_Atividades;
import java.util.*;

public class Exercicio03 {

    public static void main(String[] args) {
        Double gasolina, alcool, diesel, quantidade;
        int combustivel;
        gasolina = 4.75;
        alcool = 4.0;
        diesel = 3.50;

        Scanner input = new Scanner(System.in);

        System.out.println("Qual tipo de combustível você deseja?");
        System.out.println("Digite:\n 1 para gasolina \n 2 para álcool \n 3 para diesel");

        combustivel = input.nextInt();

        switch (combustivel) {
        case 1:
            System.out.println("Você escolheu gasolina.");
            System.out.println("Quantos reais de gasolina você deseja?");
            quantidade = input.nextDouble();
            System.out.format("Você colocou %.2f litros de gasolina.", quantidade / gasolina);
            break;
        case 2:
            System.out.println("Você escolheu álcool.");
            System.out.println("Quantos reais de álcool você deseja?");
            quantidade = input.nextDouble();
            System.out.format("Você colocou %.2f litros de álcool.", quantidade / alcool);
            break;
        case 3:
            System.out.println("Você escolheu diesel.");
            System.out.println("Quantos reais de diesel você deseja?");
            quantidade = input.nextDouble();
            System.out.format("Você colocou %.2f litros de diesel.", quantidade / diesel);
            break;
        default:
            System.out.println("Você não digitou um número válido.");
        }

        input.close();
    }
}
