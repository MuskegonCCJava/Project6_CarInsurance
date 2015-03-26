//	Bycycle.java by Kyle Wolff and Brandon VanderMey on 3/25/2015

import javax.swing.*;

public class Bicycle extends Vehicle
{	
	public Bicycle()
	{
		super("a person", 2);
	}
	
	@Override
	public void setPrice()
	{
		final int MAX = 4000;
		String entry = JOptionPane.showInputDialog(null, "Enter bicycle price");
		
		price = Integer.parseInt(entry);
		
		if (price > MAX)
			price = MAX;
	}
	
	@Override
	public String toString()
	{
		return "The bicycle is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels and costs $" + getPrice();
	}
}
