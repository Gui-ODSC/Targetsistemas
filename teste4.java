
	public class teste4 {
		public static void main(String[] args) {
			double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, out = 19849.53;
			double somaTotal = sp + rj + mg + es + out;
			double perSp, perRj, perMg, perEs, perOut;
			System.out.println("Já que o lucro total mensal foi de: R$" + somaTotal);
			
			perSp = (sp * 100) / somaTotal;  
			System.out.printf("O percentual de SP foi de : %.2f%n" , perSp);
			perRj = (rj * 100) / somaTotal;
			System.out.printf("O percentual de RJ foi de : %.2f%n" , perRj);
			perMg = (mg * 100) / somaTotal;
			System.out.printf("O percentual de MG foi de : %.2f%n" , perMg);
			perEs = (es * 100) / somaTotal;
			System.out.printf("O percentual de ES foi de : %.2f%n" , perEs);
			perOut = (out * 100) / somaTotal;
			System.out.printf("O percentual de Outros foi de : %.2f%n" , perOut);
		}
}
