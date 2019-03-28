import java.io.*;
class strong{
	static int factorial(int x ){
		int t=x;
                int f=1;
                while(t!=0){
                        f=f*t;
			t=t-1;
		}
		return f;
	}

	public static void main(String args[]) throws IOException{
         	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n >> ");
		int n=Integer.parseInt(br.readLine());
		int s=0;
		int temp=n;
		int x;
		while(temp!=0){
			x=temp%10;
			s=s+factorial(x);
			temp=temp/10;
			
		}	
		if(n==s){
			System.out.println("Strong");
		}
		else{
			System.out.println("not strong");
		}
	}
}