package cn.lore;

import java.util.Arrays;
import java.util.Random;
//ð��
public class ArraySort {

	public static void main(String[] args) {
		int[] arr=new int[6];
		int count=0;
		int size=arr.length;
		Random rn=new Random();
		for(int i=0;i<arr.length;i++){
			int n=rn.nextInt(100);
			arr[count]=n;
			count++;
		}
		System.out.println(Arrays.toString(arr));
		int m=0;
		//���ѭ����������
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-1-i;j++){
				if(arr[j]<arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					//m++;
				}
				//�������ǽ���������������ѭ������
				m++;
			}
		}
		System.out.println("һ��ִ�еĴ���Ϊ��"+m);
		System.out.println(Arrays.toString(arr));
		System.out.println(size);
	}

}
