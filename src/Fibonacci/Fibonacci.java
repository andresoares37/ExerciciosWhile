package Fibonacci;

public class Fibonacci {
	static long fibonacci(int n) {
		int atual = 0;
		int anterior = 0;
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				atual = 1;
				anterior = 0;
			} else {
				atual += anterior;
				anterior = atual - anterior;
			}
		}

		return atual;
	}

	public static void main(String[] args) {

		for (int i = 0; i < 30; i++) {
			System.out.println();
			System.out.println("(" + i + "):" + Fibonacci.fibonacci(i) + "\t");
		}

	}

}
