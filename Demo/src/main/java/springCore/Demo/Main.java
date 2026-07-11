package springCore.Demo;



public class Main {
	
	   public A m1() {
		   return new A();
	   }
	
	  public static void main(String[] args) {
		
	String name="Hello";
     String name1="Hello";
     
   System.out.println(name.equals(name1));
   
     Main m=new Main();
     int b=m.m2();
     System.out.print(b);
   A a=m.m1();
   System.out.println(a);
   
    
	  }

	  private int m2() {
		// TODO Auto-generated method stub
		return 10;
	  }
}
