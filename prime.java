import java.io.*;
class prime{


	public static void main(String args[]) throws IOException{
         	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n >> ");
		int n=Integer.parseInt(br.readLine());
		int f=1;
		System.out.println("2");
		for(int i=3;i<n;i++){
			for(int j=2;j<i;j++){
				if((i%j)==0){
					
					f=0;
					break;
                                 }
			}
			if(f==1){
				System.out.println(i);
			}
			f=1;
			
		}
		
	}
}