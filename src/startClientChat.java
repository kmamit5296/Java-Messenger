import javax.swing.UIManager;

import client.*;
class startClientChat{
	public static void main(String v[]){
		 try{
	            UIManager.LookAndFeelInfo l1[]=UIManager.getInstalledLookAndFeels();
	            UIManager.setLookAndFeel(l1[1].getClassName());
	        }
	        catch(Exception e){
	        e.printStackTrace();}
		try{
			ChatClientDriver chd=new ChatClientDriver();
			chd.startClient();
			}
		catch(Exception e){
		e.printStackTrace();}
	}
}