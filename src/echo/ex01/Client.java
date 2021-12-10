package echo.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws IOException {
		// 미국
		// 3.
		Socket socket = new Socket();

		System.out.println("클라이언트 시작");

		// 4. 서버 IP , 프로그램에서 세팅한 Port 10001
		System.out.println("클라이언트 연결요청");
		socket.connect(new InetSocketAddress("192.168.219.100", 10001));
		
		//메세지 보낼 준비 (빨대 꼽기)
		OutputStream os = socket.getOutputStream(); //주스트림
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");//보조스트림
		BufferedWriter bw = new BufferedWriter(osw);
		
		//5. 메세지 보내기
		String str = "안녕하세요";
		bw.write(str);
		bw.newLine();
		bw.flush(); //-> buffered 쟁반이 꽉 차야 움직이는 것인데 보내는 데이터가 적으면 null 나옴 
		//가득 채운것으로 치겠다 
		
		//10. 메세지 받을 준비 (순서 상관없음 위에 써도됨)
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//11. 메시지 받기
		String reMsg = br.readLine(); //한줄씩 받기 
		System.out.println("server:"+reMsg);
		
		// 3. 닫기
		bw.close();
		socket.close();
		
	}

}
