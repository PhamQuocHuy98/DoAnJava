/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhom4.component;

/**
 *
 * @author quocs
 */
public class JpanelStaff extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public JpanelStaff() {
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

        lblEmail = new javax.swing.JLabel();
        lblDiaChi = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtTaiKhoan = new javax.swing.JTextField();
        lbltaikhoan = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        lblMatKhau = new javax.swing.JLabel();
        txtXacNhanMatKhau = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        lblXacNhanMatKhau = new javax.swing.JLabel();
        cbPhanQuyen = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        taDiaChi = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        lblEmail2 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnXoa = new javax.swing.JButton();
        txtLuong = new javax.swing.JTextField();
        lblHovaten = new javax.swing.JLabel();
        lblSDT = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        rbGioiTinhNam = new javax.swing.JRadioButton();
        lblEmail1 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        rbGioiTinhNu = new javax.swing.JRadioButton();

        setLayout(null);

        lblEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail.setText("Mã Nhân Viên:");
        add(lblEmail);
        lblEmail.setBounds(39, 337, 87, 25);

        lblDiaChi.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDiaChi.setText("Địa Chỉ:");
        add(lblDiaChi);
        lblDiaChi.setBounds(425, 337, 46, 15);

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        add(btnThem);
        btnThem.setBounds(40, 450, 112, 44);

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        add(btnSua);
        btnSua.setBounds(620, 450, 119, 44);

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Họ và Tên", "Tài Khoản", "Giới Tính", "Ngày Sinh", "SĐT", "Địa Chỉ", "Lương"
            }
        ));
        jScrollPane1.setViewportView(tbNhanVien);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 95, 680, 147);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 153));
        jLabel1.setText("BẢNG QUẢN LÝ NHÂN VIÊN");
        add(jLabel1);
        jLabel1.setBounds(307, 11, 243, 25);

        txtTaiKhoan.setText("S01");
        add(txtTaiKhoan);
        txtTaiKhoan.setBounds(166, 260, 140, 20);

        lbltaikhoan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbltaikhoan.setText("Tài Khoản:");
        add(lbltaikhoan);
        lbltaikhoan.setBounds(39, 262, 64, 15);
        add(txtMatKhau);
        txtMatKhau.setBounds(166, 285, 140, 20);

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Save.png"))); // NOI18N
        btnLuu.setText("Lưu");
        add(btnLuu);
        btnLuu.setBounds(220, 450, 116, 44);

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblMatKhau.setText("Mật Khẩu:");
        add(lblMatKhau);
        lblMatKhau.setBounds(39, 287, 63, 15);
        add(txtXacNhanMatKhau);
        txtXacNhanMatKhau.setBounds(166, 311, 140, 20);

        lblGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGioiTinh.setText("Giới Tính:");
        add(lblGioiTinh);
        lblGioiTinh.setBounds(425, 287, 56, 15);

        lblXacNhanMatKhau.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblXacNhanMatKhau.setText("Xác Nhận Mật Khẩu:");
        add(lblXacNhanMatKhau);
        lblXacNhanMatKhau.setBounds(39, 313, 123, 15);

        cbPhanQuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbPhanQuyen);
        cbPhanQuyen.setBounds(166, 371, 140, 20);

        taDiaChi.setColumns(20);
        taDiaChi.setRows(5);
        taDiaChi.setText("1A đường B ngõ C");
        jScrollPane2.setViewportView(taDiaChi);

        add(jScrollPane2);
        jScrollPane2.setBounds(540, 340, 155, 67);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tìm Kiếm Tài Khoản:");
        add(jLabel10);
        jLabel10.setBounds(18, 59, 122, 15);

        lblEmail2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail2.setText("Lương:");
        add(lblEmail2);
        lblEmail2.setBounds(39, 399, 44, 25);

        txtHoTen.setText("Nguyễn Văn A");
        add(txtHoTen);
        txtHoTen.setBounds(540, 260, 150, 20);

        txtSDT.setText("0123456789");
        add(txtSDT);
        txtSDT.setBounds(540, 310, 150, 20);

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICON/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        add(btnXoa);
        btnXoa.setBounds(430, 450, 114, 44);

        txtLuong.setText("10000000");
        add(txtLuong);
        txtLuong.setBounds(166, 402, 140, 20);

        lblHovaten.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHovaten.setText("Họ Và Tên:");
        add(lblHovaten);
        lblHovaten.setBounds(425, 262, 66, 15);

        lblSDT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSDT.setText("SĐT:");
        add(lblSDT);
        lblSDT.setBounds(425, 313, 28, 15);
        add(txtTimKiem);
        txtTimKiem.setBounds(158, 57, 203, 20);

        rbGioiTinhNam.setText("Nam");
        add(rbGioiTinhNam);
        rbGioiTinhNam.setBounds(540, 280, 47, 23);

        lblEmail1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEmail1.setText("Phân Quyền:");
        add(lblEmail1);
        lblEmail1.setBounds(39, 368, 78, 25);
        add(txtMaNV);
        txtMaNV.setBounds(166, 337, 140, 20);

        rbGioiTinhNu.setText("Nữ");
        add(rbGioiTinhNu);
        rbGioiTinhNu.setBounds(640, 280, 39, 23);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbPhanQuyen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiaChi;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEmail2;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblHovaten;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblXacNhanMatKhau;
    private javax.swing.JLabel lbltaikhoan;
    private javax.swing.JRadioButton rbGioiTinhNam;
    private javax.swing.JRadioButton rbGioiTinhNu;
    private javax.swing.JTextArea taDiaChi;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTaiKhoan;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtXacNhanMatKhau;
    // End of variables declaration//GEN-END:variables
}
