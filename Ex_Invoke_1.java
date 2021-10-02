package a.b.c.ch6;

public class Ex_Invoke_1 {
	public int aM() {
		System.out.println("aM() 함수시작 >>>> : ");
		System.out.println("aM()");
		
		// aM()함수 블럭에서 bM() 함수를 호출한다. invoke 한다. 	
		int sum =bM() ;
		System.out.println("aM() 함수종료 >>>> : ");
		return sum;
	}
	
	public int bM() {
		System.out.println("bM() 함수시작 >>>> : ");
		System.out.println("bM()");
		
		// bM()함수 블럭에서 cM() 함수를 호출한다. invoke 한다. 	
		int sum =cM() ;
		System.out.println("bM() 함수종료 >>>> : ");
		return sum;
	}
	
	public int cM() {
		System.out.println("cM() 함수시작 >>>> : ");
		System.out.println("cM()");
		
		// cM()함수 블럭에서 dM() 함수를 호출한다. invoke 한다. 	
		int sum =dM(); 
		System.out.println("cM() 함수종료 >>>> : ");
		return sum;
	}
	
	public int dM() {
		System.out.println("dM() 함수시작 >>>> : ");
		System.out.println("dM()");
		
		int sum = 1/1;
		System.out.println("dM() 함수종료 >>>> : ");

		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Invoke_1 main() 함수 시작 >>> : ");
		System.out.println("Ex_Invoke_1 main() 함수 첫라인부터 인터프리트 방식으로 수행된다 >>> : ");
		//사용자 정의 클래스 참조변수 사용하기
		Ex_Invoke_1 exi = new Ex_Invoke_1();
		System.out.println("exi 주소값 >>> : " +exi);
		
		//메인함수 블럭에서 참조변수 exi로 am() 호출한다. invoke 한다.
		int sum = exi.aM(); //<<<= 이때 참조변수am()을 호출함.
		System.out.println("main sum >>> : " + sum);

	}

}

		//main() -> aM() -> bM() -> cM() -> dM()	
