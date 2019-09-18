package cn.lore.map;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeMap;

public class TsetTreeMap {

	public static void main(String[] args) {

		TreeMap dt=new TreeMap(new Comparator() {
			//�ڲ���
			@Override
			public int compare(Object k1, Object k2) {
				Integer intK1=(Integer)k1;
				Integer intK2=(Integer)k2;
				if(intK1>intK2)
					return -1;
				else if(intK1<intK2)
					return 1;
				return 0;
			}
			
		});
		Department dep0=new Department("dep001","�з���",50);
		Department dep2=new Department("dep002","���²�",30);
		Department dep3=new Department("dep003","��ҵ��",20);
		Department dep4=new Department("dep004","�г���",100);
		
		//�洢����,������������
		dt.put(new Integer(100), dep3);
		dt.put(new Integer(50), dep0);
		dt.put(new Integer(80), dep4);
		dt.put(new Integer(10), dep2);
		
		Collection coll=dt.values();
		for(Object i:coll){
			Department depTemp=(Department)i;
			System.out.println(depTemp.getName()+"\t"+depTemp.getCode()+"\t"+depTemp.getQuantity());
		}
	}

}
