package blogex.ex0721;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client0721 {

	public static void main(String[] args) {
		
		//소켓 생성
		Socket cliso = null;
		
		//접속할 서버 IP, port정보
		String serverIP = null;
		
		int port = 10001;
		
		try {
			
			serverIP = InetAddress.getLocalHost().getHostAddress();
			
			//실제 사용시에는 serverIP와 port를 꼭 입력할것 
			//EX - Socket socket = new Socket("195.000.00.20", port); 
			
			cliso = new Socket(serverIP, port);

			System.out.println("서버에 접속하였습니다.");
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(cliso !=null) cliso.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

