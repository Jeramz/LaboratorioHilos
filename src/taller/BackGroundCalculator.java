/*
  Clase BackGroundCalculator: Clase que crea los hilos a ejecutar en segundo plano, 
  dado un array, calcula la suma, promedio, numero de pares y numero de impares de los elementos del arreglo

  Autor: Jesus Ramirez-1731388   Andrés Felipe-1730534
  email: jesus.zuluaga@correounivalle.edu.co - andres.lopez@correounivalle.edu.co
  fecha: 2 mayo 2018
 */
package taller;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingWorker;

/**
 *
 * @author Jesús Ramírez
 */
public class BackGroundCalculator extends SwingWorker <String, Integer> {
    Random generator=new Random();
    int[] array;
    JTextArea resultTextArea;
    JButton cancelButton, calculateButton;
    JLabel StatusLabel;
    long startTime=0,endTime=0;
    
    //Constructor
    public BackGroundCalculator(int[] array, JTextArea area, JButton cancelButton, JButton calculateButton, JLabel StatusLabel){
        this.array=array;
        resultTextArea=area;
        this.cancelButton=cancelButton;
        this.calculateButton=calculateButton;
        this.StatusLabel=StatusLabel;
        
    }
    
    @Override
    //Aquí se define el proceso a realizará el hilo, en este caso el cálculo de la suma, promedio etc, del arreglo
    //Actualiza los botones y textfield correspondientes, retorna un String respuesta
    public String doInBackground(){
        StatusLabel.setText("");
        String resultado="";
        int suma=0,pares=0,impares=0;
        double promedio=0;
        
        startTime=System.currentTimeMillis();
        for(int i=0;i<array.length;i++){
            
            if(isCancelled()){
                resultado="La suma es de: "+ suma+ "\n"+
                      "El promedio es de: "+ promedio + "\n"+
                      "El numero de pares es de: "+ pares + "\n"+
                      "El numero de impares es de: "+ impares + "\n"+
                      "tiempo de ejecucion "+ endTime + "\n";
             
                return resultado;
            }
            else{
                setProgress(100 * (i+1)/array.length);
                try{
                    Thread.sleep(generator.nextInt(5)); 
                }catch(InterruptedException ex){
                    StatusLabel.setText("Interrupted.");
                    
                }
                
                suma+=array[i];
                
                if(array[i]%2==0){
                    pares++;
                }
                
                if(!(array[i]%2==0)){
                    impares++;
                }
                
                publish(array[i]);
            
            }
        }
        
        promedio=suma/array.length;
        
        endTime=System.currentTimeMillis()-startTime;
        
        resultado="La suma es de: "+ suma+ "\n"+
                  "El promedio es de: "+ promedio + "\n"+
                  "El numero de pares es de: "+ pares + "\n"+
                  "El numero de impares es de: "+ impares + "\n" +
                  "tiempo de ejecucion "+ endTime + "\n";
        
        
        return resultado;
    }
    //imprime en el text area los valores guardados en el arreglo
    protected void process(List<Integer> publishedVals){
        for(int i =0; i<publishedVals.size();i++){
            resultTextArea.append(publishedVals.get(i) + "\n");
        }
    }
    
    @Override
    //Al finalizar los calculos, actualiza el label y los botones correspondientes, 
    //imprime en el text area el resultado de los cálculos
    protected void done(){
        calculateButton.setEnabled(true);
        cancelButton.setEnabled(false);
        String respuesta;
        
        try{
            respuesta= get();
        }catch(InterruptedException ex){
            StatusLabel.setText("Interrupted While Waiting results.");
            return;
        }
        catch(ExecutionException ex){
            StatusLabel.setText("Error Performig computation.");
            return;
        }
        catch(CancellationException ex){
            StatusLabel.setText("Cancelled.");
            return;
        }
        resultTextArea.append(respuesta);
        StatusLabel.setText("Process finished");
        
    }
    
    
}
