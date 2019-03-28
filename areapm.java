import java.io.*;
abstract class shape{
	 double pm,a;
	 abstract double perimeter();

	 abstract double area();

}
class circle extends shape{
	int radius;
	double perimeter(){
		pm=3.14*2*radius;
		return pm;
	}
	double area(){
		a=3.14*radius*radius;
		return a;
	}
}
class square extends shape{
	int as;
	double perimeter(){
		pm=4*as;
		return pm;
	}
	double area(){
		a=as*as;
		return a;
	}
}		

class rectangle extends shape{
	int length,breadth;
	double perimeter(){
		pm=2*(length+breadth);
		return pm;
	}
	double  area(){
		a=length*breadth;
		return a;
	}
}		

class areapm{

	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		System.out.println("1 - circle 2-square 3-rectanle  ");
		System.out.println("enter choice >> ");
		int choice =Integer.parseInt(br.readLine());
		if (choice==1){
			System.out.println("enter radius of circle  >> ");
			circle c= new circle();
			c.radius=Integer.parseInt(br.readLine());
			System.out.println("perimeter  of circle  >> "+c.perimeter());
			System.out.println("area  of circle  >> "+c.area());
		}
		else if (choice==2){
			System.out.println("enter side  of square  >> ");
			square s= new square();
                	s.as=Integer.parseInt(br.readLine());
			System.out.println("perimeter  of sqaure  >> "+s.perimeter());
			System.out.println("area  of square  >> "+s.area());	
		}
		else if (choice==3){
			rectangle r = new rectangle();
			System.out.println("enter length of rectangle >> ");
			r.length=Integer.parseInt(br.readLine());
			System.out.println("enter breadth of rectangle >> ");
			r.breadth=Integer.parseInt(br.readLine());
			System.out.println("perimeter  of rectangle  >> "+r.perimeter());
			System.out.println("area  of rectangle  >> "+r.area());	
		}
			
		
		else{
			System.out.println("enter a valid choice ");
		}
	
          }
}	
		