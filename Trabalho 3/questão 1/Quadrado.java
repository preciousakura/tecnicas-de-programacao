public class Quadrado extends Figura{
  Ponto ponto1, ponto2;
  double lado;
  double area;

  Quadrado(Ponto ponto1, Ponto ponto2){
    this.ponto1 = ponto1;
    this.ponto2 = ponto2;
    this.area = Math.pow(ponto1.getX() - ponto2.getX(), 2) + Math.pow(ponto1.getY() - ponto2.getY(), 2);
  }
  //c)
  public double calcularArea(){
    return area;
  }
  //b)
  public void mover(float dx, float dy) {
    this.ponto1.setX(this.ponto1.getX() + dx);
    this.ponto1.setY(this.ponto1.getY() + dy);
    this.ponto2.setX(this.ponto2.getX() + dx);
    this.ponto2.setY(this.ponto2.getY() + dy);
  }
  //a)
  public String toString(){
    return "Quadrado";
  }  
} 
