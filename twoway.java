import java.io.*;
import java.net.*;
import java.util.*;
class twoway{
	ServerSocket ss;
	Socket cs;
	BufferedReader in;
	
	PrintWriter out;
	String str;
	public twoway()
	{
		try{
			ss=new ServerSocket(2004);
			cs=ss.accept();
			
			in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			
		        while(true){
				in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
				
				str=in.readLine();

				
				if(str.equals("exit")){
					System.exit(0);
				}
				System.out.println("client:"+str);
				in=new BufferedReader(new InputStreamReader(System.in));
				out = new PrintWriter(cs.getOutputStream(),true);
				System.out.println("server :");
				str=in.readLine();
				out.println(str);
				if(str.equals("exit")){
					System.exit(0);
				}

			}
		}
		catch(Exception e){}
	}
	public static void main(String args[]){
		twoway s=new twoway();
	}
}
			