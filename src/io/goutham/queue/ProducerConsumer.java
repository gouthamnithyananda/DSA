package io.goutham.queue;

import java.time.LocalTime;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlockingQueue queue = new ArrayBlockingQueue(4);
		
		Runnable producer = ()-> {
			while(true) {
			try {
				queue.put(LocalTime.now());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		};
		
		Runnable consumer =  ()-> {
			while(true) {
			try {
				System.out.println("Consumer: "+queue.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		};
		
		Thread producerThread = new Thread(producer);
		Thread consumerThread = new Thread(consumer);
		producerThread.start();
		consumerThread.start();
		

	}
	
	
	

}
