public class Predator extends Animal {
	private String huntStyle;
	
	public Predator(char type, int health, String huntStyle) {
		super(type, health);
		this.huntStyle = (huntStyle.equals("stalk")) ? huntStyle : "ambush";
		
	}
	
	public Predator(Predator toCopy){
		super(toCopy);
		huntStyle = toCopy.huntStyle;
		
	}
	
	public String getHuntStyle() {
		return huntStyle;
	}
	public void setHuntStyle(String aHuntStyle) {
		this.huntStyle = (aHuntStyle.equals("stalk")) ? aHuntStyle : (aHuntStyle.equals("ambush")) ? aHuntStyle : this.getHuntStyle();
	}
	
	public double getRelativeHealth() {
		return (huntStyle.equals("ambush")) ? super.getHealth() * 1.5 : super.getHealth()*.75;
	}
	
	public String toString() {
		return "[Predator] " + super.toString() + " Hunt style: " + getHuntStyle();
	}
}