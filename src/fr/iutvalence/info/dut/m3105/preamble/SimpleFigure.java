package fr.iutvalence.info.dut.m3105.preamble;


public class SimpleFigure implements Figure
{
	private	Position position;
	private Shape shape;

	public SimpleFigure(Position position, Shape shape)
	{
		this.position = position;
		this.shape = shape;
	}

	@Override
	public void draw()
	{
		this.shape.draw(position);
		
	}
	
	
}
