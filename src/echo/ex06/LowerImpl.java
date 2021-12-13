package echo.ex06;

public class LowerImpl implements Runnable{

	@Override
	public void run() {
		
		for(char cLower = 'a'; cLower<='z'; cLower++ ) {
			System.out.println(cLower);
			//바로출력되서 상황을 알아보기 위해 강제로 출력 시간 값을 준 것.
			try {
				Thread.sleep(1000); //1초씩 출력 시간을 주겠다
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
	
}
