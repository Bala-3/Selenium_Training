package com.advanced;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;

public class log4j_xml {

	static final Logger logger1=Logger.getLogger(log4j_xml.class);

	public static void main(String[] args) {
		
	    DOMConfigurator.configure("src\\test\\java\\com\\advanced\\log4j.xml");
		logger1.debug("Example for debug msg");
		logger1.info("Example for info msg");
		logger1.warn("Example for warn msg");
		logger1.error("Example for error msg");
		logger1.fatal("Example for fatal msg");

	}
}