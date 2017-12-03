package com.pattern.facade.theater;

public class TheaterFacade {

	private Light light;

	private DVDPlayer dvdPlayer;

	public TheaterFacade(Light light, DVDPlayer dvdPlayer) {
		this.light = light;
		this.dvdPlayer = dvdPlayer;
	}

	public void playMovie() {
		light.off();
		dvdPlayer.play();
	}

	public void endMovie() {
		light.on();
		dvdPlayer.stop();
	}
}
