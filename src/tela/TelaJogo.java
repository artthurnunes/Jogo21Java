
package tela;

import java.util.Random;

import javax.swing.ImageIcon;

public class TelaJogo extends javax.swing.JFrame {
    
    double baralho[] = new double[52];
    double cartaSorteada = 0, numCarta = 0, soma;
    int indice = 0;
    ImageIcon img;
    
    public void setandoBaralho(){
        baralho[0] = 1;
        baralho[1] = 1.1;
        baralho[2] = 1.2;
        baralho[3] = 1.3;
        
        baralho[4] = 2;
        baralho[5] = 2.1;
        baralho[6] = 2.2;
        baralho[7] = 2.3;
        
        baralho[8] = 3;
        baralho[9] = 3.1;
        baralho[10] = 3.2;
        baralho[11] = 3.3;
        
        baralho[12] = 4;
        baralho[13] = 4.1;
        baralho[14] = 4.2;
        baralho[15] = 4.3;
        
        baralho[16] = 5;
        baralho[17] = 5.1;
        baralho[18] = 5.2;
        baralho[19] = 5.3;
        
        baralho[20] = 6;
        baralho[21] = 6.1;
        baralho[22] = 6.2;
        baralho[23] = 6.3;
        
        baralho[24] = 7;
        baralho[25] = 7.1;
        baralho[26] = 7.2;
        baralho[27] = 7.3;
        
        baralho[28] = 8;
        baralho[29] = 8.1;
        baralho[30] = 8.2;
        baralho[31] = 8.3;
        
        baralho[32] = 9;
        baralho[33] = 9.1;
        baralho[34] = 9.2;
        baralho[35] = 9.3;
        
        baralho[36] = 10;
        baralho[37] = 10.1;
        baralho[38] = 10.2;
        baralho[39] = 10.3;
        baralho[40] = 10.4;
        baralho[41] = 10.5;
        baralho[42] = 10.6;
        baralho[43] = 10.7;
        baralho[44] = 10.8;
        baralho[45] = 10.9;
        baralho[46] = 10.10;
        baralho[47] = 10.11;
        baralho[48] = 10.12;
        baralho[49] = 10.13;
        baralho[50] = 10.14;
        baralho[51] = 10.15;     
    }
    
    public void pegandoCartaBaralho(){
        Random cartaAleatoria = new Random();
        indice = cartaAleatoria.nextInt(52);
        cartaSorteada = Math.floor(baralho[indice]);
        numCarta = baralho[indice];
        soma = soma + cartaSorteada; //numero da carta sem o ponto já soma
    }
    
    public void setandoImagem(double n){
        img = new ImageIcon(getClass().getResource("/imagens/"+n+".png"));
    }
    
    public void teste(){
        soma = 0;
        this.pegandoCartaBaralho(); //sempre que for mostrar
        //System.out.println("X: "+indice);
        //System.out.println("Teste: "+numCarta);
        this.setandoImagem(numCarta);
        carta1.setIcon(img);
        this.pegandoCartaBaralho();
        this.setandoImagem(numCarta);
        carta2.setIcon(img);
        soma1.setText(Double.toString(soma));
    }
    

    public TelaJogo() {
        initComponents();
        this.setandoBaralho(); //1x
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        carta1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        carta2 = new javax.swing.JLabel();
        soma1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo 21 :)");

        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1.1.png"))); // NOI18N

        jLabel2.setText("JOGO 21");

        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel3.setText("Suas duas primeiras cartas:");

        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1.1.png"))); // NOI18N

        soma1.setText("SOMA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btnIniciar))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(carta1)
                                .addGap(18, 18, 18)
                                .addComponent(carta2))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(soma1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(306, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnIniciar)
                    .addComponent(carta1)
                    .addComponent(carta2))
                .addGap(18, 18, 18)
                .addComponent(soma1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        this.teste();
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel carta1;
    private javax.swing.JLabel carta2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel soma1;
    // End of variables declaration//GEN-END:variables
}
