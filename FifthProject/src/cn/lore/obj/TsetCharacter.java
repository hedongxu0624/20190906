package cn.lore.obj;

public class TsetCharacter {

	public static void main(String[] args) {

		char c='A';
		/*characterʵ���Ĵ���*/
		
		//ʹ�ù�������������
		Character chObj=new Character('��');
		
		
		//ʹ�þ�̬��ʽ��������
		Character chObj0=Character.valueOf(c);
		
		//����ʵ������
		//��ȡcharֵ
		char zhong=chObj.charValue();
		System.out.println(zhong);
		
		System.out.println(chObj0.compareTo('B'));
		
		String str=chObj.toString();
		System.out.println(str+str.length());//�ַ�������
	}

}
