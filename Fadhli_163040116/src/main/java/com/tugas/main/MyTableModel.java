/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas.main;
import javax.swing.table.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FDL
 */
class MyTableModel extends AbstractTableModel{
    private String[] columnNames = {"Nama", "Jenis Kelamin", "No HP", "Alamat"};
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();

   public int getColumnCount(){
       return columnNames.length;
   }
   
   public int getRowCount(){
       return data.size();
   }
   
   public String getColumn(int col){
       return columnNames[col];
   }
   
   public Object getValueAt(int row, int col){
       List<String> rowItem = data.get(row);
       return rowItem.get(col);
   }
   
   public boolean isCellEditable(int row, int col){
        return false;
    }
   
   public void add(ArrayList<String> value){
        data.add(value);
        fireTableRowsInserted(data.size()-1, data.size()-1);
    }

//    private void fireTableRowInserted(int i, int i0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
