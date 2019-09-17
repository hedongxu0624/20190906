package cn.lore;

import java.util.Arrays;

//二分查找/折半查找,数组有序排列才行
public class HalfSerch {

	public static void main(String[] args) {
		int[] arr = { 15, 23, 25, 60, 26, 18, 95 };
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;
		int n = 26;
		int count = 0;
		Arrays.sort(arr);// 做不到排序纯字符的字符串
		while (start <= end) {
			if (n > arr[mid]) {
				start = mid + 1;
			} else if (n < arr[mid]) {
				end = mid - 1;
			} else {
				System.out.println("对应的索引" + mid);
				break;
			}
			count++;
			mid = (start + end) / 2;
		}
		if (start > end) {
			System.out.println("没有该元素");
		}
		System.out.println(count);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[mid]);
	}

}
