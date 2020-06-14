/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.component;

import com.nhom4.model.Member;
import com.nhom4.repository.MemberRepository;
import com.nhom4.repository.StaffRepository;
import com.nhom4.ui.AddStaffForm;
import com.nhom4.ui.MemberForm;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phamquochuy
 */
public class JpanelMember extends javax.swing.JPanel {

    /**
     * Creates new form JpanelMember
     */
    
    MemberRepository memberRepo ;
    
    List<Member> lstMember;
    public JpanelMember() {
        initComponents();
        initData();
        
       
    }
    
    void initData(){
        memberRepo = new MemberRepository();
        
        loadListMember();
    }
    
    
    private void loadListMember(){
       lstMember= memberRepo.getAllMember();
        
        
        DefaultTableModel defaultTableModel  = new DefaultTableModel(
                
        ){
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        
        lsvThanhVien.setModel(defaultTableModel);
       
        
        defaultTableModel.addColumn("Mã Thành Viên");
        defaultTableModel.addColumn("Tên Thành Viên");
       
        defaultTableModel.addColumn("Số Điện Thoại");
        defaultTableModel.addColumn("Điểm Tích Lũy");
        
        
        lstMember.forEach((member) -> {
            defaultTableModel.addRow(new Object[]{member.getMakhachhang(),member.getTenkhachhang(),member.getSodienthoai(),member.getTichdiem()
            });
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLamMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsvThanhVien = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        btnThem1 = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();

        setLayout(null);

        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Add.png"))); // NOI18N
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        add(btnLamMoi);
        btnLamMoi.setBounds(520, 10, 115, 44);

        lsvThanhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã thành viên", "Họ và Tên", "SĐT", "Điểm tích lũy"
            }
        ));
        lsvThanhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lsvThanhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lsvThanhVien);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 61, 780, 400);
        add(jTextField1);
        jTextField1.setBounds(10, 19, 227, 28);

        btnThem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Add.png"))); // NOI18N
        btnThem1.setText("Thêm");
        btnThem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem1ActionPerformed(evt);
            }
        });
        add(btnThem1);
        btnThem1.setBounds(400, 10, 115, 44);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        add(btnXoa);
        btnXoa.setBounds(640, 10, 115, 44);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
     initData();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem1ActionPerformed
        // TODO add your handling code here:
        MemberForm  addmember= new MemberForm();
     
        addmember.setMemberRepo(memberRepo);
        addmember.setLocationRelativeTo(null);
        addmember.setVisible(true);
    }//GEN-LAST:event_btnThem1ActionPerformed

    private void lsvThanhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lsvThanhVienMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2 && lsvThanhVien.getSelectedRow()!=-1 ){
                DefaultTableModel defaultTableModel  = ( DefaultTableModel) lsvThanhVien.getModel();
                
                int selectedRowIndex =lsvThanhVien.getSelectedRow();
                
                selectedRowIndex=lsvThanhVien.convertRowIndexToModel(selectedRowIndex);
                
                System.out.print(selectedRowIndex);
                
                MemberForm  memberForm= new MemberForm();
                memberForm.setMemberRepo(memberRepo);
                memberForm.setMemberModel(lstMember.get(selectedRowIndex));
                memberForm.initValue();
                memberForm.setLocationRelativeTo(null);
                memberForm.setVisible(true);
                
            }
    }//GEN-LAST:event_lsvThanhVienMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
         int selectedRowIndex =lsvThanhVien.getSelectedRow();
         selectedRowIndex=lsvThanhVien.convertRowIndexToModel(selectedRowIndex);
         if(selectedRowIndex<0 || selectedRowIndex>= lstMember.size()){
           // System.out.print("Chọn nhân viên để xoá");
            JOptionPane.showMessageDialog(this, "Vui lòng chọn khách hàng để xoá", "Thông báo!",
            JOptionPane.INFORMATION_MESSAGE);
         }else{
             int dialogResult = JOptionPane.showConfirmDialog (this, "Bạn muốn xoá khách hàng "+lstMember.get(selectedRowIndex).getMakhachhang(),"Thông báo",JOptionPane.YES_NO_OPTION);
              if(dialogResult == JOptionPane.YES_OPTION){
                 if (memberRepo.deleteMember(lstMember.get(selectedRowIndex).getMakhachhang()) == true){
                     initData();
                 }
              }else{
                  
              }
             
         }
    }//GEN-LAST:event_btnXoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThem1;
    private javax.swing.JButton btnXoa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable lsvThanhVien;
    // End of variables declaration//GEN-END:variables
}
