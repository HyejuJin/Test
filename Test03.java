package test;
import java.util.Scanner;

public class Test03 {
	
	public static long fac(int n) {
		if(n==1) {
			System.out.println("1!=1");
			return 1;
		} else {
			System.out.println(n + "!=" + n + "*" + (n-1) + "!");
			return fac(n-1)*n;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fac(n));
	}
}
