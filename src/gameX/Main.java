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
	public int tileSize = 20;
	public float scl = (float) 0.1; //scale
	public long seed;
	Player player = new Player(400,300);
	/**COLORS**/
	public int ocean = color(0,8,255);
	public int coastWater = color(0,161,255);
	public int beach = color(250,250,210);
	public int grassland = color(46,139,87);
	public int tundra = color(192,192,192);
	public int peak = color(255,255,255);
	public void setup() { //setup for the applet
		size(screenWidth,screenHeight);
		seed = millis();
		System.out.println(seed);
	}
	public void draw() { //The actual applet
		graphics(mapLoaded);
	}
	public void graphics(boolean map) {
		background(0);
		if(map) {
			mapGenerate();
			player.drawPlayer(this);
		}else {
			text("Map not loaded!...",(screenWidth/2)-50,screenHeight/2);
		}
	}
	public void mapGenerate() {
//		noiseSeed(seed); //uses the seed set earlier
		noStroke();
		for(int w = 0; w < screenWidth/tileSize;w++) {
			for(int h = 0;h < screenHeight/tileSize;h++) {
				fill(getColor(w,h));
				rect(w * tileSize,h *tileSize,tileSize,tileSize);
			}
		}
	}
	public int getColor(int x,int y) {
		float v = noise(x*scl,y*scl);
		if(v < 0.45) { //basically I'm just taking the noise value and replacing it with water
			return ocean;
		}else if(v < 0.55){
			return coastWater;
		}else if(v < 0.6){
			return beach;
		}else if(v < 0.85) {
			return grassland;
		}else if(v < 0.95) {
			return tundra;
		}else {
			return peak;
		}
	}
}