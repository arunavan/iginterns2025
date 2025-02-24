package com.insight.conucrrency;
class Q1  {
	int n;
	boolean valueset = false;
	
	 synchronized int  get( ) {
		if (!valueset)
		try {
			wait( );//producer to wait
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		} 
		System.out.println( "Got: " + n);
		valueset = false;
		notify( );
		return n;
	}

	 synchronized void put( int n) {
		if (valueset)
		try {
			wait( ); //consumer to wait
		} catch (InterruptedException e) {
			System.out.println("InterruptedException caught");
		} 
		this.n = n;
		valueset = true;
		System.out.println( "Put: " + n); 
		notify( );
	}
}

class Producer implements Runnable {
	Q1 q;
	Producer ( Q1 q) {
		this.q = q;
		new Thread( this, "Producer").start( );
	}
	
	public void run( ){
		int i = 0; 
		for(int index=1;index<=5;index++) {
			q.put (i++); 
		}
	}
}

class Consumer implements Runnable {
	Q1 q;
	Consumer ( Q1 q) {
		this.q = q;
		new Thread (this, "Consumer").start( );
	} 
	
	public void run( ) {
		for(int index=1;index<=5;index++) {
			q.get( );
		}
	}
}

class ProducerConsumer {
	public static void main (String args [ ] ){
		Q1 q = new Q1( );
		new Producer (q);
		new Consumer (q);
		System.out.println("Press Control-C to stop");
	}
} 