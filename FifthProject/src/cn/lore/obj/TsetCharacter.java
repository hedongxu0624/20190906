package cn.lore.obj;

public class TsetCharacter {

	public static void main(String[] args) {

		char c='A';
		/*character实例的创建*/
		
		//使用构造器创建对象
		Character chObj=new Character('中');
		
		
		//使用静态方式创建对象
		Character chObj0=Character.valueOf(c);
		
		//常用实例方法
		//获取char值
		char zhong=chObj.charValue();
		System.out.println(zhong);
		
		System.out.println(chObj0.compareTo('B'));
		
		String str=chObj.toString();
		System.out.println(str+str.length());//字符串长度
	}

}
