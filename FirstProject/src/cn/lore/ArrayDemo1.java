package cn.lore;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		Random rn=new Random();
		int n=0;
		while(n<arr.length){
			int m=rn.nextInt(50);
			arr[n]=m;
			n++;
		}
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("×î´óÖµ"+max);
	}

}
