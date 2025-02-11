package com.insight.logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class AccountDemo {
	private static final Log LOGGER = LogFactory.getLog(AccountDemo.class);

	void disp() {
		System.out.println(" in disp...");
		LOGGER.info("in disp method of Account class");
	}

}
