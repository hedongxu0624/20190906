package cn.lore.map;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		
		Car c0=new Car("哈弗",new Date(),4,170);
		Car c2=new Car("奔驰",new Date(),6,150);
		Car c3=new Car("QQ",new Date(),5,165);
		Car c4=new Car("红旗",new Date(),7,200);
		Car c5=new Car("法拉利",new Date(),9,300);
		
		HashMap carMap=new HashMap();//接口,
		
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
			System.out.println("没找到");
		
		/*获取Map集合的所有Key */
		Set keySet=carMap.keySet();
		
		for(Object k:keySet){
			
			Car temp=(Car)carMap.get(k);
			System.out.println(temp.getBrand()+"\t"+temp.getHoserpower()+"\t"+temp.getSpeed());
		}
		System.out.println("+++++++++++++++++");
		
		/*获取所有值对象*/
		Collection coll=carMap.values();
		for(Object v:coll){
			System.out.println(((Car)v).getBrand());
		}
		
		/*判断是否包含某个给定key*/
		boolean bool=carMap.containsKey("k4");
		System.out.println("是否包含k4键:"+bool);
		System.out.println(carMap.containsKey("k5"));
		System.out.println(carMap.containsValue(c5));
		
		/*移除键值对象*/
		if(carMap.containsKey("k4")){
			Object ro=carMap.remove("k4");
			System.out.println(((Car)ro).getBrand());
		}
		System.out.println(carMap.size());
	}

}
