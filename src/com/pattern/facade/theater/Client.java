package com.wallace.pattern.facade.theater;

public class Client {

	public static void main(String[] args) {
		new Client().test();
	}

	private void test() {
		Light light = new Light();
		DVDPlayer dvdPlayer = new DVDPlayer();

		TheaterFacade theaterFacade = new TheaterFacade(light, dvdPlayer);

		theaterFacade.playMovie();
		theaterFacade.endMovie();
	}

}
