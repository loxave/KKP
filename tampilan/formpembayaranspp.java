/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tampilan;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JFrame;
import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import koneksi.koneksi;
/**
 *
 * @author salza
 */
public class formpembayaranspp extends javax.swing.JFrame {
    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    
    /**
     * Creates new form formpembayaranspp
     */
    public formpembayaranspp() {
        initComponents();
        datatable();
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        rng_kode();
    }
    protected void aktif() {
        kode_pembayaran.setEnabled(true);
        nis.setEnabled(true);
        nama_siswa.setEnabled(true);
    }
        
    protected void kosong() {
        nis.setText("");
        nama_siswa.setText("");
        jurusan.setSelectedIndex(0); 
        tgl_pembayaran.setDate(null);
        bulan.setSelectedIndex(0);
        jumlah_biaya.setText("");
        cbxadmin.setSelectedIndex(0);
    }    
    
    protected void datatable(){
    Object[] Baris = {"Kode Pembayaran", "NIS", "Nama Siswa", "Jurusan", "Tanggal Pembayaran", "Bulan", "Jumlah Biaya", "Nama Admin TU"};
    tabmode = new DefaultTableModel(null, Baris);
    tabelpembayaranspp.setModel(tabmode);
    String sql = "SELECT * FROM pembayaranspp";
    try {
    
      java.sql.Statement stat = conn.createStatement();
        ResultSet hasil = stat.executeQuery(sql);
        while (hasil.next()){
            String a = hasil.getString("kode_pembayaran");
            String b = hasil.getString("nis");
            String c = hasil.getString("nama_siswa");
            String d = hasil.getString("jurusan");  
            String e = hasil.getString("tanggal_pembayaran");
            String f = hasil.getString("bulan");  
            String g = hasil.getString("jumlah_biaya");
            String h = hasil.getString("admin");  
            
            String[] data={a,b,c,d,e,f,g,h};
            tabmode.addRow (data) ;
        }
        }catch(Exception e){
                
        }
    }
    public void rng_kode() {
        int awal, akhir, hasil;
        Random rng = new Random();
        awal = 10000;
        akhir = 100000;
        hasil = rng.nextInt(akhir-awal)+awal;
        
        kode_pembayaran.setText(String.valueOf("SPP"+hasil));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nis = new javax.swing.JTextField();
        nama_siswa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jurusan = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        kode_pembayaran = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxadmin = new javax.swing.JComboBox();
        btnsave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jumlah_biaya = new javax.swing.JTextField();
        bulan = new javax.swing.JComboBox();
        tgl_pembayaran = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelpembayaranspp = new javax.swing.JTable();
        btnedit = new javax.swing.JButton();
        warnnis = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jMenu16 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu5.setText("jMenu5");

        jMenu7.setText("jMenu7");

        jMenu9.setText("jMenu9");

        jMenu12.setText("jMenu12");

        jMenu15.setText("jMenu15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setText("Pembayaran SPP");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("NIS");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Nama Siswa");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setText("Jurusan");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setText("Tanggal Pembayaran");

        nis.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        nis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nisKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nisKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nisKeyTyped(evt);
            }
        });

        nama_siswa.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        nama_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_siswaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel8.setText("Bulan");

        jurusan.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jurusan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Akutansi", "Administrasi Perkantoran", "Teknik Komputer Dan Jaringan" }));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel9.setText("Kode Pembayaran");

        kode_pembayaran.setEditable(false);
        kode_pembayaran.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        kode_pembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_pembayaranActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel10.setText("Nama Admin TU");

        cbxadmin.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        cbxadmin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Salza Silviastanti", "Sifa Maskury", "Sonia Agustina D.M", "Dwiki Charisma I", "Fajar Hidayatullah", "Waskito Adhy P", "Andri Pratama", "Zen Fanny P.P" }));

        btnsave.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnsave.setText("SIMPAN");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnclear.setText("BERSIHKAN");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel11.setText("Jumlah Biaya");

        jumlah_biaya.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jumlah_biaya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jumlah_biayaKeyTyped(evt);
            }
        });

        bulan.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        bulan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));

        tgl_pembayaran.setDateFormatString("yyyy-MM-dd");
        tgl_pembayaran.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        tabelpembayaranspp.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        tabelpembayaranspp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        tabelpembayaranspp.setRowHeight(25);
        tabelpembayaranspp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpembayaransppMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelpembayaranspp);

        btnedit.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        warnnis.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        warnnis.setForeground(new java.awt.Color(255, 51, 51));
        warnnis.setToolTipText("");

        jMenuBar1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        jMenu1.setText("Data Siswa");
        jMenu1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jMenu1.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data Buku");
        jMenu2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenuBar1.add(jMenu2);

        jMenu4.setText("Data Guru");
        jMenu4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jMenu4.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenuBar1.add(jMenu4);

        jMenu8.setText("Biaya");
        jMenu8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jMenu8.setMargin(new java.awt.Insets(0, 5, 0, 5));

        jMenuItem2.setText("Biaya SPP");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenuItem3.setText("Biaya Buku");
        jMenu8.add(jMenuItem3);

        jMenuItem4.setText("Biaya Seragam");
        jMenu8.add(jMenuItem4);

        jMenuItem5.setText("Biaya Gedung");
        jMenu8.add(jMenuItem5);

        jMenuBar1.add(jMenu8);

        jMenu13.setText("Transaksi");
        jMenu13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jMenu13.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenuBar1.add(jMenu13);

        jMenu14.setText("Laporan");
        jMenu14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jMenu14.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenuBar1.add(jMenu14);

        jMenu16.setText("Data Admin TU");
        jMenu16.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jMenu16.setMargin(new java.awt.Insets(0, 5, 0, 5));
        jMenuBar1.add(jMenu16);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nis, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama_siswa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jurusan, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                                        .addComponent(tgl_pembayaran, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(warnnis))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kode_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jumlah_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 75, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(kode_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(warnnis))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nama_siswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tgl_pembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(bulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jumlah_biaya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbxadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nama_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_siswaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_siswaActionPerformed

    private void kode_pembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_pembayaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_pembayaranActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
     String sql = "INSERT INTO pembayaranspp VALUES (?, ?, ?, ?, ?, ?, ?, ?)"; 
     
     if(nis.getText().trim().isEmpty()) {
         warnnis.setText("Masukkan NIS");
     }
     try {
        PreparedStatement stat = conn.prepareStatement(sql);
        stat.setString(1, kode_pembayaran.getText());
        stat.setString(2, nis.getText());
        stat.setString(3, nama_siswa.getText());
        stat.setString(4, jurusan.getSelectedItem().toString());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = sdf.format(tgl_pembayaran.getDate());  
        stat.setString(5, date); 
        
        stat.setString(6, bulan.getSelectedItem().toString());
        stat.setString(7, jumlah_biaya.getText());
        stat.setString(8, cbxadmin.getSelectedItem().toString());
        
        stat.executeUpdate();
        JOptionPane.showMessageDialog(null, "Data Pembayaran SPP Disimpan");
        kosong();
        kode_pembayaran.requestFocus();
        datatable();
        rng_kode();
            
    } catch (SQLException ex) {
        Logger.getLogger(formpembayaranspp.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        // TODO add your handling code here:
        kosong();
        rng_kode();
        nama_siswa.setEditable(true);
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        int ok = JOptionPane.showConfirmDialog(null, "Hapus Data SPP ?", "Menghapus Data", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0 ) {
            String sql = "DELETE FROM pembayaranspp WHERE nis='"+nis.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data Pembayaran SPP Dihapus");
                kosong();
                rng_kode();
                nis.requestFocus();
                datatable();
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data Pembayaran SPP Gagal Dihapus");
            }
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void tabelpembayaransppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpembayaransppMouseClicked
        // TODO add your handling code here:

        try {
            tabmode = (DefaultTableModel)tabelpembayaranspp.getModel();
        
            int bar = tabelpembayaranspp.getSelectedRow();
            String kode = tabmode.getValueAt(bar, 0).toString();
            String nomor = tabmode.getValueAt(bar, 1).toString();
            String nama = tabmode.getValueAt(bar, 2).toString();
            String jurus = tabmode.getValueAt(bar, 3).toString();
            
            java.util.Date tgl = new SimpleDateFormat("yyyy-MM-dd").parse((String)tabmode.getValueAt(bar, 4));
            
            String bln = tabmode.getValueAt(bar, 5).toString();
            String biaya = tabmode.getValueAt(bar, 6).toString();
            String admin = tabmode.getValueAt(bar, 7).toString();


            kode_pembayaran.setText(kode);
            nis.setText(nomor);
            nama_siswa.setText(nama);
            jurusan.setSelectedItem(jurus);

            tgl_pembayaran.setDate(tgl);

            bulan.setSelectedItem(bln);
            jumlah_biaya.setText(biaya);
            cbxadmin.setSelectedItem(admin);
            
        } catch (ParseException ex) {
            Logger.getLogger(formpembayaranspp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_tabelpembayaransppMouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        try {
           String sql = "UPDATE pembayaranspp SET nis=?, nama_siswa=?, jurusan=?, tanggal_pembayaran=?, bulan=?, jumlah_biaya=?, admin=? WHERE kode_pembayaran=?";
           PreparedStatement stat= conn.prepareStatement(sql);
        
           stat.setString(1, nis.getText());
           stat.setString(2, nama_siswa.getText());
           stat.setString(3, jurusan.getSelectedItem().toString());
           
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           String date = sdf.format(tgl_pembayaran.getDate());
           stat.setString(4, date);
           
           stat.setString(5, bulan.getSelectedItem().toString());
           stat.setString(6, jumlah_biaya.getText());
           stat.setString(7, cbxadmin.getSelectedItem().toString());
           stat.setString(8, kode_pembayaran.getText());
           
           stat.executeUpdate();
           JOptionPane.showMessageDialog(null,"Data Pembayaran SPP Berhasil Diubah");
           kosong();
           nis.requestFocus();
           datatable();
           rng_kode();
           
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Data Pembayaran SPP Gagal Diubah"+e);
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void jumlah_biayaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jumlah_biayaKeyTyped
        // TODO add your handling code here:
        char biaya = evt.getKeyChar();
            if(!Character.isDigit(biaya)||(biaya == KeyEvent.VK_BACK_SPACE|| biaya == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jumlah_biayaKeyTyped

    private void nisKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nisKeyReleased
        // TODO add your handling code here:
        warnnis.setText("");
    }//GEN-LAST:event_nisKeyReleased

    private void nisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nisKeyTyped
        // TODO add your handling code here:
        char nis = evt.getKeyChar();
            if(!Character.isDigit(nis)||(nis == KeyEvent.VK_BACK_SPACE|| nis == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_nisKeyTyped

    private void nisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nisKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String sql = "SELECT nama, jurusan FROM datasiswa WHERE nis='"+nis.getText()+"'";
            
            try {
                java.sql.Statement stat = conn.createStatement();
                ResultSet datalist = stat.executeQuery(sql);
                while(datalist.next()){
                    String nama = datalist.getString("nama");
                    String namajurusan = datalist.getString("jurusan");
                    nama_siswa.setText(nama);
                    jurusan.setSelectedItem(namajurusan);
                    nama_siswa.setEditable(false);
                }
                
            } catch (Exception e) {
                
            }
        }
    }//GEN-LAST:event_nisKeyPressed

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
            java.util.logging.Logger.getLogger(formpembayaranspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formpembayaranspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formpembayaranspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formpembayaranspp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new formpembayaranspp().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox bulan;
    private javax.swing.JComboBox cbxadmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu16;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jumlah_biaya;
    private javax.swing.JComboBox jurusan;
    private javax.swing.JTextField kode_pembayaran;
    private javax.swing.JTextField nama_siswa;
    private javax.swing.JTextField nis;
    private javax.swing.JTable tabelpembayaranspp;
    private com.toedter.calendar.JDateChooser tgl_pembayaran;
    private javax.swing.JLabel warnnis;
    // End of variables declaration//GEN-END:variables

}