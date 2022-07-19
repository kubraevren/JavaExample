package javaCalismalar;

import java.util.Scanner;

public class WhileOrnek2 {

	public static void main(String[] args) {
		// faktoriyel hesaplama
		// harmonik sayilar
		// yildizlar ile ucgen yapma
		// uslu sayi hesaplama

		/*
		 * ilk ornek: Scanner scan=new Scanner(System.in); System.out.print("sayi:");
		 * int f=scan.nextInt(); int sonuc=1; while(f>0){ sonuc*=f; f--; }
		 * System.out.println(sonuc);
		 */

		/*
		 * ikinci ornek: Scanner scan=new Scanner(System.in); System.out.print("sayi:");
		 * double h=scan.nextDouble(); double sonuc=0; while(h>0) { sonuc+=1/h; h--; }
		 * System.out.println(sonuc);
		 */

		/*
		 * ucuncu ornek: Scanner scan = new Scanner(System.in);
		 * System.out.print("sayi:"); int n = scan.nextInt(); int k = 1; while (k <= n)
		 * { int l = 1; while (l <= k) { System.out.print("*"); l++; }
		 * System.out.println(); k++; }
		 */
	/*	Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		double sonuc=Math.pow(a, b);
		System.out.println(Math.pow(a, b));
		*/
		Scanner scan = new Scanner(System.in);
		System.out.print("a:");
		int a=scan.nextInt();
		System.out.print("b:");
		int b=scan.nextInt();
		int i=1;
		int sonuc=1;
		while(i<=b) {
			sonuc=sonuc*a;
			i++;
		}
		System.out.println(sonuc);
		
		

	}
}
