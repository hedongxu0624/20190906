package com.lore;

public class Thread1 extends Thread{
	private int n;
	private boolean f = true;
	public Thread1(int n){
		this.n = n;
	}
	public void run(){
		while(f){
			try {
				sleep(2000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(n--);
			if(n<=0){
				f=false;
			}
		} 
	}
	public static void main(String[] args) {
		Thread td1 = new Thread1(10);
		Thread td2 = new Thread1(20);
		td1.start();
		td2.start();
	}
}
