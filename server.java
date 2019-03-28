import java.io.*;
import java.net.*;
import java.util.*;
class server{
	ServerSocket ss;
	Socket cs;
	BufferedReader in;
	//PrintWriter out;
	String str;
	public server()
	{
		try{
			ss=new ServerSocket(2004);
			cs=ss.accept();
			//in=new BufferedReader(new InputStreamRedaer(System.in));
			//cs = new Socket("localhost",2004);
			in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			while(true){
				
				str=in.readLine();
				
				if(str.equals("exit")){
					System.exit(0);
				}
				System.out.println("client:"+str);
			}
		}
		catch(Exception e){}
	}
	public static void main(String args[]){
		server s=new server();
	}
}