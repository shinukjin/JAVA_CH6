package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Exception_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int arr[] = new int[3]; // �� 3��
			for (int i = 0 ; i <=arr.length ; i ++)
			{
				System.out.println("arr["+i+"] >>> : " + arr[i]);
			}
		}
		catch(Exception e) {
			System.out.println("Exception ������ :: e.getMessage() >>> : " 
					+ e.getMessage());
		}finally {
			System.out.println("���� �߻��� ������� ����Ǵ� ��");
		}
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(d);
		System.out.println("date >>> : " + date);
		
		System.out.println(new SimpleDateFormat().format(new Date()));
	}

}
