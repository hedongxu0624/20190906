package cn.lore;

import java.util.Arrays;

//���ֲ���/�۰����,�����������в���
public class HalfSerch {

	public static void main(String[] args) {
		int[] arr = { 15, 23, 25, 60, 26, 18, 95 };
		int start = 0;
		int end = arr.length - 1;
		int mid = (start + end) / 2;
		int n = 26;
		int count = 0;
		Arrays.sort(arr);// �����������ַ����ַ���
		while (start <= end) {
			if (n > arr[mid]) {
				start = mid + 1;
			} else if (n < arr[mid]) {
				end = mid - 1;
			} else {
				System.out.println("��Ӧ������" + mid);
				break;
			}
			count++;
			mid = (start + end) / 2;
		}
		if (start > end) {
			System.out.println("û�и�Ԫ��");
		}
		System.out.println(count);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[mid]);
	}

}
