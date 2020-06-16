/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.component;

import com.nhom4.model.Staff;
import com.nhom4.model.Utils;
import com.nhom4.repository.StaffRepository;
import com.nhom4.ui.AddStaffForm;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phamquochuy
 */
public final class JPanelStaff1 extends javax.swing.JPanel {

    /**
     * Creates new form JPanelStaff1
     */
    private StaffRepository staffRepo ;
    
    private List<Staff> listStaff;
    public JPanelStaff1() {
        initComponents();
        
        initData();
    }
    
    void initData(){
        staffRepo = new StaffRepository();
        
        loadListStaff();
    }
    
    
    private void loadListStaff(){
       listStaff= staffRepo.getListStaff();
        
        
        DefaultTableModel defaultTableModel  = new DefaultTableModel(
                
        ){
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        
        lstNhanVien.setModel(defaultTableModel);
       
        
        defaultTableModel.addColumn("Tài khoản");
        defaultTableModel.addColumn("Tên Nhân Viên");
        defaultTableModel.addColumn("Giới Tính");
        defaultTableModel.addColumn("Chức Vụ");
        defaultTableModel.addColumn("Ngày Vào Làm");
        defaultTableModel.addColumn("Địa chỉ");
        defaultTableModel.addColumn("Số Điện Thoại");
        defaultTableModel.addColumn("Lương");
        
        //DecimalFormat formatter = new DecimalFormat("###,###,###");
        listStaff.forEach((staff) -> {
            defaultTableModel.addRow(new Object[]{
                staff.getMaNV(),staff.getTenNV(),mapSexIntToString(staff.getGioiTinh()),staff.getChucVu(),1900,staff.getSdt(),staff.getDiaChi(),Utils.formatMoney(staff.getLuong())
            });
        });
    }

    String mapSexIntToString(int sex){
        return sex==0?"Nữ":"Nam";
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThemMoi = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNhanVien = new javax.swing.JTable();
        btnRefesh = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        btnThemMoi.setBackground(new java.awt.Color(76, 175, 80));
        btnThemMoi.setForeground(new java.awt.Color(255, 255, 255));
        btnThemMoi.setText("Thêm mới");
        btnThemMoi.setBorderPainted(false);
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        txtTimKiem.setText("Tìm kiếm");

        lstNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Họ và Tên", "Giới Tính", "Ngày Sinh", "SĐT", "Địa Chỉ", "Lương"
            }
        ));
        lstNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstNhanVienMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lstNhanVienMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lstNhanVienMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lstNhanVienMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(lstNhanVien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRefesh.setText("Refesh");
        btnRefesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefeshActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(255, 51, 51));
        btnXoa.setForeground(new java.awt.Color(255, 255, 255));
        btnXoa.setText("Xoá");
        btnXoa.setBorderPainted(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnRefesh, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefesh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        // TODO add your handling code here:
        
      AddStaffForm  addSataffForm= new AddStaffForm();
      addSataffForm.setStaffRepo(staffRepo);
      addSataffForm.initValue();
      addSataffForm.setLocationRelativeTo(null);
      addSataffForm.setVisible(true);
      
      
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void btnRefeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefeshActionPerformed
        initData();
    }//GEN-LAST:event_btnRefeshActionPerformed

    private void lstNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstNhanVienMouseClicked
            if(evt.getClickCount()==2 && lstNhanVien.getSelectedRow()!=-1 ){
                DefaultTableModel defaultTableModel  = ( DefaultTableModel) lstNhanVien.getModel();
                
                int selectedRowIndex =lstNhanVien.getSelectedRow();
                
                selectedRowIndex=lstNhanVien.convertRowIndexToModel(selectedRowIndex);
                
                System.out.print(selectedRowIndex);
                
                AddStaffForm  addSataffForm= new AddStaffForm();
                addSataffForm.setStaffRepo(staffRepo);
                addSataffForm.setStaffModel(listStaff.get(selectedRowIndex));
                addSataffForm.initValue();
                addSataffForm.setLocationRelativeTo(null);
                addSataffForm.setVisible(true);
                
            }
           
    }//GEN-LAST:event_lstNhanVienMouseClicked

    private void lstNhanVienMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstNhanVienMouseReleased
         
    }//GEN-LAST:event_lstNhanVienMouseReleased

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int selectedRowIndex =lstNhanVien.getSelectedRow();
         selectedRowIndex=lstNhanVien.convertRowIndexToModel(selectedRowIndex);
         if(selectedRowIndex<0 || selectedRowIndex>= listStaff.size()){
           // System.out.print("Chọn nhân viên để xoá");
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên để xoá", "Thông báo!",
            JOptionPane.INFORMATION_MESSAGE);
         }else{
             int dialogResult = JOptionPane.showConfirmDialog (this, "Bạn muốn xoá nhân viên "+listStaff.get(selectedRowIndex).getMaNV(),"Thông báo",JOptionPane.YES_NO_OPTION);
              if(dialogResult == JOptionPane.YES_OPTION){
                 if (staffRepo.deleteStaff(listStaff.get(selectedRowIndex).getMaNV()) == true){
                     initData();
                 }
              }else{
                  
              }
             
         }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void lstNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstNhanVienMouseExited
       
    }//GEN-LAST:event_lstNhanVienMouseExited

    private void lstNhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstNhanVienMousePressed
        //System.out.print("Click Press");
    }//GEN-LAST:event_lstNhanVienMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefesh;
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lstNhanVien;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
