package part01.sec01.exam02;

import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {

		int a,b;
		int result;
		
		Scanner s=new Scanner(System.in); 
		a=s.nextInt(); // 스캐너기능중 nextInt가 있는데 이게 키보드로부터 정수를 읽어줌. 
		b=s.nextInt();
		
		result=a+b;
		System.out.println(a+"+"+b+"="+result);
		result=a-b;
		System.out.println(a+"-"+b+"="+result);
		result=a*b;
		System.out.println(a+"*"+b+"="+result);
		result=a/b;
		System.out.println(a+"/"+b+"="+result);
		
		s.close();
		
	}

}
