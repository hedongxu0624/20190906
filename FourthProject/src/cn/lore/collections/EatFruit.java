package cn.lore.collections;
//限制类型,上界定界符
public class EatFruit<T extends Fruit> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	public static void main(String[] args) {
		EatFruit<Apple> e=new EatFruit<>();
		EatFruit<RedApple> e1=new EatFruit<>();
	}
}
