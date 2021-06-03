/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;

import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import koneksi.koneksi;

/**
 *
 * @author User
 */
public class login extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();

    /**
     * Creates new form formlogin
     */
    public login() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    protected void aktif() {
        txtuserid.setEnabled(true);
        txtpassword.setEnabled(true);
    }
    
    protected void kosong() {
        txtuserid.setText("");
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

        userid = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnmasuk = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        showpass = new javax.swing.JCheckBox();
        login = new javax.swing.JLabel();
        warnuser = new javax.swing.JLabel();
        warnpass = new javax.swing.JLabel();
        btndaftar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setSize(new java.awt.Dimension(1920, 1080));

        userid.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        userid.setText("User ID");

        password.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        password.setText("Password");

        txtuserid.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txtuserid.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtuserid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtuseridKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtuseridKeyTyped(evt);
            }
        });

        txtpassword.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });

        btnmasuk.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnmasuk.setText("Masuk");
        btnmasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasukActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        showpass.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        showpass.setText("Show Password");
        showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpassActionPerformed(evt);
            }
        });

        login.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        login.setText("Login");

        warnuser.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        warnuser.setForeground(new java.awt.Color(255, 51, 51));

        warnpass.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        warnpass.setForeground(new java.awt.Color(255, 51, 51));

        btndaftar.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btndaftar.setText("Daftar");
        btndaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndaftarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(655, 655, 655)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(login)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userid)
                            .addComponent(password))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtuserid, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                    .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addComponent(showpass))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(warnuser)
                            .addComponent(warnpass))))
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btndaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btndaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184)
                .addComponent(login)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userid)
                    .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(warnuser)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showpass))
                .addGap(6, 6, 6)
                .addComponent(warnpass)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(297, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmasukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasukActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM account WHERE username='"+txtuserid.getText()+"' AND password='"+txtpassword.getText()+"' ";
        
        if(txtuserid.getText().trim().isEmpty() && txtpassword.getText().trim().isEmpty()) {
            warnuser.setText("Masukkan Username Anda!");
            warnpass.setText("Masukkan Password Anda!");
            
        } else if(txtuserid.getText().trim().isEmpty()) {
            warnuser.setText("Masukkan User ID Anda!");
        } else if(txtpassword.getText().trim().isEmpty()) {
            warnpass.setText("Masukkan Password Anda!");
        } else
        
        try {
            java.sql.Statement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            
            if(hasil.next()){
                
                kosong();
                
                formpendataansiswa datasiswa = new formpendataansiswa();
                datasiswa.setVisible(true);
                this.setVisible(true);
                this.setVisible(false);
                this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
                this.dispose();

                
            } else {
                JOptionPane.showMessageDialog(null, "Maaf, Username atau Password Anda Salah");
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }
    }//GEN-LAST:event_btnmasukActionPerformed

    private void showpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpassActionPerformed
        // TODO add your handling code here:
        if(showpass.isSelected()){
            txtpassword.setEchoChar((char)0);
        } else {
            txtpassword.setEchoChar('\u25CF');
        }
    }//GEN-LAST:event_showpassActionPerformed

    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
        // TODO add your handling code here:
        txtpassword.setEchoChar('\u25CF');
    }//GEN-LAST:event_txtpasswordKeyTyped

    private void txtuseridKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuseridKeyTyped
        // TODO add your handling code here:
        char nis = evt.getKeyChar();
            if(!Character.isDigit(nis)||(nis == KeyEvent.VK_BACK_SPACE|| nis == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtuseridKeyTyped

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btnhapusActionPerformed

    private void txtuseridKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuseridKeyReleased
        // TODO add your handling code here:
        warnuser.setText("");
    }//GEN-LAST:event_txtuseridKeyReleased

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        // TODO add your handling code here:
        warnpass.setText("");
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String sql = "SELECT * FROM account WHERE username='"+txtuserid.getText()+"' AND password='"+txtpassword.getText()+"' ";
        
        if(txtuserid.getText().trim().isEmpty() && txtpassword.getText().trim().isEmpty()) {
            warnuser.setText("Masukkan Username Anda!");
            warnpass.setText("Masukkan Password Anda!");
            
        } else if(txtuserid.getText().trim().isEmpty()) {
            warnuser.setText("Masukkan User ID Anda!");
        } else if(txtpassword.getText().trim().isEmpty()) {
            warnpass.setText("Masukkan Password Anda!");
        } else
        
        try {
            java.sql.Statement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            
            if(hasil.next()){
                
                kosong();
                
                formpendataansiswa datasiswa = new formpendataansiswa();
                datasiswa.setVisible(true);
                this.setVisible(true);
                this.setVisible(false);
                this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
                this.dispose();
                
            } else {
                JOptionPane.showMessageDialog(null, "Maaf, Username atau Password Anda Salah");
            }
            
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Gagal");
            }
        }
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void btndaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndaftarActionPerformed
        // TODO add your handling code here:
        register daftar = new register();
        daftar.setSize(1920, 1080); 
        daftar.setVisible(true);
        this.setVisible(false);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btndaftarActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndaftar;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnmasuk;
    private javax.swing.JLabel login;
    private javax.swing.JLabel password;
    private javax.swing.JCheckBox showpass;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuserid;
    private javax.swing.JLabel userid;
    private javax.swing.JLabel warnpass;
    private javax.swing.JLabel warnuser;
    // End of variables declaration//GEN-END:variables
}