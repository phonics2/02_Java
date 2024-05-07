package com.kh.serverEx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		int port = 3000;
		
		String serverIP = "192.00.3.58";
		ServerSocket server;
		
		
		try {
			
			while(true) {
				//server = new ServerSocket(port);  //주최자 집 주소인 IP를 변경하지 않을때
				//server = new ServerSocket(port,InetAddress.getByName(serverIP)); ->구버전
				server = new ServerSocket(port,50,InetAddress.getByName(serverIP));
				//						->50은 동시에 들어왔을 때 대기할 수 있는 크기	
				// 내 집과 같은 나의 아이피 주소에서는 대기숫자를 작성하지 않아도 되지만
				// 남의 집 주소에서 열 때는 요청 처리를 위한 숫자 제한을 해줘야함
				// ex 파티룸
				// 내가 사람들을 초대할 주소 getByName 요청받으면 대기하는 대기열(50) 어떻게 접속해야되는지(3000)
				Socket client = server.accept();
				System.out.println("클라이언트가 접속했습니다.");
				
				//BufferedReader 글자를 실시간으로 읽어오기
				BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
				//PrintWriter 를 사용해서 읽어온 글자 출력하기
				PrintWriter out = new PrintWriter(client.getOutputStream(),true);
				
				String msg = in.readLine();
				while(msg != null) {
					System.out.println("send success" + msg);
					out.println("c h e c k");
				}
				
				//클라이언트가 전달한 메세지 보여주고 종료
				client.close();
				server.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
