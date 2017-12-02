package com.wallace.thread.basic;

public class ThreadVariations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerThread1("InnerThread1");
		new InnerThread2("InnerThread2");
		new ThreadMethod("ThreadMethod").runTask();
	}

}

class InnerThread1 {

	private int countDown = 5;

	@SuppressWarnings("unused")
	private Inner inner;

	public InnerThread1(String name) {
		inner = new Inner(name);
	}

	private class Inner extends Thread {

		public Inner(String name) {
			super(name);
			start();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return getName() + " " + countDown;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {
				System.out.println(this);
				if (--countDown == 0) {
					return;
				}
				try {
					sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class InnerThread2 {

	private int countDown = 5;

	private Thread t;

	public InnerThread2(String name) {
		t = new Thread(name) {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					System.out.println(this);
					if (--countDown == 0) {
						return;
					}
					try {
						sleep(10);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return getName() + " " + countDown;
			}
		};
		t.start();
	}

}

class ThreadMethod {

	private int countDown = 5;

	private Thread t;

	private String name;

	public ThreadMethod(String name) {
		this.name = name;
	}

	public void runTask() {
		if (t == null) {
			t = new Thread(name) {

				@Override
				public void run() {
					while (true) {
						System.out.println(this);
						if (--countDown == 0) {
							return;
						}
						try {
							sleep(10);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

				@Override
				public String toString() {
					// TODO Auto-generated method stub
					return getName() + " " + countDown;
				}
			};
			t.start();
		}
	}

}