package br.tec.abrindoportas.controller;

import java.util.Scanner;

public class VideoLocadora {
	public void locar() {
		String nomeFilme, nomeUsario, cpfUsuario, enderecoUsario;
		final int  TempoLocacao = 2;
		final double acrescimo = 5.0;
		int duracaolocacao, count;
		double duracaofilme, valorFilme;
		Scanner read = new Scanner(System.in);

		for(count = 0; count < 5; count++) {

			// BLOCO - Entrada de dados
			System.out.println("Digite seu nome: ");
			nomeUsario = read.next();
			System.out.println("Endereço Usario: ");
			enderecoUsario  = read.next();
			System.out.println("CPF do Usuario: ");
			cpfUsuario = read.next();

			System.out.println("Filme a ser Locado: ");
			System.out.println("Duração do Filme: ");
			duracaofilme = read.nextDouble();
			System.out.println("Valor do Filme: ");
			valorFilme = read.nextDouble();
			System.out.println("Tempo de Locação: ");
			TempoLocacao = read.nextInt();

			System.out.println("Prazo de entrega: ");

			// BLOCO - processamento de daos
			if(duracaolocacao <= TempoLocacao) {
				System.out.println(" Muito obrigado, volte sempre");
			}else {
				if ((duracaolocacao > TempoLocacao)&&(duracaolocacao == 3)) {
					valorFilme = valorFilme + acrescimo;
					System.out.println["A data de entrega do filme excedeu a 2 dias"
							+ " por isso sera cobrado " + "reais. "
							+ " Total sear R$" + valorFilme "]
				}
			}
		}
	}
}
