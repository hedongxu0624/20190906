/*
 * ���ڱ��������򣺿鼶������ȥ�������{}
 */
package cn.lore.oop2;

public class StaticDemo {
	public static void main(String[] args) {
		StaticDemo s=new StaticDemo();
	}
	//��̬����飬�����ڶ������,��������,���ܷ��ʷǾ�̬�ĳ�Ա�����ͷ���
	public StaticDemo(){
		System.out.println("���ǹ��췽��");
	}
	static{
		System.out.println("����ʲôλ��");
		fn();
	}
	public static void fn(){
		
	}
}
