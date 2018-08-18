package gameX;
import processing.core.PApplet;
/*
 * @version 0.1.0
 */
public class Main extends PApplet{ 
	/**Variables**/
	public boolean mapLoaded = true;//By default, the mapLoaded boolean is false, since I need to load the map in.
	public int screenWidth = 800;
	public int screenHeight = 600;
	Player player = new Player(400,300);
	public void setup() { //setup for the applet
		size(screenWidth,screenHeight);
	}
	public void draw() { //The actual applet
		graphics(mapLoaded);
	}
	public void graphics(boolean map) {
		background(0);
		if(map) {
//			mapGenerate(screenWidth,screenHeight);
			player.drawPlayer(this);
		}else {
			text("Map not loaded!...",(screenWidth/2)-50,screenHeight/2);
		}
	}
	public void mapGenerate(int width,int height) {
		
	}
}