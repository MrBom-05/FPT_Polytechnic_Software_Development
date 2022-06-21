package Product;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Product_Frame extends javax.swing.JFrame {

    private QuanLyProduct listProduct;
    private String filename = "Product_IOS.txt";

    public Product_Frame() {
        initComponents();

        this.listProduct = new QuanLyProduct();
        this.listProduct.insert(new Product("Máy Tính", 20000));
        this.listProduct.insert(new Product("Điện Thoại", 10000));
        this.listProduct.insert(new NoTaxProduct("Sách", 5000));

        this.clearForm();
        this.loadTable();
    }

    private void loadTable() {
        ArrayList<Product> danhSach = this.listProduct.getList();
        DefaultTableModel dtm = (DefaultTableModel) this.tblSanPham.getModel();
        dtm.setRowCount(0);
        for (Product product : danhSach) {
            Object[] row = new Object[]{
                product.getName(),
                product.getPrice(),
                product.getImportTax()

            };
            dtm.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rdoCoThue = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rdoKhongThue = new javax.swing.JRadioButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnXoaForm = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPham = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tên Sản Phẩm");

        jLabel2.setText("Đơn Giá");

        jLabel3.setText("Loại Sản Phẩm");

        buttonGroup1.add(rdoCoThue);
        rdoCoThue.setText("Có Thuế");

        jLabel4.setText("Thuế");

        buttonGroup1.add(rdoKhongThue);
        rdoKhongThue.setText("Không Thuế");

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

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        tblSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Sản Phẩm", "Đơn Giá", "Thuế"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPham.setGridColor(new java.awt.Color(255, 255, 255));
        tblSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPham);

        jLabel5.setText("___________________");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSP)
                            .addComponent(txtDonGia))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdoCoThue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdoKhongThue)))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDoc)
                                .addGap(29, 29, 29)
                                .addComponent(btnGhi)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnXoa)
                                .addGap(27, 27, 27)
                                .addComponent(btnXoaForm))
                            .addComponent(btnThoat))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(rdoCoThue)
                    .addComponent(rdoKhongThue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnXoaForm)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDoc)
                    .addComponent(btnGhi)
                    .addComponent(btnThoat))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFormActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnXoaFormActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tblSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamMouseClicked
        int row = this.tblSanPham.getSelectedRow();

        if (row == -1) {
            return;
        }

        txtTenSP.setText(tblSanPham.getValueAt(row, 0).toString());
        txtDonGia.setText(tblSanPham.getValueAt(row, 1).toString());
        if (Double.valueOf(tblSanPham.getValueAt(row, 2).toString()) > 0) {
            this.rdoCoThue.setSelected(true);
        } else {
            this.rdoKhongThue.setSelected(true);
        }
    }//GEN-LAST:event_tblSanPhamMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        Product product = this.getFormDate();
        if (product == null) {
            return;
        }

        this.listProduct.insert(product);
        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Thêm mới thành công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int row = this.tblSanPham.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng cần sửa trên Table");
            return;
        }
        Product product = this.getFormDate();
        if (product == null) {
            return;
        }

        this.listProduct.update(row, product);

        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Cập nhật thành công");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");

        if (confirm == JOptionPane.NO_OPTION) {
            return;
        } else if (confirm == JOptionPane.CANCEL_OPTION) {
            return;
        } else {

        }

        int row = this.tblSanPham.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng trên Table để xóa");
            return;
        }

        this.listProduct.delete(row);
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        File file = new File(filename);
        if (file.exists() == false) {
            JOptionPane.showMessageDialog(this, "File ko tồn tại");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<Product> ds = (ArrayList<Product>) ois.readObject();
            ois.close();
            this.listProduct.setList(ds);
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
            oos.writeObject(this.listProduct.getList());
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

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Product_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Frame().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoCoThue;
    private javax.swing.JRadioButton rdoKhongThue;
    private javax.swing.JTable tblSanPham;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtTenSP;
    // End of variables declaration//GEN-END:variables
    private void clearForm() {
        this.txtTenSP.setText("");
        this.txtDonGia.setText("");
        this.rdoCoThue.setSelected(true);
    }

    private Product getFormDate() {
        String tenSP = this.txtTenSP.getText();
        String donGia = this.txtDonGia.getText();

        if (tenSP.trim().length() == 0 || donGia.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
        }
        try {
            Double.parseDouble(donGia);
            if (Double.parseDouble(donGia) < 0) {
                JOptionPane.showMessageDialog(this, "Đơn giá phải là số dương");
                return null;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Đơn giá phải là số");
            return null;
        }

        if (rdoCoThue.isSelected() == true) {
            Product product = new Product(tenSP, Double.parseDouble(donGia));
            return product;
        } else {
            NoTaxProduct noTaxProduct = new NoTaxProduct(tenSP, Double.parseDouble(donGia));
            return noTaxProduct;
        }
    }
}
