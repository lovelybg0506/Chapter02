package part01.sec01.exam02;

public class Ex03_03 {

	public static void main(String[] args) {

		System.out.printf("%d/%d=%d",100,200,300);
		System.out.printf("\n");
//		System.out.printf("%d/%d=%d",100,200,0.5); //d ! = java.lang.Double 오류 => 실수를 출력할때는 %d가 아니고 %f
		System.out.printf("%d/%d=%f",100,200,0.5); //기본적으로 소수점 6자리까지 나옴.
		
		
	}

}
