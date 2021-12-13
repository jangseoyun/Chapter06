package echo.ex03;

public class DigitThread extends Thread {
	// 틀 !
	// 스레드 상속으로 독립적으로 일을 시키겠다.
	// 출장 보내고 오는것은 정해줬지만 출장가서 하는일은 개발자가

	@Override
	public void run() {

		for (int cnt = 0; cnt <= 10; cnt++) {
			System.out.println(cnt);
			
			//바로출력되서 상황을 알아보기 위해 강제로 출력 시간 값을 준 것.
			try {
				Thread.sleep(1000); //1초씩 출력 시간을 주겠다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
