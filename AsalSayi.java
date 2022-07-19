package javaCalismalar;

import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("sayi:");
		int n = input.nextInt();
		
		boolean sonuc=true;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				sonuc = false;
				break;
			} else {
				sonuc = true;
			}

		}
		if (sonuc) {
			System.out.println("sayi asal.");
		}
		else {
			System.out.println("sayi asal degildir");
		}
	}

}
