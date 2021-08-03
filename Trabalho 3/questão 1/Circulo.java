public class Circulo extends Figura{
  Ponto ponto1, ponto2;
  double area;
  double raio;

  Circulo(Ponto ponto1, Ponto ponto2) {
    this.ponto1 = ponto1;
    this.ponto2 = ponto2;
    this.raio = Math.sqrt(Math.pow(ponto1.getX() - ponto2.getX(),2) + Math.pow(ponto1.getY() - ponto2.getY(),2));
  }
  
  public double calcularArea() {
    return 3.14 * this.raio * this.raio;
  }

  public String toString(){
    return "Circulo";
  }

  public void mover(float dx, float dy){
    this.ponto1.setX(ponto1.x + dx);
    this.ponto1.setY(ponto1.y + dy);
    this.ponto2.setX(ponto2.x + dx);
    this.ponto2.setY(ponto2.y + dy);
  }

}