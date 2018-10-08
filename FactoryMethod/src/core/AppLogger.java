package core;

public final class AppLogger {

	private static AppLogger logger;
	
	private AppLogger() {}
	
	public static AppLogger getInstance() {
		if (logger == null) {
			logger = new AppLogger();
		}
		return logger;
	}

	public void info(String message) {
		System.out.println("INFO " + message);
	}
	
	public void warn(String message) {
		System.out.println("WARN " + message);
	}
}
