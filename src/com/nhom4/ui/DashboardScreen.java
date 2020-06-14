/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.ui;


import com.nhom4.component.JPanelStaff1;
import com.nhom4.component.JpanelBill;
import com.nhom4.component.JpanelMember;
import com.nhom4.component.JpanelOrder;
import com.nhom4.component.JpanelProductNew;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author phamquochuy
 */
public class DashboardScreen extends javax.swing.JFrame {

    /**
     * Creates new form DashboardScreen
     */
    
    //private final JPanelHomeTest test = new JPanelHomeTest();
    private Timer t;
    
    
    private final JpanelProductNew product = new JpanelProductNew();
    private final JpanelMember member = new JpanelMember();
    private final JpanelBill bill = new JpanelBill();
    
    
    private final JPanelStaff1 staff = new JPanelStaff1();
    
    private final JpanelOrder order = new JpanelOrder();
    
   // private JpanelStaff staff = new JpanelStaff();
    private void onChangeTabClick(int index){
        
        switch (index) {
            case 0:
                resetButton(btnHome,true);
                resetButton(btnProduct,false);
                resetButton(btnMember,false);
                resetButton(btnStaff,false);
                resetButton(btnBill,false);
                break;
            case 1:
                resetButton(btnHome,false);
                resetButton(btnProduct,true);
                resetButton(btnMember,false);
                resetButton(btnStaff,false);
                resetButton(btnBill,false);
                break;
            case 2:
                resetButton(btnHome,false);
                resetButton(btnProduct,false);
                resetButton(btnStaff,true);
                resetButton(btnMember,false);
                resetButton(btnBill,false);
                break;
            case 3:
                resetButton(btnHome,false);
                resetButton(btnProduct,false);
                resetButton(btnMember,true);
                resetButton(btnBill,false);
                resetButton(btnStaff,false);
                break;
            case 4:
                resetButton(btnHome,false);
                resetButton(btnProduct,false);
                resetButton(btnMember,false);
                resetButton(btnBill,true);
                resetButton(btnStaff,false);
                break;
            default:
                break;
        }
       
        
    }
    
    
    void resetButton(JButton t,boolean statusActive){
        
        if(statusActive==false){
            t.setBackground(new java.awt.Color(238,238,238));
            t.setOpaque(false);
            t.setBorderPainted(true);
            
            t.setForeground(new java.awt.Color(0,0,0));
        }else{
            t.setBackground(new java.awt.Color(252,95,87));
            t.setOpaque(true);
            t.setBorderPainted(false);
            
            t.setForeground(Color.white);
        } 
    }
    
    
    public DashboardScreen() {
        initComponents();
               Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
       this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
       
       
       setUpJanelMain();
       onChangeTabClick(0);
    
    }
    
    private void setUpJanelMain(){
        
        
            JpanelMain.add(product);
            
            JpanelMain.add(member);
        
            JpanelMain.add(bill);
        
            JpanelMain.add(staff);
      
            JpanelMain.add(order);
            JPanelHome.setVisible(true);
            startTimer();
            product.setVisible(false);
            member.setVisible(false);
            staff.setVisible(false);
            bill.setVisible(false);
       
      //  staff.setVisible(false);
    }
    private void startTimer(){
         t  = new Timer(1000, (ActionEvent e) -> {
             SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
             lblTimer.setText(sdf.format(new java.util.Date()));
         });
        t.start();
    }
    
    void stopTimer(){
        t.stop();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnBill = new javax.swing.JButton();
        btnProduct = new javax.swing.JButton();
        btnStaff = new javax.swing.JButton();
        btnMember = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnGoiMon = new javax.swing.JButton();
        JpanelMain = new javax.swing.JPanel();
        JPanelHome = new javax.swing.JPanel();
        lblHomeTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNumberProduct = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblRevenue = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTimer = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblNumberNewMember = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(229, 227, 229));

        btnHome.setBackground(new java.awt.Color(255, 204, 102));
        btnHome.setBorderPainted(false);
        btnHome.setFocusPainted(false);
        btnHome.setLabel("Trang Chủ");
        btnHome.setOpaque(true);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnBill.setText("Quản Lý Hoá Đơn");
        btnBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillActionPerformed(evt);
            }
        });

        btnProduct.setText("Quản Lý Sản Phẩm");
        btnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductActionPerformed(evt);
            }
        });

        btnStaff.setText("Quản Lý Nhân Viên");
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });

        btnMember.setText("Quản Lý Thành Viên");
        btnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberActionPerformed(evt);
            }
        });

        jButton1.setText("Trang Cá Nhân");

        jButton2.setText("Đăng Xuất");

        btnGoiMon.setText("Gọi Món");
        btnGoiMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoiMonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(btnBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(btnStaff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(btnMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGoiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                    .addComponent(btnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(btnStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMember, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBill, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGoiMon, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(93, 93, 93)
                    .addComponent(btnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(433, Short.MAX_VALUE)))
        );

        btnHome.getAccessibleContext().setAccessibleName("btnTrangChu");

        JpanelMain.setBackground(new java.awt.Color(255, 255, 255));
        JpanelMain.setLayout(new java.awt.CardLayout());

        JPanelHome.setBackground(new java.awt.Color(255, 255, 255));

        lblHomeTitle.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        lblHomeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHomeTitle.setText("THỐNG KÊ HOẠT ĐỘNG TRONG NGÀY");
        lblHomeTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(39, 138, 39));
        jPanel1.setMaximumSize(new java.awt.Dimension(305, 165));

        lblNumberProduct.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblNumberProduct.setForeground(new java.awt.Color(255, 255, 255));
        lblNumberProduct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumberProduct.setText("300");
        lblNumberProduct.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sản Phẩm Bán Được");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setMaximumSize(new java.awt.Dimension(88, 56));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumberProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblNumberProduct)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(226, 36, 98));
        jPanel2.setMaximumSize(new java.awt.Dimension(305, 165));

        lblRevenue.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblRevenue.setForeground(new java.awt.Color(255, 255, 255));
        lblRevenue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRevenue.setText("3M");
        lblRevenue.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Doanh Thu");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setMaximumSize(new java.awt.Dimension(88, 56));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblRevenue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblRevenue)
                .addGap(31, 31, 31)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(155, 48, 177));
        jPanel3.setMaximumSize(new java.awt.Dimension(305, 165));

        lblTimer.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblTimer.setForeground(new java.awt.Color(255, 255, 255));
        lblTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTimer.setText("12:00:01");
        lblTimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Thời gian");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6.setMaximumSize(new java.awt.Dimension(88, 56));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTimer, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTimer)
                .addGap(29, 29, 29)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(251, 88, 47));
        jPanel5.setMaximumSize(new java.awt.Dimension(305, 165));

        lblNumberNewMember.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        lblNumberNewMember.setForeground(new java.awt.Color(255, 255, 255));
        lblNumberNewMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNumberNewMember.setText("12");
        lblNumberNewMember.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thành Viên Mới");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setMaximumSize(new java.awt.Dimension(88, 56));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNumberNewMember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblNumberNewMember)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout JPanelHomeLayout = new javax.swing.GroupLayout(JPanelHome);
        JPanelHome.setLayout(JPanelHomeLayout);
        JPanelHomeLayout.setHorizontalGroup(
            JPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHomeLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(JPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelHomeLayout.createSequentialGroup()
                        .addComponent(lblHomeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                        .addGap(225, 225, 225))
                    .addGroup(JPanelHomeLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addGroup(JPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(JPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanelHomeLayout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(545, Short.MAX_VALUE)))
        );
        JPanelHomeLayout.setVerticalGroup(
            JPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHomeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblHomeTitle)
                .addGap(38, 38, 38)
                .addGroup(JPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(65, 65, 65)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(JPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPanelHomeLayout.createSequentialGroup()
                    .addGap(319, 319, 319)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(216, Short.MAX_VALUE)))
        );

        JpanelMain.add(JPanelHome, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JpanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductActionPerformed
        // TODO add your handling code here:
        
        if(MainScreen.staffRole.equals("Phục Vụ") ||MainScreen.staffRole.equals("Tài Chính")){
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập", "Thông báo!",
            JOptionPane.INFORMATION_MESSAGE);
        }else{
            product.setVisible(true);
            JPanelHome.setVisible(false);
            member.setVisible(false);
            bill.setVisible(false);
            staff.setVisible(false);
            onChangeTabClick(1);
        } 
    }//GEN-LAST:event_btnProductActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        
       
        JPanelHome.setVisible(true);
        product.setVisible(false);
        member.setVisible(false);
        bill.setVisible(false);
        staff.setVisible(false);
        onChangeTabClick(0);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        
        if(MainScreen.staffRole.equals("Toàn Quyền") ){
            
            member.setVisible(true);
            JPanelHome.setVisible(false);
            product.setVisible(false);
            bill.setVisible(false);
            staff.setVisible(false);
       
            onChangeTabClick(3);
            
        }else{
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập", "Thông báo!",
            JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnMemberActionPerformed

    private void btnBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillActionPerformed
        // TODO add your handling code here:
        if(MainScreen.staffRole.equals("Phục Vụ") ||MainScreen.staffRole.equals("Toàn Quyền") ||MainScreen.staffRole.equals("Tài Chính")){
            
            bill.setVisible(true);
            member.setVisible(false);
            JPanelHome.setVisible(false);
            product.setVisible(false);
            staff.setVisible(false);
            onChangeTabClick(4);
           
        }else{
             JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập", "Thông báo!",
            JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnBillActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        // TODO add your handling code here:
        
        if(MainScreen.staffRole.equals("Toàn Quyền") ){
            staff.setVisible(true);
        
            bill.setVisible(false);
            member.setVisible(false);
            JPanelHome.setVisible(false);
            product.setVisible(false);
       
            onChangeTabClick(2);
        }else{
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập", "Thông báo!",
            JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_btnStaffActionPerformed

    private void btnGoiMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoiMonActionPerformed
        
        if(MainScreen.staffRole.equals("Phục Vụ") ||MainScreen.staffRole.equals("Toàn Quyền")){
            order.setVisible(true);
            staff.setVisible(false);
        
            bill.setVisible(false);
            member.setVisible(false);
            JPanelHome.setVisible(false);
            product.setVisible(false);
        
            onChangeTabClick(7);
        }else{
            JOptionPane.showMessageDialog(this, "Bạn không có quyền truy cập", "Thông báo!",
            JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnGoiMonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelHome;
    private javax.swing.JPanel JpanelMain;
    private javax.swing.JButton btnBill;
    private javax.swing.JButton btnGoiMon;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnProduct;
    private javax.swing.JButton btnStaff;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblHomeTitle;
    private javax.swing.JLabel lblNumberNewMember;
    private javax.swing.JLabel lblNumberProduct;
    private javax.swing.JLabel lblRevenue;
    private javax.swing.JLabel lblTimer;
    // End of variables declaration//GEN-END:variables
}
