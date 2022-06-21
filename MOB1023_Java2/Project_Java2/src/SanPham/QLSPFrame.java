package SanPham;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLSPFrame extends javax.swing.JFrame {
    private QuanLySanPham listSanPham;
    
    private String filename = "SanPham_IOS.txt";
    
    public QLSPFrame() {
        initComponents();
        this.listSanPham = new QuanLySanPham();
        this.listSanPham.insert(new SanPham("LT1012", "Macbook Air 2020", "Laptop", 1, 29999));
        this.listSanPham.insert(new SanPham("SP2012", "iPhone 11", "SmartPhone", 1, 30999));
        this.listSanPham.insert(new SanPham("SP3021", "iPhone XS Max", "SmartPhone", 0, 15999));
        this.loadTable();
        this.clearForm();
        
        new Thread(){
            public void run(){
                while (true) {                    
                    Calendar ca = new GregorianCalendar();
                    
                    int gio = ca.get(Calendar.HOUR_OF_DAY);
                    int phut = ca.get(Calendar.MINUTE);
                    int giay = ca.get(Calendar.SECOND);
                    
                    String time = gio + ":" + phut + ":" + giay;
                    
                    lblClock.setText(time);
                    
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        txtMaSP = new javax.swing.JTextField();
        cbbDanhMuc = new javax.swing.JComboBox<>();
        rdoConHang = new javax.swing.JRadioButton();
        rdoHetHang = new javax.swing.JRadioButton();
        txtDonGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaForm = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên SP");

        jLabel2.setText("Mã SP");

        jLabel3.setText("Danh Mục");

        jLabel4.setText("Tình trạng");

        jLabel5.setText("Đơn giá");

        cbbDanhMuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "SmartPhone" }));

        buttonGroup1.add(rdoConHang);
        rdoConHang.setText("Còn hàng");

        buttonGroup1.add(rdoHetHang);
        rdoHetHang.setText("Hết hàng");

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnXoaForm.setText("Xóa Form");
        btnXoaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFormActionPerformed(evt);
            }
        });

        btnDoc.setText("Đọc");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblClock.setText("12 : 00 : 00");

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên SP", "Mã SP", "Danh mục", "Trạng thái", "Đơn giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGhi))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSua))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(cbbDanhMuc, 0, 119, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTenSP)
                            .addComponent(txtMaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoConHang)
                                .addGap(18, 18, 18)
                                .addComponent(rdoHetHang))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClock)
                                    .addComponent(btnXoaForm)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit)
                            .addComponent(btnXoa))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdoConHang)
                    .addComponent(rdoHetHang))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnXoaForm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoc)
                    .addComponent(btnGhi)
                    .addComponent(btnExit)
                    .addComponent(lblClock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        SanPham sanPham = this.getFormData();
        if(sanPham == null){
            return;
        }
        this.listSanPham.insert(sanPham);
        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Thêm mới thành công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int row = this.tblSanPham.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Chọn dòng cần sửa trên Table");
        }
        
        SanPham sanPham = this.getFormData();
        if(sanPham == null){
            return;
        }
        this.listSanPham.update(row, sanPham);
        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Sửa thành công");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = this.tblSanPham.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Chọn dòng cần xóa trên Table");
        }
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
        if(confirm == JOptionPane.NO_OPTION){
            return;
        }
        else if(confirm == JOptionPane.CANCEL_OPTION){
            return;
        }
        this.listSanPham.delete(row);
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXoaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFormActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnXoaFormActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        File file = new File(filename);
        if(file.exists() == false){
            JOptionPane.showMessageDialog(this, "File không tồn tại");
            return;
        }
        
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<SanPham> list = (ArrayList<SanPham>) ois.readObject();
            ois.close();
            this.listSanPham.setList(list);
            this.loadTable();
            JOptionPane.showMessageDialog(this, "Đọc thành công");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Lỗi dữ liệu");
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnDocActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        try {
            File file = new File(this.filename);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.listSanPham.getList());
            oos.close();
            JOptionPane.showMessageDialog(this, "Ghi thành công");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        ArrayList<SanPham> list = this.listSanPham.getList();
        
        int row = this.tblSanPham.getSelectedRow();
        if(row == -1){
            return;
        }
        String tenSP = this.tblSanPham.getValueAt(row, 0).toString();
        String maSP = this.tblSanPham.getValueAt(row, 1).toString();
        String danhMuc = this.tblSanPham.getValueAt(row, 2).toString();
        String trangThai = this.tblSanPham.getValueAt(row, 3).toString();
        String donGia = this.tblSanPham.getValueAt(row, 4).toString();
        
        this.txtTenSP.setText(tenSP);
        this.txtMaSP.setText(maSP);
        this.cbbDanhMuc.setSelectedItem(danhMuc);
        if(trangThai.equals("Còn hàng")){
            this.rdoConHang.setSelected(true);
        }
        else{
            this.rdoHetHang.setSelected(true);
        }
        this.txtDonGia.setText(donGia);
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void clearForm(){
        this.txtMaSP.setText("");
        this.txtTenSP.setText("");
        this.cbbDanhMuc.setSelectedIndex(0);
        this.rdoConHang.setSelected(true);
        this.txtDonGia.setText("");
    }
    
    private void loadTable(){
        ArrayList<SanPham> list = this.listSanPham.getList();
        DefaultTableModel dtm = (DefaultTableModel) this.tblSanPham.getModel();
        
        dtm.setRowCount(0);
        for (SanPham sanPham : list) {
            Object[] row = new Object[]{
                sanPham.getTenSP(),
                sanPham.getMaSP(),
                sanPham.getDanhMuc(),
                sanPham.getTrangThai() == 1 ? "Còn hàng" : "Hết hàng",
                sanPham.getDonGia()
            };
            dtm.addRow(row);
        }
    }
    
    private SanPham getFormData(){
        String tenSP = this.txtTenSP.getText();
        String maSP = this.txtMaSP.getText();
        String danhMuc = this.cbbDanhMuc.getSelectedItem().toString();
        int trangThai = this.rdoConHang.isSelected() ? 1 : 0;
        String donGia = this.txtDonGia.getText();
        
        if(tenSP.trim().length() == 0 || maSP.trim().length() == 0 || donGia.trim().length() == 0){
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        
        try {
            Double.parseDouble(donGia);
            if(Double.parseDouble(donGia) < 1){
                JOptionPane.showMessageDialog(this, "Đơn giá phải là số dương và lớn hơn 1");
                return null;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Đơn giá phải là số");
            return null;
        }
        
        SanPham sanPham = new SanPham(maSP, tenSP, danhMuc, trangThai, Double.parseDouble(donGia));
        return sanPham;
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLSPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSPFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSPFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaForm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbDanhMuc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JRadioButton rdoConHang;
    private javax.swing.JRadioButton rdoHetHang;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
}
