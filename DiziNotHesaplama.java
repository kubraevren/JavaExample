package javaCalismalar;

import java.util.Scanner;

public class DiziNotHesaplama {

	public static void main(String[] args) {
		double toplam = 0;
		int[] notlar = new int[7];
		System.out.println("lutfen notlarinizi giriniz:");
		Scanner input = new Scanner(System.in);
		System.out.print("Matematik: ");
		notlar[0] = input.nextInt();
		System.out.print("Turkce: ");
		notlar[1] = input.nextInt();
		System.out.print("Fizik: ");
		notlar[2] = input.nextInt();
		System.out.print("Kimya: ");
		notlar[3] = input.nextInt();
		System.out.print("Biyoloji: ");
		notlar[4] = input.nextInt();
		System.out.print("Tarih: ");
		notlar[5] = input.nextInt();
		System.out.print("Cografya: ");
		notlar[6] = input.nextInt();

		for (int deger : notlar) {
			toplam += deger;
		}
		System.out.println("ortalama:" + toplam / notlar.length);

	}

}
