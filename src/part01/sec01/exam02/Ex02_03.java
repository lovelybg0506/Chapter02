package part01.sec01.exam02;

import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {

		int a,b;
		int result;
		
		Scanner s=new Scanner(System.in); 
		System.out.print("ù��° ����� ���� �Է��ϼ���==>");
		a=s.nextInt(); // ��ĳ�ʱ���� nextInt�� �ִµ� �̰� Ű����κ��� ������ �о���. 
		System.out.print("�ι�° ����� ���� �Է��ϼ���==>");
		b=s.nextInt();
		
		result=a+b;
		System.out.println(a+"+"+b+"="+result);
		result=a-b;
		System.out.println(a+"-"+b+"="+result);
		result=a*b;
		System.out.println(a+"*"+b+"="+result);
		result=a/b;
		System.out.println(a+"/"+b+"="+result);

		s.close(); // ��ĳ�ʸ� ���� �������� �ݾ������.
		
	}

}
