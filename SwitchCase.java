package javaCalismalar;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayi giriniz: ");
		int n = scan.nextInt();

		switch (n) {
		case 1:
			System.out.println("sayi 1'e esittir.");
			break;
		case 2:
			System.out.println("sayi 2'ye esittir.");
			break;
		case 3:
			System.out.println("sayi 3'e esittir.");
		default:
			System.out.println("gecersiz sayi....");
		}

	}

}
