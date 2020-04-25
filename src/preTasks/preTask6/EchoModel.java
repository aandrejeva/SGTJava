package preTasks.preTask6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoModel extends Thread{

	private Socket socket;
	
	//constructor
	public EchoModel(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
			
			while(true) {
				String echoString = input.readLine();
				System.out.println("Received client input: " + echoString);
				
				if(echoString.equals("exit")) {
					break;
				}
				try {
					Thread.sleep(3000);
				} catch(InterruptedException e) {
					System.out.println("Thread interrupted" + e.getMessage());
				}
				output.println(echoString);
			}
		} catch(IOException e) {
			System.err.println("Faild: " + e.getMessage());
		} finally {
			try {
				socket.close();
			} catch(IOException e) {
				System.out.println("Close Failed: " + e.getMessage());
			}
		}
		
	}//end run()

}
