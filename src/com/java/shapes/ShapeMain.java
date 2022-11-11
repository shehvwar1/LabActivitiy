package com.java.shapes;

public class ShapeMain {

	public static void main(String[] args) {
		//Shape a = new Shape(Circle);
		Shape s = new Shape("Circle");
		Circle c = new Circle();
		c.draw(s);
		c.erase();
		System.out.println("*********************************");
		/*Triangle t = new Triangle();
		t.draw(s);
		t.erase();
		System.out.println("*********************************");
		Square sq = new Square();
		sq.draw(s);
		t.erase();*/
		Shape st = new Shape("Triangle");
		Triangle t = new Triangle();
		t.draw(s);
		t.erase();
		
	}

}
