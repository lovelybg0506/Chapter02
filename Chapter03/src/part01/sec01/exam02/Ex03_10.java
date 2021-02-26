package part01.sec01.exam02;

public class Ex03_10 {

	public static void main(String[] args) {

		int a=100, b=200;
		double result;
		
		result=a/b; // 정수/정수==>정수 
		
		System.out.printf("%f\n", result);

		a=170;
		b=30;
		
		result=a/b;
		
		System.out.printf("%f\n", result);
		
		
	//  float w=0.1234f;  //밑줄과 동일 (float타입에만 숫자 뒤에 f붙이기) 
		float w=(float)0.1234; // 실수형 {double(8byte) ,float(4byte)}
		System.out.printf("%f\n", w);


		
	}

}
