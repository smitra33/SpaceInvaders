package SpaceInvaders.movingObjs;

import javafx.scene.Group;

public class Bullet extends MovableObject {
	public String direction;

	
	public Bullet (double xPos, double yPos,int health,String type,Group root) {
		super(xPos,yPos,health,type,root);
		extend = 25;
		//based on the type the bullet moves in a different direction
		if(type == "ShipBullet") direction = "Up";
		else if(type == "AlienBullet") direction = "Down";
		else if(type == "nullBullet") this.remove();
	}
	//unique move for the Bullet
	public void move(String s) {
		if (direction == "Up") {
			imageView.setLayoutY(imageView.getLayoutY()-2);
			yPos -=2;
		}
		if (direction == "Down") {
			imageView.setLayoutY(imageView.getLayoutY()+2);
			yPos +=2;
		}
	}


}