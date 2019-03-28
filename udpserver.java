import java.io.*;
import java.net.*;
class udpserver{
DatagramSocket ds;
DatagramPacket dp;
byte[] recevpackt;
BufferedReader in;
InetAddress ip;
int port;
String str;
public udpserver() 
{
 try{
 ds=new DatagramSocket(1456);
 while(true)
 {
 recevpackt=new byte[100];
 dp=new DatagramPacket(recevpackt,recevpackt.length);
 ds.receive(dp);
String data=new String(dp.getData());
System.out.print("Client :"+data);
if(data.equals("exit"))	
System.exit(0);

 }


    }
catch(Exception e)
 {
 System.out.println("The Error is "+e);
 }


}

public static void main(String args[])throws IOException
{
udpserver obj=new udpserver();  
}

}

