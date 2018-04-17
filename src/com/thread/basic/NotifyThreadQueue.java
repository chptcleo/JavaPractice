package com.thread.basic;

import java.util.PriorityQueue;

public class NotifyThreadQueue {

	private int size = 10;

	private PriorityQueue<String> queue = new PriorityQueue<String>(size);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotifyThreadQueue notifyThreadQueue = new NotifyThreadQueue();
		notifyThreadQueue.execute();
	}

	private void execute() {
		new Thread(new Producer()).start();
		new Thread(new Consumer()).start();
	}

	class Producer implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			produce();
		}

		private void produce() {
			while (true) {
				synchronized (queue) {
					queue.notify();
					queue.add("x");
					System.out.println("after produce, queue size is " + queue.size());
					if (queue.size() == size) {
						try {
							System.out.println("queue is full");
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}

	}

	class Consumer implements Runnable {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			consume();
		}

		private void consume() {
			while (true) {
				synchronized (queue) {
					queue.notify();
					queue.poll();
					System.out.println("after consume, queue size is " + queue.size());
					if (queue.size() == 0) {
						try {
							System.out.println("queue is empty");
							queue.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
	}
}
