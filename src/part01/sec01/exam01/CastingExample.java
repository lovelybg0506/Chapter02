package part01.sec01.exam01;

public class CastingExample {	// casting = ����Ÿ�Ժ�ȯ

	public static void main(String[] args) {
			
		int intValue=103029770;
		byte byteValue=(byte)intValue;	//int�� byte�� ĳ���� 

		System.out.println("byteValue="+byteValue);
		System.out.println("intValue="+intValue);
		
		int intValue2=10;	// ������ �Ǽ��� ����ϴ� ����� ������ �޶� ��ǻ�Ͱ� ������ ����
		double doubleValue=5.5;  // ������ �Ϸ��� ������ ���� �������Ѵ�
								// �׷��� ���� (int)+�Ǽ�(double) => ������ �Ǽ��� ��ȯ��
		double result=intValue2+doubleValue; // 10.0 + 5.5 =�ڵ� ����ȯ
		System.out.println(result);
		System.out.println(intValue2);
	}

}
