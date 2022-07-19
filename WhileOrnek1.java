package javaCalismalar;

import java.util.Scanner;

public class WhileOrnek1 {

	public static void main(String[] args) {
         //1den 100e kadar cift sayilari ekrana yazdir
		 // negatif sayi girilene kadar girisleri kabul ediyor,girislerden tek sayilari
		 // topluyor
		 // girilen sayiya kadar olan ikinin kuvvetleri

		/*
		 * int i = 1;
		 *  while (i <= 100)
		 *   { if(i%2==0) 
		 *   System.out.println(i); 
		 *   i++; }
		 */

		int toplam = 0;
		Scanner input = new Scanner(System.in);
		/*	while (true) {
			System.out.println("sayi: ");
			int n = input.nextInt();

			if (n < 0) {
				System.out.println("toplam:" + toplam);
				break;
			}
			if (n % 2 == 1) {
				toplam += n;

			}
		}*/

		int k = input.nextInt();
		int m = 1;
		while (m <= k) {
			System.out.println(m);
			m = m * 2;
			
		}

	}

}
