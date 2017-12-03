package com.pattern.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemote extends Remote {

	void sayHello() throws RemoteException;
}
