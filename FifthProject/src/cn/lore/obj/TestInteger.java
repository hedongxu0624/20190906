package cn.lore.obj;

public class TestInteger {

	public static void main(String[] args) {

		int num=5;
		Integer intObj=new Integer(num);
		System.out.println(intObj);
		//�ַ�����ʽ,ȷ�����˵�һ�����Դ����з��ţ������ַ�����������
		Integer intObj2=new Integer("-545");
		Integer intObj3=new Integer(-545);
		System.out.println(intObj2);
		System.out.println(intObj3);
		
		/*Integer��int�ļ��ݰ�װ�࣬����ʹ��int�������������һ��integerʵ��*/
		Integer intObj4=100;
		System.out.println(intObj4);
		
		System.out.println("+++++++++++");
		/*integer���õĳ�����̬����*/
		System.out.println(Integer.BYTES);//�ֽ�
		System.out.println(Integer.SIZE);//λ��
		System.out.println(Integer.MAX_VALUE);//���ֵ
		System.out.println(Integer.MIN_VALUE);//��Сֵ
		
		/*integer���÷���*/
		System.out.println(intObj3.compareTo(intObj4));//����ֵֻ��0��1��-1
		
		//��int���ͷ��ظ�integer��ֵ
		int num2=intObj3.intValue();
		System.out.println(num2);
		
		//���ַ���ת��Ϊint���ݷ���,radix����
		int intStr=Integer.parseInt("1110",2);//�ڶ�������ʾ����,��2������ת��Ϊ10����
		System.out.println(intStr+12);
		System.out.println(Integer.parseInt("1110",2));
		 
		/*valueOf������ȡһ��integerʵ��*/
		Integer intObj5=Integer.valueOf(500);
		System.out.println(intObj5);
		
		System.out.println(Integer.valueOf("500").intValue());
		System.out.println(Integer.valueOf("1111",2).intValue());
		System.out.println(Integer.valueOf("1111",8).intValue());
		
		System.out.println("+++++++++");
		/*�����ƣ��˽��ƣ�ʮ�����Ƶ�ת��*/
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toOctalString(15));
		System.out.println(Integer.toHexString(15));
	}

}
