package javaCalismalar;

import java.util.Scanner;

public class Notortalama {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("quiz notu:");
		double quiz = inputScanner.nextDouble();
		System.out.println("vize notu:");
		double vize = inputScanner.nextDouble();
		System.out.println("final notu:");
		double finall = inputScanner.nextDouble();
		
		double ort;
		// quiz %20, vize %40 , final %40
		// ort 50 den yüksekse geçmiþ

		quiz /= 5;
		vize = (vize * 0.35);
		finall = (finall * 0.45);

		ort = (vize + finall + quiz);

		System.out.println(ort);
		if (ort >= 50) {
			System.out.println("Ogrenci dersten gecmistir.");
		} else {
			System.out.println("Ogrenci dersten kalmistir.");
		}
	}

}
