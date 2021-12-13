package echo.ex04;

public class MultiThreadApp {

	public static void main(String[] args) {
		
		//1.스레드 생성
		Thread treadDigit = new DigitThread();
		Thread treadLower = new LowerThread();
		Thread treadUpper = new UpperThread();
		
		//2. 출장 
		treadDigit.start();
		treadLower.start();
		treadUpper.start();
		
		
	}

}
