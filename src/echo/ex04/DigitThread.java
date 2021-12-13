package echo.ex04;

public class DigitThread extends Thread{

	@Override
	public void run() {
		
		for(int i = 0; i<10; i++) {
			System.out.println(i);
			//바로출력되서 상황을 알아보기 위해 강제로 출력 시간 값을 준 것.
			try {
				Thread.sleep(1000); //1초씩 출력 시간을 주겠다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
}
