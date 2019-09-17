package cn.lore.stringbuilder;

public class StringBuild {

	//连接字符串 方法
	public static String concatString(String base,String[] strs){
		
		StringBuilder builder = new StringBuilder(base);
		for(String s:strs){
			builder.append(" "+s);
		}
		return builder.toString();
	}
	//删除字符串所有空格
	public static String deleteSpace(String target){
		while(target.contains(" ")){
			StringBuilder builder=new StringBuilder(target);
			int index=builder.indexOf(" ");//查找空格位置
			builder.deleteCharAt(index);//执行删除空格
			target=builder.toString();//重新为目标字符串赋值
		}
		return target;
	}
}
