package part01.sec01.exam01;

public class OperationPromotionExample_4 {

	public static void main(String[] args) {

		byte byteValue1=10; //byte(-128~127)
		byte byteValue2=20;
//		byte byteValue3=byteValue1+byteValue2; // *** ������ �⺻����(+)�� ����� 4byte�̴� ***
										// (+)���� �ϸ� 4byte�� �ڵ���ȯ�Ǿ ����Ǳ⶧���� byteŸ�Ժ��� Ŀ���Ƿ� ��������
		int intValue1=byteValue1+byteValue2;
		System.out.println(intValue1);
		
		char charValue1='A'; //65
		char charValue2=1;
//		char charValue3=charValue1+charValue2; // 65+1 
//	��>(2byte char type)=(4byte ����type)
		
		int intValue2=charValue1+charValue2;
		System.out.println("�����ڵ�="+intValue2);
		System.out.println("��¹���="+(char)intValue2);
		
		int intValue3=10;
		int intValue4=intValue3/4; // 10/4==>2.5 ������ ������ ������ ������ ����.
		System.out.println(intValue4);
		
		int intValue5=10;
		//int intValue6=10/4.0; //������ �Ǽ��� ������ �޶� ��������
		double doubleValue6=10/4.0; // 10.0/4.0  �� ū Ÿ������ ���������
		System.out.println(doubleValue6);
		
		double doubleValue=intValue5/4.0;
		System.out.println(doubleValue); // ���� Ÿ���� ����ġ�Ҷ��� �ڵ����� Ÿ���� ���缭 ���. �����ϴ��ʵ� Ÿ���� ��ġ���������
	}

}
