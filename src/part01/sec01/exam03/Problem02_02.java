package part01.sec01.exam03;

import java.util.Scanner;

public class Problem02_02 {

	public static void main(String[] args) {
		// 이름, 국어점수, 영어점수, 총점
		
		Scanner in =new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name=in.next();
		System.out.print("국어점수를 입력하세요: ");
		int kor=in.nextInt();
		System.out.print("영어점수를 입력하세요: ");
		int eng=in.nextInt();
		
//		int total;								//변수선언할때
//		total=kor+eng;							//변수선언할때
//		System.out.println("총 "+total+"점입니다"); //변수선언할때

		System.out.println("총 "+(kor+eng)+"점입니다");
	}

}