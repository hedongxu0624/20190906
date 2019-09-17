package cn.lore.collections;

public class Foo<T1,T2> {
	private T1 t1;
	private T2 t2;
	
	public Foo() {
		super();
	}
	public Foo(T1 t1, T2 t2) {
		super();
		this.t1 = t1;
		this.t2 = t2;
	}
	public T2 getT2() {
		return t2;
	}
	public void setT2(T2 t2) {
		this.t2 = t2;
	}
	public T1 getT1() {
		return t1;
	}
	public void setT1(T1 t1) {
		this.t1 = t1;
	}
	@Override
	public String toString() {
		return "Foo [t1=" + t1 + ", t2=" + t2 + "]";
	}
	public static void main(String[] args) {
		//用包装类数据类型
		Foo<Integer,Float> f2=new Foo<>();
		Foo<User,String> f1=new Foo<>(new User("He",23),"aa");
		f1.setT1(new User("He",23));
		System.out.println(f1);
	}
}
