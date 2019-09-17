package cn.lore.obj;

public class TestInteger {

	public static void main(String[] args) {

		int num=5;
		Integer intObj=new Integer(num);
		System.out.println(intObj);
		//字符串形式,确保除了第一个可以代表有符号，其他字符必须是数字
		Integer intObj2=new Integer("-545");
		Integer intObj3=new Integer(-545);
		System.out.println(intObj2);
		System.out.println(intObj3);
		
		/*Integer是int的兼容包装类，可以使用int常量或变量创建一个integer实例*/
		Integer intObj4=100;
		System.out.println(intObj4);
		
		System.out.println("+++++++++++");
		/*integer常用的常量静态属性*/
		System.out.println(Integer.BYTES);//字节
		System.out.println(Integer.SIZE);//位数
		System.out.println(Integer.MAX_VALUE);//最大值
		System.out.println(Integer.MIN_VALUE);//最小值
		
		/*integer常用方法*/
		System.out.println(intObj3.compareTo(intObj4));//返回值只有0，1，-1
		
		//以int类型返回该integer的值
		int num2=intObj3.intValue();
		System.out.println(num2);
		
		//将字符串转换为int数据返回,radix进制
		int intStr=Integer.parseInt("1110",2);//第二个数表示进制,将2进制数转换为10进制
		System.out.println(intStr+12);
		System.out.println(Integer.parseInt("1110",2));
		 
		/*valueOf方法获取一个integer实例*/
		Integer intObj5=Integer.valueOf(500);
		System.out.println(intObj5);
		
		System.out.println(Integer.valueOf("500").intValue());
		System.out.println(Integer.valueOf("1111",2).intValue());
		System.out.println(Integer.valueOf("1111",8).intValue());
		
		System.out.println("+++++++++");
		/*二进制，八进制，十六进制的转换*/
		System.out.println(Integer.toBinaryString(15));
		System.out.println(Integer.toOctalString(15));
		System.out.println(Integer.toHexString(15));
	}

}
