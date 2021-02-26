package part01.sec01.exam01;

public class OperationPromotionExample_4 {

	public static void main(String[] args) {

		byte byteValue1=10; //byte(-128~127)
		byte byteValue2=20;
//		byte byteValue3=byteValue1+byteValue2; // *** 정수의 기본연산(+)은 결과는 4byte이다 ***
										// (+)연산 하면 4byte로 자동변환되어서 저장되기때문에 byte타입보다 커지므로 오류가남
		int intValue1=byteValue1+byteValue2;
		System.out.println(intValue1);
		
		char charValue1='A'; //65
		char charValue2=1;
//		char charValue3=charValue1+charValue2; // 65+1 
//	ㄴ>(2byte char type)=(4byte 정수type)
		
		int intValue2=charValue1+charValue2;
		System.out.println("유니코드="+intValue2);
		System.out.println("출력문자="+(char)intValue2);
		
		int intValue3=10;
		int intValue4=intValue3/4; // 10/4==>2.5 정수와 정수의 연산은 무조건 정수.
		System.out.println(intValue4);
		
		int intValue5=10;
		//int intValue6=10/4.0; //정수와 실수는 구조가 달라서 에러가남
		double doubleValue6=10/4.0; // 10.0/4.0  더 큰 타입으로 맞춰줘야함
		System.out.println(doubleValue6);
		
		double doubleValue=intValue5/4.0;
		System.out.println(doubleValue); // 서로 타입이 불일치할때는 자동으로 타입을 맞춰서 계산. 저장하는쪽도 타입을 일치시켜줘야함
	}

}
