package preTasks.preTask6;

import java.io.IOException;
import java.net.ServerSocket;

public class Server {

	public static void main(String[] args) {
		try (ServerSocket serverSocket = new ServerSocket(6000)) {
			while(true) {
				new EchoModel(serverSocket.accept()).start();
			}
		} catch (IOException e) {
			System.out.println("Server exception" + e.getMessage());
		}

	}

}
