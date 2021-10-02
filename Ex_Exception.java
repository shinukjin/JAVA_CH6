package a.b.c.ch6;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex_Exception {
	
	/*
	Exception : 예외 클래스의 최상위 클래스 
	try {} catch() {} finally {} 구문 : 예외 처리하기 
	throws 키워드 : 예외 처리 미루기 , 호출한 함수에 예외 던지기
	throw 키워드 : 사용자 정의 예외
	
	Checked Exception
	컴파일 할때 
	반드시 예외 처리를 해야한다.
	예외 발생 시 롤백을 하지 않음.
	IOException
	ClassNotFoundException etc.
	
	UNchecked Exception
	실행할 때 
	명시적으로 하지 않아도 된다.
	예외 발생시 롤백을 해야한다.
	NullPointerException
	ClassCastException etc.
	*/
	
	/*
    try - catch - finally 구문 : 예외 처리 구문 
   
	try {
		예외 발생이 예상되는 구문 작성하는 블럭 
	}catch(예외 클래스 참조변수) {
		예외를 처리하는 블럭 : 예외 클래스 계층 구조상 하위에 있는 예외 클래스 
	}catch(예외 클래스 참조변수) {
		예외를 처리하는 블럭 : 예외 클래스 계층 구조상 상위에 있는 예외 클래스 
	}finally {
		예외 발생과 관계없이 실행 되는 블럭 
	}
*/


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int arr[] = new int[3]; // 방 3개
			System.out.println(arr.length);
	//	i  < arr.length : [0][1][2] : 방 3개
	//	i <= arr.length : [0][1][2][3] : 방 4개
			for( int i=0; i <= arr.length ; i++){	
				System.out.println("arr[" + i + "] >>> : " + arr[i]);
				
			}
		}catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("ArrayIndexOutOfBoundsException 에러가 :: a.getMessage() >>> : " + a.getMessage());
		}catch(Exception e) {
			System.out.println("Exception 에러가 :: e.getMessage() >>> : " + e.getMessage());
		}finally {
			System.out.println("예외 발생과 관계없이 실행 되는 블럭 >>> : ");
		}
		
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(d);
		System.out.println("date >>> : " + date);
		
		System.out.println(new SimpleDateFormat().format(new Date()));

	}

}
