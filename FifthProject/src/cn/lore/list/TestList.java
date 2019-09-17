package cn.lore.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class TestList {

	/*public static void main(String[] args) {
		ArrayList list=new ArrayList();
		Scanner in=new Scanner(System.in);
		System.out.println("请输入三个员工信息");
		for(int i=0;i<3;i++){
			System.out.println("请输入第"+(i+1)+"个员工信息");
			System.out.println("输入姓名：");
			String name=in.next();
			System.out.println("输入性别：");
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
		Employee emp1=new Employee("狼王","男");
		Employee emp2=new Employee("大卫","男");
		Employee emp3=new Employee("孙漂亮","女");
		Vector v=new Vector();
		v.add(emp1);
		v.add(emp2);
		v.add(emp3);
		System.out.println("当前集合是否为空"+v.isEmpty());
		System.out.println("当前集合中元素的个数是"+v.size());
		Enumeration e=v.elements();//获取Vector独有的新方法提供元素枚举迭代器
		while(e.hasMoreElements()){
			Object obj=e.nextElement();
			Employee temp=(Employee)obj;
			System.out.println(temp.getName()+"\t"+temp.getSex());
		}
		if(v.contains(emp2)){//返回布尔值
			v.remove(emp2);
			System.out.println("当前集合中元素的个数是"+v.size());
		}
		for(Object obj:v){
			Employee temp=(Employee)obj;
			System.out.println(temp.getName()+"\t"+temp.getSex());
		}
	}
}
