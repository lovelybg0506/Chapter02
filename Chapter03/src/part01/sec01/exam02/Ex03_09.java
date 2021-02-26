package part01.sec01.exam02;

public class Ex03_09 {

	public static void main(String[] args) {

		int a,b,c,d;
		
		// 변수의 의미 ==> 재활용 하기 위해서 변수를 사용
		a=100+100;	//200
		b=a+100;	//300
		c=a+b-100; //400
		d=a+b+c;	//900
		
		System.out.printf("a,b,c,d의 값 ==>%d,%d,%d,%d\n",a,b,c,d);
		
		a=b=c=d=100;
		
		System.out.printf("a,b,c,d의 값 ==>%d,%d,%d,%d\n",a,b,c,d);
				
		a=100;
		a=a+200;
		a=a+200;
		
		System.out.printf("a의 값 ==>%d\n",a);
		
	}

}
