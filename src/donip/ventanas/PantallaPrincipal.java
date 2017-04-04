package donip.ventanas;

import donip.datos.DireccionIPv4;
import javax.swing.JOptionPane;

public class PantallaPrincipal extends javax.swing.JFrame {
    
    private final int numeroDeCaracteres = 3;
    private char caracter;

    public PantallaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private Integer convertir(String valor){
        return Integer.parseInt(valor);
    }
    
    private boolean verificarValores(Integer parametro){
        return parametro >= 0 && parametro < 256;
    }

    private void accionDetalles(){
        
        if(primerosBytes.getText().isEmpty() || segundosBytes.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(this, "Hay ampos vacios");
            
        }else{
            DireccionIPv4 ipv4 = new DireccionIPv4();
            boolean confirmacion = true;
            Integer primero;
            Integer segundo;
            Integer tercero;
            Integer cuarto;
        
            primero = convertir(primerosBytes.getText());
            segundo = convertir(segundosBytes.getText());
            tercero = convertir(tercerosBytes.getText());
            cuarto = convertir(cuartosBytes.getText());
        
            if(confirmacion){
                confirmacion = verificarValores(primero);
            }
        
            if(confirmacion){
                confirmacion = verificarValores(segundo);
            }
        
            if(confirmacion){
                confirmacion = verificarValores(tercero);
            }
        
            if(confirmacion){
                confirmacion = verificarValores(cuarto);
            }
        
            if(confirmacion){
                ipv4.setPrimerosBytes(primero);
                ipv4.setSegundosBytes(segundo);
                ipv4.setTercerosBytes(tercero);
                ipv4.setCuartosBytes(cuarto);
            
                ipv4.sacarClase(ipv4);
                ipv4.sacarDirDeRed(ipv4);
            
                DetallesDeIP datos = new DetallesDeIP(ipv4);
                datos.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(this, "Direccion IPv4 invalida");
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        primerosBytes = new javax.swing.JTextField();
        segundosBytes = new javax.swing.JTextField();
        tercerosBytes = new javax.swing.JTextField();
        cuartosBytes = new javax.swing.JTextField();
        botonDetalles = new javax.swing.JButton();
        botonCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        primerosBytes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                primerosBytesKeyTyped(evt);
            }
        });

        segundosBytes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                segundosBytesKeyTyped(evt);
            }
        });

        tercerosBytes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tercerosBytesKeyTyped(evt);
            }
        });

        cuartosBytes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cuartosBytesKeyTyped(evt);
            }
        });

        botonDetalles.setText("Detalles");
        botonDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDetallesActionPerformed(evt);
            }
        });

        botonCerrar.setText("Cerrar");
        botonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText(".");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText(".");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText(".");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Ingresa la direccion IP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(primerosBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(segundosBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tercerosBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cuartosBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(botonDetalles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cuartosBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(primerosBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(segundosBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tercerosBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDetallesActionPerformed
        accionDetalles();
    }//GEN-LAST:event_botonDetallesActionPerformed

    private void botonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCerrarActionPerformed

    private void primerosBytesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_primerosBytesKeyTyped

        caracter = evt.getKeyChar();
        
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }
        if(primerosBytes.getText().length() >= numeroDeCaracteres){
            evt.consume();
        }
    }//GEN-LAST:event_primerosBytesKeyTyped

    private void segundosBytesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segundosBytesKeyTyped

        caracter = evt.getKeyChar();
        
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }
        if(segundosBytes.getText().length() >= numeroDeCaracteres){
            evt.consume();
        }
    }//GEN-LAST:event_segundosBytesKeyTyped

    private void tercerosBytesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tercerosBytesKeyTyped

        caracter = evt.getKeyChar();
        
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }
        if(tercerosBytes.getText().length() >= numeroDeCaracteres){
            evt.consume();
        }
    }//GEN-LAST:event_tercerosBytesKeyTyped

    private void cuartosBytesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cuartosBytesKeyTyped

        caracter = evt.getKeyChar();
        
        if(caracter < '0' || caracter > '9'){
            evt.consume();
        }
        if(cuartosBytes.getText().length() >= numeroDeCaracteres){
            evt.consume();
        }
    }//GEN-LAST:event_cuartosBytesKeyTyped

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrar;
    private javax.swing.JButton botonDetalles;
    private javax.swing.JTextField cuartosBytes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField primerosBytes;
    private javax.swing.JTextField segundosBytes;
    private javax.swing.JTextField tercerosBytes;
    // End of variables declaration//GEN-END:variables
}
