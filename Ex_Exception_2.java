package a.b.c.ch6;

public class Ex_Exception_2 {
		
	// iVal : aM()  �Լ��� �Ű����� 
	// int[] iVal = iArr
	public void aM(int[] iVal) {
		System.out.println("Ex_Exception_2.aM() >>> ����");
		
		System.out.println("iVal >>> : " + iVal);		
		System.out.println("iVal.length >>> : " + iVal.length);
		
		for (int i=0; i <= iVal.length; i++ ){
			
			// iVal �迭�� �ʱ�ȭ �ϱ� 
			iVal[i] = i;
			
			System.out.println("iVal["+i+"] >>> : " + iVal[i]);
		}			
		
		System.out.println("Ex_Exception_2.aM() >>> ��");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Exception_2.main() >>> ����");
		
		// iArr : ��������, �������� 
		int[] iArr = new int[5];
		System.out.println("iArr >>> : " + iArr);
		
		Ex_Exception_2 ex2 = new Ex_Exception_2();
		// iArr : aM() �Լ��� �ƱԸ�Ʈ 
		ex2.aM(iArr);			

		System.out.println("Ex_Exception_2.main() >>> ��");
	}
}
