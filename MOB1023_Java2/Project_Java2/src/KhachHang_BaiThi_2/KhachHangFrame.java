package KhachHang_BaiThi_2;

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

public class KhachHangFrame extends javax.swing.JFrame {

    private QuanLyKhachHang listKhachHang;
    private String filename = "KhachHang_BaiThi_2.txt";
    private Running t;

    public KhachHangFrame() {
        initComponents();
        this.listKhachHang = new QuanLyKhachHang();
        t = new Running();
        t.start();
    }

    class Running extends Thread {

        public void run() {

            String line = lblQuanLyKhachHang.getText();
            while (true) {
                line = line.charAt(line.length() - 1) + line.substring(0, line.length() - 1);
                lblQuanLyKhachHang.setText(line);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void clearForm() {
        this.txtHoTen.setText("");
        this.rdoNam.setSelected(true);
        this.txtTuoi.setText("");
    }

    private void loadTable() {
        ArrayList<KhachHang> list = this.listKhachHang.getList();
        DefaultTableModel dtm = (DefaultTableModel) this.tblKhachHang.getModel();
        dtm.setRowCount(0);
        for (KhachHang khachHang : list) {
            Object[] row = new Object[]{
                khachHang.getTenKH(),
                khachHang.getGioiTinh() == 1 ? "Nam" : "Nữ",
                khachHang.getTuoiKH(),
                khachHang.getStatu(khachHang.getTuoiKH())
            };
            dtm.addRow(row);
        }
    }

    private KhachHang getFormData() {
        String tenKH = this.txtHoTen.getText();
        int gioiTinh = this.rdoNam.isSelected() ? 1 : 0;
        String tuoi = this.txtTuoi.getText();

        if (tenKH.trim().length() == 0 || tuoi.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        try {
            Integer.parseInt(tuoi);
            if (Integer.parseInt(tuoi) <= 0) {
                JOptionPane.showMessageDialog(this, "Tuổi lớn hơn 0");
                return null;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Tuổi phải là số");
            e.printStackTrace();
            return null;
        }

        KhachHang khachhang = new KhachHang(tenKH, gioiTinh, Integer.parseInt(tuoi));
        return khachhang;
    }

    private void SaveFile() {

        try {
            File file = new File(filename);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.listKhachHang.getList());
            oos.close();
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");
            e.printStackTrace();

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQuanLyKhachHang = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtTuoi = new javax.swing.JTextField();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnOpen = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblQuanLyKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblQuanLyKhachHang.setText("QUẢN LÝ KHÁCH HÀNG ");

        jLabel1.setText("Họ Tên");

        jLabel2.setText("Giới Tính");

        jLabel3.setText("Tuổi");

        rdoNam.setText("Nam");

        rdoNu.setText("Nữ");

        btnOpen.setText("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên KH", "Giới Tính", "Tuổi", "Trạng Thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhachHang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblQuanLyKhachHang)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(rdoNam)
                        .addGap(26, 26, 26)
                        .addComponent(rdoNu))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOpen, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuanLyKhachHang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOpen))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu)
                    .addComponent(btnSave)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        File file = new File(filename);
        if (file.exists() == false) {
            JOptionPane.showMessageDialog(this, "File không tồn tại");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<KhachHang> list = (ArrayList<KhachHang>) ois.readObject();
            this.listKhachHang.setList(list);
            this.loadTable();
            JOptionPane.showMessageDialog(this, "Open file thành công");
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
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        KhachHang khachhang = this.getFormData();
        if (khachhang == null) {
            return;
        }
        this.listKhachHang.insert(khachhang);
        this.SaveFile();
        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Save file thành công");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = this.tblKhachHang.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn một dòng trên Table");
            return;
        }
        int chon = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
        if (chon == JOptionPane.CANCEL_OPTION) {
            return;
        } else if (chon == JOptionPane.NO_OPTION) {
            return;
        } else {

        }
        this.listKhachHang.delete(row);
        this.SaveFile();
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        int row = this.tblKhachHang.getSelectedRow();
        if (row == -1) {
            return;
        }
        String tenKH = this.tblKhachHang.getValueAt(row, 1).toString();
        String gioiTinh = this.tblKhachHang.getValueAt(row, 1).toString();
        String tuoi = this.tblKhachHang.getValueAt(row, 2).toString();

        this.txtHoTen.setText(tenKH);
        if (gioiTinh.equals("Nam")) {
            rdoNam.setSelected(true);
        } else {
            rdoNu.setSelected(true);
        }
        this.txtTuoi.setText(tuoi);
    }//GEN-LAST:event_tblKhachHangMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KhachHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhachHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhachHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhachHangFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhachHangFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuanLyKhachHang;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtTuoi;
    // End of variables declaration//GEN-END:variables
}
