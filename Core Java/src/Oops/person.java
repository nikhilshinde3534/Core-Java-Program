package Oops;
public class person {
String name;
Long phone;

void walk()
{
	System.out.println("Walking...");
}
void speak()
{
	System.out.println("Speaking...");
}
public static void main(String[] args)
{
	person p1=new person();
	p1.name="Nikhil";
	p1.phone=794967593l;
	
	person p2=new person();
	p2.name="Ram";
	p2.phone=886865134l;
	
	System.out.println("Person 1 Name : "         +p1.name);
	System.out.println("Person 1 Phone Number : " +p1.phone);
	
	System.out.println("---------------------------------------");
	System.out.println("Person 2 Name : "         +p2.name);
	System.out.println("Person 2 Phone Number : " +p2.phone);
}
}
// weird
// not weird
// weird

// weird
// not weird
// weird

// weird
// not weird
// weird
