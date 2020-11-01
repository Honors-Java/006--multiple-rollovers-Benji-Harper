void setup() {
	size(400, 400);
}

  //Fill color variables
  int r = 0;
  int g = 0;
  int b = 0;

//Note: I know what was required was only 4 squares, but I wass having fun and wanted to
//challenge myself so I did 16

// Another note: I realized after the first two rows that this was pretty much copy paste
// so I added some more booleans for the colors
void draw() {
	background(255);
	stroke(0);

  //start creating the lines
  // Vertical
  line (100, 0, 100, 400);
  line (200, 0, 200, 400);
  line (300, 0, 300, 400);

  // Horizontial
  line (0, 100, 400, 100);
  line (0, 200, 400, 200);
  line (0, 300, 400, 300);

  //Fill variables
  if (mouseX <= 200) {
  b = b + 2;
  } else if (mouseX >= 200) {
  b = b - 2;
  }

  if (mouseY >= 200) {
  r = r + 2;
  } else if (mouseY <= 200) {
  r = r - 2;
  }

  fill(r, g, b);

  //Build your conditional statement 

  // First row
	if(mouseX <= 100 && mouseY <= 100) {
  rect (0, 0, 100, 100);
  
  } else if(mouseX <= 200 && mouseY <= 100) {
  rect (100, 0, 100, 100);

  } else	if(mouseX <= 300 && mouseY <= 100) {
  rect (200, 0, 100, 100);

  } else if(mouseX <= 400 && mouseY <= 100) {
  rect (300, 0, 100, 100);

  // Second row
  } else if(mouseX <= 100 && mouseY <= 200) {
    rect (0, 100, 100, 100);

  } else if(mouseX <= 200 && mouseY <= 200) {
    rect (100, 100, 100, 100);

  } else if(mouseX <= 300 && mouseY <= 200) {
    rect (200, 100, 100, 100);

  } else if(mouseX <= 400 && mouseY <= 200) {
    rect (300, 100, 100, 100);
  
  // Third row

  } else if(mouseX <= 100 && mouseY <= 300) {
    rect (0, 200, 100, 100);

  } else if(mouseX <= 200 && mouseY <= 300) {
    rect (100, 200, 100, 100);

  } else if(mouseX <= 300 && mouseY <= 300) {
    rect (200, 200, 100, 100);

  } else if(mouseX <= 400 && mouseY <= 300) {
    rect (300, 200, 100, 100);

  // Fourth row

  } else if(mouseX <= 100 && mouseY <= 400) {

    rect (0, 300, 100, 100);

  } else if(mouseX <= 200 && mouseY <= 400) {

    rect (100, 300, 100, 100);

  } else if(mouseX <= 300 && mouseY <= 400) {

    rect (200, 300, 100, 100);

  } else if(mouseX <= 400 && mouseY <= 400) {

    rect (300, 300, 100, 100);
  }
}