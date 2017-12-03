package com.thread.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class HorseRace {

	private static final int FINISH_LINE = 75;

	private ExecutorService exec = Executors.newCachedThreadPool();

	private List<Horse> horses = new ArrayList<Horse>();

	private CyclicBarrier cyclicBarrier;

	public HorseRace(int nHorse, final int pause) {
		cyclicBarrier = new CyclicBarrier(nHorse, new Runnable() {

			@Override
			public void run() {
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < FINISH_LINE; i++) {
					sb.append("=");
				}
				System.out.println(sb);
				for (Horse horse : horses) {
					System.out.println(horse.tracks());
				}
				for (Horse horse : horses) {
					if (horse.getStrides() >= FINISH_LINE) {
						System.out.println(horse + " win");
						exec.shutdownNow();
						return;
					}
				}
				try {
					TimeUnit.MILLISECONDS.sleep(pause);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		for (int i = 0; i < nHorse; i++) {
			Horse horse = new Horse(cyclicBarrier);
			horses.add(horse);
			exec.execute(horse);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HorseRace(7, 100);
	}

}

class Horse implements Runnable {

	private static int counter = 0;

	private final int id = counter++;

	private int strides;

	private CyclicBarrier cyclicBarrier;

	private static Random random = new Random(47);

	public Horse(CyclicBarrier cyclicBarrier) {
		this.cyclicBarrier = cyclicBarrier;
	}

	public int getStrides() {
		return strides;
	}

	public String tracks() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < getStrides(); i++) {
			sb.append("*");
		}
		sb.append(id);
		return sb.toString();
	}
	
	public String toString(){
		return "Horse " + id;
	}

	@Override
	public void run() {
		while (!Thread.interrupted()) {
			synchronized (this) {
				strides += random.nextInt(3);
			}
			try {
				cyclicBarrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
