//	Vehicle.java by Kyle Wolff and Brandon VanderMey on 3/25/2015

public abstract class Vehicle
{
	private String powerSource;
	private int wheels;
	protected int price;
	
	public Vehicle(String powerSource, int wheels)
	{
		setPowerSource(powerSource);
		setWheels(wheels);
		setPrice();
	}
	
	public String getPowerSource()
	{
		return powerSource;
	}
	
	public int getWheels()
	{
		return wheels;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void setPowerSource(String powerSource)
	{
		this.powerSource = powerSource;
	}
	
	public void setWheels(int wheels)
	{
		this.wheels = wheels;
	}
	
	public abstract void setPrice();
}
