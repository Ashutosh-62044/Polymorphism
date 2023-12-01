package polymorphismProject;

 class firstStep1 {
     
	 public void test1() {
		System.out.println("500");
	}
	public void print ()
{
System.out.println("class firstStep printed");
 test1();
}
 }
class firstStep2 extends firstStep1{
	@Override
	public void test1() {
		System.out.println("9000");
	}
	@Override
	public void print ()
	{
	System.out.println("class firstStep2 and ram ashyama printed");
	}
}
public class firstStep{
	public static void main(String[] args) {
		
		firstStep2 first = new firstStep2();
		first.test1();
		//first.print();
		
		firstStep1  first1 = new firstStep1();
		first1.test1();
		first1.print();
	}
   }
  
/*

class A{
	int a ,b,c;
	
	public void add(int x ,int y) {
		a=x;
		b=y;
		System.out.println("The addition of two number is = " +(x+y));
	}
	public void add (int x , int y , int z) {
		a=x;
		b=y;
		c = z;
		System.out.println("The addition of three number is = " +(a+b+c));
	}
	public void print() {
		System.out.println("class 'A' method is runnning");
	}
}

class B extends A{
	//@Override
	public void print() {
		System.out.println("Class'B' method is running");
	}
}
public class firstStep{
	public static void main(String[] args) {
		A a1 = new A();
		a1.add(40,59);
		a1.add(90,80,70);
		a1.print();
		
		B b1 = new B();
		b1.print();
	}
}
*/