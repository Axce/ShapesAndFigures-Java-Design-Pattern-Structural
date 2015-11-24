package fr.iutvalence.info.dut.m3105.preamble;

public class PreambleApplication
{
	public static void main(String[] args)
	{
		Shape circle = new Circle(4);
		Shape rect = new Rectangle(5,118);
		Shape rectDeco = new BorderShapeDecorator(rect,4);
		
		circle.draw(new Position(14,18));
		rect.draw(new Position(24,48));
		rectDeco.draw(new Position(42,42));
	
		Shape rectDecoShadow = new ShadowShapeDecorator(rectDeco, 24, 48);
		rectDecoShadow.draw(new Position(108,46));
	}

}
