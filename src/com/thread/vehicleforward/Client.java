package com.thread.vehicleforward;

public class Client {
	
	private void drive(Vehicle vehicle) {
		new Thread(vehicle).start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client1 = new Client();
		Client client2 = new Client();
		Vehicle car = new Car();
		Vehicle bicycle = new Bicycle();
		try {
			client1.drive(car);
			Thread.sleep(1000);
			client2.drive(bicycle);
			Thread.sleep(1000);
			client1.drive(bicycle);
			Thread.sleep(1000);
			client2.drive(car);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
