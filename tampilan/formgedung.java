
package tampilan;

//import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;


public class formgedung extends javax.swing.JFrame {
 private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    /**
     * Creates new form formGedung
     */
    public formgedung() {
        initComponents();
        dataTable();
        rng_kode();
    }
    protected void aktif(){
        txt_kode_bayar_gedung.setEnabled(true);
        txt_nis.setEnabled(true);
        txt_nama.setEnabled(true);
        txt_tgl_bayar.setEnabled(true);
        txt_biaya.setEnabled(true);
        cbxadmin.setEnabled(true);
    }
    protected void kosong() {
        txt_kode_bayar_gedung.setText("");
        txt_nis.setText("");
        txt_nama.setText("");
        txt_tgl_bayar.setDate(null);
        txt_biaya.setText("");
        cbxadmin.setSelectedIndex(0);
    }
    
    protected void dataTable() {
        Object [] title = {"Kode Pembayaran","NIS","Nama","Tgl Pembayaran","Biaya","Nama Admin"};
        tabmode = new DefaultTableModel(null, title);
        tableGedung.setModel(tabmode);
        String sql = "SELECT kode_pembayaran_gedung, nis, nama, tgl_pembayaran, biaya, nama_admin FROM gedung";
        
        try{
            java.sql.Statement stat =   conn.createStatement();
            ResultSet rs = stat.executeQuery(sql);
            while(rs.next()){
                String dataKodePembayaranGedung = rs.getString("kode_pembayaran_gedung");
                String dataNIS = rs.getString("nis");
                String dataNama = rs.getString("nama");
                String dataTglBayar = rs.getString("tgl_pembayaran");
                String dataBiaya = rs.getString("biaya");
                String dataAdmin = rs.getString("nama_admin");
                
                String [] data = {dataKodePembayaranGedung, dataNIS, dataNama, dataTglBayar , dataBiaya, dataAdmin};
                tabmode.addRow(data);   
            }
        } catch (Exception e) {
        }
    }
    public void rng_kode() {
        int awal, akhir, hasil;
        Random rng = new Random();
        awal = 10000;
        akhir = 100000;
        hasil = rng.nextInt(akhir-awal)+awal;
        
        txt_kode_bayar_gedung.setText(String.valueOf("BGD"+hasil));
    }

   
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_nis = new javax.swing.JTextField();
        label1 = new java.awt.Label();
        txt_nama = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txt_biaya = new javax.swing.JTextField();
        label5 = new java.awt.Label();
        btn_bersihkan = new javax.swing.JButton();
        label6 = new java.awt.Label();
        btn_simpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableGedung = new javax.swing.JTable();
        label7 = new java.awt.Label();
        txt_kode_bayar_gedung = new javax.swing.JTextField();
        txt_tgl_bayar = new com.toedter.calendar.JDateChooser();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        cbxadmin = new javax.swing.JComboBox<>();
        label2 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        txt_nis.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_nis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nisActionPerformed(evt);
            }
        });
        txt_nis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_nisKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nisKeyTyped(evt);
            }
        });

        label1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label1.setName(""); // NOI18N
        label1.setText("Kode Pembayaran Gedung");

        txt_nama.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        label3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label3.setName(""); // NOI18N
        label3.setText("Nama");

        label4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label4.setName(""); // NOI18N
        label4.setText("Tgl Pembayaran");

        txt_biaya.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_biaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_biayaActionPerformed(evt);
            }
        });
        txt_biaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_biayaKeyTyped(evt);
            }
        });

        label5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label5.setName(""); // NOI18N
        label5.setText("Biaya");

        btn_bersihkan.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_bersihkan.setText("BERSIHKAN");
        btn_bersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bersihkanActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label6.setName(""); // NOI18N
        label6.setText("Nama Admin");

        btn_simpan.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        tableGedung.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        tableGedung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama", "Tgl_Pembayaran", "Biaya", "Nama Admin", "Title 6"
            }
        ));
        tableGedung.setRowHeight(25);
        tableGedung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableGedungMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableGedung);

        label7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        label7.setName(""); // NOI18N
        label7.setText("NIS");

        txt_kode_bayar_gedung.setEditable(false);
        txt_kode_bayar_gedung.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        txt_kode_bayar_gedung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kode_bayar_gedungActionPerformed(evt);
            }
        });

        txt_tgl_bayar.setDateFormatString("yyyy-MM-dd");
        txt_tgl_bayar.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        btn_edit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_edit.setText("EDIT");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btn_hapus.setText("HAPUS");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        cbxadmin.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        cbxadmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zen Fanny P.P", "Salza Silviastanti", "Sifa Maskury", "Sonia Agustina D.M", "Dwiki Charisma I", "Fajar Hidayatullah", "Waskito Adhy P", "Andri Pratama" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nis, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_biaya, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txt_nama)
                            .addComponent(txt_kode_bayar_gedung, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tgl_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_bersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_kode_bayar_gedung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tgl_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bersihkan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        label2.setPreferredSize(new java.awt.Dimension(40, 20));
        label2.setText("BIAYA GEDUNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nisActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txt_nisActionPerformed

    private void txt_kode_bayar_gedungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kode_bayar_gedungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kode_bayar_gedungActionPerformed

    private void tableGedungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableGedungMouseClicked
        // TODO add your handling code here:
        
     try {
            tabmode = (DefaultTableModel)tableGedung.getModel();
            int bar = tableGedung.getSelectedRow();
        
            String dataKodePembayaranGedung = tabmode.getValueAt(bar, 0).toString();
            String dataNIS= tabmode.getValueAt(bar, 1).toString();
            String dataNama = tabmode.getValueAt(bar, 2).toString();
        
            java.util.Date dataTglBayar;
         
            dataTglBayar = new SimpleDateFormat("yyyy-MM-dd").parse((String)tabmode.getValueAt(bar, 3));
         
            String dataBiaya = tabmode.getValueAt(bar, 4).toString();
            String dataAdmin = tabmode.getValueAt(bar, 5).toString();
        
            txt_kode_bayar_gedung.setText(dataKodePembayaranGedung);
            txt_nis.setText(dataNIS);
            txt_nama.setText(dataNama);
            txt_tgl_bayar.setDate(dataTglBayar);
            txt_biaya.setText(dataBiaya);
            cbxadmin.setSelectedItem(dataAdmin);
            
     } catch (ParseException ex) {
         Logger.getLogger(formgedung.class.getName()).log(Level.SEVERE, null, ex);
     }
        
    }//GEN-LAST:event_tableGedungMouseClicked

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        String sql = "Insert into gedung VALUES (?,?,?,?,?,?)";
        
//        if(txt_kode_bayar_gedung.getText().trim().isEmpty() && 
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, txt_kode_bayar_gedung.getText());
            ps.setString(2, txt_nis.getText());
            ps.setString(3, txt_nama.getText());
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(txt_tgl_bayar.getDate());
            ps.setString(4, date);
            
            ps.setString(5, txt_biaya.getText());
            ps.setString(6, cbxadmin.getSelectedItem().toString());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data Biaya Gedung Berhasil Disimpan");
            kosong();
            txt_kode_bayar_gedung.requestFocus();
            dataTable();
            rng_kode();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data Biaya Gedung gagal disimpan" + e);
        }
        
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void btn_bersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bersihkanActionPerformed
        // TODO add your handling code here:
         kosong();
         rng_kode();
         txt_nama.setEditable(true);
    }//GEN-LAST:event_btn_bersihkanActionPerformed

    private void txt_biayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_biayaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_biayaActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        try {
           String sql = "UPDATE gedung SET nis=?, nama=?, tgl_pembayaran=?, biaya=?, nama_admin=? WHERE kode_pembayaran_gedung=?";
           PreparedStatement stat= conn.prepareStatement(sql);
        
           stat.setString(1, txt_nis.getText());
           stat.setString(2, txt_nama.getText());
           
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           String date = sdf.format(txt_tgl_bayar.getDate());
           stat.setString(3, date);
           
           stat.setString(4, txt_biaya.getText());
           stat.setString(5, cbxadmin.getSelectedItem().toString());
           stat.setString(6, txt_kode_bayar_gedung.getText());
           
           stat.executeUpdate();
           JOptionPane.showMessageDialog(null,"Data Biaya Gedung Berhasil Diubah");
           kosong();
           txt_nis.requestFocus();
           dataTable();
           rng_kode();
           
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Data Biaya Gedung Gagal Diubah"+e);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "Hapus Data Gedung ?", "Menghapus Data", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0 ) {
            String sql = "DELETE FROM gedung WHERE nis='"+txt_nis.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Biaya Gedung Pembayaran Gedung Dihapus");
                kosong();
                rng_kode();
                txt_nis.requestFocus();
                dataTable();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Biaya Gedung Pembayaran Gedung Gagal Dihapus");
            }
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void txt_biayaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_biayaKeyTyped
        // TODO add your handling code here:
        char biaya = evt.getKeyChar();
            if(!Character.isDigit(biaya)||(biaya == KeyEvent.VK_BACK_SPACE|| biaya == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_biayaKeyTyped

    private void txt_nisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nisKeyTyped
        // TODO add your handling code here:
        char nis = evt.getKeyChar();
            if(!Character.isDigit(nis)||(nis == KeyEvent.VK_BACK_SPACE|| nis == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nisKeyTyped

    private void txt_nisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nisKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String sql = "SELECT nama FROM datasiswa WHERE nis='"+txt_nis.getText()+"'";
            
            try {
                java.sql.Statement stat = conn.createStatement();
                ResultSet datalist = stat.executeQuery(sql);
                while(datalist.next()){
                    String nama = datalist.getString("nama");
                    txt_nama.setText(nama);
                    txt_nama.setEditable(false);
                }
                
            } catch (Exception e) {
                
            }
        }
    }//GEN-LAST:event_txt_nisKeyPressed

    
   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formgedung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bersihkan;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cbxadmin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private javax.swing.JTable tableGedung;
    private javax.swing.JTextField txt_biaya;
    private javax.swing.JTextField txt_kode_bayar_gedung;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nis;
    private com.toedter.calendar.JDateChooser txt_tgl_bayar;
    // End of variables declaration//GEN-END:variables
}
