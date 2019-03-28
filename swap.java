
class swap{


	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
                		
		System.out.println("A is " +a+" and B is "+b );
                int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping ");
		System.out.println("A is " +a+"and B is "+b );
	}
}