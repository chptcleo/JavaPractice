package com.io.chat;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class SimpleChatClientOther {

	JTextArea incoming;
	JTextField outgoing;
	Socket socket;
	BufferedReader bufferedReader;
	PrintWriter printWriter;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SimpleChatClientOther().go();
	}

	public void go() {
		JFrame jFrame = new JFrame("Simple Chat Client");
		JPanel mainPanel = new JPanel();
		incoming = new JTextArea(15, 50);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(false);

		JScrollPane qScroller = new JScrollPane(incoming);
		qScroller
				.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(qScroller);
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);

		setUpNetworking();

		Thread readerThread = new Thread(new IncomingReader());
		readerThread.start();

		jFrame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		jFrame.setSize(400, 500);
		jFrame.setVisible(true);
	}

	private void setUpNetworking() {
		try {
			socket = new Socket("127.0.0.1", 5000);
			InputStreamReader inputStreamReader = new InputStreamReader(
					socket.getInputStream());
			bufferedReader = new BufferedReader(inputStreamReader);
			printWriter = new PrintWriter(socket.getOutputStream());
			System.out.println("networking established");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public class SendButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			printWriter.println(outgoing.getText());
			printWriter.flush();
			outgoing.setText("");
			outgoing.requestFocus();
		}

	}

	public class IncomingReader implements Runnable {

		public void run() {
			// TODO Auto-generated method stub
			String message;
			try {
				while ((message = bufferedReader.readLine()) != null) {
					System.out.println("read " + message);
					incoming.append(message + "\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
