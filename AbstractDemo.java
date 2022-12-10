package aditya;
abstract class Human
{
	public  void eat()
	{
		System.out.println("Eating the food");
	}
	public abstract void walk();
}
class Man extends Human
{
	public void walk()
	{
		System.out.println("I am walking");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {

     Human obj=new Man();    // you cannot create object of abstract class 
     obj.eat();
    obj.walk();
     
     

	}

}
