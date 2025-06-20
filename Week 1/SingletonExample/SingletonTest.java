public class SingletonTest {
	
	public static void main(String[] args) {
		User1 u1=new User1();
		User2 u2=new User2();
		
		Logger l1=Logger.getInstance();
		
		l1.log("User1 is logged using logger instance");
		u1.getUserName();
		
		l1.log("User2 is logged using logger instance");
		u2.getUserName();

		System.out.println("Number of instances created = " + Logger.getInstanceCount());
		if(Logger.getInstanceCount()==1)
		{
			System.out.println("Singleton Pattern is successfully implemented with only one instance of Logger class created.");
		}
		else
		{
			System.out.println("Singleton Pattern failed");
		}	
	}

}
