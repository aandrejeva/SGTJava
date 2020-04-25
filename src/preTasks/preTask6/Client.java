package preTasks.preTask6;
import java.util.*;
import java.io.*;

import java.net.*;

public class Client {
	
	public static void main(String[] args) {
		try (Socket socket = new Socket("127.0.0.1", 6000)){
			socket.setSoTimeout(5000);
			BufferedReader echos = new BufferedReader (new InputStreamReader(socket.getInputStream()));
			PrintWriter stringToEcho = new PrintWriter(socket.getOutputStream(),true);
			Scanner scanner = new Scanner(System.in);
			
			String echoString;
			String response;
			
			do {
				System.out.println("Enter string to be passed to echo: ");
				echoString = scanner.nextLine();
				stringToEcho.println(echoString);
				
				if(!echoString.equals("exit")) {
					response = echos.readLine();
					System.out.println(response);
				}
				
			}while(!echoString.equals("exit"));
		
			
		} catch (SocketTimeoutException e){
			System.out.println("The socket time out: " + e);
		} catch (IOException e) {
			System.out.println("Client err" + e.getMessage());
		}
		

	}
}