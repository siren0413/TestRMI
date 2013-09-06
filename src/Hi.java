import java.net.InetAddress;
import java.rmi.RemoteException;
import java.rmi.server.RemoteServer;
import java.rmi.server.ServerNotActiveException;
import java.rmi.server.UnicastRemoteObject;

public class Hi extends UnicastRemoteObject implements HiInterface {

	private String message;

	protected Hi(String msg) throws RemoteException {
		super();
		message = msg + "I'm on server...";

	}

	@Override
	public String speak() throws RemoteException {
		
		for(int i = 0 ; i < 10 ; i ++) {
			String clienthost;
			try {
				Thread.sleep(1000);
				clienthost = RemoteServer.getClientHost();
				InetAddress ia = java.net.InetAddress.getByName(clienthost);
				String clentIp = ia.getHostAddress();
				System.out.println(clentIp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		return message;
	}

	public void setMessage(String msg) throws RemoteException {

		message = msg;
	}

}
