package question03;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ResourseManager {
	private int availableResources;
	private final Lock lock = new ReentrantLock();
	private final Condition resourseAvailable = lock.newCondition();
	
	public ResourseManager(int initialResources) {
		super();
		this.availableResources = initialResources;
	}
	
	public void requestResource() throws InterruptedException{
		lock.lock();
		try {
			while(availableResources == 0) {
				resourseAvailable.await();
			}
		} finally {
			lock.unlock();
		}
	}
	
	public void releaseResource() {
		lock.lock();
		try {
			availableResources++;
			resourseAvailable.signal();
		} finally {
			lock.unlock();
		}
	}
	
}
