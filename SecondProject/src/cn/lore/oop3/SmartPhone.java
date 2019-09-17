//子类重写
package cn.lore.oop3;

public class SmartPhone extends OldPhone{

	public void showNum(){
		//子类中如何调用父类方法super.方法名（）
		super.showNum();
		System.out.println("显示头像");
	}
}
