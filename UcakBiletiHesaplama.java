package javaCalismalar;

import java.util.Scanner;

public class UcakBiletiHesaplama {

	public static void main(String[] args) {
		int km, yas, tip;
		double yasIndrimi,fiyat,tipIndirimi;
		Scanner input = new Scanner(System.in);
		System.out.print("km bilgisi giriniz: ");
		km = input.nextInt();
		System.out.print("yas bilgisi giriniz: ");
		yas = input.nextInt();
		System.out.println("yolculuk tipi seciniz: \n1-Tek Yon \n2-Cýft Yon(Gidis-Donus)");
		tip = input.nextInt();
       fiyat = km * 0.10;
		if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
			if (yas < 12) {
				yasIndrimi = fiyat * 0.5;
			} else if (yas >= 12 && yas <= 24) {
				yasIndrimi = fiyat * 0.1;
			} else if (yas >= 65) {
				yasIndrimi = fiyat * 0.3;
			} else {
				yasIndrimi = 0;
			}
			fiyat -= yasIndrimi;
			if(tip==2) {
				tipIndirimi=fiyat*0.20;
				fiyat=(fiyat-tipIndirimi)*2;
				}
			System.out.println("bilet fiyatiniz: " + fiyat + "$");
		} else {
			System.out.println("girdiler yanlis");
		}
		

	}

}
