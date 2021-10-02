package a.b.c.ch6;

public class Ex_Invoke {

	public Ex_Invoke() {
		System.out.println("Ex_Invoke() ������ >>> : ");	
	}
	
	public void aM() {
		System.out.println("aM() �Լ� ���� >>> : ");
		
		System.out.println("aM() �Լ� ");
		// aM()�Լ� ������ bM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		bM();
		System.out.println("aM() �Լ� �� >>> : ");
	}

	public void bM() {
		System.out.println("bM() �Լ� ���� >>> : ");
		
		System.out.println("bM() �Լ� ");
		// bM()�Լ� ������ cM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		cM();
		
		System.out.println("bM() �Լ� �� >>> : ");
	}

	public void cM() {
		System.out.println("cM() �Լ� ���� >>> : ");
		
		System.out.println("cM() �Լ� ");
		// cM()�Լ� ������ dM() �Լ��� ȣ���Ѵ�. invoke �Ѵ�. 
		dM();
		System.out.println("cM() �Լ� �� >>> : ");
	}

	public void dM() {
		System.out.println("dM() �Լ� ���� >>> : ");
		
		System.out.println("dM() �Լ� ");
		
		System.out.println("dM() �Լ� �� >>> : ");
	}
	
	// main() �Լ��� ������ �ܼ� ���ø����̼��̶�� �θ���. 
	// �ܼ� ���ø����̼ǿ��� �Լ��� ��������  main() �Լ� �̴�. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Invoke :: main() �Լ� ���� >>> : ");
		System.out.println("Ex_Invoke :: main() �Լ� ù ���� ���� ��������Ʈ ������� ���� �ȴ�. >>> : ");
		
		// ����� ���� Ŭ���� �������� ����ϱ�
		Ex_Invoke exi = new Ex_Invoke();
		System.out.println("exi �ּҰ� >>> : " + exi);
		
		// �����Լ� ������ �������� exi �� aM()�� ȣ���Ѵ�. invoke �Ѵ�. 
		exi.aM();

	}

}
