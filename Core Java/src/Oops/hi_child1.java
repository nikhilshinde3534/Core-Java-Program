package Oops;

public class hi_child1 extends hi_parent {

void c1()
{
	System.out.println("Child 1");
}

public static void main(String[] args) {
	
	hi_child1 ob=new hi_child1();
	ob.p();
	ob.c1();
	
	hi_child2 ob2 = new hi_child2();
	ob2.c2();
	
}
}


