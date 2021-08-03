import java.util.Scanner;

class WordFrequency {
  String texto;
  int palavras;
  int NumeroDeLetras;

  WordFrequency(){
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
  void ContarVezes(String parte) {
    int repeat = 0;
    for(int i = 0; i < this.separar().length; i++) {
      if(this.separar()[i].toLowerCase().equals(parte.toLowerCase())) repeat++;
    }

    System.out.println(parte+": "+repeat);

  }

  int verificarRepeticao(int index, String parte) {
    int repetir = 0;
    for(int i = index; i >= 0; i--) {
      if(parte.toLowerCase().equals(this.separar()[i].toLowerCase())) repetir++;
    } return repetir;
  }

  void frequencia() {
    for (int i = 0; i < this.separar().length; i++){
      if(verificarRepeticao(i, this.separar()[i]) == 1) this.ContarVezes(this.separar()[i].toLowerCase());
    }
  }
}