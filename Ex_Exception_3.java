package a.b.c.ch6;

public class Ex_Exception_3 {
	
	// iVal : aM() �Լ��� �Ű�����
	// int[] iVal = iArr
	public void aM(int[] iVal) throws Exception{
		System.out.println("Ex_Exception_3.aM() ����");
		System.out.println("iVal >>> : " + iVal);
		System.out.println("iVal.length" + iVal.length);
		
		for(int i =0; i <= iVal.length ; i++) {
		
		//iVal �迭�� �ʱ�ȭ�ϱ�
		iVal[i]=i;
		System.out.println("iVal[" + i + "] >>> : " + iVal[i]);
		} 
		System.out.println("Ex_Exception_3.aM() ����");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Exception_3.main() �Լ� ����");
		
		// iArr : �������� ��������
		int[] iArr = new int[5];
		System.out.println("iArr >>> : " + iArr);
		try {
		Ex_Exception_3 ex3 = new Ex_Exception_3();
		// iArr : aM() �Լ��� �ƱԸ�Ʈ 
		ex3.aM(iArr);
		} catch(Exception e) {
			System.out.println("e >>> : " + e);
		}
		System.out.println("Ex_Exception_3.main() �Լ� ����");
	}
	

}
