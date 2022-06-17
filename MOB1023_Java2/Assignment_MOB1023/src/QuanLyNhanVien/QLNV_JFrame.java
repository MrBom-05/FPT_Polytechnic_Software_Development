package QuanLyNhanVien;

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
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLNV_JFrame extends javax.swing.JFrame {

    private QuanLyNhanVien listNhanVien;

    private String filename = "QuanLyNhanVien_IOS.txt";

    public QLNV_JFrame() {
        initComponents();
        this.listNhanVien = new QuanLyNhanVien();
        this.listNhanVien.insert(new NhanVien("PH12345", "Nguyễn Văn A", "13/02/1990", 1, 20000, "Trưởng phòng"));
        this.listNhanVien.insert(new NhanVien("PH22567", "Trần Thị B", "19/12/1999", 0, 10000, "Nhân viên"));
        this.listNhanVien.insert(new NhanVien("PH27937", "Nguyễn Ngọc Kỳ", "27/11/2003", 1, 30000, "Trưởng phòng"));
        this.clearForm();
        this.loadTable();
        this.setLocationRelativeTo(null);

        new Thread() {
            public void run() {
                while (true) {
                    Calendar ca = new GregorianCalendar();

                    int hour = ca.get(Calendar.HOUR_OF_DAY);
                    int minute = ca.get(Calendar.MINUTE);

                    String time = hour + ":" + minute;

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
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        cbbChucVu = new javax.swing.JComboBox<>();
        rdoNu = new javax.swing.JRadioButton();
        rdoNam = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        btnTimNV = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbbSapXep = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbbChieu = new javax.swing.JComboBox<>();
        btnXoaForm = new javax.swing.JButton();
        lblClock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setText("Mã NV");

        jLabel2.setText("Họ Tên");

        jLabel3.setText("Ngày Sinh");

        jLabel4.setText("Giới Tính");

        jLabel5.setText("Lương");

        jLabel6.setText("Chức Vụ");

        cbbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trưởng phòng", "Nhân viên" }));

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");

        buttonGroup1.add(rdoNam);
        rdoNam.setText("Nam");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtMaNV)
                    .addComponent(txtNgaySinh))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoNam)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdoNu))
                    .addComponent(txtLuong)
                    .addComponent(cbbChucVu, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdoNu)
                        .addComponent(rdoNam)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Họ tên", "Giới tính", "Ngày sinh", "Lương", "Chức vụ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

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

        btnTimNV.setText("Tìm NV");
        btnTimNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimNVActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel7.setText("Sắp xếp theo");

        cbbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Họ tên", "Lương", "Ngày sinh" }));
        cbbSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSapXepActionPerformed(evt);
            }
        });

        jLabel8.setText("Chiều");

        cbbChieu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tăng dần", "Giảm dần" }));
        cbbChieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbChieuActionPerformed(evt);
            }
        });

        btnXoaForm.setText("Xóa Form");
        btnXoaForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaFormActionPerformed(evt);
            }
        });

        lblClock.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblClock.setForeground(new java.awt.Color(255, 0, 0));
        lblClock.setText("12 : 00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btnThem))
                                    .addComponent(btnDoc, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGhi)
                            .addComponent(btnSua)
                            .addComponent(cbbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cbbChieu, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnXoa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnXoaForm))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnTimNV)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnThoat)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnTimNV)
                    .addComponent(btnThoat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(cbbChieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        NhanVien nhanVien = this.getFormData();
        if (nhanVien == null) {
            return;
        }

        this.listNhanVien.insert(nhanVien);
        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Thêm mới thành công");
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int row = this.tblNhanVien.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng cần sửa trên Table");
            return;
        }
        NhanVien nhanVien = this.getFormData();
        if (nhanVien == null) {
            return;
        }

        this.listNhanVien.update(row, nhanVien);

        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Cập nhật thành công");
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        int row = this.tblNhanVien.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Chọn 1 dòng trên Table để xóa");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?");
        if (confirm == JOptionPane.NO_OPTION) {
            return;
        } else if (confirm == JOptionPane.CANCEL_OPTION) {
            return;
        } else {

        }
        this.listNhanVien.delete(row);
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnXoaFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaFormActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnXoaFormActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        File file = new File(filename);
        if (file.exists() == false) {
            JOptionPane.showMessageDialog(this, "File không tồn tại");
            return;
        }

        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<NhanVien> ds = (ArrayList<NhanVien>) ois.readObject();
            ois.close();
            this.listNhanVien.setList(ds);
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
            oos.writeObject(this.listNhanVien.getList());
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

    private void btnTimNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimNVActionPerformed
        ArrayList<NhanVien> list = this.listNhanVien.getList();
        String TimNV = this.txtMaNV.getText();
        if (TimNV.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống ô Mã Nhân Viên");
            return;
        }
        if (TimNV.trim().length() != 7) {
            JOptionPane.showMessageDialog(this, "Mã NV đúng 7 kí tự");
            return;
        }
        NhanVien nv = null;
        int count = -1;
        if (TimNV.substring(0, 2).equals("PH")) {
            for (NhanVien nhanVien : list) {
                count++;
                if (nhanVien.getMaNV().equals(TimNV)) {
                    this.txtMaNV.setText(nhanVien.getMaNV());
                    this.txtHoTen.setText(nhanVien.getHoTen());
                    this.txtNgaySinh.setText(nhanVien.getNgaySinh());
                    if (nhanVien.getGioiTinh() == 1) {
                        this.rdoNam.setSelected(true);

                    } else {
                        this.rdoNu.setSelected(true);
                    }
                    this.txtLuong.setText(nhanVien.getLuong() + "");
                    this.cbbChucVu.setSelectedItem(nhanVien.getChucVu());
                    JOptionPane.showMessageDialog(this, "Đã tìm thấy");
                    this.tblNhanVien.setRowSelectionInterval(count, count);
                    return;

                }
            }
            JOptionPane.showMessageDialog(this, "Không tìm thấy");
            this.tblNhanVien.getSelectionModel().clearSelection();
            this.clearForm();
        } else {
            JOptionPane.showMessageDialog(this, "Mã NV phải bắt đầu từ 'PH' ");
            return;
        }
    }//GEN-LAST:event_btnTimNVActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void cbbSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSapXepActionPerformed
        int SapXep = cbbSapXep.getSelectedIndex();
        int Chieu = cbbChieu.getSelectedIndex();
        ArrayList<NhanVien> list = this.listNhanVien.getList();

        if (SapXep == 0) {
            if (Chieu == 0) {
                Collections.sort(list, (o1, o2) -> {
                    return o1.getHoTen().compareTo(o2.getHoTen());
                }
                );
                this.loadTable();
                this.clearForm();
            } else if (Chieu == 1) {
                Collections.sort(list, (o1, o2) -> {
                    return o1.getHoTen().compareTo(o2.getHoTen());
                }
                );
                Collections.reverse(list);
                this.loadTable();
                this.clearForm();
            }
        }
        if (SapXep == 1) {
            if (Chieu == 0) {
                Collections.sort(list, (o1, o2) -> {
                    return Double.compare(o1.getLuong(), o2.getLuong());
                }
                );
                this.loadTable();
                this.clearForm();
            } else if (Chieu == 1) {
                Collections.sort(list, (o1, o2) -> {
                    return Double.compare(o1.getLuong(), o2.getLuong());
                }
                );
                Collections.reverse(list);
                this.loadTable();
                this.clearForm();
            }
        }
        if (SapXep == 2) {
            if (Chieu == 0) {
                Collections.sort(list, (o1, o2) -> {
                    return o1.getNgaySinh().compareTo(o2.getNgaySinh());
                }
                );
                this.loadTable();
                this.clearForm();
            } else if (Chieu == 1) {
                Collections.sort(list, (o1, o2) -> {
                    return o1.getNgaySinh().compareTo(o2.getNgaySinh());
                }
                );
                Collections.reverse(list);
                this.loadTable();
                this.clearForm();
            }
        }
    }//GEN-LAST:event_cbbSapXepActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        ArrayList<NhanVien> list = this.listNhanVien.getList();
        
        int row = this.tblNhanVien.getSelectedRow();

        if (row == -1) {
            return;
        }
        String maNV = this.tblNhanVien.getValueAt(row, 0).toString();
        String hoTen = this.tblNhanVien.getValueAt(row, 1).toString();
        String gioiTinh = this.tblNhanVien.getValueAt(row, 2).toString();
        String ngaySinh = this.tblNhanVien.getValueAt(row, 3).toString();
        String luong = this.tblNhanVien.getValueAt(row, 4).toString();
        String chucVu = this.tblNhanVien.getValueAt(row, 5).toString();
        
//        NhanVien nv = null;
//        for (NhanVien nhanVien : list) {
//            if (nhanVien.getHoTen().equalsIgnoreCase(hoTen)) {
//                this.txtMaNV.setText(nhanVien.getMaNV());
//            }
//        }
        this.txtMaNV.setText(maNV);
        this.txtHoTen.setText(hoTen);
        if (gioiTinh.equals("Nam")) {
            this.rdoNam.setSelected(true);
        } else {
            this.rdoNu.setSelected(true);
        }
        this.txtNgaySinh.setText(ngaySinh);
        this.txtLuong.setText(luong);
        this.cbbChucVu.setSelectedItem(chucVu);
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void cbbChieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbChieuActionPerformed
        int SapXep = cbbSapXep.getSelectedIndex();
        int Chieu = cbbChieu.getSelectedIndex();
        ArrayList<NhanVien> list = this.listNhanVien.getList();
        if (Chieu == 0) {
            if(SapXep == 0){
                Collections.sort(list, (o1, o2) -> {
                    return o1.getHoTen().compareTo(o2.getHoTen());
                }
                );
                this.loadTable();
                this.clearForm();
            }
            else if(SapXep == 1){
                Collections.sort(list, (o1, o2) -> {
                    return Double.compare(o1.getLuong(), o2.getLuong());
                }
                );
                this.loadTable();
                this.clearForm();
            }
            else if(SapXep == 2){
                Collections.sort(list, (o1, o2) -> {
                    return o1.getNgaySinh().compareTo(o2.getNgaySinh());
                }
                );
                this.loadTable();
                this.clearForm();
            }
            
        }
        else if (Chieu == 1){
            if(SapXep == 0){
                Collections.sort(list, (o1, o2) -> {
                    return o1.getHoTen().compareTo(o2.getHoTen());
                }
                );
                Collections.reverse(list);
                this.loadTable();
                this.clearForm();
            }
            else if(SapXep == 1){
                Collections.sort(list, (o1, o2) -> {
                    return Double.compare(o1.getLuong(), o2.getLuong());
                }
                );
                Collections.reverse(list);
                this.loadTable();
                this.clearForm();
            }
            else if(SapXep == 2){
                Collections.sort(list, (o1, o2) -> {
                    return o1.getNgaySinh().compareTo(o2.getNgaySinh());
                }
                );
                Collections.reverse(list);
                this.loadTable();
                this.clearForm();
            }
        }
    }//GEN-LAST:event_cbbChieuActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QLNV_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNV_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNV_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNV_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNV_JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnTimNV;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaForm;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbChieu;
    private javax.swing.JComboBox<String> cbbChucVu;
    private javax.swing.JComboBox<String> cbbSapXep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    // End of variables declaration//GEN-END:variables
    private void clearForm() {
        this.txtMaNV.setText("");
        this.txtHoTen.setText("");
        this.txtNgaySinh.setText("");
        this.rdoNam.setSelected(true);
        this.txtLuong.setText("");
        this.cbbChucVu.setSelectedIndex(0);
    }

    private void loadTable() {
        ArrayList<NhanVien> danhSach = this.listNhanVien.getList();
        DefaultTableModel dtm = (DefaultTableModel) this.tblNhanVien.getModel();
        dtm.setRowCount(0);
        for (NhanVien nhanVien : danhSach) {
            Object[] row = new Object[]{
                nhanVien.getMaNV(),
                nhanVien.getHoTen(),
                nhanVien.getGioiTinh() == 1 ? "Nam" : "Nữ",
                nhanVien.getNgaySinh(),
                nhanVien.getLuong(),
                nhanVien.getChucVu()
            };
            dtm.addRow(row);
        }
    }

    private NhanVien getFormData() {
        String maNV = this.txtMaNV.getText();
        String hoTen = this.txtHoTen.getText();
        String ngaySinh = this.txtNgaySinh.getText();
        int gioiTinh = this.rdoNam.isSelected() ? 1 : 0;
        String luong = this.txtLuong.getText();
        String chucVu = this.cbbChucVu.getSelectedItem().toString();
        // Kiểm tra không được để trống
        if (maNV.trim().length() == 0
                || hoTen.trim().length() == 0
                || ngaySinh.trim().length() == 0
                || luong.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Không được để trống");
            return null;
        }
        // Kiểm tra maNV trên 7 kí tự, tên trên 6 kí tự
        if (maNV.trim().length() != 7) {
            JOptionPane.showMessageDialog(this, "Mã NV đúng 7 kí tự");
            return null;
        }
        if (hoTen.trim().length() < 6) {
            JOptionPane.showMessageDialog(this, "Họ tên tối thiểu 6 kí tự");
        }
        // Kiểm tra lương
        try {
            Double.parseDouble(luong);
            if (Double.parseDouble(luong) <= 0) {
                JOptionPane.showMessageDialog(this, "Lương phải là số dương và lớn hơn 0");
                return null;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Lương phải là số");
            return null;
        }
        // Kiểm tra ngày
        try {
            Date d = QLNV_JFrame.toDate(ngaySinh);
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Sai ngày sinh (dd/mm/yyy)");
            return null;
        }
        // Kiểm tra 2 kí tự đầu của mã NV bắt buộc là PH
        if (maNV.substring(0, 2).equals("PH")) {
            NhanVien nhanVien = new NhanVien(maNV, hoTen, ngaySinh, gioiTinh, Double.parseDouble(luong), chucVu);
            return nhanVien;
        }
        else {
            JOptionPane.showMessageDialog(this, "Mã NV phải bắt đầu từ 'PH' ");
            return null;
        }
    }

    // Kiểm tra ngày
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
}
