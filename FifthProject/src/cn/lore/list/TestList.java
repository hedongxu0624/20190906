package cn.lore.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class TestList {

	/*public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Scanner in=new Scanner(System.in);
		System.out.println("����������Ա����Ϣ");
		for(int i=0;i<3;i++){
			System.out.println("�������"+(i+1)+"��Ա����Ϣ");
			System.out.println("����������");
			String name=in.next();
			System.out.println("�����Ա�");
			String sex=in.next();
			Employee emp=new Employee(name,sex);
			list.add(emp);
		}
		for(Object obj:list){
			//Employee emp=(Employee)obj;
			//System.out.println(emp.getName()+"\t"+emp.getSex());
			System.out.println(obj);
		}
	}*/
	public static void main(String[] args) {
		Employee emp1=new Employee("����","��");
		Employee emp2=new Employee("����","��");
		Employee emp3=new Employee("��Ư��","Ů");
		Vector v=new Vector();
		v.add(emp1);
		v.add(emp2);
		v.add(emp3);
		System.out.println("��ǰ�����Ƿ�Ϊ��"+v.isEmpty());
		System.out.println("��ǰ������Ԫ�صĸ�����"+v.size());
		Enumeration e=v.elements();//��ȡVector���е��·����ṩԪ��ö�ٵ�����
		while(e.hasMoreElements()){
			Object obj=e.nextElement();
			Employee temp=(Employee)obj;
			System.out.println(temp.getName()+"\t"+temp.getSex());
		}
		if(v.contains(emp2)){//���ز���ֵ
			v.remove(emp2);
			System.out.println("��ǰ������Ԫ�صĸ�����"+v.size());
		}
		for(Object obj:v){
			Employee temp=(Employee)obj;
			System.out.println(temp.getName()+"\t"+temp.getSex());
		}
	}
}
