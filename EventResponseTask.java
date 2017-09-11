package com.brms.client;

public class EventResponseTask implements Runnable{

	private Object evenResponse;
	
	
	public EventResponseTask(Object evenResponse) {
		super();
		this.evenResponse = evenResponse;
	}


	public void run() {
		
		//call jms prodicer
	}

}
