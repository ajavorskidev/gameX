package gameX;
import processing.core.PApplet;

public class Player {
	/*Variables*/
	private String name,faction;
	private int money,partySize,caravanSize,speed,xPos,yPos;
	public Player(int x,int y) {
		name = "Rammi";
		//faction future feature
		money = 1000;
		partySize = 1; //how many people in party
		caravanSize = 1; //how many wagons available
		speed = 2; //How fast the caravan and party can move across the map
		xPos = x;
		yPos = y;
	}
	public void drawPlayer(PApplet window) {
		window.fill(0);
		window.rect(xPos, yPos, 10, 10);
	}
	public void movePlayer(int way) {
		if(way == 1) {
			yPos -= speed; //north
		}
		if(way == 3) {
			yPos += speed; //south
		}
		if(way == 2) {
			xPos += speed; //east
		}
		if(way == 4) {
			xPos -= speed; //west
		}
	}
	public int getX() {
		return xPos;
	}
	public int getY() {
		return yPos;
	}
}
