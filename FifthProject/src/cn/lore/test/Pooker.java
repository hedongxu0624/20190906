package cn.lore.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * 斗地主发牌
 */
public class Pooker {

	public static void main(String[] args) {

		HashMap<Integer, String> pP=new HashMap<>();
		String[] pN={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] colors = {"♠","♥","♣","♦"};
		ArrayList<Integer> list=new ArrayList<>();
		int index=2;
		for(String num:pN){
			for(String c:colors){
				pP.put(index, c+num);
				list.add(index);
				index++;
			}
		}
		pP.put(0,"大王");
		list.add(0);
		pP.put(1,"小王");
		list.add(1);
		Collections.shuffle(list);
		System.out.println(pP);
		
		ArrayList<Integer> p1 = new ArrayList<Integer>();
		ArrayList<Integer> p2 = new ArrayList<Integer>();
		ArrayList<Integer> p3 = new ArrayList<Integer>();
		ArrayList<Integer> btm = new ArrayList<Integer>();
		
		for(int i=0;i<list.size();i++){
			if(i<3){
				btm.add(list.get(i));
			}else if(i%3==0){
				
				p1.add(list.get(i));
				
			}else if(i%3==1){
				
				p2.add(list.get(i));
				
			}else if(i%3==2){
				
				p3.add(list.get(i));
				
			}
		}
		System.out.println("P1的牌是：");
		lookPai(p1, pP);
		System.out.println("P2的牌是：");
		lookPai(p2, pP);
		System.out.println("P3的牌是：");
		lookPai(p3, pP);
		System.out.println("BTM的牌是：");
		lookPai(btm, pP);
	}


	public static void lookPai(ArrayList<Integer> p,HashMap<Integer, String> map){
		//给发的牌排序
		Collections.sort(p);
		for(Integer i:p){
			System.out.print(map.get(i)+"，");
		}
		System.out.println();
	}

}


