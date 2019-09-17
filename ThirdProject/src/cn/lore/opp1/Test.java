package cn.lore.opp1;

public class Test {

	public static void main(String[] args) {
		Person p=new Student();//向上转型
		Student s=new Student();
		Person p1=new Worker();
		Student s1=(Student)p;//向下转型
		p.walk();
		s.walk();
		s1.fn();
		s1.walk();
		p1.walk();
		int a = p.a;
		int a2 = s.a;
		int a3=s1.a;
		System.out.println(a);
		System.out.println(a2);
		System.out.println(a3);
		}
}
