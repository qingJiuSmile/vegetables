package com.fragment.use.vegetables.service;

public class MyThread extends Thread {
	int i = 0;
	@Override
	public void run() {
		while(i < 5) {
			i ++;
			System.out.println(this.getName()+" running...");
			try {
                Thread.sleep(1000); // 休息1000ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
	public static void main(String[]args) throws InterruptedException {
		MyThread thread1 = new MyThread();
		System.out.println(		thread1.getState());
		thread1.start();
		System.out.println(		thread1.getState());
		thread1.join();
		System.out.println(		thread1.getState());
	}
}
