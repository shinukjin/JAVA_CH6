package a.b.c.ch6;

import java.util.Scanner;

public class Ex_Exception_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�ֿܼ� �����͸� �Է� �Ͻÿ� >>> : ");
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int x = sc.nextInt();
			System.out.println("�Է��� ������ x = " + x);
			int y = sc.nextInt();
			System.out.println("�Է��� ������ y = " + y);
			int z = x / y;
			System.out.println("���� ��� " + x + " / " + y + " = " + z);
		
		}catch (Exception e) {
			System.out.println("e ������ >>> : " + e.getMessage());
		}finally {
			System.out.println("finally �� ");
		}
		
		System.out.println("try-catch-finally �� ���� >>> : ");
	}
}
