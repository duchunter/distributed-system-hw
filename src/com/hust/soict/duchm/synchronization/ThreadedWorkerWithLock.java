package com.hust.soict.duchm.synchronization;

public class ThreadedWorkerWithLock extends Thread {
	private ResourcesExploiter rExp;
	
	public ThreadedWorkerWithLock(ResourcesExploiterWithLock rExp) {
		this.rExp = rExp;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			rExp.exploit();
		}
	}
}
