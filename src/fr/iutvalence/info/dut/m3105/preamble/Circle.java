package fr.iutvalence.info.dut.m3105.preamble;

public class Circle implements Shape
{
	private int	radius;

	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	@Override
	public void draw(Position position)
	{
		System.out.print("\nCircle drawn at "+position+" radius= "+this.radius);
	}
	
}
