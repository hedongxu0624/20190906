package cn.lore.opp;
/*
 * 方法的重载：同一类中方法名相同，参数列表不同（参数类型，个数，顺序），跟返回值类型无关
 * 方法重写：必须存在继承，实现，子类重写父类的方法(子类权限不能小于父类),所有方法都可以重写
 * 重写方法返回值必须与父类方法一致
 */
public abstract class Fu{
	int a=1;
	int fn(){
		return 1;
	}
	public abstract void work();
}