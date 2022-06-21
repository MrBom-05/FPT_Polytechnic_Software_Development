package BaiThi;

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

public class QuanLySanPhamFrame extends javax.swing.JFrame {

    private QuanLySanPham listSanPham;
    private String filename = "SanPham.txt";

    public QuanLySanPhamFrame() {
        initComponents();
        this.listSanPham = new QuanLySanPham();
        this.listSanPham.insert(new SanPham("MacBook Air 2020", "LC4", "Laptop", 1, 29999));
        this.listSanPham.insert(new SanPham("iPhone 11", "SC4", "SmartPhone", 1, 30999));
        this.listSanPham.insert(new SanPham("iPhone XS Max", "IP10", "SmartPhone", 0, 15999));
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

    private void clearForm() {
        this.txtTenSP.setText("");
        this.txtMaSP.setText("");
        this.cbbDanhMuc.setSelectedIndex(0);
        this.rdoConHang.setSelected(true);
        this.txtDonGia.setText("");
    }

    private void loadTable() {
        ArrayList<SanPham> list = this.listSanPham.getList();
        DefaultTableModel dtm = (DefaultTableModel) this.tblSanPham.getModel();
        dtm.setRowCount(0);
        for (SanPham sanPham : list) {
            Object[] row = new Object[]{
                sanPham.getTenSP(),
                sanPham.getMaSP(),
                sanPham.getDanhMuc(),
                sanPham.getTrangThai() == 1 ? "Con Hang" : "Het Hang",
                sanPham.getDonGia()
            };
            dtm.addRow(row);
        }
    }

    private SanPham getFormData() {
        String tenSP = this.txtTenSP.getText();
        String maSP = this.txtMaSP.getText();
        String danhMuc = this.cbbDanhMuc.getSelectedItem().toString();
        int trangThai = this.rdoConHang.isSelected() ? 1 : 0;
        String donGia = this.txtDonGia.getText();

        if (tenSP.trim().length() == 0 || maSP.trim().length() == 0 || donGia.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Khong duoc de trong");
            return null;
        }
        SanPham sanpham = new SanPham(tenSP, maSP, danhMuc, trangThai, Double.parseDouble(donGia));
        return sanpham;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbbDanhMuc = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        rdoConHang = new javax.swing.JRadioButton();
        rdoHetHang = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaForm = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("TenSP");

        jLabel2.setText("MaSP");

        jLabel3.setText("Danh Muc");

        cbbDanhMuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laptop", "SmartPhone" }));

        jLabel4.setText("Trang thai");

        buttonGroup1.add(rdoConHang);
        rdoConHang.setText("Con Hang");

        buttonGroup1.add(rdoHetHang);
        rdoHetHang.setText("Het Hang");

        jLabel5.setText("Don gia");

        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sua");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnXoaForm.setText("Xoa Form");
        btnXoaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFormActionPerformed(evt);
            }
        });

        btnDoc.setText("Doc");
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

        btnThoat.setText("Thoat");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        lblClock.setText("00:00:00");

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TenSP", "MaSP", "Danh Muc", "Trang Thai", "Don Gia"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(cbbDanhMuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenSP))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)
                                .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoConHang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoHetHang))
                            .addComponent(txtDonGia))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem)
                            .addComponent(btnDoc))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGhi)
                                .addGap(41, 41, 41)
                                .addComponent(btnThoat))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSua)
                                .addGap(41, 41, 41)
                                .addComponent(btnXoa)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnXoaForm)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblClock)
                                .addGap(40, 40, 40))))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rdoConHang)
                    .addComponent(rdoHetHang))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnXoaForm))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoc)
                    .addComponent(btnGhi)
                    .addComponent(btnThoat)
                    .addComponent(lblClock))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        SanPham sanpham = this.getFormData();
        if (sanpham == null) {
            return;
        }
        this.listSanPham.insert(sanpham);
        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Them thanh cong");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int row = this.tblSanPham.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chon 1 dong tren Table");
            return;
        }
        SanPham sanpham = this.getFormData();
        if (sanpham == null) {
            return;
        }
        this.listSanPham.update(row, sanpham);
        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Sua thanh cong");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = this.tblSanPham.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chon 1 dong tren Table");
            return;
        }
        int chon = JOptionPane.showConfirmDialog(this, "Ban co muon xoa khong");
        if (chon == JOptionPane.CANCEL_OPTION) {
            return;
        } else if (chon == JOptionPane.NO_OPTION) {
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
            JOptionPane.showMessageDialog(this, "File khong ton tai");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<SanPham> list = (ArrayList<SanPham>) ois.readObject();
            ois.close();
            this.listSanPham.setList(list);
            this.loadTable();
            JOptionPane.showMessageDialog(this, "Doc thanh cong");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Khong tim thay file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Loi vao ra");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Sai du lieu");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDocActionPerformed

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed

        try {
            File file = new File(filename);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.listSanPham.getList());
            oos.close();
            JOptionPane.showMessageDialog(this, "Ghi thanh cong");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Khong tim thay file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Loi vao ra");
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked

        int row = this.tblSanPham.getSelectedRow();
        if (row == -1) {
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
        if (trangThai.equals("Con Hang")) {
            rdoConHang.setSelected(true);
        } else {
            rdoHetHang.setSelected(true);
        }
        this.txtDonGia.setText(donGia);
    }//GEN-LAST:event_tblSanPhamMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySanPhamFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySanPhamFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
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
