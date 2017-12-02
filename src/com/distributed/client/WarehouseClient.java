
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class WarehouseClient {

	public static void main(String[] args) throws NamingException, RemoteException {
		Context namingContext = new InitialContext();
		String url = "rmi://localhost/central_warehouse";
		Warehouse centralWarehouse = (Warehouse) namingContext.lookup(url);
		double price = centralWarehouse.getPrice("Organe");
		System.out.println(price);
		List<String> keywords = new ArrayList<String>();
		keywords.add("java");
//		keywords.add("juice");
		Product p = centralWarehouse.getProduct(keywords);
		System.out.println(p.getDescription());
		System.out.println(p.getPrice());
		System.out.println(p.getLocation());
	}

}
