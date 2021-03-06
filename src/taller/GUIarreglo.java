/*
  Clase GUIarreglo: Menú para el usuario
  Autor: Jesus Ramirez-1731388 Andrés Felipe-1730534
  email: jesus.zuluaga@correounivalle.edu.co - andres.lopez@correounivalle.edu.co
  fecha: 2 mayo 2018
 */
package taller;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class GUIarreglo extends javax.swing.JFrame {

    /**
     * Creates new form GUIarreglo
     */
    public GUIarreglo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelSinHilos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taSinHilos = new javax.swing.JTextArea();
        progressBarSinHilos = new javax.swing.JProgressBar();
        statusSinHilos = new javax.swing.JLabel();
        panelHilos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        taHilo2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        taHilo3 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taHilo1 = new javax.swing.JTextArea();
        lbHilo1 = new javax.swing.JLabel();
        lbHilo2 = new javax.swing.JLabel();
        lbHilo3 = new javax.swing.JLabel();
        progressBarHilo1 = new javax.swing.JProgressBar();
        progressBarHilo2 = new javax.swing.JProgressBar();
        progressBarHilo3 = new javax.swing.JProgressBar();
        statusHilo1 = new javax.swing.JLabel();
        statusHilo2 = new javax.swing.JLabel();
        statusHilo3 = new javax.swing.JLabel();
        lbTamañoArreglo = new javax.swing.JLabel();
        tfTamañoArreglo = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        taSinHilos.setEditable(false);
        taHilo1.setEditable(false);
        taHilo2.setEditable(false);
        taHilo3.setEditable(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelSinHilos.setBorder(javax.swing.BorderFactory.createTitledBorder("Sin Hilos"));

        taSinHilos.setColumns(20);
        taSinHilos.setRows(5);
        jScrollPane1.setViewportView(taSinHilos);

        javax.swing.GroupLayout panelSinHilosLayout = new javax.swing.GroupLayout(panelSinHilos);
        panelSinHilos.setLayout(panelSinHilosLayout);
        panelSinHilosLayout.setHorizontalGroup(
            panelSinHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSinHilosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSinHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelSinHilosLayout.createSequentialGroup()
                        .addComponent(progressBarSinHilos, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(statusSinHilos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelSinHilosLayout.setVerticalGroup(
            panelSinHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSinHilosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelSinHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progressBarSinHilos, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(statusSinHilos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelHilos.setBorder(javax.swing.BorderFactory.createTitledBorder("Con Hilos"));

        taHilo2.setColumns(20);
        taHilo2.setRows(5);
        jScrollPane3.setViewportView(taHilo2);

        taHilo3.setColumns(20);
        taHilo3.setRows(5);
        jScrollPane4.setViewportView(taHilo3);

        taHilo1.setColumns(20);
        taHilo1.setRows(5);
        jScrollPane2.setViewportView(taHilo1);

        lbHilo1.setText("Hilo1");

        lbHilo2.setText("Hilo2");

        lbHilo3.setText("Hilo3");

        javax.swing.GroupLayout panelHilosLayout = new javax.swing.GroupLayout(panelHilos);
        panelHilos.setLayout(panelHilosLayout);
        panelHilosLayout.setHorizontalGroup(
            panelHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHilosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHilosLayout.createSequentialGroup()
                        .addComponent(progressBarHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statusHilo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelHilosLayout.createSequentialGroup()
                        .addComponent(progressBarHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statusHilo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelHilosLayout.createSequentialGroup()
                        .addComponent(progressBarHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(statusHilo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelHilosLayout.createSequentialGroup()
                        .addGroup(panelHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                .addComponent(jScrollPane4)
                                .addComponent(jScrollPane2))
                            .addComponent(lbHilo1)
                            .addComponent(lbHilo2)
                            .addComponent(lbHilo3))
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelHilosLayout.setVerticalGroup(
            panelHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHilosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHilo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelHilosLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(progressBarHilo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(statusHilo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbHilo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressBarHilo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusHilo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHilosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHilosLayout.createSequentialGroup()
                        .addComponent(lbHilo3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(progressBarHilo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHilosLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(statusHilo3))))
        );

        lbTamañoArreglo.setText("Tamaño Arreglo");

        tfTamañoArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTamañoArregloActionPerformed(evt);
            }
        });

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelSinHilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelHilos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(lbTamañoArreglo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfTamañoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfTamañoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTamañoArreglo))
                        .addGap(44, 44, 44)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelHilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelSinHilos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Define el tamaño del arreglo y lo llena de numeros aleatorios (entre el 1-100)
    public void crearArreglo(int tamaño){
        arreglo=new int[tamaño];
        
        for(int i=0;i<arreglo.length;i++){
            arreglo[i]= (int) (Math.random() * 100) + 1;
        }
    }
    
    //Separa el array dado en tres más pequeños
    public void separarArray(){
        int tamaño=(int) Math.floor(tamano/3);
        a1=new int[tamaño];
        a2=new int[tamaño];
        if(arreglo.length%3==0){
            a3=new int[tamaño];
        }else{
            a3=new int[tamaño+(tamano%3)];
        }
        
        for(int i=0;i<tamaño;i++){
            a1[i]=arreglo[i];
            a2[i]=arreglo[i+tamaño];
            
            if(arreglo.length%3==0){
                a3[i]=arreglo[i+(tamaño*2)];
            }else{
                int aux=i;
                
                for(int j=i+(tamaño*2);j<tamano;j++){
                    a3[aux]=arreglo[j];
                    aux++;
                }
            }
            
        }
        
    }

    private void tfTamañoArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTamañoArregloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTamañoArregloActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        // TODO add your handling code here:
        progressBarSinHilos.setValue(0);
        progressBarHilo1.setValue(0);
        progressBarHilo2.setValue(0);
        progressBarHilo3.setValue(0);
        taSinHilos.setText("");
        taHilo1.setText("");
        taHilo2.setText("");
        taHilo3.setText("");
        
        try{
            tamano=Integer.parseInt(tfTamañoArreglo.getText());
            tfTamañoArreglo.setText("");
            
        }catch(NumberFormatException ex){
            statusSinHilos.setText("Enter an Integer.");
            
        }
        this.crearArreglo(tamano);
        sinHilos=new BackGroundCalculator(arreglo,taSinHilos,btCancelar,btCalcular,statusSinHilos);
        if(tamano>=3){
            //JOptionPane.showMessageDialog(null, "El tamaño del array debe ser mayor a 3");
            
            this.separarArray();
        
            hilo1=new BackGroundCalculator(a1,taHilo1,btCancelar,btCalcular,statusHilo1);
            hilo2=new BackGroundCalculator(a2,taHilo2,btCancelar,btCalcular,statusHilo2);
            hilo3=new BackGroundCalculator(a3,taHilo3,btCancelar,btCalcular,statusHilo3);
        
            hilo1.addPropertyChangeListener(
            new PropertyChangeListener(){
                public void propertyChange(PropertyChangeEvent e){
                    if(e.getPropertyName().equals("progress")){
                        int newValue = (Integer) e.getNewValue();
                        progressBarHilo1.setValue(newValue);
                    }
                }
            });//end call to addPropertyChangeListener
            
            hilo2.addPropertyChangeListener(
            new PropertyChangeListener(){
                public void propertyChange(PropertyChangeEvent e){
                    if(e.getPropertyName().equals("progress")){
                        int newValue = (Integer) e.getNewValue();
                        progressBarHilo2.setValue(newValue);
                    }
                }
            });//end call to addPropertyChangeListener
            
            hilo3.addPropertyChangeListener(
            new PropertyChangeListener(){
                public void propertyChange(PropertyChangeEvent e){
                    if(e.getPropertyName().equals("progress")){
                        int newValue = (Integer) e.getNewValue();
                        progressBarHilo3.setValue(newValue);
                    }
                }
            });//end call to addPropertyChangeListener
        
            hilo1.execute();
            hilo2.execute();
            hilo3.execute();
        }
        sinHilos.addPropertyChangeListener(
        new PropertyChangeListener(){
            public void propertyChange(PropertyChangeEvent e){
                if(e.getPropertyName().equals("progress")){
                    int newValue = (Integer) e.getNewValue();
                    progressBarSinHilos.setValue(newValue);
                }
            }
        });//end call to addPropertyChangeListener
        
        btCalcular.setEnabled(false);
        btCancelar.setEnabled(true);
        
        sinHilos.execute();
    }//GEN-LAST:event_btCalcularActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        // TODO add your handling code here:
        sinHilos.cancel(true);
        hilo1.cancel(true);
        hilo2.cancel(true);
        hilo3.cancel(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIarreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIarreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIarreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIarreglo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIarreglo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    BackGroundCalculator sinHilos,hilo1,hilo2,hilo3;
    int[]arreglo,a1,a2,a3;
    int tamano;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbHilo1;
    private javax.swing.JLabel lbHilo2;
    private javax.swing.JLabel lbHilo3;
    private javax.swing.JLabel lbTamañoArreglo;
    private javax.swing.JPanel panelHilos;
    private javax.swing.JPanel panelSinHilos;
    private javax.swing.JProgressBar progressBarHilo1;
    private javax.swing.JProgressBar progressBarHilo2;
    private javax.swing.JProgressBar progressBarHilo3;
    private javax.swing.JProgressBar progressBarSinHilos;
    private javax.swing.JLabel statusHilo1;
    private javax.swing.JLabel statusHilo2;
    private javax.swing.JLabel statusHilo3;
    private javax.swing.JLabel statusSinHilos;
    private javax.swing.JTextArea taHilo1;
    private javax.swing.JTextArea taHilo2;
    private javax.swing.JTextArea taHilo3;
    private javax.swing.JTextArea taSinHilos;
    private javax.swing.JTextField tfTamañoArreglo;
    // End of variables declaration//GEN-END:variables
}
