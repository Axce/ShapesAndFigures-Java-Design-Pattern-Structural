package fr.iutvalence.info.dut.m3105.preamble;

public class BorderShapeDecorator implements Shape
{
	private Shape shape;
	private int thickness;
	
	public BorderShapeDecorator(Shape shape, int thickness)
	{
		this.shape = shape;
		this.thickness = thickness;
	}

	@Override
	public void draw(Position position)
	{
		
		this.shape.draw(position);
		System.out.print(" ; with "+thickness +" px border");	
	}
	
}
