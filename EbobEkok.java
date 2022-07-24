package javaCalismalar;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		int min;	
		int ebob = 1;
		int ekok;
		Scanner input = new Scanner(System.in);
		System.out.print("a:");
		int a = input.nextInt();
		System.out.print("b:");
		int b = input.nextInt();
		if (a > b)
			min = b;
		else {
			min = a;
		}
		for (int i = min; i > 0; i--) {
			if (a % i == 0 && b % i == 0) {
				ebob = i;
			break;
			}
		}
		System.out.println("obeb: " + ebob);
		ekok=(a*b)/ebob;
		System.out.println("ekok: " + ekok);
	}
}
