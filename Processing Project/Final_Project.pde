int house; //David Xiao, Period 8, Lopez, APCSP, Day and Night Project//
int windows;
int roof;
int ground;
int sun;
int moon;
int dcdleaf;
int evrgrn;
int trunk;
int stem;
int petal1;
int petal2;
int petal3;
int flwrin;
int sky;
int door;
String winter;
void setup(){
size(1920,1080);
moon = color(230,230,230); //off white//
door = color(126,77,50); //brown//
evrgrn=color(58,79,60);//dark green//
}
void flower1(){
  fill(stem);
  stroke(stem);
  rect(1000,850,10,50);
  stroke(petal1);
  fill(petal1);
  ellipse(1005,840,40,40);
  stroke(flwrin);
  fill(flwrin);
  ellipse(1005,840,25,25);
}
void flower2(){
  fill(stem);
  stroke(stem);
  rect(1100,850,10,50);
  stroke(petal2);
  fill(petal2);
  ellipse(1105,840,40,40);
  stroke(flwrin);
  fill(flwrin);
  ellipse(1105,840,25,25);
}
void flower3(){
  fill(stem);
  stroke(stem);
  rect(1200,850,10,50);
  stroke(petal3);
  fill(petal3);
  ellipse(1205,840,40,40);
  stroke(flwrin);
  fill(flwrin);
  ellipse(1205,840,25,25);
}
void flowers(){
  flower1();
  flower2();
  flower3();
}
void house() {
    stroke(house);
    fill(house);
    rect(200,550,350,350);
    stroke(roof);
    fill(roof);
    triangle(200,550,375,400,550,550);
    stroke(windows);
    fill(windows);
    rect(250,600,75,75);
    rect(425,600,75,75);
    stroke(door);
    fill(door);
    rect(325,725,100,175);
}
void ground() {
  stroke(ground);
  fill(ground);
  rect(0,900,1920,180);
}
void sun() {
  fill(sun);
  stroke(sun);
  ellipse(1750,150,150,150);
}
void moon() {
   stroke(moon);
   fill(moon);
   ellipse(1800,100,100,100);
}
void dcdtree() {
  stroke(trunk);
  fill(trunk);
  rect(800,500,100,400);
  triangle(750,900,800,850,800,900);
  triangle(900,900,900,850,950,900);
  rect(800,475,100,25);
  triangle(720,450,700,475,800,475);
  triangle(700,475,800,475,800,500);
  triangle(900,475,980,450,1000,475);
  triangle(900,500,900,475,1000,475);
  rect(840,350,20,150);
  rect(700,350,20,123);
  rect(980,350,20,123);
  if (winter.contains("no")){
    stroke(dcdleaf);
    fill(dcdleaf);
    ellipse(850,350,400,400);
  }
}
void evrgrn() {
  stroke(trunk);
  fill(trunk);
  rect(1300,700,75,200);
  stroke(evrgrn);
  fill(evrgrn);
  triangle(1200,700,1337,500,1474,700);
  triangle(1200,600,1337,400,1474,600);
  triangle(1200,500,1337,300,1474,500);
}
void draw()
{
  if (mouseX <= 960 && mouseY >= 540) {
    flwrin = color(195,201,90); //darker yellow//
    petal1 = color(195,60,60); //red//
    petal2 = color(16,132,189); //blue//
    petal3 = color(170,118,199); //purple//
    trunk = color(110,82,66); //brown//
    dcdleaf=color(6,96,17); //dark green//
    winter ="no";
    sky = color(18,57,81); //light blue//
    background(sky);
    house = color(215,195,179); //dark peach//
    windows = sky;
    roof = color(208,46,46); //red//
    moon();
    ground = color(04, 105, 0); //dark green//
    stem = ground;
    ground();
    house();
    evrgrn();
    flowers();
  }
  else if (mouseX <= 960 && mouseY <= 540) {
      flwrin = color(247,255,114); //pastel yellow//
      petal1 = color(255,78,78); //light red//
      petal2 = color(0,171,255); //light blue//
      petal3 = color(218,153,255); // light purple//
      trunk=color(150,122,106); //light brown//
      dcdleaf=color(8,171,27); //green//
      winter="no";
      sky = color(91,193,255); //dark blue//
      sun = color(250,250,33); // light yellow//
      background(sky);
      house = color(255,235,219); //peach//
      windows = sky;
      roof = color(244,60,60); //pinkish red//
      sun();
      ground = color(64, 165,0); //green//
      stem = ground;
      ground();
      evrgrn();
      house();
      flowers();
    }
  if (mouseX >= 960 && mouseY <= 540) {
    winter="yes";
    sky = color(195,195,195); //light grey//
    sun = color(186,179,0); //dark yellow//
    house = color(214,195,181); //peach//
    roof = color(208,46,46); //red//
    windows = sky;
    background(sky);
    ground = color(94,79,68); //brown//
    sun();
    dcdtree();
    evrgrn();
    ground();
    house();
  }
   else if (mouseX >= 960 && mouseY >= 540) {
      winter="yes";
      sky = color(84,84,84); //dark grey//
      background(sky);
      moon();
      ground = color(74,59,48); //dark brown//
      ground();
      house = color(144,125,111); //light brown//
      windows = sky;
      roof= color(176,36,36); //dak red//
      house();
      dcdtree();
      evrgrn();
    }
    dcdtree();
}
