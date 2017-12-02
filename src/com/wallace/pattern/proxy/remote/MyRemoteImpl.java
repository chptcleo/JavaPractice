package com.wallace.pattern.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class MyRemoteImpl implements MyRemote {

	@Override
	public void sayHello() {
		System.out.println("server says: hey buddy.");
	}

	public static void main(String[] args) {
		MyRemote myRemote = new MyRemoteImpl();
		try {
			Naming.rebind("remoteHello", myRemote);
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
