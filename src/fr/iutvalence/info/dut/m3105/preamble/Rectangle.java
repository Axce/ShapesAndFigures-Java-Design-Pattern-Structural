package fr.iutvalence.info.dut.m3105.preamble;

public class Rectangle implements Shape
{
	
	private Object	xSize;
	private Object	ySize;

	public Rectangle(int xSize, int ySize)
	{
		this.xSize = xSize;
		this.ySize = ySize;
	}
	
	@Override
	public void draw(Position position)
	{
		System.out.println("Rectangle drawn at "+position+" xSize= "+this.xSize+" ySize= "+this.ySize);	
	}
	
	
}
