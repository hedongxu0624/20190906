package com.lore;

public class Calc extends Thread{
	private long start;
	private long end;
	public Calc(int start, int end) {
		this.start = start;
		this.end = end;
	}
	public void run(){
		long sum = 0;
		for(long i=start;i<=end;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		Thread t1 = new Calc(1, 99);
		Thread t2 = new Calc(100, 999);
		Thread t3 = new Calc(1000, 9999);
		t1.start();
		t2.start();
		t3.start();
	}
}
