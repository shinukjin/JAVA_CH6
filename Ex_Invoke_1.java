package a.b.c.ch6;

public class Ex_Invoke_1 {
	public int aM() {
		System.out.println("aM() �Լ����� >>>> : ");
		System.out.println("aM()");
		
		// aM()�Լ� ������ bM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 	
		int sum =bM() ;
		System.out.println("aM() �Լ����� >>>> : ");
		return sum;
	}
	
	public int bM() {
		System.out.println("bM() �Լ����� >>>> : ");
		System.out.println("bM()");
		
		// bM()�Լ� ������ cM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 	
		int sum =cM() ;
		System.out.println("bM() �Լ����� >>>> : ");
		return sum;
	}
	
	public int cM() {
		System.out.println("cM() �Լ����� >>>> : ");
		System.out.println("cM()");
		
		// cM()�Լ� ������ dM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 	
		int sum =dM(); 
		System.out.println("cM() �Լ����� >>>> : ");
		return sum;
	}
	
	public int dM() {
		System.out.println("dM() �Լ����� >>>> : ");
		System.out.println("dM()");
		
		int sum = 1/1;
		System.out.println("dM() �Լ����� >>>> : ");

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Invoke_1 main() �Լ� ���� >>> : ");
		System.out.println("Ex_Invoke_1 main() �Լ� ù���κ��� ��������Ʈ ������� ����ȴ� >>> : ");
		//����� ���� Ŭ���� �������� ����ϱ�
		Ex_Invoke_1 exi = new Ex_Invoke_1();
		System.out.println("exi �ּҰ� >>> : " +exi);
		
		//�����Լ� ������ �������� exi�� am() ȣ���Ѵ�. invoke �Ѵ�.
		int sum = exi.aM(); //<<<= �̶� ��������am()�� ȣ����.
		System.out.println("main sum >>> : " + sum);

	}

}

		//main() -> aM() -> bM() -> cM() -> dM()	
