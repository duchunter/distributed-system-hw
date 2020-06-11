package com.hust.soict.duchm.synchronization;

public class ThreadedWorkerWithSync extends Thread {
	private ResourcesExploiter rExp;
	
	public ThreadedWorkerWithSync(ResourcesExploiter rExp) {
		this.rExp = rExp;
	}
	
	@Override
	public void run() {
		synchronized(rExp) {
			for (int i = 0; i < 1000; i++) {
				rExp.exploit();
			}
		}
	}
}
