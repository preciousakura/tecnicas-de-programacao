class Main {
  public static void main(String[] args) {
    int primos[] = {1,3,5,7,11,13,17,19,23,29};
    Conjunto N = new Conjunto(10); //10 primeiros naturais
    Conjunto P = new Conjunto(5); //5 primeiros pares
    Conjunto I = new Conjunto(5); //5 primeiros impares
    Conjunto Primos = new Conjunto(primos); //10 primeiros primos
    Conjunto Universo = new Conjunto(50);// conjunto universo da questão 15

    for(int i = 0; i < 10; i++) {
      N.inserirNoConjunto(i+1);
    }
    for(int i=2; i < 11;i=i+2){
      P.inserirNoConjunto(i);
    }
    for(int i=1;i<10;i=i+2){
      I.inserirNoConjunto(i);
    }
    for(int i=0;i<50;i++){
      Universo.inserirNoConjunto(i);
    }

    //13
    //a)

    if(Primos.subconjunto(Primos)) 
      System.out.println("A) O conjunto dos primos é subconjunto dele mesmo\n");
  
    //b)
    if(N.subconjunto(P)){
      System.out.println("B)Conjunto dos 5 primeiros pares pertence ao conjunto dos 10 primeiros Naturais\n");
    }
    else{
      System.out.println("B)Conjunto dos 5 primeiros pares NÃO pertence ao conjunto dos 10 primeiros Naturais\n");
    }
    
    if(N.subconjunto(I)){
      System.out.println("- Conjunto dos 5 primeiros impares pertence ao conjunto dos 10 primeiros Naturais\n");
    }
    else{
      System.out.println("- Conjunto dos 5 primeiros impares NÃO pertence ao conjunto dos 10 primeiros Naturais\n");
    }
    if(N.subconjunto(Primos)){
      System.out.println("- Conjunto dos 10 primeiros primos pertence ao conjunto dos 10 primeiros Naturais\n");
    }
    else{
      System.out.println("- Conjunto dos 10 primeiros primos NÃO pertence ao conjunto dos 10 primeiros Naturais\n");
    }
    
    
    //c)
    Conjunto uniaoPI = new Conjunto(P.contar_elementos() + I.contar_elementos());
    uniaoPI = P.uniao(I);
    if(N.equivalencia(uniaoPI)) 
      System.out.println("C) A união do conjunto dos números pares com o conjunto dos número ímpares é igual ao conjunto dos números naturais\n");
    
    else
      System.out.println("C) A união do conjunto dos números pares com o conjunto dos número ímpares não é igual ao conjunto dos números naturais\n");

    //d)
    Conjunto intersecaoNP = new Conjunto(P.contar_elementos() + I.contar_elementos());
    intersecaoNP = N.intersecao(P);
    if(intersecaoNP.contar_elementos() != 0) 
      System.out.println("D) A interseção do conjuntos dos número naturais com o conjunto dos número pares não é vazia!\n");
    
    else
      System.out.println("D) A interseção do conjuntos dos número naturais com o conjunto dos número pares é vazia!\n");
    
    //e)
    Conjunto diferenca = new Conjunto(N.contar_elementos());
    diferenca = N.diferenca(P);

    System.out.println("E) O conjunto da diferença entre os 10 primeiros naturais e os 5 primeiros pares é:");

    for (int i = 0; i < diferenca.contar_elementos();i++){
      System.out.print(diferenca.getConjunto()[i] + " ");
    }
  }
}