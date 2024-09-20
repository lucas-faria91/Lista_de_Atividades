package Lista_Atividades;

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		Double altura, peso;
		String nome, cor;
		int idade, irmaos, contador = 0;
		char sexo, familia;
		boolean livros, jogos;

		Scanner input = new Scanner(System.in);

		System.out.print("Responda o questionário a seguir para que eu saiba ");
		System.out.println("se você é parecido comigo ou não.");

		System.out.print("Digite seu nome: ");
		nome = input.next();

		if ("Lucas".equals(nome) || "lucas".equals(nome)) {
			contador++;
		}

		System.out.print("Qual sua cor favorita? ");
		cor = input.next();

		if ("Azul".equals(cor) || "azul".equals(cor)) {
			contador++;
		}

		System.out.print("Qual sua altura? ");
		altura = input.nextDouble();

		if (altura == 1.87) {
			contador++;
		}

		System.out.print("Qual o seu peso? ");
		peso = input.nextDouble();

		if (peso == 97.0) {
			contador++;
		}

		System.out.print("Qual a sua idade? ");
		idade = input.nextInt();

		if (idade == 31) {
			contador++;
		}

		System.out.print("Você tem quantos irmãos? ");
		irmaos = input.nextInt();

		if (irmaos == 1) {
			contador++;
		}

		System.out.println("Qual o seu sexo? Digite M para masculino ou F para feminino: ");
		sexo = input.next().charAt(0);

		if (sexo == 'M' || sexo == 'm') {
			contador++;
		}

		System.out.println("Você mora com sua família? Digite S para sim e N para não: ");
		familia = input.next().charAt(0);

		if (familia == 'S' || familia == 's') {
			contador++;
		}

		System.out.println("Você gosta de ler? Responda true para Verdadeiro e false para Falso ");
		livros = input.nextBoolean();
		if (livros) { 
		    contador++;
		}

		System.out.println("Você gosta de jogar? Responda true para Verdadeiro e false para Falso ");
		jogos = input.nextBoolean();
		if (jogos) { 
		    contador++;
		}

		if (contador >= 5)
			System.out.println("Essa pessoa é parecida comigo.");
		else
			System.out.println("Essa pessoa é diferente de mim.");

		input.close();
	}
}
