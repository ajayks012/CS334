class amstrong
{
  public static void main(String args[])
   { 
     int d;
     int a= Integer.parseInt(args[0]);
     int temp= a;
     int s=0;
     while(temp!=0)
     { 
      d=(temp%10);
     
      s=s+(d*d*d);
      temp=temp/10;
     }
     if(s==a){
       System.out.println("amstrong");
     }
     else
     {
      System.out.println("not amstrong");
     }
   }
}    