package io.goutham.threads;




/**
 * 
 * 
 * @author gnithyan
 * 
 * Print even and odd numbers in increasing order using two threads in Java
 *
 */
public class PrintEvenOdd2Threads {

	int counter = 1;
	static int max;

	public void printOdd() throws InterruptedException {

		synchronized (this) {
			while (counter <= max) {

				if (counter % 2 != 0) {
					wait();

				}
				System.out.println("Odd");
				System.out.println(counter);
				counter++;
				notify();
			}

		}

	}

	public void printEven() throws InterruptedException {

		synchronized (this) {
			while (counter <= max) {

				if (counter % 2 == 0) {
					wait();
				}
				System.out.println("even");
				System.out.println(counter);

				counter++;
				notify();
			}

		}

	}

	public static void main(String[] args) {
		max = 10;
		PrintEvenOdd2Threads instance = new PrintEvenOdd2Threads();

		Thread evenE = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					instance.printEven();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread evenO = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					instance.printOdd();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		evenE.start();
		evenO.start();
	}

}
