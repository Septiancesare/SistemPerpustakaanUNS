/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package frameApp;

/**
 *
 * @author acer
 */
public class frameBuku extends javax.swing.JFrame {

    /**
     * Creates new form frameBuku
     */
    public frameBuku() {
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

        jPanel1 = new javax.swing.JPanel();
        inputIDBuku = new javax.swing.JTextField();
        inputJudulBuku = new javax.swing.JTextField();
        inputPenulis = new javax.swing.JTextField();
        inputPenerbit = new javax.swing.JTextField();
        inputTahunTerbit = new javax.swing.JTextField();
        inputRak = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBuku = new javax.swing.JTable();
        bgBuku = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        inputIDBuku.setBackground(new java.awt.Color(222, 217, 186));
        inputIDBuku.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputIDBuku.setForeground(new java.awt.Color(255, 204, 0));
        inputIDBuku.setBorder(null);
        inputIDBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIDBukuActionPerformed(evt);
            }
        });
        getContentPane().add(inputIDBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 400, 30));

        inputJudulBuku.setBackground(new java.awt.Color(222, 217, 186));
        inputJudulBuku.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputJudulBuku.setForeground(new java.awt.Color(255, 204, 0));
        inputJudulBuku.setBorder(null);
        inputJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputJudulBukuActionPerformed(evt);
            }
        });
        getContentPane().add(inputJudulBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 400, 30));

        inputPenulis.setBackground(new java.awt.Color(222, 217, 186));
        inputPenulis.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputPenulis.setForeground(new java.awt.Color(255, 204, 0));
        inputPenulis.setBorder(null);
        inputPenulis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPenulisActionPerformed(evt);
            }
        });
        getContentPane().add(inputPenulis, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 400, 30));

        inputPenerbit.setBackground(new java.awt.Color(222, 217, 186));
        inputPenerbit.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputPenerbit.setForeground(new java.awt.Color(255, 204, 0));
        inputPenerbit.setBorder(null);
        inputPenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPenerbitActionPerformed(evt);
            }
        });
        getContentPane().add(inputPenerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 400, 30));

        inputTahunTerbit.setBackground(new java.awt.Color(222, 217, 186));
        inputTahunTerbit.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputTahunTerbit.setForeground(new java.awt.Color(255, 204, 0));
        inputTahunTerbit.setBorder(null);
        inputTahunTerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTahunTerbitActionPerformed(evt);
            }
        });
        getContentPane().add(inputTahunTerbit, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 400, 30));

        inputRak.setBackground(new java.awt.Color(222, 217, 186));
        inputRak.setFont(new java.awt.Font("Century", 0, 14)); // NOI18N
        inputRak.setForeground(new java.awt.Color(255, 204, 0));
        inputRak.setBorder(null);
        inputRak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputRakActionPerformed(evt);
            }
        });
        getContentPane().add(inputRak, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, 400, 30));

        btnTambah.setBackground(new java.awt.Color(125, 39, 34));
        btnTambah.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 204, 0));
        btnTambah.setText("Tambah");
        btnTambah.setBorder(null);
        btnTambah.setPreferredSize(new java.awt.Dimension(57, 17));
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 110, 220, 50));

        btnSimpan.setBackground(new java.awt.Color(125, 39, 34));
        btnSimpan.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 204, 0));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorder(null);
        btnSimpan.setPreferredSize(new java.awt.Dimension(57, 17));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, 220, 50));

        btnUbah.setBackground(new java.awt.Color(125, 39, 34));
        btnUbah.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        btnUbah.setForeground(new java.awt.Color(255, 204, 0));
        btnUbah.setText("Ubah");
        btnUbah.setBorder(null);
        btnUbah.setPreferredSize(new java.awt.Dimension(57, 17));
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        getContentPane().add(btnUbah, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 220, 50));

        btnHapus.setBackground(new java.awt.Color(125, 39, 34));
        btnHapus.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 204, 0));
        btnHapus.setText("Hapus");
        btnHapus.setBorder(null);
        btnHapus.setPreferredSize(new java.awt.Dimension(57, 17));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 330, 220, 50));

        btnBatal.setBackground(new java.awt.Color(125, 39, 34));
        btnBatal.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 204, 0));
        btnBatal.setText("Keluar");
        btnBatal.setBorder(null);
        btnBatal.setPreferredSize(new java.awt.Dimension(57, 17));
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 400, 220, 50));

        jScrollPane1.setForeground(new java.awt.Color(255, 204, 0));
        jScrollPane1.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N

        tabelBuku.setFont(new java.awt.Font("Century", 0, 12)); // NOI18N
        tabelBuku.setForeground(new java.awt.Color(255, 204, 0));
        tabelBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Buku", "Judul Buku", "Penulis", "Penerbit", "Tahun Terbit", "Rak"
            }
        ));
        tabelBuku.setSelectionForeground(new java.awt.Color(255, 204, 0));
        tabelBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBuku);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 1300, 430));

        bgBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_componen/ui_dataBuku.png"))); // NOI18N
        getContentPane().add(bgBuku, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputJudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputJudulBukuActionPerformed

    private void inputPenulisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPenulisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPenulisActionPerformed

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

    private void inputIDBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIDBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIDBukuActionPerformed

    private void inputPenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPenerbitActionPerformed

    private void inputTahunTerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTahunTerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTahunTerbitActionPerformed

    private void inputRakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputRakActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputRakActionPerformed

    private void tabelBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuMouseClicked
        // TODO add your handling code here:
        int row = tabelBuku.getSelectedRow();
        
//        if (row == -1){
//            return;
//        
//        }
        String idBuku = (String) tabelBuku.getValueAt(row, 1);
        inputIDBuku.setText(idBuku);
        
        String judulBuku = (String) tabelBuku.getValueAt(row, 2);
        inputJudulBuku.setText(judulBuku);
        
        String penulis = (String) tabelBuku.getValueAt(row, 3);
        inputPenulis.setText(penulis);
        
        String penerbit = (String) tabelBuku.getValueAt(row, 4);
        inputPenerbit.setText(penerbit);
        
        String tahunTerbit = (String) tabelBuku.getValueAt(row, 5);
        inputTahunTerbit.setText(tahunTerbit);
        
        String rak = (String) tabelBuku.getValueAt(row, 6);
        inputRak.setText(rak);
    }//GEN-LAST:event_tabelBukuMouseClicked
    
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
            java.util.logging.Logger.getLogger(frameBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bgBuku;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JTextField inputIDBuku;
    private javax.swing.JTextField inputJudulBuku;
    private javax.swing.JTextField inputPenerbit;
    private javax.swing.JTextField inputPenulis;
    private javax.swing.JTextField inputRak;
    private javax.swing.JTextField inputTahunTerbit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBuku;
    // End of variables declaration//GEN-END:variables
}
