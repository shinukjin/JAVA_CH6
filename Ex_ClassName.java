package a.b.c.ch6;

import java.lang.reflect.Method;

public class Ex_ClassName extends java.lang.Object {

	public void aM() {
		System.out.println("ClassName.aM() �Լ� ");
	}
	public void bM() {
		System.out.println("ClassName.bM() �Լ� ");
	}
	public void cM() {
		System.out.println("ClassName.cM() �Լ� ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ڽ�Ŭ�������� �ڽ�Ŭ������������ ���� = new �ڽ�Ŭ����������()���� 
		Ex_ClassName cn = new Ex_ClassName();
		System.out.println("cn �������� >>> : " + cn);
		System.out.println("cn.getClass() >>> : " + cn.getClass());
		System.out.println("cn.getClass().getName() >>> : " + cn.getClass().getName());
		
		// �θ�Ŭ��������  �θ�Ŭ���������������� = new �ڽ�Ŭ����()������ ���� 
		Object obj = new Ex_ClassName();
		System.out.println("�θ�Ŭ���� Object�� obj �θ�Ŭ������������ " + obj);
				
		// �θ�Ŭ���� obj ���� �ڽ�Ŭ���� ClassName �� �������� �� 
		// obj ���� ClassName ĳ���� �� �� 
		// obj ���� ClassName ���� ��ü ����ȯ : reference casting 
		//  ��  = (��) �� : �ڹٴ� = ���Կ����ڸ� �߽����� ��� �ڷ����� �¿찡 ���ƾ� �Ѵ�.(�ڷ���)
		Ex_ClassName cn1 = (Ex_ClassName)obj;
		System.out.println("cn1 �������� >>> : " + cn1);
		System.out.println("cn1.getClass() >>> : " + cn1.getClass());
		System.out.println("cn1.getClass().getName() >>> : " + cn1.getClass().getName());
		
		try {
			Class cc = Class.forName("a.b.c.ch6.Ex_ClassName");
			System.out.println("cc >>> : " + cc);
			Ex_ClassName cc1 = (Ex_ClassName)cc.newInstance();
			System.out.println("cc1 >>> : " + cc1);
			cc1.aM();
			
			System.out.println("\n############\n");
			
			// Ŭ������ ����� �޼ҵ� ã�� 
			Method m[] = cc.getDeclaredMethods();
			for (int i=0; i < m.length; i++) {
				
				System.out.println(">>> :: " + m[i].toString());
				
				String findM = m[i].getName();
				System.out.println("m["+i+"].getName() >>> :: " + findM);			
			}
			
			System.out.println("\n############\n");
			
			Class aList = Class.forName("java.util.ArrayList");
			java.util.ArrayList aList1 = (java.util.ArrayList)aList.newInstance();
			System.out.println("aList1 >>> : " + aList1);
			
			Class d = Class.forName("java.util.Date");
			java.util.Date dd = (java.util.Date)d.newInstance();
			System.out.println("dd >>> : " + dd);
			
		}catch(Exception c) {
			System.out.println("c ������ >>>  :" + c);
		}		
	}
}
