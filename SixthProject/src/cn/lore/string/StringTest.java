package cn.lore.string;

import javax.jws.soap.SOAPBinding;

public class StringTest {

	public static void main(String[] args) {
		
		/*char[]chars={'I','\t','a','m',' ','a','\n','c','h','i','n','e','S','E'};
		String str=new String("我是中国人");
		String str2=new String(chars);
		String str3=new String(chars,5,9);
		String str4=new String("\"\\\n\t");
		String str5="+++++";//静态常量直接赋值
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);*/
		
		String name2="东方不败";
		String name3="东方不败";
		
		boolean bool=StringManager.eqName(name2, name3);
		System.out.println(bool);	
		System.out.println(name2==new String("东方不败"));//false,指向不是同一对象
		
		char ch=StringManager.findChar("我爱你的倒萨的发达的时代", 10);
		System.out.println(ch);
		
		String mail="https://@dytt8.com";
		boolean bool0=StringManager.vaildateEmailCode(mail);
		boolean bool2=StringManager.vaildateEmailPerfix(mail);
		boolean bool3=StringManager.vaildateNamePrefix("张翠山","张");
		System.out.println(bool0);
		System.out.println(bool2);
		System.out.println(bool3);
		
		String password="    kdk sk  s ";
		System.out.println(password.length());
		String newPwd=password.trim();//去掉空格,中间空格去不掉
		System.out.println(newPwd);
		System.out.println(password);//源字符串不会改变
		
		/*string 的indexOf重载方法*/
		System.out.println("索引位置"+mail.indexOf('@'));//没有返回-1
		System.out.println("索引位置"+mail.indexOf('@',9));//数字表示从第几个索引开始查
		System.out.println("索引位置"+mail.indexOf(".com"));
		System.out.println("索引位置"+mail.indexOf(".com",10));
		
		/*分割字符串数组方法*/
		String target="何东旭，特朗普，金正恩";
		String[]strs=StringManager.spilStringByTag(target, "，");
		for(String s:strs){
			
			System.out.println(s);
		}
		 
		/*提取子串的方法*/
		String subStr=target.substring(3);
		String subStr2=target.substring(4,7);//索引3到8不包括8
		System.out.println(subStr);
		System.out.println(subStr2);
		
		char[]chars={'I',' ','a','m',' ','a',' ','c','h','i','n','e','S','E'};
		System.out.println(StringManager.toLowerOrUpperFormString(chars, 'L'));
		
		/*valueOf方法构建字符串*/
		String str7=String.valueOf(789);//字符串
		
		System.out.println(Integer.parseInt(str7)+100);
		System.out.println(str7+100);
		
		/*替换字符或字符串*/
		System.out.println(target.replace('东', '晓'));
		System.out.println(target.replace("东旭", "奕葶"));
		
	}
}
