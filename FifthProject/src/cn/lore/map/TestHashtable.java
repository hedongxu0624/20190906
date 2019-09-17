package cn.lore.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestHashtable {

	public static void main(String[] args) {
		//不能存储空键或空值
//		Hashtable ht=new Hashtable();
//		ht.put("k0", "基督教");
//		ht.put("k1", "基督教");
//		ht.put("k2", "基督教");
		//ht.put(null, "基督教");
//		System.out.println(ht.size());
		
		Scanner in=new Scanner(System.in);
		//减少类的定义
		System.out.println("请输入三个学生信息：");
		ArrayList stuList=new ArrayList();
		for(int i=1;i<=3;i++){
			HashMap stuMap=new HashMap();//使用map代替学生实体数据类
			System.out.println("请输入第"+i+"个学生信息");
			System.out.println("请输入学生姓名");
			String name=in.next();
			stuMap.put("name", name);
			System.out.println("请输入学生性别");
			String sex=in.next();
			stuMap.put("sex", sex);
			System.out.println("请输入学生年龄");
			int age=in.nextInt();
			stuMap.put("age", age);
			stuList.add(stuMap);
		}
		System.out.println("所有学生信息：");
		for(Object m:stuList){
			Map stuMap=(HashMap)m;
			System.out.println(stuMap.get("name")+"\t"+stuMap.get("sex")+"\t"+stuMap.get("age"));
		}
	}

}
