package com.kh.serverEx;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		int port = 3000;
		
		
		String serverIp = "192.00.3.58";// 주최자 집주소 IP 변경
		
		
		ServerSocket server;
		
		try {
			
			//server = new ServerSocket(port); //주최자 집 주소인 IP를 변경하지 않을 때 사용
			//server = new ServerSocket(port,InetAddress.getByName(serverIp)); ->구버전
			server = new ServerSocket(port,  50   ,InetAddress.getByName(serverIp));
			//								-> 50은 동시에 들어왔을 때 대기할 수 있는 크기
			// 내 집과 같은 나의 아이피 주소에서는 대기숫자를 작성하지 않아도 되지만
			// 남의 집 주소에서 열 때는 요청 처리를 위한 숫자 제한을 해줘야함
			// ex 파티룸
			
			
			Socket client = server.accept();
			System.out.println("클라이언트가 접속했습니다.");
			
			//BufferedReader 글자를 실시간으로 읽어오기
			BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
			//PrintWriter 를 사용해서 읽어온 글자 출력하기
			PrintWriter out = new PrintWriter(client.getOutputStream(), true);
			// 참가자한테 받은 메세지 수신하기
			String m;
			while((m = in.readLine()) != null) {
				System.out.println("send success : " + m);
				out.println(" c h e c k");
				//클라이언트가 전달한 메세지 보여주고 종료
				
				
			}
			client.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}