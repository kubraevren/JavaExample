package javaCalismalar;

import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("1. sayiyi giriniz: ");
		int birinci = input.nextInt();

		System.out.print("2. sayiyi giriniz: ");
		int ikinci = input.nextInt();

		System.out.println("yapmak istediginiz islemi  giriniz: \n 1-Toplama \n 2-Cikarma \n 3-Carpma \n 4-Bolme");
		int secim = input.nextInt();

		if (secim == 1) {
			System.out.println(birinci + ikinci);
		} else if (secim == 2) {

			System.out.println(birinci - ikinci);
		} else if (secim == 3) {
			System.out.println(birinci * ikinci);
		} else if (secim == 4) {
			if (ikinci == 0) {
				System.out.println("ikinci sayi 0 olamaz.");
			}
			if (ikinci != 0)
				System.out.println(birinci / ikinci);
		} else {
			System.out.println("lutfen 1-2-3-4 seceneklerinden birini seciniz..");
		}
	}
}
