package cn.lore.string;

public class StringManager {

	//�Ƚϸ��������˵������Ƿ���ȫ��ͬ
	//��ͬ����true�����򷵻�false
	public static boolean eqName(String name2,String name3){
		return name2.equals(name3)?true:false;
	}
	//���ո����������Ҵ�λ���ַ�������
	public static char findChar(String resource,int index){
		if(index<0||index>=resource.length())//����
			return '?';
		return resource.charAt(index);
	}
	/**
	 * ��֤��������������Ƿ���.comΪ��β,httpΪǰ׺
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
	//�ָ��ַ������ָ���
	public static String[] spilStringByTag(String source,String tag){
		return source.split(tag);
	}
	//���ַ�������ת��char������
	public static char[] toArrayFromString(String target){
		return target.toCharArray();
	}
	//��������char������ݲ���chת��С��д��ĸ�ı��С
	public static String toLowerOrUpperFormString(char[] chs,char ch){
		if(ch=='l'||ch=='L')
		return new String(chs).toLowerCase();
		return new String(chs).toUpperCase();
	}
	
}
