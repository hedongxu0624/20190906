package cn.lore;

import java.util.Arrays;
import java.util.Random;

public class StringDemo {

	public static void main(String[] args) {
		String[] names={"����","����","�ζ���","����","����","��ɳ","�ֶ�"};
		System.out.println(Arrays.toString(names));
		Random rn=new Random();
		int i=rn.nextInt(names.length);
		System.out.println(names[i]);
	}

}
