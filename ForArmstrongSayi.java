package javaCalismalar;

public class ForArmstrongSayi {

	public static void main(String[] args) {
		// 153= (1*1*1)+(5*5*5)+(3*3*3)
		int temp, birler, onlar, yuzler,toplam;
		for (int i = 100; i <= 999; i++) {
			temp = i;
			birler = temp % 10;
			temp = temp / 10;
			onlar = temp % 10;
			temp = temp / 10;
			yuzler = temp % 10;
			
			toplam=(birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);

			if(toplam==i) {
				System.out.println(i + " Armstrong sayidir.");
			}
		}

	}

}
