package com.brms.client;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ResponseHander {
	
	private ExecutorService threadPoolExecutor ;
	
	private static ResponseHander INSTANCE;
	
	public static ResponseHander getInstance(){
		
		if ( INSTANCE == null){
			synchronized (ResponseHander.class){
				if ( INSTANCE == null){
					INSTANCE = new ResponseHander();
				}
			}
		}
		return INSTANCE;
	}

	private ResponseHander(){
		initThreadPool();
		
	}
	public void addResponse(Object eventResponse ){
		
		EventResponseTask task = new EventResponseTask(eventResponse);
		threadPoolExecutor.execute(task);
		 
	}
	
	
	private void initThreadPool(){
		
		int  corePoolSize  =  Integer.valueOf(System.setProperty("corePoolSize", "5")).intValue();
	    int  maxPoolSize   =  Integer.valueOf(System.setProperty("maxPoolSize", "10")).intValue();
	    long  keepAliveTime   =  Integer.valueOf(System.setProperty("keepAliveTime", "5000")).longValue();

	    
		 threadPoolExecutor = new ThreadPoolExecutor(
		                corePoolSize,
		                maxPoolSize,
		                keepAliveTime,
		                TimeUnit.MILLISECONDS,
		                new LinkedBlockingQueue<Runnable>());

	}
	
	
	
}
