package a.b.c.ch6;

public class Ex_Exception_3 {
	
	// iVal : aM() 함수의 매개변수
	// int[] iVal = iArr
	public void aM(int[] iVal) throws Exception{
		System.out.println("Ex_Exception_3.aM() 시작");
		System.out.println("iVal >>> : " + iVal);
		System.out.println("iVal.length" + iVal.length);
		
		for(int i =0; i <= iVal.length ; i++) {
		
		//iVal 배열에 초기화하기
		iVal[i]=i;
		System.out.println("iVal[" + i + "] >>> : " + iVal[i]);
		} 
		System.out.println("Ex_Exception_3.aM() 종료");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex_Exception_3.main() 함수 시작");
		
		// iArr : 지역변수 참조변수
		int[] iArr = new int[5];
		System.out.println("iArr >>> : " + iArr);
		try {
		Ex_Exception_3 ex3 = new Ex_Exception_3();
		// iArr : aM() 함수의 아규먼트 
		ex3.aM(iArr);
		} catch(Exception e) {
			System.out.println("e >>> : " + e);
		}
		System.out.println("Ex_Exception_3.main() 함수 종료");
	}
	

}
