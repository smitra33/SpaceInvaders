//Inherits bouncer
public class Ball extends Bouncer{
	private int bounciness;
	
	public Ball(int bounciness, double height)
	{
		super(height);
		
		if (bounciness > 0 && bounciness < 100)
		{
			this.bounciness = bounciness;
		}
		else 
		{
			this.bounciness = 50;
		}
	}
	public Ball(Ball toCopy)
	{
		super(toCopy);
		bounciness = toCopy.bounciness;
	}
	public void setBounciness(int bounciness)
	{
		if (bounciness > 0 && bounciness < 100)
		{
			this.bounciness = bounciness;
		}
		else 
		{
			this.bounciness = 50;
		}
	}
	
	public int getBounciness()
	{
		return bounciness;
	}
	
	public double heightAfterBounces(int numOfBounces)
	{
		double height = super.getHeight();
		double bounciness = (double) getBounciness();
		height = height * Math.pow((bounciness/100), numOfBounces);
		if (height < 1)
		{
			height = 0;
		}
		return height;
	}

	public String toString()
	{
		return "[Ball] " + super.toString() + " Bounciness: " + getBounciness() + "%";
		
	}
	
}