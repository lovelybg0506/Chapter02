package part01.sec01.exam03;

import java.util.Scanner;

public class Problem02_02 {

	public static void main(String[] args) {
		// �̸�, ��������, ��������, ����
		
		Scanner in =new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name=in.next();
		System.out.print("���������� �Է��ϼ���: ");
		int kor=in.nextInt();
		System.out.print("���������� �Է��ϼ���: ");
		int eng=in.nextInt();
		
//		int total;								//���������Ҷ�
//		total=kor+eng;							//���������Ҷ�
//		System.out.println("�� "+total+"���Դϴ�"); //���������Ҷ�

		System.out.println("�� "+(kor+eng)+"���Դϴ�");
	}

}