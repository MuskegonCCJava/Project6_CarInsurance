//	Sailboat.java by Kyle Wolff and Brandon VanderMey on 3/25/2015

import javax.swing.*;

public class Sailboat extends Vehicle
{
	private int length;
	
	public Sailboat()
	{
		super("wind", 0);
		setLength();
	}
	
	public void setLength()
	{
		String entry = JOptionPane.showInputDialog(null, "Enter sailboat length in feet");
		
		length = Integer.parseInt(entry);
	}
	
	public int getLength()
	{
		return length;
	}
	
	@Override	//	Implements
	public void setPrice()
	{
		final int MAX = 100000;
		String entry = JOptionPane.showInputDialog(null, "Enter sailboat price");
		
		price = Integer.parseInt(entry);
		
		if (price > MAX)
			price = MAX;
	}
	
	@Override	//	Overrides
	public String toString()
	{
		return "The " + getLength() + " foot sailboat is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels and costs $" + getPrice();
	}
}
