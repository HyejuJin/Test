package test;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("��ȯ�� 10������ �Է��ϼ���. :  ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String a = Integer.toBinaryString(num);
		System.out.println("2����: " + a );
	}
}
