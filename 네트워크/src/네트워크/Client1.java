package 네트워크;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Client1 {
	
	
	public static void main(String[] args) {
		String IP;
		try {
			IP = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
