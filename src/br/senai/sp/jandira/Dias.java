package br.senai.sp.jandira;

import java.util.Scanner;

public class Dias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner anos = new Scanner(System.in);
		
		System.out.println("Quantos anos já vivi, aproximadamente?");
		System.out.println("Digite sua idade:");
		
		double x = anos.nextDouble();
		
		System.out.println("esse é o número de dias que você já viveu:");
		
		
		System.out.println(x * 365 );
	}

}
