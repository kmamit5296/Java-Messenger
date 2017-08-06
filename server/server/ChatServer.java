package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

import client.ChatClientIF;

public class ChatServer extends UnicastRemoteObject implements ChatServerIF{
	private static final long serialVersionUID = 1L;
	ArrayList<ChatClientIF> clients=new ArrayList<ChatClientIF>();
	protected ChatServer() throws RemoteException {
		super();
	}
	public synchronized void registerClient(ChatClientIF ccif) throws RemoteException {
		clients.add(ccif);
	}
	public synchronized void broadCastMsg(String msg) throws RemoteException {
		int i=0;
		while(i<clients.size()){
			clients.get(i++).printMessage(msg);
		}
	}
	
}
