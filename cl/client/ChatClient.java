package client;

import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

import javax.swing.JScrollBar;

import server.ChatServerIF;

public class ChatClient extends UnicastRemoteObject implements ChatClientIF{
	private static final long serialVersionUID = 1L;
	ChatServerIF chsrvr;
	String name;
	static ClientGUI cgui=new ClientGUI();
	ChatClient()throws RemoteException{
		super();
	}
	public void printMessage(String msg)throws RemoteException{
		cgui.addPanelLabel(msg);
		cgui.jsp.validate();
		JScrollBar js=cgui.jsp.getVerticalScrollBar();
		js.setValue(js.getMaximum());
	}
	public void startGui(){
		cgui.control();
	}
	public void run1(){	
				try {
					ChatClientDriver.ccl.chsrvr.broadCastMsg(ChatClientDriver.ccl.name+":    "+cgui.smsg);
				} 
				catch (RemoteException e) {
					e.printStackTrace();
				}
	}
	
}
