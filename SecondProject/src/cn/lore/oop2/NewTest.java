/*���������ͬʱ��Ϊ������г�ʼ��
 * ���췽����Ȩ�����η�  ��������{}	���췽��������ĸ��д
 * ���������û���ֶ���ӹ��췽����������Զ������޲εĹ��췽�����ֶ�����������������
 * ��������
 * */
package cn.lore.oop2;

public class NewTest {

	public static void main(String[] args) {
		Car c=new Car();
		Car c1=new Car(4,"����","G600");
		System.out.println(c1.getName()+c1.getEngine()+c1.getWheel());
	}

}
