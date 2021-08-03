import java.util.*;

class TesteHash2{

  public static void main(String args[]){

    Set<String> mesesHash = new HashSet<>();

    mesesHash.add("Janeiro");
    mesesHash.add("Fevereiro");
    mesesHash.add("Março");
    mesesHash.add("Abril");
    mesesHash.add("Maio");
    mesesHash.add("Fevereiro");

    System.out.println("HashSet: ");
    TesteHash2.listar(mesesHash);
    TesteHash2.listar2(mesesHash);
  } 

  static void listar(Collection<?> c){  //questão b diz "incluido um método listar que permita imprimir todos os elementos de qualquer tipo de coleção"
    System.out.println("***Listar 1***"); // entretando, isso é feito no listar2, fiquei na dúvida e repeti.
      for(Object o: c){
        System.out.println(o);
      }

  }

  static void listar2(Collection<?> c){ // questão c
    System.out.println("***Listar 2***");
    for(Object o: c){
      System.out.println(o);
    }
  }

  // questão d: A ordem dos elementos muda, apesar de nenhuma das três(HashSet,TreeSet e LinkedHashSet) garantir a ordenação dos seus elementos. 
  //E o tempo de execução muda. 

}