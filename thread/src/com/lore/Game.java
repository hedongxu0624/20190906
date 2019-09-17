package com.lore;

import java.util.Random;
import java.util.Scanner;

public class Game implements Runnable{
	private boolean isrun = true;
	private boolean ispuss = false;
	@Override
	public void run() {
		Random rd = new Random();
		while(isrun){
			if(ispuss){
				try {
					synchronized (this) {
					wait();
					}	
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			int r = Math.abs(rd.nextInt())%10;
			if(r>=0 && r<4){
				System.out.println("Ê¯Í·");
			}else if(r>=4 && r<=6){
				System.out.println("¼ôµ¶");
			}else{
				System.out.println("²¼");
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Game game = new Game();
		Thread t1 = new Thread(game);
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while(b){
			int n = sc.nextInt();
			
			switch(n){
			case 0:
				t1.start();
				break;
			case 1:
				game.ispuss=true;
				break;
			case 2:
				synchronized (game) {
					game.ispuss=false;
					game.notify();
				}
				break;
			case 3:
				game.isrun = false;
				b = false;
				break;
			}
		}
	}
}
