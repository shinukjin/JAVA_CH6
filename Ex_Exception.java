package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Exception {
	
	/*
	Exception : ���� Ŭ������ �ֻ��� Ŭ���� 
	try {} catch() {} finally {} ���� : ���� ó���ϱ� 
	throws Ű���� : ���� ó�� �̷�� , ȣ���� �Լ��� ���� ������
	throw Ű���� : ����� ���� ����
	
	Checked Exception
	������ �Ҷ� 
	�ݵ�� ���� ó���� �ؾ��Ѵ�.
	���� �߻� �� �ѹ��� ���� ����.
	IOException
	ClassNotFoundException etc.
	
	UNchecked Exception
	������ �� 
	��������� ���� �ʾƵ� �ȴ�.
	���� �߻��� �ѹ��� �ؾ��Ѵ�.
	NullPointerException
	ClassCastException etc.
	*/
	
	/*
    try - catch - finally ���� : ���� ó�� ���� 
   
	try {
		���� �߻��� ����Ǵ� ���� �ۼ��ϴ� �� 
	}catch(���� Ŭ���� ��������) {
		���ܸ� ó���ϴ� �� : ���� Ŭ���� ���� ������ ������ �ִ� ���� Ŭ���� 
	}catch(���� Ŭ���� ��������) {
		���ܸ� ó���ϴ� �� : ���� Ŭ���� ���� ������ ������ �ִ� ���� Ŭ���� 
	}finally {
		���� �߻��� ������� ���� �Ǵ� �� 
	}
*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int arr[] = new int[3]; // �� 3��
			System.out.println(arr.length);
	//	i  < arr.length : [0][1][2] : �� 3��
	//	i <= arr.length : [0][1][2][3] : �� 4��
			for( int i=0; i <= arr.length ; i++){	
				System.out.println("arr[" + i + "] >>> : " + arr[i]);
				
			}
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("ArrayIndexOutOfBoundsException ������ :: a.getMessage() >>> : " + a.getMessage());
		}catch(Exception e) {
			System.out.println("Exception ������ :: e.getMessage() >>> : " + e.getMessage());
		}finally {
			System.out.println("���� �߻��� ������� ���� �Ǵ� �� >>> : ");
		}
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(d);
		System.out.println("date >>> : " + date);
		
		System.out.println(new SimpleDateFormat().format(new Date()));

	}

}
