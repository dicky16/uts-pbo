/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author djavu
 */
public class Fungsi {

     public JTable setKolom(JTable tblPembelian) {
        TableColumn column;
        tblPembelian.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        column = tblPembelian.getColumnModel().getColumn(0);
        column.setPreferredWidth(40);
        column = tblPembelian.getColumnModel().getColumn(1);
        column.setPreferredWidth(260);
        column = tblPembelian.getColumnModel().getColumn(2);
        column.setPreferredWidth(200);
        column = tblPembelian.getColumnModel().getColumn(3);
        column.setPreferredWidth(100);
        column = tblPembelian.getColumnModel().getColumn(4);
        column.setPreferredWidth(132);
        column = tblPembelian.getColumnModel().getColumn(5);
        column.setPreferredWidth(190);
        return tblPembelian;
    }
     public String setIDR(double var) {
        //rupiah format
        String idr;
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols rp = new DecimalFormatSymbols();
        rp.setCurrencySymbol("IDR. ");
        rp.setMonetaryDecimalSeparator(',');
        rp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(rp);
        //end
        idr = rupiah.format(var);
        return idr;
    }

}
