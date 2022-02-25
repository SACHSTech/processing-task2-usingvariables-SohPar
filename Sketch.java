import processing.core.PApplet;

public class Sketch extends PApplet {

  //Width and Height
  float width = 800;
  float Height = 800;

  // Scale Factor
  float wScaleF = width / 400;
  float hScaleF = Height / 400;

  public void settings() {
	// put your size call here
    size((int)width, (int)Height);
  }

 
  public void setup() {
    //grass
    background(71, 219, 66);
  }

  public void draw() {
	  
	// sky
  fill (135, 206, 235);
  rect(0, 0, width, 230 * hScaleF);

  // house
  fill(245, 66, 66);
  rect(170 * wScaleF, 220 * hScaleF, 70 * wScaleF, 45 * hScaleF);
  
  // roof
  fill(245, 66, 66);
  triangle(170 * wScaleF, 220 * hScaleF, 205 * wScaleF, 195 * hScaleF, 240 * wScaleF, 220 * hScaleF);
  
  // Windows
  fill(255,255,255);
  rect(180 * wScaleF, 230 * hScaleF, 10 * wScaleF, 12 * hScaleF);
  rect(220 * wScaleF, 230 * hScaleF, 10 * wScaleF, 12 * hScaleF);

  // Door
  fill(0);
  rect(200 * wScaleF, 245 * hScaleF, 10 * wScaleF, 18 * hScaleF);

  // Sun
  fill(250, 255, 0);
  ellipse(0, 0, 150 * wScaleF, 150 * hScaleF);




  }


  }
  
  // define other methods down here.
