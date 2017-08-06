import server.*;
class startServerChat{
	public static void main(String v[]){
		try{
			chatServerDriver chd=new chatServerDriver();
			chd.sControl();
			}
		catch(Exception e){
		e.printStackTrace();}	
	}
}