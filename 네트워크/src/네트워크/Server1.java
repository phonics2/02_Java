package 네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	
	public static void main(String[] args) {
		int port = 3000;
		ServerSocket server;
		String ip = "localhost";
		
		try {
			server = new ServerSocket(port,50,InetAddress.getByName(ip));
			
			Socket client = server.accept();
			System.out.println("클라이언트가 접속했습니다.");
			
			//버퍼 리더는 읽기임 in 으로 객채명 지정해줌
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			
			//프린트롸이터 는 쓰기 out 으로 객채명 지정 클라이언트가 입력한 정보를 출력해줘야하기 때문에 
			PrintWriter out = new PrintWriter(client.getOutputStream(),true);
			
			String m = in.readLine();
			while(m != null) {
				System.out.println("send success : " +m);
				out.print("c h e c k");
			}
			server.close();
			client.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
