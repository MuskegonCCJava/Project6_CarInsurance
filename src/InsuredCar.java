//	InsuredCar.java by Kyle Wolff and Brandon VanderMey on 3/25/2015

import javax.swing.*;

public class InsuredCar extends Vehicle implements Insured
{
	private int coverage;
	
	public InsuredCar()
	{
		super("gas", 4);
		setCoverage();
	}
	
	@Override	//	Implements
	public void setPrice()
	{
		final int MAX = 60000;
		String entry = JOptionPane.showInputDialog(null, "Enter car price");
		
		price = Integer.parseInt(entry);
		
		if (price > MAX)
			price = MAX;
	}
	
	@Override	//	Implements
	public void setCoverage()
	{
		coverage = (int)(price * 0.9);
	}
	
	@Override	//	Implements
	public int getCoverage()
	{
		return coverage;
	}
	
	@Override	//	Overrides
	public String toString()
	{
		return "The insured car is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels, costs $" + getPrice() +
				" and is insured for $" + getCoverage();
	}
}
