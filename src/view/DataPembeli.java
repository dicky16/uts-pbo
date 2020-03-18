/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static model.ArrayDataPembeli.ArrJumlahTiket;
import static model.ArrayDataPembeli.ArrNamaPembeli;
import static model.ArrayDataPembeli.ArrNomorPembeli;
import static model.ArrayDataPembeli.ArrTanggal;
import static model.ArrayDataPembeli.ArrTotalHarga;
import model.Fungsi;
import model.WisataData;

/**
 *
 * @author djavu
 */
public class DataPembeli extends javax.swing.JFrame {

    int baris = 0;
    static Object kolom[] = {"No.", "Nama", "Nomor", "Jumlah Tiket", "Total", "Tanggal"};
    DefaultTableModel tbl = new DefaultTableModel(kolom, baris);
    /**
     * Creates new form DataPembeli
     */
    public DataPembeli() {
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
        tabel_pembelian = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_home = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tabel_pembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel_pembelian);

        menu_home.setText("Home");
        menu_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu_homeMousePressed(evt);
            }
        });
        jMenuBar1.add(menu_home);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        tabel_pembelian.setModel(tbl);
        Fungsi fungsi = new Fungsi();
        fungsi.setKolom(tabel_pembelian);
        String nama,nomor,jumlah,total,tanggal; 
        int no;
        if (ArrNamaPembeli.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data Kosong");
        } else {
            for (int i = 0; i < ArrNamaPembeli.size(); i++) {
                no = i + 1;
                nama = ArrNamaPembeli.get(i);
                nomor = ArrNomorPembeli.get(i);
                jumlah = ArrJumlahTiket.get(i);
                total = ArrTotalHarga.get(i);
                tanggal = ArrTanggal.get(i);
                tbl.addRow(new Object[]{no, nama, nomor, jumlah,total, tanggal});
            }
        }
    }//GEN-LAST:event_formComponentShown

    private void menu_homeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_homeMousePressed
        Home home = new Home();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_homeMousePressed

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
            java.util.logging.Logger.getLogger(DataPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataPembeli.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataPembeli().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu_home;
    private javax.swing.JTable tabel_pembelian;
    // End of variables declaration//GEN-END:variables
}