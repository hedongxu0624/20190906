package cn.lore.oop3;

public class Tiger extends Suckler{

	public Tiger() {
		super();	
	}

	public Tiger(String food, int leg, String name) {
		super(food, leg, name);	
		System.out.println("tiger参构造方法");
	}
	public void foodType(){
		System.out.println("老虎也是吃奶长大的");
	}
	
}
