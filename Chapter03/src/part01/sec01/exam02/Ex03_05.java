package part01.sec01.exam02;

public class Ex03_05 {

	public static void main(String[] args) {

		System.out.printf("%d\n",123);
		System.out.printf("%5d\n",123); //자릿수를 5자릿수로 만듦
		System.out.printf("%05d\n",123); //앞에 남는자리는 0으로 대체
		System.out.printf("%10d\n",123456);
		

		System.out.printf("%f\n",123.45);// 기본 소수점 6자리수까지 출력
		System.out.printf("%7.1f\n",123.45); //4까지만 찍혀야되는데 뒤에 5라서 반올림 (7이라는 숫자는 . 까지 포함한 칸 수)
		System.out.printf("%7.3f\n",123.45); //소수점3자리 까지 찍어야하는데 0이라서 .450출력
	
		System.out.printf("%s\n","Hi~~Java");
		System.out.printf("%10s\n","Hi~~Java");
		
	}

}
