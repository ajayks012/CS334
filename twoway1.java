import java.io.*;
import java.net.*;
import java.util.*;
class twoway1{
	
	Socket cs;
	BufferedReader in1;
	
	PrintWriter out;
	String str;
	public twoway1()
	{
		try{
			in1=new BufferedReader(new InputStreamReader(System.in));
			cs = new Socket("172.16.126.29",2004);
			out = new PrintWriter(cs.getOutputStream(),true);
		        while(true){
				in1=new BufferedReader(new InputStreamReader(System.in));
				out = new PrintWriter(cs.getOutputStream(),true);
				System.out.println("client:");
				str=in1.readLine();
				out.println(str);
				
				
				if(str.equals("exit")){
					System.exit(0);
				}
				in1 = new BufferedReader(new InputStreamReader(cs.getInputStream()));
				str=in1.readLine();
				if(str.equals("exit")){
					System.exit(0);
				}
				System.out.println("server:"+str);
			}
		}
		catch(Exception e){}
	}
	public static void main(String args[]){
		twoway1 s=new twoway1();
	}
}
