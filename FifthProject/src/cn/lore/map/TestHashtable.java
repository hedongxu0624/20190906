package cn.lore.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TestHashtable {

	public static void main(String[] args) {
		//���ܴ洢�ռ����ֵ
//		Hashtable ht=new Hashtable();
//		ht.put("k0", "������");
//		ht.put("k1", "������");
//		ht.put("k2", "������");
		//ht.put(null, "������");
//		System.out.println(ht.size());
		
		Scanner in=new Scanner(System.in);
		//������Ķ���
		System.out.println("����������ѧ����Ϣ��");
		ArrayList stuList=new ArrayList();
		for(int i=1;i<=3;i++){
			HashMap stuMap=new HashMap();//ʹ��map����ѧ��ʵ��������
			System.out.println("�������"+i+"��ѧ����Ϣ");
			System.out.println("������ѧ������");
			String name=in.next();
			stuMap.put("name", name);
			System.out.println("������ѧ���Ա�");
			String sex=in.next();
			stuMap.put("sex", sex);
			System.out.println("������ѧ������");
			int age=in.nextInt();
			stuMap.put("age", age);
			stuList.add(stuMap);
		}
		System.out.println("����ѧ����Ϣ��");
		for(Object m:stuList){
			Map stuMap=(HashMap)m;
			System.out.println(stuMap.get("name")+"\t"+stuMap.get("sex")+"\t"+stuMap.get("age"));
		}
	}

}
