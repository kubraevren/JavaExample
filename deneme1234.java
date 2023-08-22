import java.util.Scanner;

public class deneme1234 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("sayi:");
		int n = scan.nextInt();
		int k = 1;
		while (k <= n) {
			int l = 1;
			while (l <= k) {
				System.out.print("*");
				l++;
			}
			System.out.println();
			k++;
		}
	}
}
