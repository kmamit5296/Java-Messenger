package server;

import java.rmi.*;

import client.ChatClientIF;

public interface ChatServerIF extends Remote{
	void registerClient(ChatClientIF ccif)throws RemoteException;
	void broadCastMsg(String msg)throws RemoteException;
}
