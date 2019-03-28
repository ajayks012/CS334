
class factorial{


	public static void main(String args[]){
		int n=Integer.parseInt(args[0]);
		int t=n;
                int f=1;
                while(t!=0){
                        f=f*t;
			t=t-1;
		}
		System.out.println("factorial of "+n +"is "+f);			
		
	}
}