package cn.lore;
import java.util.Random;
import java.util.Scanner;

public class GuessSum {

	public static void main(String[] args) {
		Random rn=new Random();
		int n=rn.nextInt(100);
		System.out.println("请输入一个100以内的数");
		Scanner sc=new Scanner(System.in);
		while(true){
			int i=sc.nextInt();
			if(i<n){
				System.out.println("小了");
			}else if(i>n){
				System.out.println("大了");
			}else{
				System.out.println("对了");
				break;
			}
		}
	}

}
