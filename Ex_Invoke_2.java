package a.b.c.ch6;

public class Ex_Invoke_2 {
	

	
		public Ex_Invoke_2() {
		System.out.println("Ex_Invoke_2() ������ >>> : ");	
	}
	
		public int aM() {
		System.out.println("aM() �Լ� ���� >>> : ");
		
		System.out.println("aM() �Լ� ");
		// aM()�Լ� ������ bM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = bM();
		System.out.println("aM() sum >>> : " + sum);
		System.out.println("aM() �Լ� �� >>> : ");
		
		return sum;
	}
	
	public int bM() {
		System.out.println("bM() �Լ� ���� >>> : ");
		
		System.out.println("bM() �Լ� ");
		// bM()�Լ� ������ cM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = cM();
		System.out.println("bM() sum >>> : " + sum);
		System.out.println("bM() �Լ� �� >>> : ");
		
		return sum;
	}
	
	public int cM() {
		System.out.println("cM() �Լ� ���� >>> : ");
		
		System.out.println("cM() �Լ� ");
		// cM()�Լ� ������ dM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = dM();
		System.out.println("cM() sum >>> : " + sum);
		System.out.println("cM() �Լ� �� >>> : ");
		
		return sum;
	}
	
	public int dM() {
		
		System.out.println("dM() �Լ� ���� >>> : ");
		System.out.println("dM() �Լ� ");
		int sum = 0;
		try {
			sum = 1/0;
			System.out.println("dm() sum >>> : " + sum);
		} catch(ArithmeticException a) {
			System.out.println("������ >>> : " + a);
			System.out.println("������ a.getMessage() >>> : " + a.getMessage());
			a.printStackTrace();
		}
		
		System.out.println("dM() �Լ� �� >>> : ");
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Invoke_2 :: main() �Լ� ���� >>> : ");
		System.out.println("Ex_Invoke_2 :: main() �Լ� ù ���� ���� ��������Ʈ ������� ���� �ȴ�. >>> : ");
		
		// ����� ���� Ŭ���� �������� ����ϱ�
		Ex_Invoke_2 exi2 = new Ex_Invoke_2();
		System.out.println("exi2 �ּҰ� >>> : " + exi2);
		
		// �����Լ� ������ �������� exi2 �� aM()�� ȣ���Ѵ�. invoke �Ѵ�. 
		int sum = exi2.aM();
		System.out.println("main sum >>> : " + sum);
	}

}
