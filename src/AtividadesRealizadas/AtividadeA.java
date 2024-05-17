package AtividadesRealizadas;

import java.util.Scanner;

public class AtividadeA {
	public void atividade() {
			// Bloco - Declaração de Variáveis
			String nome, pais;
			int maioridade, idade;
			Scanner read = new Scanner(System.in);

			// BLOCO - Entrada de dados
			System.out.println("Digite seu nome: ");
			nome = read.next();
			System.out.println("Digite seu gênero (M/F): ");
                        read.next();
			System.out.println("Digite seu pais: ");
			pais = read.next();

			System.out.println("Digite sua idade:");
			idade= read.nextInt();

			//Processamento e saida dados
			if (idade >= 18) { 
				System.out.println(nome + " Voçê possui a idade necessaria para deixar o país");
			}else { 
				System.out.println(nome + " Voçê não possui a idade necessaria para deixar o páis");

			}
		}
	}