package com.insight.logging;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
public class LogDemo {
//write log in to file
	private static final Log LOGGER = LogFactory.getLog(LogDemo.class);

	static void show() {
		//System.out.println("in show");
		LOGGER.info("in show method of same class");
	}
	public static void main(String[] args) {//fatal,error,debug,warn,info
		
		//System.out.println("in main ");
		LOGGER.info(" in main method...");
		show();
		LOGGER.info("calling account demo class");
		AccountDemo ad=new AccountDemo();
		ad.disp();
		LOGGER.info("after return  account demo class");
		

	}

}
