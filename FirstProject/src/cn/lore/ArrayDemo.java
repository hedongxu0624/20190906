package cn.lore;

import java.util.Arrays;
import java.util.Random;

public class ArrayDemo {

	/*public static void main(String[] args) {
		int[] arr=new int[10];
		Random rn=new Random();
		for(int i=0;i<arr.length;i++){
			int n=rn.nextInt(100);
			arr[i]=n;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1)
				System.out.print(arr[i]);
			else
				System.out.print(arr[i]+",");
		}
	}*/
	public static void main(String[] args){
		int[] arr=new int[10];
		Random rn=new Random();
		for(int i=0;i<arr.length;i++){
			int n=rn.nextInt(100);
			arr[i]=n;
		}
		//外层控制轮数，内层控制次数
		/*for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}*/
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>arr[i]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		/*for(int j=0;j<arr.length;j++){
			if(j==arr.length-1)
				System.out.print(arr[j]);
			else
				System.out.print(arr[j]+",");
		}*/
		System.out.println(Arrays.toString(arr));
	}
}
