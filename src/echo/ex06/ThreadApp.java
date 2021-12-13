package echo.ex06;

public class ThreadApp {

	public static void main(String[] args) {
		
		//1.Thread 생성, 정의
		//Thread 생성자에 바로 넣어줌
		/*
		Runnabel digit = new DigitRunableImpl();
		Runnable lower = new LowerImpl();
		Runnable upper = new UpperImpl();
		
		Thread thread1 = new Thread(digit);
		Thread thread2 = new Thread(lower);
		Thread thread3 = new Thread(upper);
		*/
		
		//Thread 생성자에 바로 넣어줌
		Thread thread1 = new Thread(new DigitRunableImpl());
		Thread thread2 = new Thread(new LowerImpl());
		Thread thread3 = new Thread(new UpperImpl());

		//2. 출장 start
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
