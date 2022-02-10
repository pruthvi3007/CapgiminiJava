package com.capgi.day10;

class TestThread extends Thread{
	@Override
	public void run() {
		for(int i=0;i<6;i++) {
			System.out.println("Thread class"+i+" "+currentThread().getName());
//			System.err.println("Thread class"+i+" "+currentThread().getId());
			System.err.println("Thread class"+i+" "+currentThread().getPriority());

			try {
				currentThread().sleep(1000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class MyThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestThread T1 = new TestThread();
		T1.setPriority(2);
		T1.getPriority();
		T1.setName("T1");
		T1.start();
		
		TestThread T2 =new TestThread();
		T2.setName("T2");
		T2.start();
	}

}
