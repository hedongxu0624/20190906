package cn.lore.oop3;

public class Tiger extends Suckler{

	public Tiger() {
		super();	
	}

	public Tiger(String food, int leg, String name) {
		super(food, leg, name);	
		System.out.println("tiger�ι��췽��");
	}
	public void foodType(){
		System.out.println("�ϻ�Ҳ�ǳ��̳����");
	}
	
}
