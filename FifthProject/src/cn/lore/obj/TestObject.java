package cn.lore.obj;

public class TestObject {

	public static void main(String[] args) {

		Users user=new Users();
		Users user2=new Users();
		boolean bool=user.equals(user2);
		System.out.println(bool);
		
		Users user3=user;
		System.out.println(user.equals(user3));
		
		Class cla=user.getClass();
		System.out.println(cla.getName());
	}

}
