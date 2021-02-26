package part01.sec01.exam01;

public class CastingExample {	// casting = 강제타입변환

	public static void main(String[] args) {
			
		int intValue=103029770;
		byte byteValue=(byte)intValue;	//int를 byte로 캐스팅 

		System.out.println("byteValue="+byteValue);
		System.out.println("intValue="+intValue);
		
		int intValue2=10;	// 정수와 실수를 계산하는 방식은 구조가 달라서 컴퓨터가 연산을 못함
		double doubleValue=5.5;  // 연산을 하려면 구조를 같게 만들어야한다
								// 그래서 정수 (int)+실수(double) => 정수가 실수로 변환됨
		double result=intValue2+doubleValue; // 10.0 + 5.5 =자동 형변환
		System.out.println(result);
		System.out.println(intValue2);
	}

}
