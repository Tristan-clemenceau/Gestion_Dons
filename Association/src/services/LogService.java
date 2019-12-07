package services;

import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class LogService {
	private FileHandler handler;
	private Logger logger;
	private String path;

	public LogService(String path) {
		this.path = path;
	}

	public void setLogger() throws Exception {
		handler = new FileHandler("log.txt", true);
		logger.addHandler(handler);
	}

	public void setLog(String choice, String message) {
		switch (choice.toLowerCase()) {
		case "warning":
			logger.warning(message);
			break;
		case "info":
			logger.warning(message);
			break;
		case "config":
			logger.warning(message);
			break;
		case "severe":
			logger.severe(message);
			break;
		}
	}

}
