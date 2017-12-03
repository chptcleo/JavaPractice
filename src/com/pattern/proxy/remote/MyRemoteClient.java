package com.pattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {

	private void drive() {
		try {
			MyRemote server = (MyRemote) Naming
					.lookup("rmi://127.0.0.1/remoteHello");
			server.sayHello();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new MyRemoteClient().drive();
	}

}
