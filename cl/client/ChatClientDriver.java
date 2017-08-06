package client;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.swing.JOptionPane;

import server.ChatServerIF;

public class ChatClientDriver {
	static ChatClient ccl;
	public void startClient() throws MalformedURLException, RemoteException, NotBoundException, AlreadyBoundException{
		ccl=new ChatClient();
		ccl.name=JOptionPane.showInputDialog(null,"Enter your nick name");
		ccl.chsrvr=(ChatServerIF)Naming.lookup("rmi://192.168.137.1:1099/Messenger");
		ccl.chsrvr.registerClient(ccl);
		ccl.startGui();
	}
}
