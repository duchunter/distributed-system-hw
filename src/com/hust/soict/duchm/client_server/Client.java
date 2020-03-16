package com.hust.soict.duchm.client_server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 9898);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			System.out.println(in.readLine());
			Scanner scanner = new Scanner(System.in);
			String message = scanner.nextLine();
			while (!message.equals("stop")) {
				out.println(message);
				System.out.println(in.readLine());
				message = scanner.nextLine();
			}
			out.print("");
			socket.close();
			scanner.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
