package KhanhHang;

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLKH_Frame extends javax.swing.JFrame {

    private QLKH listKH;
    private String filename = "KhachHang_IOS.txt";

    public QLKH_Frame() {
        initComponents();
        this.listKH = new QLKH();

        new Thread() {
            public void run() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmaiKH = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhachHang = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        btnSavaFile = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();
        cbbLoaiKH = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Loai Khach Hang");

        jLabel2.setText("Ma Khach Hang");

        jLabel3.setText("Ten Khach Hang");

        jLabel4.setText("Email Khach Hang");

        tblKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loai KH", "Ma KH", "Ten KH", "Email KH"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
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

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnOpenFile.setText("OpenFile");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        btnSavaFile.setText("SaveFile");
        btnSavaFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavaFileActionPerformed(evt);
            }
        });

        lblClock.setText("12 : 00 : 00");

        cbbLoaiKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vip", "Not Vip" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(btnOpenFile))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmaiKH)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSavaFile)
                                .addGap(49, 49, 49)
                                .addComponent(lblClock)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenKH)
                            .addComponent(txtMaKH)
                            .addComponent(cbbLoaiKH, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnClear)
                    .addComponent(btnDelete)
                    .addComponent(btnExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnAdd)
                    .addComponent(cbbLoaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtEmaiKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOpenFile)
                    .addComponent(btnSavaFile)
                    .addComponent(lblClock))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        KhachHang khachHang = this.getFormData();
        if (khachHang == null) {
            return;
        }
        this.listKH.insert(khachHang);
        try {
            File file = new File(filename);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.listKH.getlist());
            oos.close();
            JOptionPane.showMessageDialog(this, "Save File thành công");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");
            e.printStackTrace();
        }
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = this.tblKhachHang.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn một dòng trên Table");
            return;
        }
        int comfin = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không");
        if (comfin == JOptionPane.CANCEL_OPTION) {
            return;
        } else if (comfin == JOptionPane.NO_OPTION) {
            return;
        } else {

        }
        this.listKH.delete(row);
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        File file = new File(filename);
        if (file.exists() == false) {
            JOptionPane.showMessageDialog(this, "File không tồn tại");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<KhachHang> list = (ArrayList<KhachHang>) ois.readObject();
            ois.close();
            this.listKH.setList(list);
            this.loadTable();
            JOptionPane.showMessageDialog(this, "Open File thành công");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy File");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Lỗi dữ liệu");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnOpenFileActionPerformed

    private void btnSavaFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavaFileActionPerformed
        try {
            File file = new File(filename);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.listKH.getlist());
            oos.close();
            JOptionPane.showMessageDialog(this, "Save File thành công");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSavaFileActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void tblKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhachHangMouseClicked
        ArrayList<KhachHang> list = this.listKH.getlist();

        int row = this.tblKhachHang.getSelectedRow();
        if (row == -1) {
            return;
        }

        String loaiKH = this.tblKhachHang.getValueAt(row, 0).toString();
        String maKH = this.tblKhachHang.getValueAt(row, 1).toString();
        String tenKH = this.tblKhachHang.getValueAt(row, 2).toString();
        String email = this.tblKhachHang.getValueAt(row, 3).toString();

        this.cbbLoaiKH.setSelectedItem(loaiKH);
        this.txtMaKH.setText(maKH);
        this.txtTenKH.setText(tenKH);
        this.txtEmaiKH.setText(email);
    }//GEN-LAST:event_tblKhachHangMouseClicked

    private void clearForm() {
        this.cbbLoaiKH.setSelectedIndex(0);
        this.txtMaKH.setText("");
        this.txtTenKH.setText("");
        this.txtEmaiKH.setText("");
    }

    private void loadTable() {
        ArrayList<KhachHang> list = this.listKH.getlist();
        DefaultTableModel dtm = (DefaultTableModel) this.tblKhachHang.getModel();

        dtm.setRowCount(0);
        for (KhachHang khachHang : list) {
            Object[] row = new Object[]{
                khachHang.getLoaiKH(),
                khachHang.getMaKH(),
                khachHang.getTenKH(),
                khachHang.getEmail()
            };
            dtm.addRow(row);
        }
    }

    private KhachHang getFormData() {
        String LoaiKH = this.cbbLoaiKH.getSelectedItem().toString();
        String maKH = this.txtMaKH.getText();
        String tenKH = this.txtTenKH.getText();
        String email = this.txtEmaiKH.getText();

        if (maKH.trim().length() == 0 || tenKH.trim().length() == 0 || email.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        String check_email = "^\\w+[a-z0-9]*@{1}\\w+mail.com$";
        Pattern pattern = Pattern.compile(check_email);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            KhachHang khachHang = new KhachHang(LoaiKH, maKH, tenKH, email);
            return khachHang;
        } else {
            JOptionPane.showMessageDialog(this, "Sai định dạng email '@'");
        }
        return null;
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
            java.util.logging.Logger.getLogger(QLKH_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLKH_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLKH_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLKH_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLKH_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnSavaFile;
    private javax.swing.JComboBox<String> cbbLoaiKH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JTable tblKhachHang;
    private javax.swing.JTextField txtEmaiKH;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}
