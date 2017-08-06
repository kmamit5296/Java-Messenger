package server;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class chatServerDriver {
		ChatServer cs;
		void createBind() throws MalformedURLException, RemoteException, AlreadyBoundException{
			LocateRegistry.createRegistry(1099);
			Naming.bind("rmi://127.0.0.1:1099/Messenger",cs);
		}
		public void sControl() throws RemoteException, MalformedURLException, AlreadyBoundException{
			cs=new ChatServer();
			createBind();
		}
}
