package part01.sec01.exam02;

public class Ex03_08 {

	public static void main(String[] args) {

		int a,b;
		double c,d;
		
		a=100;
		b=a; // 복사
		System.out.printf("a,b의 값 ==> %d,%d\n",a,b);
		
		c=111.1;
		d=c; // 복사
		System.out.printf("c,d의 값 ==> %7.3f,%5.1f\n",c,d); // 5.1 = (.포함 5자리수), 소수점은 1자리까지만출력
		// .앞의수는 전체자릿수, .뒤의수는 소수점이하 자릿수
		
	}

}
