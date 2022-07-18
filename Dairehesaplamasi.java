package javaCalismalar;

import java.util.Scanner;

public class Dairehesaplamasi {

	public static void main(String[] args) {
   //daire alani ve cevresi
		
		Scanner input=new Scanner(System.in);
		System.out.println("yaricap degerini giriniz: ");
		int r=input.nextInt();
		
		double pi=3.14;
		System.out.println("Dairenin alani : " + pi*(r*r));
		System.out.println("Dairenin cevresi : " + 2*pi*r);
	}

}
