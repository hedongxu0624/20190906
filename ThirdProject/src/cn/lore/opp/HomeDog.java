package cn.lore.opp;

public class HomeDog extends Dog implements HomeInterface,DrugInterface{

	@Override
	public void bark() {
		System.out.println(getName()+"在狂叫");
	}

	@Override
	public void home() {
		System.out.println("会看家");
	}
	public void home1() {
		System.out.println("会看家2");
	}

	@Override
	public void drug() {
		System.out.println("也会缉毒");
	}

	@Override
	public void work() {
		System.out.println("工作是什么");
	}

}
