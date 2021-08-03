import java.util.Scanner;

class CountWords{
  int palavras, repetidas;
  String texto;
  
  CountWords(){
    this.palavras = 1;
    this.repetidas = 0;
    Scanner entradaTeclado = new Scanner(System.in);
    this.texto = entradaTeclado.nextLine();
    entradaTeclado.close();
  }
  
  int contarPalavras() {
    char c;
    for(int i = 0; i < this.texto.length(); i++) {
      c = this.texto.charAt(i);
      if(c == ' ') {
        this.palavras++;
      }
    }
    return this.palavras;
  }

  int contarPalavrasRepetidas() {
    String[] string2 = this.texto.split(" ");
    this.repetidas = this.palavras;
    
    for(int i = 0; i < this.palavras; i++) {
      for(int j = this.palavras-1; j > i; j--) {
        if(i == 0) {
          if(string2[i].equals(string2[j])) this.repetidas--;
        } else {
          if(string2[i].equals(string2[j]) && i-1 >= 0 && !string2[i].equals(string2[i-1])) this.repetidas--;
        }
      }
    }
    return this.repetidas;
  }
}