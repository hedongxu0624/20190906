package cn.lore.oop4;

public class Test {

	public static void main(String[] args) {
		J2ee j=new J2ee();
		Android a=new Android();
		j.setNum("e110");
		j.setName("����");
		j.work();
		j.setBonus(500);
		System.out.println("����"+j.getBonus());
		a.setNum("a120");
		a.setName("����");
		a.work();
	}

}
