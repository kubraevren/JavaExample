import java.util.Scanner;

public class Test {
//string icerisindeki sesli harfleri bulmak
	//bosluklar sessiz kabul edilir
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.print("metin:");
		String metin = inputScanner.nextLine();

		int sayi = 0;

		for (int i = 0; i < metin.length(); i++) {
			if (metin.charAt(i) == 'a' || metin.charAt(i) == 'i' || metin.charAt(i) == 'o' || metin.charAt(i) == 'u'
					|| metin.charAt(i) == 'e') {
				sayi++;
			}
		}
		System.out.println(sayi + " tane sesli harf vardir");

		int sayi2 = metin.length() - sayi;
		System.out.println(sayi2 + " tane sessiz harf vardir.");
	}
}
