package cn.lore.stringbuilder;

public class StringBuild {

	//�����ַ��� ����
	public static String concatString(String base,String[] strs){
		
		StringBuilder builder = new StringBuilder(base);
		for(String s:strs){
			builder.append(" "+s);
		}
		return builder.toString();
	}
	//ɾ���ַ������пո�
	public static String deleteSpace(String target){
		while(target.contains(" ")){
			StringBuilder builder=new StringBuilder(target);
			int index=builder.indexOf(" ");//���ҿո�λ��
			builder.deleteCharAt(index);//ִ��ɾ���ո�
			target=builder.toString();//����ΪĿ���ַ�����ֵ
		}
		return target;
	}
}
