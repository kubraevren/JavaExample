package javaCalismalar;

import java.util.Scanner;

public class KdvHesaplama {

	public static void main(String[] args) {
       double tutar,kdvlifiyat,kdv=0.18;
       
       Scanner inScanner=new Scanner(System.in);
       System.out.println("urun tutarini giriniz: ");
       tutar=inScanner.nextDouble();
       
       kdvlifiyat=tutar+(tutar*kdv);
       System.out.println("urunun kdv'li fiyati" + kdvlifiyat);
	}

}
