package fr.iutvalence.info.dut.m3105.preamble;

public class ShadowShapeDecorator implements Shape
{
	private Shape shape;
	private int angle;
	private int density;
	
	public ShadowShapeDecorator(Shape shape,  int angle, int density)
	{
		this.shape = shape;
		this.angle = angle;
		this.density = density;
	}

	@Override
	public void draw(Position position)
	{
		this.shape.draw(position);
		System.out.print(" ; with shadow (angle= "+angle+" | density = "+density+")");	
	}
	
}
