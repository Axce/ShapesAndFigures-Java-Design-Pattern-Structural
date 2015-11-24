package fr.iutvalence.info.dut.m3105.preamble;

public class CircleBuilder implements ShapeBuilder
{
	Shape currentCircle;
	
	public CircleBuilder(int radius)
	{
		this.currentCircle = new Circle(radius);
	}
	
	@Override
	public CircleBuilder border(int thickness)
	{
		this.currentCircle = new BorderShapeDecorator(currentCircle, thickness);
		return this;
	}

	@Override
	public CircleBuilder shadow(int angle, int density)
	{
		this.currentCircle = new ShadowShapeDecorator(currentCircle, angle, density);
		return this;
	}

	@Override
	public Shape getShape()
	{
		return this.currentCircle;
	}
	
}
