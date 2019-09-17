package cn.lore;

import java.util.Arrays;

//≈≈–Ú—°‘Ò
public class ArraySort1 {

	public static void main(String[] args) {
		int[] arr={23,40,52,36,48,2,54,68,79};
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				count++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}

}
