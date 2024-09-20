package Lista_Atividades;

import java.util.*;

public class Exercicio12 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random aleatorio = new Random();
        double peso, altura, salario;
        int idade, letra1, letra2, letra3, letra4;
        String alfabeto;

        idade = aleatorio.nextInt(100) + 1; // Idade entre 1 e 100
        letra1 = aleatorio.nextInt(26); // Letras do alfabeto (0 a 25)
        letra2 = aleatorio.nextInt(26);
        letra3 = aleatorio.nextInt(26);
        letra4 = aleatorio.nextInt(26);
        alfabeto = "abcdefghijklmnopqrstuvwxyz";

        System.out.print("O nome aleatório é: ");
        System.out.print(alfabeto.charAt(letra1));
        System.out.print(alfabeto.charAt(letra2));
        System.out.print(alfabeto.charAt(letra3));
        System.out.println(alfabeto.charAt(letra4));

        peso = aleatorio.nextDouble() * 100; // Peso entre 0 e 100 kg
        altura = aleatorio.nextDouble() * 2; // Altura entre 0 e 2 m
        salario = aleatorio.nextDouble() * 30000; // Salário entre 0 e 30.000

        System.out.print("O peso aleatório é: ");
        System.out.format("%.2f", peso);

        System.out.print("\nA altura aleatória é: ");
        System.out.format("%.2f", altura);

        System.out.print("\nO salário aleatório é: ");
        System.out.format("%.2f", salario);

        System.out.print("\nA idade aleatória é: ");
        System.out.println(idade);
    }
}

