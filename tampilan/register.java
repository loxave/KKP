/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import koneksi.koneksi;

/**
 *
 * @author User
 */
public class register extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    /**
     * Creates new form formregister
     */
    public register() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    protected void aktif() {
        txtnis.setEnabled(true);
        txtnama.setEnabled(true);
        txtemail.setEnabled(true);
        txtnotelp.setEnabled(true);
        txtpassword.setEnabled(true);
        txtnis.requestFocus();
    }
    
    protected void kosong() {
        txtnis.setText("");
        txtnama.setText("");
        txtemail.setText("");
        txtnotelp.setText("");
        txtpassword.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtnis = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtnotelp = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btndaftar = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnmasuk = new javax.swing.JButton();
        warnnis = new javax.swing.JLabel();
        warnnama = new javax.swing.JLabel();
        warnemail = new javax.swing.JLabel();
        warnnotelp = new javax.swing.JLabel();
        warnpassword = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Password");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setText("No Telepon");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Email");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Nama Lengkap");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("User ID");

        txtnis.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtnis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnisKeyTyped(evt);
            }
        });

        txtnama.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtnama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnamaKeyReleased(evt);
            }
        });

        txtnotelp.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtnotelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnotelpKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnotelpKeyTyped(evt);
            }
        });

        txtpassword.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });

        btndaftar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btndaftar.setText("Daftar");
        btndaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnmasuk.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnmasuk.setText("Masuk");
        btnmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasukActionPerformed(evt);
            }
        });

        warnnis.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        warnnis.setForeground(new java.awt.Color(255, 51, 51));

        warnnama.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        warnnama.setForeground(new java.awt.Color(255, 51, 51));

        warnemail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        warnemail.setForeground(new java.awt.Color(255, 51, 51));

        warnnotelp.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        warnnotelp.setForeground(new java.awt.Color(255, 51, 51));

        warnpassword.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        warnpassword.setForeground(new java.awt.Color(255, 51, 51));

        txtemail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtemail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtemailKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(663, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6))
                                    .addGap(129, 129, 129)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(warnnis)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btndaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(warnemail)
                                        .addComponent(warnpassword)
                                        .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                        .addComponent(txtnis, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtpassword))
                                    .addGap(830, 830, 830))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(85, 85, 85)
                                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(warnnama))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(115, 115, 115)
                            .addComponent(txtnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(warnnotelp)))
                    .addComponent(btnmasuk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warnnis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warnnama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warnemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnotelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(warnnotelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warnpassword)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(540, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarActionPerformed
        // TODO add your handling code here:
        String sql = "INSERT INTO account VALUES (?, ?, ?, ?, ?)";
        String email = txtemail.getText();
        
        
        if(txtnis.getText().trim().isEmpty() && txtnama.getText().trim().isEmpty() &&
           txtemail.getText().trim().isEmpty() && txtnotelp.getText().trim().isEmpty() &&
           txtpassword.getText().trim().isEmpty()) {
            
            warnnis.setText("NIS Wajib Diisi!");
            warnnama.setText("Nama Wajib Diisi!");
            warnemail.setText("Email Wajib Diisi!");
            warnnotelp.setText("No Telepon Wajib Diisi!");
            warnpassword.setText("Password Wajib Diisi!");
            
        } else if(txtnis.getText().trim().isEmpty()) {
            warnnis.setText("NIS Wajib Diisi!");
        } else if(txtnama.getText().trim().isEmpty()) {
            warnnama.setText("Nama Wajib Diisi!");
        } else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$", txtemail.getText()))) {
            warnemail.setText("Email Tidak Valid!");
        } else if(txtnotelp.getText().trim().isEmpty()) {
            warnnotelp.setText("No Telepon Wajib Diisi!");
        } else if(txtpassword.getText().trim().isEmpty()) {
            warnpassword.setText("Password Wajib Diisi!");
        } else
        
        try {
            PreparedStatement regist = conn.prepareStatement(sql);
            
                regist.setString(1, txtnis.getText());
                regist.setString(2, txtnama.getText());
                
                
                regist.setString(3, email);
                
                regist.setString(4, txtnotelp.getText());
                regist.setString(5, txtpassword.getText());

                regist.executeUpdate();
                JOptionPane.showMessageDialog(null, "Akun Berhasil Didaftarkan!");
                kosong();
                txtnis.requestFocus();

                login login = new login();
                login.setSize(1920, 1080); 
                login.setVisible(true);
                this.setVisible(false);
                this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
                this.dispose();
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Akun Gagal Didaftarkan! "+e);
        }
    }//GEN-LAST:event_btndaftarActionPerformed

    private void txtnotelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnotelpKeyTyped
        // TODO add your handling code here:
        char notelp = evt.getKeyChar();
            if(!Character.isDigit(notelp)||(notelp == KeyEvent.VK_BACK_SPACE|| notelp == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnotelpKeyTyped

    private void btnmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasukActionPerformed
        // TODO add your handling code here:
               login login = new login();
               login.setSize(1920, 1080); 
               login.setVisible(true);
               this.setVisible(false);
               this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
               this.dispose();
    }//GEN-LAST:event_btnmasukActionPerformed

    private void txtnisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnisKeyReleased
        // TODO add your handling code here:
        warnnis.setText("");
    }//GEN-LAST:event_txtnisKeyReleased

    private void txtnamaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnamaKeyReleased
        // TODO add your handling code here:
        warnnama.setText("");
    }//GEN-LAST:event_txtnamaKeyReleased

    private void txtnotelpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnotelpKeyReleased
        // TODO add your handling code here:
        warnnotelp.setText("");
    }//GEN-LAST:event_txtnotelpKeyReleased

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        // TODO add your handling code here:
        warnpassword.setText("");
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void txtemailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtemailKeyReleased
        // TODO add your handling code here:
        warnemail.setText("");
    }//GEN-LAST:event_txtemailKeyReleased

    private void txtnisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnisKeyTyped
        // TODO add your handling code here:
        char nis = evt.getKeyChar();
            if(!Character.isDigit(nis)||(nis == KeyEvent.VK_BACK_SPACE|| nis == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtnisKeyTyped

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndaftar;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnmasuk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnis;
    private javax.swing.JTextField txtnotelp;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JLabel warnemail;
    private javax.swing.JLabel warnnama;
    private javax.swing.JLabel warnnis;
    private javax.swing.JLabel warnnotelp;
    private javax.swing.JLabel warnpassword;
    // End of variables declaration//GEN-END:variables
}
