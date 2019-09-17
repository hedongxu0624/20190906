package cn.lore;

import java.util.Arrays;

public class Circul {

	public static void main(String[] args) {
		int[] arr = new int[100];
		int index = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0)
				continue;
			else {
				arr[index] = i;
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
