
abstract class Shape
{
	abstract void  numberOfSides();
}

class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("I am Rectangle, I have 4 sides");
	}
}

class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("I am Triangle, I have 3 sides");
	}
}

class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("I am Hexagon, I have 6 sides");
	}
}

public class Abstract_Class_Shape {

	public static void main(String[] args) {
		
		 Rectangle obj = new  Rectangle();
		 obj.numberOfSides();
		 Triangle obj1 = new Triangle();
		 obj1.numberOfSides();
		 Hexagon obj2 = new Hexagon();
		 obj2. numberOfSides();

	}

}
