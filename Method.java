package javaCalismalar;

public class Method {

	public static void main(String[] args) {

		int k=power(3, 5);
		System.out.println(k);
		int sayi=r(5);
		System.out.println(sayi);
		}
	
	static int power(int a,int b) {
		int toplam=a+b;
		
		return toplam;
	}
	
	static int r(int x) {
		if(x==1)
			return 1;
		return x+r(x-1);
	}

}
