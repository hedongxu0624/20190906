/*创建对象的同时，为对象进行初始化
 * 构造方法：权限修饰符  类名（）{}	构造方法名首字母大写
 * 如果在类中没有手动添加构造方法，虚拟机自动生成无参的构造方法，手动添加虚拟机不会生成
 * 方法重载
 * */
package cn.lore.oop2;

public class NewTest {

	public static void main(String[] args) {
		Car c=new Car();
		Car c1=new Car(4,"宝马","G600");
		System.out.println(c1.getName()+c1.getEngine()+c1.getWheel());
	}

}
