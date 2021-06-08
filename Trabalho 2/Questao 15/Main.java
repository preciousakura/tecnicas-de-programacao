class Main {
  public static void main(String[] args) {
    
    // conjunto universo
    Conjunto universo = new Conjunto(50);
    for (int i = 1; i <51;i++){
      universo.inserirNoConjunto(i); // adiciona valores no conjunto
    }
    Conjunto conjA = new Conjunto(10);
    for (int i = 1; i <11;i++){
      conjA.inserirNoConjunto(i);
    }
    Conjunto conjB = new Conjunto(30);
    for (int i = 1; i <31;i++){
      conjB.inserirNoConjunto(i);
    }
    //leis de Morgan:
    if(universo.diferenca(conjA.uniao(conjB)).equivalencia((universo.diferenca(conjA).intersecao(universo.diferenca(conjB))))){
      System.out.println("A lei de Morgan vale");
    }
    if(universo.diferenca(conjA.intersecao(conjB)).equivalencia((universo.diferenca(conjA).uniao(universo.diferenca(conjB))))){
      System.out.println("A lei de Morgan vale");
    }
    

  }
}