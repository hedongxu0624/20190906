/*
 *�������أ���������ͬ�������б�ͬ�������������������ͣ����β������޹�
 *		�������ظ�����ֵ����û�й�ϵ
 */
package cn.lore.oop2;

public class Sum {
	static int i=10;
	public int sumary(int a,int b){
		return a+b;
	}
	public double sumary(int a,double b){
		return (a+b);
	}
	public static int sumary(int... arr){
		int sum=0;
		//��ǿFor..each,�ӵ�һ�������һ��
		for(int i:arr){
			sum+=i;
		}
		return sum;
	}
}
