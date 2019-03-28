import java.io.*;
import java.net.*;
import java.util.*;
class client{
	Socket cs;
	BufferedReader in1;
	PrintWriter out;
	String str;
	public client() throws IOException
	{
		try{
			in1=new BufferedReader(new InputStreamReader(System.in));
			cs = new Socket("172.16.126.28",2004);
			out = new PrintWriter(cs.getOutputStream(),true);
			while(true){
				System.out.println("client:");
				str=in1.readLine();
				out.println(str);
				if(str.equals("exit")){
					System.exit(0);
				}
			}
		}
		catch(Exception e){}
	}
	public static void main(String args[]) throws IOException{
		client s=new client();
	}
}