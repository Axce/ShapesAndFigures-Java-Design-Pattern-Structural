package fr.iutvalence.info.dut.m3105.preamble;

import java.util.ArrayList;

public class ComplexFigure implements Figure
{
	private ArrayList<Figure> elements;


	public Figure addElements(Figure elements)
	{
		this.elements.add(elements);
		return this;
	}

	@Override
	public void draw()
	{
		
		System.out.println("Cette figure complexe est composée de :");
		for (Figure element : elements)
		{
			element.draw();
		}
	}
}
