/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    
    public BackGroundCalculator(int[] array, JTextArea area, JButton cancelButton, JButton calculateButton, JLabel StatusLabel){
        this.array=array;
        resultTextArea=area;
        this.cancelButton=cancelButton;
        this.calculateButton=calculateButton;
        this.StatusLabel=StatusLabel;
        
    }
    
    @Override
    public String doInBackground(){
        String resultado="";
        int suma=0,pares=0,impares=0;
        double promedio=0;
        
        for(int i=0;i<array.length;i++){
            
        if(isCancelled()){
            resultado="La suma es de: "+ suma+ "\n"+
                  "El promedio es de: "+ promedio + "\n"+
                  "El numero de pares es de: "+ pares + "\n"+
                  "El numero de impares es de: "+ impares + "\n";
            resultTextArea.append(resultado);
            return resultado;
        }
        else{
            setProgress(100 * (i+1)/array.length);
            try{
                Thread.sleep(generator.nextInt(5)); 
            }catch(InterruptedException ex){
                StatusLabel.setText("Interrupted.");
                resultTextArea.append(resultado);
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
        
        resultado="La suma es de: "+ suma+ "\n"+
                  "El promedio es de: "+ promedio + "\n"+
                  "El numero de pares es de: "+ pares + "\n"+
                  "El numero de impares es de: "+ impares + "\n";
        
        return resultado;
    }
    
    protected void process(List<Integer> publishedVals){
        for(int i =0; i<publishedVals.size();i++){
            resultTextArea.append(publishedVals.get(i) + "\n");
        }
    }
    
    @Override
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
