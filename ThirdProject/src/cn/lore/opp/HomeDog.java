package cn.lore.opp;

public class HomeDog extends Dog implements HomeInterface,DrugInterface{

	@Override
	public void bark() {
		System.out.println(getName()+"�ڿ��");
	}

	@Override
	public void home() {
		System.out.println("�ῴ��");
	}
	public void home1() {
		System.out.println("�ῴ��2");
	}

	@Override
	public void drug() {
		System.out.println("Ҳ�Ἡ��");
	}

	@Override
	public void work() {
		System.out.println("������ʲô");
	}

}
