import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.registry.LocateRegistry;

public class Server {

	public static void main(String[] args) {
		
		try {
			LocateRegistry.createRegistry(1099);
			
			//System.setSecurityManager(new RMISecurityManager());
				
			HiInterface hi = new Hi("Hello World");

			Naming.rebind("rmi://192.168.1.18:1099/A", hi);

			System.out.println("Server is ready!");
		} catch (Exception e) {
			System.out.println("Hi Server failed: " + e);
		}
	}
}
