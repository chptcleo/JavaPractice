package com.thread.basic;

import java.util.PriorityQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionThreadQueue {

	private int size = 10;

	private PriorityQueue<String> queue = new PriorityQueue<String>(size);

	private Lock locker = new ReentrantLock();
	
	private Condition isFull = locker.newCondition();
	
	private Condition isEmpty = locker.newCondition();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConditionThreadQueue conditionThreadQueue = new ConditionThreadQueue();
		conditionThreadQueue.execute();
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
				locker.lock();
				try {
					isEmpty.signal();
					queue.add("x");
					System.out.println("after produce, queue size is " + queue.size());
					while (queue.size() == size) {
						System.out.println("queue is full");
						isFull.await();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {

					locker.unlock();
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
				locker.lock();
				try {
					isFull.signal();
					queue.poll();
					System.out.println("after consume, queue size is " + queue.size());
					while (queue.size() == 0) {
						System.out.println("queue is empty");
						isEmpty.await();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {

					locker.unlock();
				}
			}
		}
	}
}
