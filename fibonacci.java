
class fibonacci{


	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
                
		int a =0;
		int b= 1;
		System.out.println(a);
		System.out.println(b);
                int s= a+b;
                while(s<n){
			
      			System.out.println(s);
			a=b;
                        b=s;
                        s=a+b; 
		}         
                		
		
	}
}