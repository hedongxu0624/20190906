package cn.lore;
import java.util.Random;
import java.util.Scanner;

public class GuessSum {

	public static void main(String[] args) {
		Random rn=new Random();
		int n=rn.nextInt(100);
		System.out.println("������һ��100���ڵ���");
		Scanner sc=new Scanner(System.in);
		while(true){
			int i=sc.nextInt();
			if(i<n){
				System.out.println("С��");
			}else if(i>n){
				System.out.println("����");
			}else{
				System.out.println("����");
				break;
			}
		}
	}

}
