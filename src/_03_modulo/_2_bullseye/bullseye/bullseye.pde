
void setup() {
 
  // set the size of your sketch
  size(500, 500);
  
}

void draw() {
  int width = 300;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i = 0; i<8; i++) {
    ellipse(250, 250, width, width);
    width -= 50;
    if(i % 2 ==0) {
      fill(0, 0, 0);
    }
    else {
      fill(255, 0, 0);
    }
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}
