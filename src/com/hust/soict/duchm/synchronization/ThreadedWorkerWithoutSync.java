package com.hust.soict.duchm.synchronization;

public class ThreadedWorkerWithoutSync extends Thread {
	private ResourcesExploiter rExp;
	
	public ThreadedWorkerWithoutSync(ResourcesExploiter rExp) {
		this.rExp = rExp;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			rExp.exploit();
		}
	}
}
