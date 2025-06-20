public class Logger {
    private static Logger instance;
    private static int instanceCount = 0;
    
    private Logger() {
    	instanceCount+=1;
        System.out.println("Logger created");
    }
    
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    public static int getInstanceCount() {
    	return instanceCount;
    }
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
