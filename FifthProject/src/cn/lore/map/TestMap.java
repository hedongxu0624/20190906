package cn.lore.map;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		Car c0=new Car("����",new Date(),4,170);
		Car c2=new Car("����",new Date(),6,150);
		Car c3=new Car("QQ",new Date(),5,165);
		Car c4=new Car("����",new Date(),7,200);
		Car c5=new Car("������",new Date(),9,300);
		
		HashMap carMap=new HashMap();//�ӿ�,
		
		carMap.put("k1",c0);
		carMap.put("k2",c2);
		carMap.put("k3",c3);
		carMap.put("k4",c4);
		carMap.put("k5",c5);
		
		Object obj=carMap.get("k4");
		if(obj!=null){
			Car target=(Car)obj;
			System.out.println(target.getBrand()+"\t"+target.getHoserpower()+"\t"+target.getSpeed()+target.getCreateDate());
		}else
			System.out.println("û�ҵ�");
		
		/*��ȡMap���ϵ�����Key */
		Set keySet=carMap.keySet();
		
		for(Object k:keySet){
			
			Car temp=(Car)carMap.get(k);
			System.out.println(temp.getBrand()+"\t"+temp.getHoserpower()+"\t"+temp.getSpeed());
		}
		System.out.println("+++++++++++++++++");
		
		/*��ȡ����ֵ����*/
		Collection coll=carMap.values();
		for(Object v:coll){
			System.out.println(((Car)v).getBrand());
		}
		
		/*�ж��Ƿ����ĳ������key*/
		boolean bool=carMap.containsKey("k4");
		System.out.println("�Ƿ����k4��:"+bool);
		System.out.println(carMap.containsKey("k5"));
		System.out.println(carMap.containsValue(c5));
		
		/*�Ƴ���ֵ����*/
		if(carMap.containsKey("k4")){
			Object ro=carMap.remove("k4");
			System.out.println(((Car)ro).getBrand());
		}
		System.out.println(carMap.size());
	}

}
