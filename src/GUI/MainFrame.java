/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Pung's Computer
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    
    public void close(){
        this.setVisible(false);
        this.dispose();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_search = new javax.swing.JButton();
        btn_transaction = new javax.swing.JButton();
        btn_upStock = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btn_itul = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(38, 38, 38));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        desktop.setBackground(new java.awt.Color(38, 38, 38));
        desktop.setForeground(new java.awt.Color(255, 255, 255));
        desktop.setLayout(new java.awt.BorderLayout());
        getContentPane().add(desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 0, 880, 550));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 0, -1, 506));

        jPanel3.setBackground(new java.awt.Color(51, 102, 255));

        btn_search.setBackground(new java.awt.Color(51, 102, 255));
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/history.png"))); // NOI18N
        btn_search.setText("Trans History");
        btn_search.setBorder(null);
        btn_search.setPreferredSize(new java.awt.Dimension(125, 45));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_transaction.setBackground(new java.awt.Color(51, 102, 255));
        btn_transaction.setForeground(new java.awt.Color(255, 255, 255));
        btn_transaction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/transaction.png"))); // NOI18N
        btn_transaction.setText("Transaction");
        btn_transaction.setBorder(null);
        btn_transaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transactionActionPerformed(evt);
            }
        });

        btn_upStock.setBackground(new java.awt.Color(51, 102, 255));
        btn_upStock.setForeground(new java.awt.Color(255, 255, 255));
        btn_upStock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/update.png"))); // NOI18N
        btn_upStock.setText("Update Stock");
        btn_upStock.setBorder(null);
        btn_upStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_upStockMouseClicked(evt);
            }
        });
        btn_upStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_upStockActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 102, 255));
        jButton1.setForeground(new java.awt.Color(0, 10, 39));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/exit.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_itul.setBackground(new java.awt.Color(51, 102, 255));
        btn_itul.setForeground(new java.awt.Color(255, 255, 255));
        btn_itul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/util.png"))); // NOI18N
        btn_itul.setText("Utility");
        btn_itul.setBorder(null);
        btn_itul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_itulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_upStock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_itul, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btn_transaction, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btn_upStock, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btn_itul)
                .addGap(199, 199, 199))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_transactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transactionActionPerformed
        // TODO add your handling code here:
        Transaction transaction = new Transaction();
        this.desktop.add(transaction);
        
        transaction.setVisible(true);
    }//GEN-LAST:event_btn_transactionActionPerformed

    private void btn_upStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_upStockActionPerformed
        // TODO add your handling code here:
        
        Update_stock update = new Update_stock();
        this.desktop.add(update);
        
        update.setVisible(true);
    }//GEN-LAST:event_btn_upStockActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_upStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_upStockMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_upStockMouseClicked

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        Search search = new Search();
        this.desktop.add(search);
        
        search.setVisible(true);
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_itulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_itulActionPerformed
        // TODO add your handling code here:
        Util util = new Util();
        util.setVisible(true);
        close();
    }//GEN-LAST:event_btn_itulActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_itul;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_transaction;
    private javax.swing.JButton btn_upStock;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
