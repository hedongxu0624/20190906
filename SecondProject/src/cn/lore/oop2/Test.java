package cn.lore.oop2;

public class Test{
	public static void main(String[] args){
		Car c=new Car();
		c.setWheel(4);
		c.setEngine("����");
		c.setName("G500");
		c.go();
		c.stop();
		System.out.print("��̥��");
		System.out.println(c.getWheel()+"��");
	}
}
