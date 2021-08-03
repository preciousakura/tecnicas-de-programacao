public class Main {
  public static void main(String[] args) {
    Figura vetorFig[] = new Figura[10];
    for(int i = 0; i < vetorFig.length; i++) {
      if(i % 2 == 0) {
        vetorFig[i] = new Circulo(new Ponto(i, i+1), new Ponto(i+1, i));
      }
      else {
        vetorFig[i] = new Quadrado(new Ponto(i, i+1), new Ponto(i, i+2));
      }
      if(i % 3 == 0) {
        vetorFig[i].Desenhar("Lilás");
      }
    }

    for(int i = 0; i < vetorFig.length; i++) {
      if(vetorFig[i].validarColorida()) {
        System.out.printf("Área: %.2f, ", vetorFig[i].calcularArea());
        System.out.printf("Cor: %s\n", vetorFig[i].GetCor()); 
      }
    }

    Ponto ponto1 = new Ponto(3, 3);
    Ponto ponto2 = new Ponto(3, 6);
    Ponto ponto3 = new Ponto(0, 6);
    Ponto ponto4 = new Ponto(0, 0);

    Circulo c1 = new Circulo(ponto1, ponto2);
    Circulo c2 = new Circulo(ponto1, ponto3);

    Quadrado q1 = new Quadrado(ponto1,ponto2);
    Quadrado q2 = new Quadrado(ponto3, ponto1);
    
    System.out.println("Área Quadrado 1: "+q1.calcularArea());
    q1.Desenhar("Rosa");
    System.out.println("Cor do Quadrado 1: "+q1.GetCor()); 
    System.out.println("Área Quadrado 2: "+q2.calcularArea());
    q2.Desenhar("Verde");
    System.out.println("Cor do Quadrado 1: "+q2.GetCor());
    System.out.println("Área Círculo 1: "+c1.calcularArea());
    System.out.println("Área Círculo 2: "+c2.calcularArea());
    


    System.out.println(q2.validarColorida());
    q2.Desenhar("Verde");
    System.out.println(q2.GetCor()); 
  }
}

