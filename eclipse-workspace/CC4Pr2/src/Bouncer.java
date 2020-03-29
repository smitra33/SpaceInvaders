//abstract class
public abstract class Bouncer {
	private double height;
	//constructor
	public Bouncer (double height)
	{
		if (height > 0)
			this.height = height;
		else
			this.height = 1;
	}
	//copy constructor
	public Bouncer (Bouncer toCopy)
	{
		height = toCopy.height;
	}
	protected void setHeight (double height)
	{
		if (height > 0)
			this.height = height;
		else
			this.height = 1;
	}
	protected double getHeight()
	{
		return height;
		
	}
	//updates the height to reflect a SINGLE BOUNCE
	public void bounce()
	{
		height = getHeight();
		height = heightAfterBounces(1);
	}
	//returns number of bounces the ball takes before remaining still on the ground
	public int numberOfBounces()
	{
		if (getHeight() < 1)
		{	//no more bounces
			return 0;
		}
		else
		{
			int bounces = 1;
			double currentHeight = getHeight();
			currentHeight = heightAfterBounces(bounces);
			while (currentHeight >= 1)
			{
				bounces += 1;
				currentHeight = heightAfterBounces(bounces);
			}
		return bounces;
		}
	}
	//abstract method
	public abstract double heightAfterBounces(int numOfBounces);
	
	public String toString()
	{
		return "Height: " + height + " Number of bounces: " + numberOfBounces();
		
	}
}