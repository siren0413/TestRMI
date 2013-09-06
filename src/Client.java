import java.rmi.Naming;


public class Client {

	
	public static void main(String[] args) {
		try {
			HiInterface hi = (HiInterface)Naming.lookup("rmi://192.168.1.18:1099/A");
			hi.setMessage("Vincent");
			System.out.println(hi.speak());
		} catch (Exception e) {
			System.out.println("HiClient exception: " + e);  
		}
	}
}
