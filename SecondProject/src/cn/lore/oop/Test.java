package cn.lore.oop;

public class Test {

	public static void main(String[] args) {
		Person p=new Person();
		Gun g=new Gun();
		Animal animal=new Animal();
		int age = p.age;
		String name = p.name;
		
		System.out.println(name+"������"+age);
		p.hunt(g, animal);
	}

}
