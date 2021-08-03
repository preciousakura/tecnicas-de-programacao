class Ponto {
  float x, y;
  
  Ponto (float c) {
    this(c,c);
  }
  
  Ponto (float x, float y) {
    this.x = x;
    this.y = y;
  }

  void setX(float x){
    this.x = x;
  }

  void setY(float y) {
    this.y = y;
  }

  float getX() {
    return x;
  }

  float getY() {
    return y;
  }

}