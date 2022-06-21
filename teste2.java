import java.util.Scanner;
public class teste2 {
	public static void main(String[] args) {
		int ante = 0, atual = 1, suce = 0, i, n, alerta = 0;
		Scanner ent = new Scanner(System.in);
		
		System.out.println("digite o numero informado: ");
		n = ent.nextInt();
		
		System.out.println(ante);
		System.out.println(atual);
		for (i = 0; i <= 20; i++) {
			suce = ante + atual;
			System.out.println(suce);
			if (n == suce || n == ante || n == atual) {
				alerta += 1;
			}
			ante = atual;
			atual = suce;
		}
		if (alerta > 0) {
			System.out.println("O número " + n +" pertence a lista");
		}
		else {
			System.out.println("O número " + n + " não pertence a lista");
		}
	}
}
