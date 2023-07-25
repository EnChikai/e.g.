package blogex.ex0721;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server0721 {

/*	
	
1. ServerSocket과 Socket을 이용하여 
서버를 여는쪽과 접속하는쪽을 구현하시오

서버 오픈시
"- - - 서버 오픈 - - -"

클라이언트 접속시
"클라이언트가 접속하였습니다."
로 출력되어야하며

클라이언트 쪽에서는 서버 접속시
"서버에 접속하였습니다."
가 출력되어야합니다.
	
*/	
	
	public static void main(String[] args) {
		
		//서버 소켓 생성
		ServerSocket server = null;
		
		//소켓 생성
		Socket serSo = null;
		
		//포트 입력
		int port = 10001;
		
		try {
			
			//서버 생성
			server = new ServerSocket(port);
			
			System.out.println("- - - 서버 오픈 - - -");
			while(true) {
			//서버 오픈
			serSo = server.accept();
			
			System.out.println("클라이언트가 접속하였습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(serSo != null) serSo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}

