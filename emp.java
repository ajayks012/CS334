import java.io.*;
class employee{
	String ename;
	int eno,salary;
	double grosssalary,da,pf,hra;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	void get_data() throws IOException {
		
 		System.out.println("enter employee name >> ");
 		ename=br.readLine();
  		System.out.println("enter employee id >> ");
		eno=Integer.parseInt(br.readLine());
		System.out.println("enter employee salary >> ");
		salary=Integer.parseInt(br.readLine());
	}
	void calculate(){
		da=0.10*salary;
		pf=0.50*salary;
		hra=0.30*salary;
                grosssalary=salary+da+hra-pf;
	}
	void display(){
		System.out.println("employee name >> "+ename);
		System.out.println("employee id >> "+eno);
		System.out.println("employee salary >> "+salary);
		System.out.println("da >> "+da);
		System.out.println("pf >> "+pf);
		System.out.println("hra>> "+hra);
		System.out.println("gross salary >> "+grosssalary);
	}

}

class emp{

	public static void main(String args[]) throws IOException{
		employee e =new employee();
		e.get_data();
		e.calculate();
		e.display();
	}



}