
public class teste5 {
	public static void main(String[] args) {
//		5) Escreva um programa que inverta os caracteres de um string.
//
//	IMPORTANTE:
//	a) Essa string pode ser informada atrav�s de qualquer entrada de sua prefer�ncia ou pode ser previamente definida no c�digo;
//	b) Evite usar fun��es prontas, como, por exemplo, reverse;
		String nome = "TargetSistemas", inversao = "";
		int i;
		
		for (i = nome.length()-1; i >= 0; i--) {
			inversao += nome.charAt(i);
		}
		System.out.println("Antes da invers�o: " + nome);
		System.out.println("Depois da invers�o: " + inversao);
	}
}
