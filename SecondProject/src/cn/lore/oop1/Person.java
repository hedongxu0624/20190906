/*
 * private˽�еģ������εĳ�Ա�����ͷ�����ֻ�����ڲ��ܷ���
 * Ȩ�����η�������ֵ���ͣ�������������{}
 */
package cn.lore.oop1;


 class Person {
	private String name;
	public String getName() {
		return name;
	}
//thisָ����ͨ�����ഴ���Ķ��󣨵�ǰ����
	public void setName(String name) {
		this.name = name;
	}

	private int age;
	 
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>120||age<0){
		this.age = 20;
		}else{
			this.age=age;
		}
	}

	public void walk(){
		System.out.println("��������");
	}
} 
