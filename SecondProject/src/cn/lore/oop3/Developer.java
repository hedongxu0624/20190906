/*
 *  �����ࣺ�������󷽷����࣬��abstract����,���ܴ�������
 * ���󷽷���������Ҫ�ùؼ���abstract����
 * Ȩ�����η�       abstract    ����ֵ����       ������������
 * ���ڳ����಻��Ҫ������������������Ҫ�Է���������д�������й��췽����
 * ������Ҫ�вεĹ�����
 * ������д��������ڼ̳й�ϵ
 */
package cn.lore.oop3;

public abstract class Developer {
	private String name;
	private int age;
	private String num;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	//���󷽷�
	public abstract void work();
	
}
