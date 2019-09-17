package cn.lore.set;


import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		/*TreeSet<Integer> set=new TreeSet<>();//创建一个采用默认树形自然排序的TreeSet集合对象
		set.add(50);
		set.add(60);
		set.add(25);
		set.add(29);
		set.add(250);
		System.out.println(set);
		for(Object o:set){
			System.out.print(Integer.parseInt(o.toString())+"\t");
		}
		//获取当前Treeset集合的倒序排序迭代器
		Iterator it=set.descendingIterator();
		
		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		}*/
		
		TreeSet set=new TreeSet(new GoodsSorted());
		Goods g0=new Goods();
		g0.setName("剃须刀");
		g0.setPrice(280.50);
		
		Goods g2=new Goods();
		g2.setName("热水壶");
		g2.setPrice(300.00);
		
		Goods g3=new Goods();
		g3.setName("老白干");
		g3.setPrice(200.99);
		
		Goods g4=new Goods();
		g4.setName("柠檬茶");
		g4.setPrice(78.50);
		
		set.add(g0);
		set.add(g2);
		set.add(g3);
		set.add(g4);
		
		for(Object o:set){
			System.out.println(((Goods)o).getName()+"\t"+((Goods)o).getPrice());
			
		}
		System.out.println("第一个集合元素"+((Goods)set.first()).getName());
	}
 
}
