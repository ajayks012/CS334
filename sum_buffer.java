import java.io.*;
class sum_buffer{


	public static void main(String args[]) throws IOException{
         	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n >> ");
		int n=Integer.parseInt(br.readLine());
		int s=0;
		for(int i=1;i<=n;i++){
			s=s+i;
		}
		System.out.println("Sum is  "+s);
	}
}