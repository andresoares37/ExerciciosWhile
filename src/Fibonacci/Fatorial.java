package Fibonacci;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		long fatorial = 1;
		System.out.print("Digite o valor: ");
		int x = leitor.nextInt();
		if (x < 0) {
			System.out.println("NÃO existe fatorial de número negativo.");
		} else {
			while (x > 0) {
				fatorial = fatorial * x;
				x--;				
			}
			System.out.println("Fatorial: " + fatorial);
		}
		leitor.close();
	}

}
