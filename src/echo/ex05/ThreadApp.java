package echo.ex05;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
		//1. 스레드를 무조건 올려야함 + run 클래스를
		// Runnable digit = new DigitRunableImpl();
		Thread thread1 = new Thread(new DigitRunableImpl());
		

		//2.  출장 (start)
		thread1.start();
		
		for(char ch = 'A'; ch<='Z'; ch++ ) {
			System.out.println(ch);
			Thread.sleep(1000); //Thread 스태틱이다.
		}
	}

}
