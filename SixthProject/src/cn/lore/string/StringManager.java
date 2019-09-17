package cn.lore.string;

public class StringManager {

	//比较给定两个人的名字是否完全相同
	//相同返回true，否则返回false
	public static boolean eqName(String name2,String name3){
		return name2.equals(name3)?true:false;
	}
	//按照给定索引查找此位置字符并返回
	public static char findChar(String resource,int index){
		if(index<0||index>=resource.length())//长度
			return '?';
		return resource.charAt(index);
	}
	/**
	 * 验证给定的邮箱号码是否以.com为结尾,http为前缀
	 */
	public static boolean vaildateEmailCode(String mail){
		return mail.endsWith(".com")?true:false;
	}
	public static boolean vaildateEmailPerfix(String mail){
		return mail.startsWith("http")?true:false;
	}
	public static boolean vaildateNamePrefix(String name,String prefix){
		return name.startsWith(prefix)?true:false;
	}
	//分割字符串，分隔符
	public static String[] spilStringByTag(String source,String tag){
		return source.split(tag);
	}
	//将字符串对象转换char型数组
	public static char[] toArrayFromString(String target){
		return target.toCharArray();
	}
	//将给定得char数组根据参数ch转换小大写字母改变大小
	public static String toLowerOrUpperFormString(char[] chs,char ch){
		if(ch=='l'||ch=='L')
		return new String(chs).toLowerCase();
		return new String(chs).toUpperCase();
	}
	
}
