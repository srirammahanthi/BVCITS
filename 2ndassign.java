abstract class Shape
{
	protected String color;
	protected boolean filled;
	public Shape(){}
	public Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public String toString()
	{
		return "Shape[color="+color+",filled="+filled+"]";
	}
}
class Circle extends Shape
{
	protected double radius;
	public Circle()
	{
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		return 3.14*radius*radius;
	}
	public double getPerimeter()
	{
		return 2*3.14*radius;
	}
	public String toString()
	{
		return "Circle["+super.toString()+",radius="+radius+",area="+this.getArea()+",perimeter="+this.getPerimeter()+"]";
	}
}
class Rectangle extends Shape
{
	protected double width;
	protected double length;
	Rectangle(){}
	public Rectangle(double width,double length)
	{
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width,double length,String color,boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getArea()
	{
		return width*length;
	}
	public double getPerimeter()
	{
		return 2*(width+length);
	}
	public String toString()
	{
		return "Rectangle["+super.toString()+",width="+width+",length="+length+",area="+this.getArea()+",perimeter="+this.getPerimeter()+"]";
	}
}
class Square extends Rectangle
{
	public Square()	{}
	public Square(double side)
	{
		width=side;
		length=side;
	}
	public Square(double side,String color, boolean filled)
	{
		super(side,side,color,filled);
		width=side;
		length=side;
	}
	public double getSide()
	{
		return width;
	}
	public double getWidth()
	{
		return width;
	}
	public void setSide(double side)
	{
		width=side;
		length=side;
	}
	public void setWidth(double side)
	{
		width=side;
	}	
	public void setLength(double side)
	{
		length=side;
	}
	public String toString()
	{
		return "Square["+super.toString()+",width="+width+",length="+length+",area="+this.getArea()+",perimeter="+this.getPerimeter()+"]";
	}
}
		