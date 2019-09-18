package cn.lore.string;

import javax.jws.soap.SOAPBinding;

public class StringTest {

	public static void main(String[] args) {
		
		/*char[]chars={'I','\t','a','m',' ','a','\n','c','h','i','n','e','S','E'};
		String str=new String("�����й���");
		String str2=new String(chars);
		String str3=new String(chars,5,9);
		String str4=new String("\"\\\n\t");
		String str5="+++++";//��̬����ֱ�Ӹ�ֵ
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);*/
		
		String name2="��������";
		String name3="��������";
		
		boolean bool=StringManager.eqName(name2, name3);
		System.out.println(bool);	
		System.out.println(name2==new String("��������"));//false,ָ����ͬһ����
		
		char ch=StringManager.findChar("�Ұ���ĵ����ķ����ʱ��", 10);
		System.out.println(ch);
		
		String mail="https://@dytt8.com";
		boolean bool0=StringManager.vaildateEmailCode(mail);
		boolean bool2=StringManager.vaildateEmailPerfix(mail);
		boolean bool3=StringManager.vaildateNamePrefix("�Ŵ�ɽ","��");
		System.out.println(bool0);
		System.out.println(bool2);
		System.out.println(bool3);
		
		String password="    kdk sk  s ";
		System.out.println(password.length());
		String newPwd=password.trim();//ȥ���ո�,�м�ո�ȥ����
		System.out.println(newPwd);
		System.out.println(password);//Դ�ַ�������ı�
		
		/*string ��indexOf���ط���*/
		System.out.println("����λ��"+mail.indexOf('@'));//û�з���-1
		System.out.println("����λ��"+mail.indexOf('@',9));//���ֱ�ʾ�ӵڼ���������ʼ��
		System.out.println("����λ��"+mail.indexOf(".com"));
		System.out.println("����λ��"+mail.indexOf(".com",10));
		
		/*�ָ��ַ������鷽��*/
		String target="�ζ��������գ�������";
		String[]strs=StringManager.spilStringByTag(target, "��");
		for(String s:strs){
			
			System.out.println(s);
		}
		 
		/*��ȡ�Ӵ��ķ���*/
		String subStr=target.substring(3);
		String subStr2=target.substring(4,7);//����3��8������8
		System.out.println(subStr);
		System.out.println(subStr2);
		
		char[]chars={'I',' ','a','m',' ','a',' ','c','h','i','n','e','S','E'};
		System.out.println(StringManager.toLowerOrUpperFormString(chars, 'L'));
		
		/*valueOf���������ַ���*/
		String str7=String.valueOf(789);//�ַ���
		
		System.out.println(Integer.parseInt(str7)+100);
		System.out.println(str7+100);
		
		/*�滻�ַ����ַ���*/
		System.out.println(target.replace('��', '��'));
		System.out.println(target.replace("����", "����"));
		
	}
}
