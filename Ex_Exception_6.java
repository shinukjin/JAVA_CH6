package a.b.c.ch6;

public class Ex_Exception_6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Exception_4.main() �Լ� ����");
		
		int argsL = args.length;
		if(2 == argsL) {
			String sX = args[0];
			System.out.println("�Է��� ������ sX = " + sX);
			String sY = args[1];
			System.out.println("�Է��� ������ sY = " + sY);
			
			try {
				// public static int parseInt(String s) throws NumberFormatException
				// ���� ���ڸ� ���ڷ� ����ȯ 
				
				int x = Integer.parseInt(sX);
				int y = Integer.parseInt(sY);
				int z = x/y;
				System.out.println(x + " / " + y + " = " + z);	
			}
//			catch(NumberFormatException n) {
//				System.out.println("������ n.getMessage() >>> : " + n.getMessage());
			catch(Exception e) {
				System.out.println("������ e.getMessage() >>> : " + e.getMessage());
			}
		}
		else {
			
			System.out.println("�ֿܼ� �����͸� �Է� �Ͻÿ� !! ");
		}
		System.out.println("main() �� >>> : ");
	}
	
}
