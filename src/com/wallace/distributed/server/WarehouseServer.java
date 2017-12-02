
import java.rmi.RemoteException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class WarehouseServer {

	public static void main(String[] args) throws NamingException,
			RemoteException {

		System.setProperty("java.security.policy", "server.policy");
		System.setSecurityManager(new SecurityManager());

		WarehouseImpl backupWarehouse = new WarehouseImpl(null);
		WarehouseImpl centralWarehouse = new WarehouseImpl(backupWarehouse);
		centralWarehouse.add("juice", new Product("Organe", 15.25));
		backupWarehouse
				.add("java", new Book("Core java 2", "494313134", 44.95));
		Context namingContext = new InitialContext();
		namingContext.bind("rmi:central_warehouse", centralWarehouse);
	}

}
