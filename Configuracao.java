package com.java;

/**
 * Classe que abstrai a Configuração do software
 * @author jarvis
 * @version 1.0
 */

import java.util.Scanner;

public class Configuracao {

	// Atributos da classe
	private String email;
	private int telefone;
	private String meta;
	private String dicaDeProfissional;
	private String mensagemIncentivadora;
	

	void alterar(String email, int telefone, String meta, String dicaDeProfissional, String mensagemIncentivadora) {
	}
	public static void main (String[] args) {

		System.out.println("Suporte / Ajuda");

		System.out.println("");


		String suporteAjuda;
		suporteAjuda = "Email";	
		System.out.print(suporteAjuda);

		System.out.println(": (alterar)");



		System.out.println("Telefone: (alterar)");   


		System.out.println("Metas: (Alterar)");


		System.out.println("Dica de Profissional: ............ ");


		System.out.println("Mensagem Incentivadora:  ..........");

		/**
		 *  Respostas do usuário
		 */
		 
		Scanner tec = new Scanner (System.in);
		String resp;


		System.out.println("Problemas Técnicos na Plataforma?  (Sim / Não) ");
		resp = tec.next();

		if (resp.equals("sim")) {

			System.out.println("Entre em contato com nosso suporte, pelo e-mail: .......");

		} else {
			System.out.println("");
		}



		/**
		 *  Respostas do usuário
		 */
		 
		System.out.println("Nosso aplicativo tem o ajudado? Conceda nos uma nota de 0 a 10: ");


		double nota = 0;
		Scanner dc = new Scanner (System.in);
		nota = dc.nextDouble();
		System.out.println("Agradecemos pelo seu feedback .....");

	}


}








