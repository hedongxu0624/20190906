package cn.lore.stringbuilder;

public class TsetStringBuilder {

	public static void main(String[] args) {

		StringBuilder builder=new StringBuilder("�����й���");
		//System.out.println(builder);
		
		String str="�����������";
		String[]strs={"����","�ǲ�˯����","�Ѿ�����","����"};
		System.out.println(StringBuild.concatString(str, strs));
		
		String str2="�� ���� ���� �� ˵��  �� ��";
		String result=StringBuild.deleteSpace(str2);
		System.out.println(result);
	}

}
