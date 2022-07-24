package javaCalismalar;

import java.util.Scanner;

public class AtmProje {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int bakiye = 1000, input, miktar;

		System.out.println("Bankamiza Hosgeldiniz!");
		System.out.println("Guncel bakiyeniz " + bakiye + " TL");
		while (bakiye > 0) {
			System.out.println("Lutfen Yapmak Istediginiz Islemi Secin");
			System.out.println("1- Para Yatirma");
			System.out.println("2- Para Cekme");
			System.out.println("3- Bakiye Sorgulama");
			System.out.println("4- Cikis Yapmak");
			input = scan.nextInt();

			if (input == 1) {
				System.out.println("kac tl yatirmak istersiniz?");
				miktar = scan.nextInt();
				bakiye += miktar;
				System.out.println("Guncel bakiyeniz: "+bakiye+" TL");
			} else if (input == 2) {
				System.out.println("kac tl cekmek istersiniz?");
				miktar = scan.nextInt();
				if (miktar > bakiye) {
					System.out.println("Bu miktarda para bakiyenizde bulunmamaktadir.");
				} else {
					bakiye -= miktar;
					System.out.println("Guncel bakiyeniz: "+bakiye +" TL");
				}
			}
			else if(input==3){
				System.out.println("Bakiye: " + bakiye +" TL");
			}
			else if(input==4){
				break;
			}

		}
	}
}
