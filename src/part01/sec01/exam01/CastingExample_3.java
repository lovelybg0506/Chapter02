package part01.sec01.exam01;

public class CastingExample_3 {

	public static void main(String[] args) {
		
		int intValue=44032;
		char charValue=(char)intValue; // char = 0~65535(2byte)
		System.out.println(charValue); // int=4byte , 큰타입이 작은타입으로 들어갈수 없기때문에 강제형변환(casting)해준것
		System.out.println(charValue+1);// 연산을 해버리면 그냥 숫자가 나옴
	
		long longValue=500;
		intValue=(int)longValue;
		System.out.println(intValue);
		
		double doubleValue=3.14;
		intValue=(int)doubleValue;
		System.out.println(intValue);
	}

}
