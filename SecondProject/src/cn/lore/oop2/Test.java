package cn.lore.oop2;

public class Test{
	public static void main(String[] args){
		Car c=new Car();
		c.setWheel(4);
		c.setEngine("±¼³Û");
		c.setName("G500");
		c.go();
		c.stop();
		System.out.print("ÂÖÌ¥ÓÐ");
		System.out.println(c.getWheel()+"¸ö");
	}
}
