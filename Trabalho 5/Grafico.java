import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import java.util.ArrayList;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
import java.util.Random;

public class Grafico extends ApplicationFrame{
   public static void main( String[ ] args ) {
   
    ArrayList <Label> label = new ArrayList<Label>(); // lista de valores
    JFrame frame = new JFrame("Distribuição das Probabilidade"); // frame da interface gráfica
    RandomGaussian gaussian = new RandomGaussian();
    
    double MEAN = 100.0f;
    double VARIANCE = 5.0f;
    
    for(int i = 0; i < 10; i++) { /// gera os valores aleatório de gaussian
      label.add(new Label(String.valueOf(gaussian.getGaussian(MEAN, VARIANCE))));
      label.get(i).setBackground(new Color(new Random().nextInt(255), 
                                           new Random().nextInt(255), 
                                           new Random().nextInt(255), 
                                           new Random().nextInt(255)));
    }
    
    int value = 100;
    for(int i = 0; i < 10; i++) { // adiciona os valores na interface gráfica
      label.get(i).setBounds(50, value, 150,30);
      frame.add(label.get(i)); 
      value += 30;
    }


    //Datasets e formação dos gráficos
    final String none = " ";     
    final DefaultCategoryDataset dataset = 
    new DefaultCategoryDataset( );  
    
    for(int i = 0; i < label.size(); i++) {//colocando os valores
      dataset.addValue(Double.parseDouble(label.get(i).getText()), "valor"+(i+1), none );   
    }


    //Datasets e formação dos gráficos
    final DefaultCategoryDataset dataset2 = 
    new DefaultCategoryDataset( );  

    double Cumulativo = 0;
    for(int i = 0;i<10; i++){//colocando os valores cumulativos
	    Cumulativo = Cumulativo + Double.parseDouble(label.get(i).getText());
	    dataset2.addValue( Cumulativo , "valor"+(i+1) , none );
    }    
    
    JFreeChart barChart2 = ChartFactory.createBarChart(
      "Distribuição das Probabilidade Cumulativa",           
      "Números Gerados",            
      "Valores",            
      dataset2,          
      PlotOrientation.VERTICAL,           
      true, true, false);
      
    ChartPanel chartPanel2 = new ChartPanel( barChart2 );        
    chartPanel2.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );   
    
    chartPanel2.setBounds(250, 320, 400, 300);
    frame.add(chartPanel2);
      

    JFreeChart barChart = ChartFactory.createBarChart(
      "Distribuição das Probabilidade",           
      "Números Gerados",            
      "Valores",            
      dataset,          
      PlotOrientation.VERTICAL,           
      true, true, false);
      
   ChartPanel chartPanel = new ChartPanel( barChart );        
   chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );        
   
   chartPanel.setBounds(250, 10, 400, 300);
   frame.add(chartPanel);
    
    
    Button b = new Button("Gerar Valores");  
    b.setBounds(50,50,100,30);  
    frame.add(b); 

    b.addActionListener(new ActionListener() {  
      public void actionPerformed(ActionEvent e){  
          for(int i = 0; i < label.size(); i++) {
            label.get(i).setText(String.valueOf(gaussian.getGaussian(MEAN, VARIANCE)));
            label.get(i).setBackground(new Color(new Random().nextInt(255), 
                                                 new Random().nextInt(255), 
                                                 new Random().nextInt(255), 
                                                 new Random().nextInt(255)));
          }
          
          //Valores da Distribuição normal 
          for(int i = 0; i < label.size(); i++) {
            dataset.addValue(Double.parseDouble(label.get(i).getText()), "valor"+(i+1), none );   
          }

          //Valores Distribuição Cumulativa
          double Cumulativo2 = 0;
          for(int i = 0;i<10; i++){
            Cumulativo2 = Cumulativo2 + Double.parseDouble(label.get(i).getText());
            dataset2.addValue( Cumulativo2 , "valor"+(i+1) , none );
            
          } 
        }  
    });  
    
    Button salvar = new Button("Salvar no Arquivo");  
    salvar.setBounds(50,460,150,30);  
    frame.add(salvar); 
    
    // evento ao clicar no botão
    salvar.addActionListener(new ActionListener() {  
      public void actionPerformed(ActionEvent e){  
        try {
          // salvar no arquivo txt
          File f = new File("arq.txt");
          FileOutputStream fo = new FileOutputStream(f);
          String texto = "";
          for(int i = 0; i < label.size(); ++i){
            texto = String.valueOf(label.get(i).getText());
            texto = texto + "\n";
            fo.write(texto.getBytes());
          }  
          fo.close();
          JOptionPane.showMessageDialog(frame, "Arquivo gravado com sucesso");
        } catch (Exception err){
          err.printStackTrace();
        }
      }  
    });  

    frame.setLayout( null );
    frame.setVisible(true);
    frame.setSize(700, 700);  
   }
}