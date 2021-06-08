class Main {
  public static void main(String[] args) {

    Conjunto<String> cantor = new Conjunto<String>(5);
    cantor.inserirNoConjunto("Suzy");
    cantor.inserirNoConjunto("Eunwoo");
    cantor.inserirNoConjunto("IU");
    cantor.inserirNoConjunto("Taehyung");
    cantor.inserirNoConjunto("Lady Gaga");

    Conjunto<String> ator = new Conjunto<String>(7);
    ator.inserirNoConjunto("Jennifer Lawrence");
    ator.inserirNoConjunto("IU");
    ator.inserirNoConjunto("Eunwoo");
    ator.inserirNoConjunto("Park Shin Hye");
    ator.inserirNoConjunto("Suzy");
    ator.inserirNoConjunto("Logan Lerman");
    ator.inserirNoConjunto("Tom Holland");

    // produto cartesiano de cantor e ator
    int tam = cantor.contar_elementos()*ator.contar_elementos();
    Conjunto[] paresString = new Conjunto[tam];
    paresString = cantor.cartesiano(ator);
    System.out.println("O produto cartesiano: \n");
    for(int i = 0; i < tam; i++){
      System.out.print("(");
      for(int j = 0; j < 2; j++){
        System.out.print(paresString[i].getConjunto()[j]);
        if(j != 1)
          System.out.print(", ");
      }System.out.println(")");
    }

    // adiciona valores par ao conjunto
    System.out.println("\nO produto cartesiano de impar e par: \n");
    Conjunto<Integer> par = new Conjunto<Integer>(5); 
    for(int i = 2;i<12;i=i+2){
      par.inserirNoConjunto(i);
    }


    // adiciona valores impar ao conjunto
    Conjunto<Integer> impar = new Conjunto<Integer>(5); 
    for(int i = 1;i<10;i=i+2){
      impar.inserirNoConjunto(i);
    }


    // produto cartesiano de numeros impar e par
    Conjunto[] pares = new Conjunto[25];
    pares = par.cartesiano(impar);
    for(int i = 0; i < pares.length; i++){
      System.out.print("(");
      for(int j = 0; j < 2; j++){
        System.out.print(pares[i].getConjunto()[j]);
        if(j != 1)
          System.out.print(", ");
      }System.out.println(")");
    } 

    System.out.println("\no Conjunto Potência de 1 a 5: \n");
    Conjunto<Integer> numeros = new Conjunto<Integer>(5); 
    for(int i = 1;i<=5;i++){
      numeros.inserirNoConjunto(i);
    }
    numeros.potencia();

    Conjunto<String> corrida = new Conjunto<String>(3);
    corrida.inserirNoConjunto("Jose");
    corrida.inserirNoConjunto("Samanta");
    corrida.inserirNoConjunto("Diego");

    System.out.println("\no Conjunto Potência de String: \n");
    corrida.potencia();
  }
}
