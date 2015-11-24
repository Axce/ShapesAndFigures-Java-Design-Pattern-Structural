package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Shape circle = new Circle(4);
		Shape rect = new Rectangle(5,118);
		circle.draw(new Position(14,18));
		rect.draw(new Position(24,48));
	}

}
