package fr.iutvalence.info.dut.m3105.preamble;

public interface ShapeBuilder
{
	public ShapeBuilder border(int thickness);
	
	public ShapeBuilder shadow(int angle, int density);
	
	public Shape getShape();
}
