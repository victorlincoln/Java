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
		/* Classe Alimenta��o
		 *  
		 */
	 	alimentacao alimentacaoHorario = new alimentacao();
		alimentacao alimentacaoRefeicao = new alimentacao();
		alimentacao alimentacaoCaloriaDia = new alimentacao();
		alimentacao alimetacaoCardapio = new alimentacao();

		alimentacaoHorario.refeicaonome = "Caf� da manh�, Lanche da Manh�, Almo�o, Lache da Tarde, Jantar";
		alimentacaoRefeicao.numero = 5;
		alimentacaoCaloriaDia.consumo = "1800 a 2500 calorias";
		alimetacaoCardapio.tipo =  "Carboidratos, Legumes e Verduras, Carnes, Ovos, Aves, Frutas";

		/** Informa��es a serem printadas na tela
		 * 
		 */
		
		System.out.println("Alimenta��o");
		System.out.println("");
		System.out.println("Refei��o: ");
		System.out.println(alimentacaoHorario.refeicaonome);
		System.out.println("");

		System.out.println("N�mero de Refei��es por dia: ");
		System.out.println(alimentacaoRefeicao.numero);
		System.out.println("");

		System.out.println("Consumo de Calorias por dia: ");
		System.out.println(alimentacaoCaloriaDia.consumo);
		System.out.println("");

		System.out.println("Card�pio:");
		System.out.println( alimetacaoCardapio.tipo);
}
		
}
	
