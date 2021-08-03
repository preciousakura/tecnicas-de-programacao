import java.lang.Math;

abstract class Figura implements Colorida {
  String cor;
  boolean colorida;

  Figura(){
    this.colorida = false;
  }

  public abstract double calcularArea();
  public abstract String toString();
  public abstract void mover(float dx, float dy);

  public void Desenhar(String cor) {
    this.colorida = true;
    this.cor = cor;
  }
  
  public String GetCor() {
    if (!validarColorida()){
      return "Figura não colorida";
    }
    return this.cor;
  }

  public boolean validarColorida() {
    return this.colorida;
  }
}