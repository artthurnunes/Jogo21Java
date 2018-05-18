
package tela;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaJogo extends javax.swing.JFrame {
    
    double baralho[] = new double[52];
    double cartaSorteada = 0, numCarta = 0, soma;
    int indice = 0, controle = 0;
    ImageIcon img;
    
    public void setandoBaralho(){
        baralho[0] = 1.0;
        baralho[1] = 1.1;
        baralho[2] = 1.2;
        baralho[3] = 1.3;
        
        baralho[4] = 2.0;
        baralho[5] = 2.1;
        baralho[6] = 2.2;
        baralho[7] = 2.3;
        
        baralho[8] = 3.0;
        baralho[9] = 3.1;
        baralho[10] = 3.2;
        baralho[11] = 3.3;
        
        baralho[12] = 4.0;
        baralho[13] = 4.1;
        baralho[14] = 4.2;
        baralho[15] = 4.3;
        
        baralho[16] = 5.0;
        baralho[17] = 5.1;
        baralho[18] = 5.2;
        baralho[19] = 5.3;
        
        baralho[20] = 6.0;
        baralho[21] = 6.1;
        baralho[22] = 6.2;
        baralho[23] = 6.3;
        
        baralho[24] = 7.0;
        baralho[25] = 7.1;
        baralho[26] = 7.2;
        baralho[27] = 7.3;
        
        baralho[28] = 8.0;
        baralho[29] = 8.1;
        baralho[30] = 8.2;
        baralho[31] = 8.3;
        
        baralho[32] = 9.0;
        baralho[33] = 9.1;
        baralho[34] = 9.2;
        baralho[35] = 9.3;
        
        baralho[36] = 10.0;
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
        indice = cartaAleatoria.nextInt(52); //aleatorio de 0 a 51
        System.out.println("Indice Carta aleatória: "+indice); //teste
        cartaSorteada = Math.floor(baralho[indice]);
        System.out.println("Valor da carta sorteada : "+cartaSorteada); //teste
        numCarta = baralho[indice];
        System.out.println("Nome carta original para carregar imagem: "+numCarta); //teste
        soma = soma + cartaSorteada; //numero da carta sem o ponto já soma
        System.out.println("Soma quando pega a carta: "+soma); //teste
        System.out.println("----------");
    }
    
    public void setandoImagem(double n){
        img = new ImageIcon(getClass().getResource("/imagens/"+n+".png"));
    }
    
    public void iniciar(){
        soma = 0;
        this.pegandoCartaBaralho(); //sempre que for mostrar
        this.setandoImagem(numCarta);
        carta1.setIcon(img);
        this.pegandoCartaBaralho();
        this.setandoImagem(numCarta);
        carta2.setIcon(img);
        soma1.setText(Double.toString(soma));
        btnIniciar.setEnabled(false);
    }
    
    public void restart(){
        carta1.setIcon(null);
        carta2.setIcon(null);
        carta3.setIcon(null);
        carta4.setIcon(null);
        carta5.setIcon(null);
        btnIniciar.setEnabled(true);
        btnComprar.setEnabled(true);
        soma1.setText("0");
        cartaSorteada = 0;
        numCarta = 0;
        soma = 0;
        indice = 0; 
        controle = 0;  
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
        btnComprar = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        carta3 = new javax.swing.JLabel();
        carta4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        carta5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo 21 :)");

        carta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100.jpg"))); // NOI18N

        jLabel2.setText("JOGO 21");

        btnIniciar.setText("INICIAR");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jLabel3.setText("Suas duas primeiras cartas:");

        carta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100.jpg"))); // NOI18N

        soma1.setText("SOMA");

        btnComprar.setText("COMPRAR");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });

        btnParar.setText("PARAR");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });

        carta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100.jpg"))); // NOI18N

        carta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100.jpg"))); // NOI18N

        jLabel1.setText("Sua soma:");

        btnNovo.setText("JOGAR NOVAMENTE");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        carta5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/100.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(soma1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNovo)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(btnComprar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnParar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(carta1)
                                .addGap(18, 18, 18)
                                .addComponent(carta2)
                                .addGap(76, 76, 76)
                                .addComponent(carta3)
                                .addGap(18, 18, 18)
                                .addComponent(carta4)
                                .addGap(18, 18, 18)
                                .addComponent(carta5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel3)))))
                .addGap(12, 12, 12))
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
                    .addComponent(carta1)
                    .addComponent(carta2)
                    .addComponent(carta3)
                    .addComponent(carta4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIniciar)
                        .addGap(18, 18, 18)
                        .addComponent(btnComprar)
                        .addGap(18, 18, 18)
                        .addComponent(btnParar))
                    .addComponent(carta5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNovo)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soma1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        this.iniciar();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed
        if(controle == 0) {
            this.pegandoCartaBaralho();
            this.setandoImagem(numCarta);
            carta3.setIcon(img);
            controle ++;
            soma1.setText(Double.toString(soma));
        }else if(controle == 1){
            this.pegandoCartaBaralho();
            this.setandoImagem(numCarta);
            carta4.setIcon(img);
            controle++;
            soma1.setText(Double.toString(soma));
        }else{
            this.pegandoCartaBaralho();
            this.setandoImagem(numCarta);
            carta5.setIcon(img);
            btnComprar.setEnabled(false);
            soma1.setText(Double.toString(soma));
        }
  
    }//GEN-LAST:event_btnComprarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.restart();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        JOptionPane.showMessageDialog(null, "Soma : "+soma);
        this.restart();
    }//GEN-LAST:event_btnPararActionPerformed

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
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnParar;
    private javax.swing.JLabel carta1;
    private javax.swing.JLabel carta2;
    private javax.swing.JLabel carta3;
    private javax.swing.JLabel carta4;
    private javax.swing.JLabel carta5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel soma1;
    // End of variables declaration//GEN-END:variables
}
