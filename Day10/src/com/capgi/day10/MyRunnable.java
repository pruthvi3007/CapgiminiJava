package com.capgi.day10;

class RunnableThread implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 6; i++) {
			System.out.println("Thread class" + i + " " + Thread.currentThread().getName());
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MyRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableThread thread = new RunnableThread();

		Thread T1 = new Thread(thread);
		T1.setName("T1");
		T1.start();
		

		Thread T2 = new Thread(thread);
		T2.setName("T2");
		T2.start();

	}

}
