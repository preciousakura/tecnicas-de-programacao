class Main {
  public static void main(String[] args) {

    Conjunto<String> cantor = new Conjunto<String>(7);
    cantor.inserirNoConjunto("Suzy");
    cantor.inserirNoConjunto("Eunwoo");
    cantor.inserirNoConjunto("IU");
    cantor.inserirNoConjunto("Taehyung");
    cantor.inserirNoConjunto("Lady Gaga");
    cantor.inserirNoConjunto("Minatozaki Sana");
    cantor.inserirNoConjunto("Taylor Swift");

    Conjunto<String> ator = new Conjunto<String>(7);
    ator.inserirNoConjunto("Jennifer Lawrence");
    ator.inserirNoConjunto("IU");
    ator.inserirNoConjunto("Eunwoo");
    ator.inserirNoConjunto("Park Shin Hye");
    ator.inserirNoConjunto("Suzy");
    ator.inserirNoConjunto("Logan Lerman");
    ator.inserirNoConjunto("Tom Holland");

    // insere valores em c1
    Conjunto<Integer> c1 = new Conjunto<Integer>(10);
    for(int i=0;i<10;i++){
      c1.inserirNoConjunto(i);
    }

    // insere valores em c2
    Conjunto<Integer> c2 = new Conjunto<Integer>(5);
    for(int i=0;i<10;i=i+2){
      c2.inserirNoConjunto(i);
    }

    // insere valores em c3
    Conjunto<Integer> c3 = new Conjunto<Integer>(5);
    for(int i=1;i<10;i=i+2){
      c3.inserirNoConjunto(i);
    }
    
    Conjunto<String> mamifero = new Conjunto<String>(4);
    mamifero.inserirNoConjunto("baleia");
    mamifero.inserirNoConjunto("golfinho");
    mamifero.inserirNoConjunto("gato");
    mamifero.inserirNoConjunto("jaguatirica");

    Conjunto<String> felino = new Conjunto<String>(2);
    felino.inserirNoConjunto("gato");
    felino.inserirNoConjunto("jaguatirica");

    Conjunto<String> aquatico = new Conjunto<String>(2);
    aquatico.inserirNoConjunto("baleia");
    aquatico.inserirNoConjunto("golfinho");

    if(mamifero.subconjunto(aquatico)){
      System.out.println("é subconjunto");
    } else{
      System.out.println("Não é subconjunto");
    }

    System.out.println();

   // verifica se conjunto diferenca de mamifero e aquatico é igual ao conjunto dos felinos
   if(felino.equivalencia(mamifero.diferenca(aquatico))){
      System.out.println("A diferença é igual ao conjunto dos felinos");
    } else{
      System.out.println("Não é igual ao subconjunto dos felinos");
    }
    System.out.println();

    // diferença entre o conjunto dos atores e cantores
    Conjunto<String> diferenca1 = new Conjunto<String>(ator.getConjunto().length);
     diferenca1 = ator.diferenca(cantor);
    for (int i = 0; i < diferenca1.getConjunto().length; i++){
      if(diferenca1.getConjunto()[i] != null)
      System.out.println(diferenca1.getConjunto()[i]+" não é cantor.");
    }
    System.out.println();


    // interseção dos conjuntos ator e cantor
    Conjunto<String> intersecaoCA = new Conjunto<String>(ator.getConjunto().length);
    intersecaoCA = ator.intersecao(cantor);

    for (int i = 0; i < intersecaoCA.getConjunto().length; i++){
      if(intersecaoCA.getConjunto()[i] != null)
      System.out.println(intersecaoCA.getConjunto()[i]+" é ator e cantor.");
    }
    System.out.println();


    // uniao dos conjuntos cantor e ator
    Conjunto<String> uniaoCA = new Conjunto<String>(ator.getConjunto().length+cantor.getConjunto().length);
    uniaoCA = ator.uniao(cantor);

    for (int i = 0; i < uniaoCA.getConjunto().length; i++){
      if(uniaoCA.getConjunto()[i] != null)
      System.out.println(uniaoCA.getConjunto()[i]+" é ator ou cantor.");
    }
    System.out.println();

    if(ator.subconjunto(cantor)){
      System.out.println("é subconjunto");
    } else{
      System.out.println("Não é subconjunto");
    }
    System.out.println();

    if(ator.subconjunto(c1)){
      System.out.println("é subconjunto");
    } else{
      System.out.println("Não é subconjunto");
    }
    System.out.println();

    if((c2.uniao(c3)).subconjunto(c1)){
      System.out.println("é subconjunto");
    } else{
      System.out.println("Não é subconjunto");
    }
    System.out.println();
  }
}