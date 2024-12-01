package question03;

import java.util.concurrent.atomic.AtomicInteger;

public class User implements Runnable {
	private static final AtomicInteger userCounter = new AtomicInteger(1);
	private final int userId;
	private final ResourseManager resourseManager;
	
	public User(int userId, ResourseManager resourseManager) {
		this.userId = userCounter.getAndIncrement();
		this.resourseManager = resourseManager;
	}
	
	public void run() {
		try {
			while (true) {
                resourseManager.requestResource();
                System.out.println("User " + userId + " acquired a resource.");
         
                Thread.sleep(1000);
                resourseManager.releaseResource();
                System.out.println("User " + userId + " released the resource.");
            
                Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
}
