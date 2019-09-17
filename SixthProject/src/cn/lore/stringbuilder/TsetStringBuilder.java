package cn.lore.stringbuilder;

public class TsetStringBuilder {

	public static void main(String[] args) {

		StringBuilder builder=new StringBuilder("我是中国人");
		//System.out.println(builder);
		
		String str="今天会下雨吗？";
		String[]strs={"会呢","是不睡会呢","已经下了","大雨"};
		System.out.println(StringBuild.concatString(str, strs));
		
		String str2="我 是中 国人 不 说外  国 话";
		String result=StringBuild.deleteSpace(str2);
		System.out.println(result);
	}

}
