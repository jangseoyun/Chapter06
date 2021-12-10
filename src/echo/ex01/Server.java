package echo.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// 한국
		// 1. 예외처리 해줘야함 ! (통신이 안될 수 있는 상황)
		ServerSocket serverSocket = new ServerSocket();

		// 2. IP 192.168.219.100 Port 10001
		serverSocket.bind(new InetSocketAddress("192.168.219.100", 10001));

		// -----------접속 확인-------------------
		System.out.println("서버시작");
		System.out.println("연결을 기다리고 있습니다");
		// ------------------------------------
		// 5. 대기하고 있다가 누가 오면 실행(연결)
		Socket socket = serverSocket.accept();

		System.out.println("클라이언트가 연결되었습니다");
		
		//6. 메세지 '받을' 준비 (빨대 꼽기)
		InputStream is = socket.getInputStream();//socket으로 연결해서 소통하는 것 생각
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//7. 메세지 받기 
		String msg = br.readLine(); // 한줄 받아오기 
		System.out.println("받은 메세지:"+msg);
		
		//8. 메세지 '보낼' 준비 (순서상관없음 위에 써도됨)
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		//9. 메세지 보내기
		bw.write(msg);
		bw.newLine();
		bw.flush();
		
		// 1. 닫기
		socket.close();
		serverSocket.close();

	}
}
