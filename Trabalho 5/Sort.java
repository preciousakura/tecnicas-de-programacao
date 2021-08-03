import java.io.*;
import java.util.ArrayList;
import java.util.Collections; 

public class Sort{
  public static void main(String...aArgs) {
  
    Sort sort = new Sort();
    ArrayList <Double> arr = new ArrayList<Double>();
    
    try {
      // ler o arquivo txt
      FileReader arq = new FileReader("random.txt");
      BufferedReader w = new BufferedReader(arq);
      
      Double valor = 0.0;
      String linha = w.readLine();
      while(linha != null) {
        valor = valor.parseDouble(linha);
        arr.add(valor);
        linha = w.readLine();
      }
      Collections.sort(arr);
      arq.close();
      sort.regravar(arr);
      System.out.print("Arquivo lido e ordenado com sucesso");
      
    } catch (IOException e) {
      System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
    }
  }

  public void regravar(ArrayList <Double> arr) {
    try {
      // salvar no arquivo txt
      File f = new File("random.txt");
      FileOutputStream fo = new FileOutputStream(f);
      String texto = "";
      for(int i = 0; i < arr.size(); ++i){
        texto = String.valueOf(arr.get(i));
        texto = texto + "\n";
        fo.write(texto.getBytes());
      }  
      fo.close();
      System.out.println("Arquivo gravado com sucesso");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}