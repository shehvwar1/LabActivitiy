package com.java.shapes;

public class Triangle {
	
	public void draw(Shape s)
	{
		System.out.println("The drawn shape is: " + s.getShape());
	}
	public void erase()
	{
		System.out.println("The shape is erased");
	}
	public static void main(String args[])
	{
		Shape s = new Shape("Triangle");
		Triangle t = new Triangle();
		t.draw(s);
		t.erase();
	}

}
