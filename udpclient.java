import java.io.*;
import java.net.*;
class udpclient{
DatagramSocket ds;
DatagramPacket dp;
byte[] sendpackt;
BufferedReader in;
InetAddress ip;
int port;
String str;
public udpclient() 
{
 try{

in=new BufferedReader(new InputStreamReader(System.in));
ip=InetAddress.getByName("localhost");
ds=new DatagramSocket();
while(true){
sendpackt =new byte[100];
System.out.print("Client :");
str=in.readLine();
sendpackt=str.getBytes();
dp=new DatagramPacket(sendpackt,sendpackt.length,ip,1456);
ds.send(dp);
if(str.equals("exit"))	
{System.exit(0);
}
}

}

catch(Exception e)
 {
 System.out.println("The Error is "+e);
 }


}

public static void main(String args[])throws IOException
{
udpclient obj=new udpclient();  
}

}

