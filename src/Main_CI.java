//	Main_CI.java by Kyle Wolff and Brandon VanderMey on 3/25/2015

import javax.swing.*;

public class Main_CI
{
	public static void main(String[] args)
	{
		/*
		Sailboat aBoat = new Sailboat();
		Bicycle aBike = new Bicycle();
		
		JOptionPane.showMessageDialog(null, "\nVehicle descriptions:\n" + aBoat.toString() + "\n" + aBike.toString());
		*/
		
		InsuredCar myCar = new InsuredCar();
		JOptionPane.showMessageDialog(null, myCar.toString());
	}
}
