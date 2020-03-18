/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
//import class fungsi dan WisataData
import model.Fungsi;
import model.WisataData;

/**
 *
 * @author djavu
 */
public class DetailTiket extends javax.swing.JFrame {

    /**
     * Creates new form DetailTiket
     */
    public DetailTiket(String nama, String harga, String img) {

        initComponents();

        try {
            tv_harga.setText(harga);
            tv_nama_wisata.setText(nama);

            URL url = new URL(img);
            ImageIcon imggg = new ImageIcon(new ImageIcon(url).getImage()
                    .getScaledInstance(400, 200, Image.SCALE_SMOOTH));

            tv_img_detail.setIcon(imggg);

        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    DetailTiket() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tv_img_detail = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tv_nama_wisata = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_bayar = new javax.swing.JButton();
        edt_nama_pembeli = new javax.swing.JTextField();
        edt_nomor_pembeli = new javax.swing.JTextField();
        tv_harga = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        edt_jumlah = new javax.swing.JTextField();
        tv_total_harga = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel2.setText("Harga");

        jLabel3.setText("Nama");

        tv_nama_wisata.setText("nama wisata");

        jLabel5.setText("Nomor Telp.");

        btn_bayar.setBackground(new java.awt.Color(0, 102, 255));
        btn_bayar.setForeground(new java.awt.Color(255, 255, 255));
        btn_bayar.setText("BAYAR");
        btn_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bayarActionPerformed(evt);
            }
        });

        tv_harga.setText("harga");

        jLabel1.setText("Jumah Tiket");

        edt_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edt_jumlahKeyReleased(evt);
            }
        });

        tv_total_harga.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(tv_img_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(303, 303, 303)
                            .addComponent(tv_nama_wisata))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(376, 376, 376)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tv_harga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edt_jumlah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGap(80, 80, 80)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(edt_nomor_pembeli)
                                .addComponent(edt_nama_pembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tv_total_harga, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                    .addComponent(btn_bayar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(tv_img_detail, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tv_nama_wisata)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(edt_nama_pembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(edt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(edt_nomor_pembeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tv_harga))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(tv_total_harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bayarActionPerformed
        String nama, noTelp, jumlahTiket, total, tgl;
        Date date = new Date();
        nama = edt_nama_pembeli.getText();
        noTelp = edt_nomor_pembeli.getText();
        jumlahTiket = edt_jumlah.getText();

        tgl = date.toString();
        WisataData wisataData = new WisataData();
        if (nama.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Masukkan Nama");
        } else if (noTelp.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Masukkan Nomor Telepon");
        } else if (jumlahTiket.equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Masukkan Jumlah Tiket");

        } else {
            if (isNumber(noTelp)) {
                total = tv_total_harga.getText();
                JOptionPane.showMessageDialog(this, "Nama : " + nama + "\n"
                        + "Nomor Telepon : " + noTelp + "\n"
                        + "Jumlah Tiket : " + jumlahTiket + "\n"
                        + "Total : " + total + "\n"
                        + "Tanggal Pembelian : " + tgl);
                wisataData.setDataArray(nama, noTelp, jumlahTiket, total, tgl);
                
                edt_nama_pembeli.setText("");
                edt_nomor_pembeli.setText("");
                edt_jumlah.setText("");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Masukkan Nomor Telepon berisi angka");
            }

        }
    }//GEN-LAST:event_btn_bayarActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        tv_harga.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void edt_jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edt_jumlahKeyReleased
        Fungsi fungsi = new Fungsi();
        if (edt_jumlah.getText().equals("")) {
            tv_total_harga.setText("");
        } else {
            if (isNumber(edt_jumlah.getText())) {
                double jumlahTiket = Double.parseDouble(edt_jumlah.getText());
                String harga = tv_harga.getText();
                Double hargaAwal = Double.parseDouble(getHargaToString(harga));
                //set nilai
                WisataData wisataData = new WisataData(jumlahTiket, hargaAwal);
                //proses
                double total = wisataData.getTotalHarga();
                tv_total_harga.setText(fungsi.setIDR(total));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Masukkan Jumlah Tiket berisi angka");
            }

        }
    }//GEN-LAST:event_edt_jumlahKeyReleased

    String getHargaToString(final CharSequence input) {
        final StringBuilder sb = new StringBuilder(input.length());
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            if (c > 47 && c < 58) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))
                    == false) {
                return false;
            }
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bayar;
    private javax.swing.JTextField edt_jumlah;
    private javax.swing.JTextField edt_nama_pembeli;
    private javax.swing.JTextField edt_nomor_pembeli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel tv_harga;
    private javax.swing.JLabel tv_img_detail;
    private javax.swing.JLabel tv_nama_wisata;
    private javax.swing.JLabel tv_total_harga;
    // End of variables declaration//GEN-END:variables
}
