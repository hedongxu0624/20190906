package cn.lore.opp1;

public class Test {

	public static void main(String[] args) {
		Person p=new Student();//����ת��
		Student s=new Student();
		Person p1=new Worker();
		Student s1=(Student)p;//����ת��
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
