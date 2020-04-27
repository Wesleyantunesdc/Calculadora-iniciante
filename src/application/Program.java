package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] agrs) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Boolean continuar = true;
		double n1, n2;
		System.out.println("Calculadora de dois números!");
		// Primeira calculadora

		do {
			menu();
			System.out.print("Digite a opção: ");
			int opc = sc.nextInt();
			switch (opc) {
			case 1:
				System.out.print("Soma: ");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				System.out.printf("Resultado: %.2f", soma(n1, n2));
				break;
			case 2:
				System.out.print("Subtração: ");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				System.out.printf("Resultado: %.2f", subt(n1, n2));
				break;
			case 3:
				System.out.print("Multiplicação: ");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				System.out.printf("Resultado: %.2f", mult(n1, n2));
				break;
			case 4:
				System.out.print("Divisão: ");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				System.out.printf("Resultado: %.2f", divi(n1, n2));
				break;
			case 5:
				System.out.print("Raiz quadrada: ");
				n1 = sc.nextDouble();
				System.out.printf("Resultado: %.2f", raiz2(n1));
				break;
			case 6:
				System.out.print("Resto da divisão: ");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				System.out.printf("Resultado: %.2f", rest(n1, n2));
				break;
			case 7:
				System.out.print("Potenciação: ");
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				System.out.printf("Resultado: %.2f", potenc(n1, n2));
				break;
			case 8:
				continuar = false;
				break;
			default:
				System.out.println("Opção invalida!");
				;
			}
		} while (continuar == true);
		System.out.println("Programa finalizado.");
		sc.close();
	}

	public static void menu() {
		System.out.println();
		System.out.println("===Calculadora===");
		System.out.println("1-Soma");
		System.out.println("2-Subtrair");
		System.out.println("3-Multiplicar");
		System.out.println("4-Divisão");
		System.out.println("5-Raiz quadrada");
		System.out.println("6-Resto da divisão");
		System.out.println("7-Potenciação");
		System.out.println("8-Sair");
		System.out.println("============================================");
	}

	public static double soma(double n1, double n2) {
		return n1 + n2;
	}

	public static double subt(double n1, double n2) {
		return n1 - n2;
	}

	public static double mult(double n1, double n2) {
		return n1 * n2;
	}

	public static double divi(double n1, double n2) {
		return n1 / n2;
	}

	public static double raiz2(double n1) {
		return Math.sqrt(n1);
	}

	public static double rest(double n1, double n2) {
		return n1 % n2;
	}

	public static double potenc(double n1, double n2) {
		return Math.pow(n1, n2);
	}
}
