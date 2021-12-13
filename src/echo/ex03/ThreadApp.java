package echo.ex03;

public class ThreadApp {

	public static void main(String[] args) throws InterruptedException {
		//메인 
		//1. 메모리에 올리기 (오버라이딩)
		Thread thread = new DigitThread();
		
		//2. thread 시작 (출장 준비)
		thread.start();//독립적인 일-->숫자 언제되든 상관없음 실행만 시켜주면됨
		
		//3. 메인 스레드의 일 --> 알파벳 순서대로 출력
		for(char ch = 'A'; ch<='Z'; ch++ ) {
			System.out.println(ch);
			Thread.sleep(1000); //Thread 스태틱이다.
		}

	}

}
