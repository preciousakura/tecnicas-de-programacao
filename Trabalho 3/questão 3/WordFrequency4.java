import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.*;

class WordFrequency4 {
  String texto;
  int palavras;
  int NumeroDeLetras;

  WordFrequency4(){
    Scanner entradaTeclado = new Scanner(System.in);
    this.texto = entradaTeclado.nextLine().toLowerCase();
    entradaTeclado.close();
  }
  
  String[] separar(){
    String[] string2 = this.texto.split(" ");
    return string2;
  }

  //void verificaSeExiste(String[] textos, String texto) {
    //for(int i = 0; i < texto.)}
  int ContarVezes(String parte) {
    int repeat = 0;
    for(int i = 0; i < this.separar().length; i++) {
      if(this.separar()[i].toLowerCase().equals(parte.toLowerCase())) repeat++;
    }
    return repeat;
  }

  int verificarRepeticao(int index, String parte, List list) {
    List<Texto> lista = new ArrayList<Texto>();
    lista = list;
    int repetir = 0;
    for(int i = index; i >= 0; i--) {
      if(parte.toLowerCase().equals(lista.get(i).parte.toLowerCase())) repetir++;
    } return repetir;
  }

  void frequencia() {
    List<Texto> list = new ArrayList<Texto>();
    
    for (int i = 0; i < this.separar().length; i++) {
        Texto text = new Texto();
        text.parte = this.separar()[i];
        text.frequencia = ContarVezes(this.separar()[i]);
        list.add(text);
    }

    int i = 0, j;
    while(i < list.size()) {
      j = i;
      while(j-1 >= 0 && list.get(j).frequencia > list.get(j-1).frequencia && j >= 0) {
        Collections.swap(list, j, j-1);
        j--;
      }
      i++;
    }
    for(int k = 0; k < list.size();k++) {
      if(verificarRepeticao(k, list.get(k).parte, list) == 1)
      System.out.println(list.get(k).parte+": "+list.get(k).frequencia);
    }
  }
}