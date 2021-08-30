package com.java;

public class alimentacao { 
	String orientar;

	public void setOrientar (Object setOrientar) {
		return;
}
	// Atributos da classe

   private String refeicaonome;
	private int numero;
	private Object caloriaDia;
	private String consumo;
	private Object alimentacaoCardapio;
	private String tipo;
	private Object alimentacaoRefeicao;
	 public static void main(String[] args) {
		/* Classe Alimentação
		 *  
		 */
	 	alimentacao alimentacaoHorario = new alimentacao();
		alimentacao alimentacaoRefeicao = new alimentacao();
		alimentacao alimentacaoCaloriaDia = new alimentacao();
		alimentacao alimetacaoCardapio = new alimentacao();

		alimentacaoHorario.refeicaonome = "Café da manhã, Lanche da Manhã, Almoço, Lache da Tarde, Jantar";
		alimentacaoRefeicao.numero = 5;
		alimentacaoCaloriaDia.consumo = "1800 a 2500 calorias";
		alimetacaoCardapio.tipo =  "Carboidratos, Legumes e Verduras, Carnes, Ovos, Aves, Frutas";

		/** Informações a serem printadas na tela
		 * 
		 */
		
		System.out.println("Alimentação");
		System.out.println("");
		System.out.println("Refeição: ");
		System.out.println(alimentacaoHorario.refeicaonome);
		System.out.println("");

		System.out.println("Número de Refeições por dia: ");
		System.out.println(alimentacaoRefeicao.numero);
		System.out.println("");

		System.out.println("Consumo de Calorias por dia: ");
		System.out.println(alimentacaoCaloriaDia.consumo);
		System.out.println("");

		System.out.println("Cardápio:");
		System.out.println( alimetacaoCardapio.tipo);
}
		
}
	
