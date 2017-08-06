package client;
import java.rmi.*;
public interface ChatClientIF extends Remote {
	void printMessage(String msg)throws RemoteException;
}
