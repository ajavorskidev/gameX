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
		speed = 5; //How fast the caravan and party can move across the map
		xPos = x;
		yPos = y;
	}
	public void drawPlayer(PApplet window) {
		window.ellipse(xPos, yPos, 10, 10);
	}
}
