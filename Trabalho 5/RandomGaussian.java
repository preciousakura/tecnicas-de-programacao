import java.util.Random;
import java.io.*;

public final class RandomGaussian {
    public static void main(String...aArgs) {
      
      RandomGaussian gaussian = new RandomGaussian();
      double MEAN = 100.0f;
      double VARIANCE = 5.0f;
        
      for(int idx=1; idx<=10; ++idx){
        //log("Generated: "+ gaussian.getGaussian(MEAN, VARIANCE));
      }
      
      try{
        // salvar no arquivo txt
        File f = new File("random.txt");
        FileOutputStream fo = new FileOutputStream(f);
        String texto = "";
        for(int idx=1; idx<=10; ++idx){
          texto = String.valueOf(gaussian.getGaussian(MEAN, VARIANCE));
          texto = texto + "\n";
          fo.write(texto.getBytes());
        }  
        fo.close();
        //System.out.println("Arquivo gravado com sucesso");
        
      } catch (Exception e){
        e.printStackTrace();
      }
      
      try {
        // ler o arquivo txt
        File f = new File("random.txt");
        FileInputStream fi = new FileInputStream(f);
        int i = 0;
        
        while(i != -1){
          i = fi.read();
          char c = (char) i;
          //System.out.print(c);
          
        }
        fi.close();
        //System.out.print("Arquivo lido com sucesso");
        
      } catch (Exception e){
        e.printStackTrace();
      }
                
    }

    private Random fRandom = new Random();

    public double getGaussian(double aMean, double aVariance){
      return aMean + fRandom.nextGaussian() * aVariance;
    }

    private static void log(Object aMsg) {
      System.out.println(String.valueOf(aMsg));
    }
    
} 
