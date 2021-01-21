package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("변환할 10진수를 입력하세요. :  ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String a = Integer.toBinaryString(num);
		System.out.println("2진수: " + a );
	}
}
