import java.io.*;
class perfect{


	public static void main(String args[]) throws IOException{
         	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n >> ");
		int n=Integer.parseInt(br.readLine());
		int s=0;
		for(int i=1;i<n;i++){
				if((n%i)==0){
					
					s=s+i;
                                 }
		}
			
		if(n==s){
			System.out.println("perfect");
		}
		else{
			System.out.println(" not perfect");
		}

	}
}