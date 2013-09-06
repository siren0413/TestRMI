import java.rmi.Remote;
import java.rmi.RemoteException;


public interface HiInterface extends Remote {

	public String speak() throws RemoteException;
	public void setMessage(String msg) throws RemoteException;
}
