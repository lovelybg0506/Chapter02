package part01.sec01.exam01;

public class CastingExample_3 {

	public static void main(String[] args) {
		
		int intValue=44032;
		char charValue=(char)intValue; // char = 0~65535(2byte)
		System.out.println(charValue); // int=4byte , ūŸ���� ����Ÿ������ ���� ���⶧���� ��������ȯ(casting)���ذ�
		System.out.println(charValue+1);// ������ �ع����� �׳� ���ڰ� ����
	
		long longValue=500;
		intValue=(int)longValue;
		System.out.println(intValue);
		
		double doubleValue=3.14;
		intValue=(int)doubleValue;
		System.out.println(intValue);
	}

}
