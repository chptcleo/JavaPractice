package com.io.chat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

public class SimpleChatServer {

	ArrayList<PrintWriter> clientOutputStreams;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleChatServer().go();
	}

	public void go() {
		clientOutputStreams = new ArrayList<PrintWriter>();
		try {
			ServerSocket serverSocket = new ServerSocket(5000);
			while (true) {
				Socket clientSocket = serverSocket.accept();
				PrintWriter printWriter = new PrintWriter(
						clientSocket.getOutputStream());
				clientOutputStreams.add(printWriter);

				Thread thread = new Thread(new ClientHandler(clientSocket));
				thread.start();
				System.out.println("got a connection");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public class ClientHandler implements Runnable {

		Socket clientSocket;
		BufferedReader bufferedReader;

		public ClientHandler(Socket clientSocket) {
			this.clientSocket = clientSocket;
			try {
				InputStreamReader inputStreamReader = new InputStreamReader(
						clientSocket.getInputStream());
				bufferedReader = new BufferedReader(inputStreamReader);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		public void run() {
			// TODO Auto-generated method stub
			String message;
			try {
				while ((message = bufferedReader.readLine()) != null) {
					System.out.println("read " + message);
					tellEveryone(message);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void tellEveryone(String message) {
		Iterator<PrintWriter> iterator = clientOutputStreams.iterator();
		while (iterator.hasNext()) {
			PrintWriter printWriter = (PrintWriter) iterator.next();
			printWriter.println(message);
			printWriter.flush();
		}
	}

}
