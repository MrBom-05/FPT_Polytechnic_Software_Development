package HocVien;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

public class HocVienFrame extends javax.swing.JFrame {

    int elapsedTime = 0;
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    boolean started = false;
    String seconds_string = String.format("%02d", seconds);
    String minutes_string = String.format("%02d", minutes);
    String hours_string = String.format("%02d", hours);

    Timer timer = new Timer(1000, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {

            elapsedTime = elapsedTime + 1000;
            hours = (elapsedTime / 3600000);
            minutes = (elapsedTime / 60000) % 60;
            seconds = (elapsedTime / 1000) % 60;
            seconds_string = String.format("%02d", seconds);
            minutes_string = String.format("%02d", minutes);
            hours_string = String.format("%02d", hours);
            lblClock.setText(hours_string + ":" + minutes_string + ":" + seconds_string);

        }

    });

    private QuanLyHocVien listHocVien;
    private String filename = "HocVien_IOS.txt";

    public HocVienFrame() {
        initComponents();
        this.listHocVien = new QuanLyHocVien();
        timer.start();

    }

    private void clearForm() {
        this.cbbLop.setSelectedIndex(0);
        this.txtMaHV.setText("");
        this.txtEmail.setText("");
        this.txtNgaySinh.setText("");
    }

    private void loadTable() {
        ArrayList<HocVien> list = this.listHocVien.getList();
        DefaultTableModel dtm = (DefaultTableModel) this.tblHocVien.getModel();
        dtm.setRowCount(0);
        for (HocVien hocVien : list) {
            Object[] row = new Object[]{
                hocVien.getLop(),
                hocVien.getMaHV(),
                hocVien.getEmail(),
                hocVien.getNgaySinh()
            };
            dtm.addRow(row);
        }
    }

    private HocVien getFormData() {
        String lop = this.cbbLop.getSelectedItem().toString();
        String maHV = this.txtMaHV.getText();
        String email = this.txtEmail.getText();
        String ngaySinh = this.txtNgaySinh.getText();

        if (maHV.trim().length() == 0 || email.trim().length() == 0 || ngaySinh.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        try {
            Date d = HocVienFrame.toDate(ngaySinh);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Sai ngày sinh (dd/mm/yyy)");
            e.printStackTrace();
            return null;
        }
        String check_email = "^\\w+[a-z0-9]*@{1}\\w+mail.com$";
        Pattern pattern = Pattern.compile(check_email);
        Matcher matcher = pattern.matcher(email);
        if (matcher.find()) {
            HocVien hocvien = new HocVien(lop, maHV, email, ngaySinh);
            return hocvien;
        } else {
            JOptionPane.showMessageDialog(this, "Sai định dạng email '@'");
        }
        return null;
    }

    public static Date toDate(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/mm/yyy");
        Date d = null;
        try {
            d = sdf.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
            throw e;
        }

        return d;
    }

    public static String toString(Date d) {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("dd/mm/yyyy");
        return sdf.format(d);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbbLop = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaHV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnOpenFile = new javax.swing.JButton();
        btnSaveFile = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHocVien = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Lop");

        cbbLop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TL01", "TL02", "TL03", "TL04" }));

        jLabel2.setText("MaHV");

        jLabel3.setText("Email");

        jLabel4.setText("NgaySinh");

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

        btnOpenFile.setText("Open File");
        btnOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenFileActionPerformed(evt);
            }
        });

        btnSaveFile.setText("Save File");
        btnSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveFileActionPerformed(evt);
            }
        });

        lblClock.setText("00:00:00");

        tblHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lop", "MaHV", "Email", "NgaySinh"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        tblHocVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHocVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHocVien);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(txtMaHV, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNgaySinh)
                            .addComponent(cbbLop, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSaveFile))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addGap(31, 31, 31)
                                .addComponent(lblClock))
                            .addComponent(btnExit)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOpenFile))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbbLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(btnOpenFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear)
                    .addComponent(btnSaveFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(lblClock))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        HocVien hocvien = this.getFormData();
        if (hocvien == null) {
            return;
        }
        this.listHocVien.insert(hocvien);
        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Add thành công");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = this.tblHocVien.getSelectedRow();
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
        this.listHocVien.delete(row);
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenFileActionPerformed
        File file = new File(filename);
        if (file.exists() == false) {
            JOptionPane.showMessageDialog(this, "File không tồn tại");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<HocVien> list = (ArrayList<HocVien>) ois.readObject();
            ois.close();
            this.listHocVien.setList(list);
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

    private void btnSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveFileActionPerformed
        try {
            File file = new File(filename);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.listHocVien.getList());
            oos.close();
            JOptionPane.showMessageDialog(this, "Save File thành công");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Lỗi vào ra");
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSaveFileActionPerformed

    private void tblHocVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHocVienMouseClicked
        int row = this.tblHocVien.getSelectedRow();
        if (row == -1) {
            return;
        }
        String lop = this.tblHocVien.getValueAt(row, 0).toString();
        String maSV = this.tblHocVien.getValueAt(row, 1).toString();
        String email = this.tblHocVien.getValueAt(row, 2).toString();
        String ngaySinh = this.tblHocVien.getValueAt(row, 3).toString();

        this.cbbLop.setSelectedItem(lop);
        this.txtMaHV.setText(maSV);
        this.txtEmail.setText(email);
        this.txtNgaySinh.setText(ngaySinh);
    }//GEN-LAST:event_tblHocVienMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HocVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HocVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HocVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HocVienFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HocVienFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnOpenFile;
    private javax.swing.JButton btnSaveFile;
    private javax.swing.JComboBox<String> cbbLop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaHV;
    private javax.swing.JTextField txtNgaySinh;
    // End of variables declaration//GEN-END:variables

}
