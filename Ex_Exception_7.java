package a.b.c.ch6;

public class Ex_Exception_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throw new Exception("���� �޽���");
//			Exception e = new Exception("���� �޽���");
//			thorw e;
		} catch(Exception e) {
			System.out.println("e.getMessage() >>> : " + e.getMessage());	
		}
		System.out.println("try-catch �� ���� >>>");
	}
}
