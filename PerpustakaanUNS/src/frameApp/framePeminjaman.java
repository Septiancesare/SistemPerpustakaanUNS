/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frameApp;

/**
 *
 * @author Asus
 */
public class framePeminjaman extends javax.swing.JFrame {

    /**
     * Creates new form framePeminjaman
     */
    public framePeminjaman() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        TabelPeminjaman = new javax.swing.JTable();
        inputNoPinjam = new javax.swing.JTextField();
        inputIDPetugas = new javax.swing.JTextField();
        inputIDAnggota = new javax.swing.JTextField();
        inputNamaAnggota = new javax.swing.JTextField();
        inputIDBuku = new javax.swing.JTextField();
        inputJudulBuku = new javax.swing.JTextField();
        inputTanggalPinjam = new javax.swing.JTextField();
        inputBatasPengembalian = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        bgPeminjaman = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabelPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. Pinjam ", "ID Petugas", "ID Anggota", "Nama Anggota", "ID Buku", "Judul Buku", "Tanggal Pinjam", "Batas Pengembalian "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelPeminjaman);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 467, 1300, 270));

        inputNoPinjam.setBackground(new java.awt.Color(222, 217, 186));
        inputNoPinjam.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputNoPinjam.setBorder(null);
        inputNoPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNoPinjamActionPerformed(evt);
            }
        });
        getContentPane().add(inputNoPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 390, 30));

        inputIDPetugas.setBackground(new java.awt.Color(222, 217, 186));
        inputIDPetugas.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputIDPetugas.setBorder(null);
        inputIDPetugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDPetugasActionPerformed(evt);
            }
        });
        getContentPane().add(inputIDPetugas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 390, 30));

        inputIDAnggota.setBackground(new java.awt.Color(222, 217, 186));
        inputIDAnggota.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputIDAnggota.setBorder(null);
        inputIDAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDAnggotaActionPerformed(evt);
            }
        });
        getContentPane().add(inputIDAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 390, 30));

        inputNamaAnggota.setBackground(new java.awt.Color(222, 217, 186));
        inputNamaAnggota.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputNamaAnggota.setBorder(null);
        inputNamaAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaAnggotaActionPerformed(evt);
            }
        });
        getContentPane().add(inputNamaAnggota, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 390, 30));

        inputIDBuku.setBackground(new java.awt.Color(222, 217, 186));
        inputIDBuku.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputIDBuku.setBorder(null);
        inputIDBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDBukuActionPerformed(evt);
            }
        });
        getContentPane().add(inputIDBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 390, 30));

        inputJudulBuku.setBackground(new java.awt.Color(222, 217, 186));
        inputJudulBuku.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputJudulBuku.setBorder(null);
        inputJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJudulBukuActionPerformed(evt);
            }
        });
        getContentPane().add(inputJudulBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 390, 30));

        inputTanggalPinjam.setBackground(new java.awt.Color(222, 217, 186));
        inputTanggalPinjam.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputTanggalPinjam.setBorder(null);
        inputTanggalPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTanggalPinjamActionPerformed(evt);
            }
        });
        getContentPane().add(inputTanggalPinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 390, 30));

        inputBatasPengembalian.setBackground(new java.awt.Color(222, 217, 186));
        inputBatasPengembalian.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputBatasPengembalian.setBorder(null);
        inputBatasPengembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBatasPengembalianActionPerformed(evt);
            }
        });
        getContentPane().add(inputBatasPengembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 390, 30));

        btnTambah.setBackground(new java.awt.Color(125, 39, 34));
        btnTambah.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 204, 0));
        btnTambah.setText("Tambah");
        btnTambah.setBorder(null);
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 220, 50));

        btnSimpan.setBackground(new java.awt.Color(125, 39, 34));
        btnSimpan.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 204, 0));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(null);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, 220, 50));

        btnUbah.setBackground(new java.awt.Color(125, 39, 34));
        btnUbah.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 204, 0));
        btnUbah.setText("Ubah");
        btnUbah.setBorder(null);
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 220, 50));

        btnHapus.setBackground(new java.awt.Color(125, 39, 34));
        btnHapus.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 204, 0));
        btnHapus.setText("Hapus");
        btnHapus.setBorder(null);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 220, 50));

        btnBatal.setBackground(new java.awt.Color(125, 39, 34));
        btnBatal.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 204, 0));
        btnBatal.setText("Keluar");
        btnBatal.setBorder(null);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 400, 220, 50));

        bgPeminjaman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/uiPeminjaman.png"))); // NOI18N
        getContentPane().add(bgPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputIDPetugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDPetugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDPetugasActionPerformed

    private void inputNoPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNoPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNoPinjamActionPerformed

    private void inputIDAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDAnggotaActionPerformed

    private void inputNamaAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaAnggotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaAnggotaActionPerformed

    private void inputIDBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDBukuActionPerformed

    private void inputJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJudulBukuActionPerformed

    private void inputTanggalPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTanggalPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTanggalPinjamActionPerformed

    private void inputBatasPengembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBatasPengembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBatasPengembalianActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalActionPerformed

    private void TabelPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelPeminjamanMouseClicked
        // TODO add your handling code here:
        int row = TabelPeminjaman.getSelectedRow();

        //        if (row == -1){
            //            return;
            //
            //        }
        String idPinjam = (String) TabelPeminjaman.getValueAt(row, 1);
        inputNoPinjam.setText(idPinjam);

        String idPetugas = (String) TabelPeminjaman.getValueAt(row, 6);
        inputIDPetugas.setText(idPetugas);

        String idAnggota = (String) TabelPeminjaman.getValueAt(row, 3);
        inputIDAnggota.setText(idAnggota);

        String namaAnggota = (String) TabelPeminjaman.getValueAt(row, 4);
        inputNamaAnggota.setText(namaAnggota);

        String idBuku = (String) TabelPeminjaman.getValueAt(row, 5);
        inputIDBuku.setText(idBuku);

        String judulBuku = (String) TabelPeminjaman.getValueAt(row, 9);
        inputJudulBuku.setText(judulBuku);

    }//GEN-LAST:event_TabelPeminjamanMouseClicked

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
            java.util.logging.Logger.getLogger(framePeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(framePeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(framePeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(framePeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new framePeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelPeminjaman;
    private javax.swing.JLabel bgPeminjaman;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField inputBatasPengembalian;
    private javax.swing.JTextField inputIDAnggota;
    private javax.swing.JTextField inputIDBuku;
    private javax.swing.JTextField inputIDPetugas;
    private javax.swing.JTextField inputJudulBuku;
    private javax.swing.JTextField inputNamaAnggota;
    private javax.swing.JTextField inputNoPinjam;
    private javax.swing.JTextField inputTanggalPinjam;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
