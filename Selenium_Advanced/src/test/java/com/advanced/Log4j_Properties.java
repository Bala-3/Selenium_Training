package com.advanced;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4j_Properties {


		static final Logger logger1=Logger.getLogger(Log4j_Properties.class);

		public static void main(String[] args) {

		PropertyConfigurator.configure("src\\test\\java\\com\\advanced\\log4j.properties");
		logger1.debug("Example for debug msg");
		logger1.info("Example for info msg");
		logger1.warn("Example for warn msg");
		logger1.error("Example for error msg");
		logger1.fatal("Example for fatal msg");

		}
}
