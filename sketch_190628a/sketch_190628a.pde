public class Segment {
   int cornerX;
   int cornerY;
   
   public Segment(int cornerX, int cornerY) {
     this.cornerX  = cornerX;
     this.cornerY = cornerY;
   }
}


Segment head;
int foodX;
int foodY;

void setup(){
  size(500,500);
  head = new Segment(50,50);
  frameRate(20);
  dropFood();
}

void dropFood() {
  foodX = ((int)random(50)*10);
  foodY = ((int)random(50)*10);
}

void draw() {
  background(0,0,0);
  drawFood();
  drawSnake();
}

void drawFood() {
  fill(#B630FA);
  rect( foodX, foodY,10,10);
}

void drawSnake() {
  fill(#FFFFFF);
  rect(head.cornerX, head.cornerY, 10,10);
}
