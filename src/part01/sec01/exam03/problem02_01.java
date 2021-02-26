package part01.sec01.exam03;

import java.util.Scanner;

public class problem02_01 {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);

		System.out.print("이름을 입력: ");
		String name=in.next(); // String(문자역)class
		System.out.print("국어점수를 입력: ");
		int kor=in.nextInt();
		
		System.out.println(name+"님의 국어 점수는"+kor+"점입니다");
	
	}

}
