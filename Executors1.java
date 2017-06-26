package javaexp;

import java.util.Map;
import java.util.concurrent.*;
import java.util.*;

public class Executors1 {
	static Map<String, Long> orders = new ConcurrentHashMap<>();
			
	static void processOrders() {
		for (String key : orders.keySet()) {
			for(int i =0;i<100; i++) {
				long oldOrder = orders.get(key);
				orders.put(key, oldOrder +i);
			}
		}
	}
	public static void main(String[] args){
		ExecutorService executor = Executors.newFixedThreadPool(10);
		executor.execute(new Test());
		
		orders.put("Bombay", 1L);
		orders.put("Chennai", 2L);
		orders.put("Ramesh", 3L);
		executor.submit(Executors1 :: processOrders);
		
		for (String key : orders.keySet()) {
			System.out.println(orders.get(key));
		}
		executor.shutdown();
	}
}

class Test implements Runnable {
	public static int value;
	int id;
	public void run(){
		for (int i=0; i< 10;i++) {
			System.out.println("iteration "+i);
		}
	}
	
	Test(){
		id = ++ value;
	}
}
