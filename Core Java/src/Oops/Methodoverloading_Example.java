package Oops;
public class Methodoverloading_Example {

	void area(int sum)
	{
		System.out.println("Area of Sqaure is : " +(sum*sum));
	}
	
	void area(int length, int breadth)
	{
		System.out.println("Area of Rectangle is : " +(length*breadth));
	}
	
	void area(float r)
	{
		System.out.println("Area of Circle is : " +(3.14*(r*r)));
	}
	
	void area(float b, int h)
	{
		System.out.println("Area of Triangle is : "+(1/2)* (b*h));
	}
	public static void main(String[] args) {
		
		Methodoverloading_Example ob = new Methodoverloading_Example();
		ob.area(6);
		ob.area(4, 8);
		ob.area(3f);
		ob.area(5.2f, 4);
	}
}





