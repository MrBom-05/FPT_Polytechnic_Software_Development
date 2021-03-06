package MyJob;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MyJobManageFrame extends javax.swing.JFrame {

    private MyJobManage listMyJob;

    private String fileName = "MyJob.xlsx";

    public MyJobManageFrame() {
        initComponents();
        this.listMyJob = new MyJobManage();
        new Thread(){
            public void run(){
                while (true) {                    
                    Calendar ca = new GregorianCalendar();
                    
                    int hour = ca.get(Calendar.HOUR_OF_DAY);
                    int minute = ca.get(Calendar.MINUTE);
                    int second = ca.get(Calendar.SECOND);
                    
                    String time = hour + " : " + minute + " : " + second;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblMyJob = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNameJob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbCompanysName = new javax.swing.JComboBox<>();
        rdoYes = new javax.swing.JRadioButton();
        rdoNo = new javax.swing.JRadioButton();
        txtInCome = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMyJob = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        btnWrite = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMyJob.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMyJob.setText("C??ng vi???c c???a t??i");

        jLabel1.setText("T??n c??ng vi???c");

        jLabel2.setText("T??n doanh nghi???p");

        jLabel3.setText("H???c ti???n s??");

        jLabel4.setText("Thu nh???p");

        cbbCompanysName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FPT", "GOOGLE", "VINGROUP", "FLCGROUP" }));

        buttonGroup1.add(rdoYes);
        rdoYes.setText("C??");

        buttonGroup1.add(rdoNo);
        rdoNo.setText("Kh??ng");

        tblMyJob.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T??n CV", "T??n DN", "H???c ti???n s??", "Thu nh???p", "K???t lu???n"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
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
        tblMyJob.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMyJobMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMyJob);

        btnInsert.setText("Th??m");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("S???a");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("X??a");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearch.setText("T??m");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnSort.setText("S???p x???p");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        btnWrite.setText("Ghi File");
        btnWrite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteActionPerformed(evt);
            }
        });

        btnSave.setText("L??u");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRead.setText("M??? File");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        lblClock.setText("00 : 00 : 00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(lblMyJob, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(lblClock))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoYes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                        .addComponent(rdoNo))
                                    .addComponent(txtNameJob)
                                    .addComponent(cbbCompanysName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtInCome))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnInsert)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSort))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnWrite))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSearch)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnSave))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnDelete)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRead)))))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMyJob)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblClock)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnInsert)
                    .addComponent(btnSort))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbbCompanysName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate)
                    .addComponent(btnWrite))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdoYes)
                    .addComponent(rdoNo)
                    .addComponent(btnDelete)
                    .addComponent(btnRead))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtInCome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnSave))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        MyJob myJob = this.GetFormDate();
        if (myJob == null) {
            return;
        }
        this.listMyJob.insert(myJob);
        this.loadTable();
        this.clearForm();
        JOptionPane.showMessageDialog(this, "Th??m m???i th??nh c??ng");
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = this.tblMyJob.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Ch???n d??ng c???n s???a tr??n Table");
            return;
        }

        MyJob myJob = this.GetFormDate();
        if (myJob == null) {
            return;
        }
        this.listMyJob.update(row, myJob);
        this.clearForm();
        this.loadTable();
        JOptionPane.showMessageDialog(this, "C???p nh???t th??nh c??ng");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = this.tblMyJob.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Ch???n d??ng c???n x??a tr??n Table");
            return;
        }
        int confirm = JOptionPane.showConfirmDialog(this, "B???n c?? mu???n x??a kh??ng ?");
        if (confirm == JOptionPane.NO_OPTION) {
            return;
        } else if (confirm == JOptionPane.CANCEL_OPTION) {
            return;
        }

        MyJob myJob = this.GetFormDate();
        if (myJob == null) {
            return;
        }
        this.listMyJob.delete(row);
        this.clearForm();
        this.loadTable();
        JOptionPane.showMessageDialog(this, "X??a th??nh c??ng");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        ArrayList<MyJob> list = this.listMyJob.getList();
        String nameJob = this.txtNameJob.getText();

        if (nameJob.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Kh??ng ???????c ????? tr???ng ?? T??n c??ng vi???c");
            return;
        }
        MyJob myJob = null;
        int count = -1;
        for (MyJob MJ : list) {
            count++;
            if (MJ.getNameJob().equalsIgnoreCase(nameJob)) {
                this.txtNameJob.setText(MJ.getNameJob());
                this.cbbCompanysName.setSelectedItem(MJ.getCompanysName());
                if (MJ.getDocter() == 1) {
                    this.rdoYes.setSelected(true);
                } else {
                    this.rdoNo.setSelected(true);
                }
                this.txtInCome.setText(MJ.getIncome() + "");
                JOptionPane.showMessageDialog(this, "???? t??m th???y");
                this.tblMyJob.setRowSelectionInterval(count, count);
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y");
        this.tblMyJob.getSelectionModel().clearSelection();
        this.clearForm();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        ArrayList<MyJob> list = this.listMyJob.getList();

        Collections.sort(list, (o1, o2) -> {
            return o1.getNameJob().compareTo(o2.getNameJob());
        });
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnWriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteActionPerformed
        try {
            File file = new File(fileName);
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.listMyJob.getList());
            oos.close();
            JOptionPane.showMessageDialog(this, "Ghi th??nh c??ng");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "L???i v??o ra");
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnWriteActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        File file = new File(fileName);
        if (file.exists() == false) {
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList<MyJob> list = (ArrayList<MyJob>) ois.readObject();
            ois.close();
            this.listMyJob.setList(list);
            this.loadTable();
            JOptionPane.showMessageDialog(this, "?????c th??nh c??ng");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Kh??ng t??m th???y file");
            e.printStackTrace();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "L???i v??o ra");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "L???i d??? li???u");
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnReadActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        this.listMyJob.insert(new MyJob("L???p tr??nh", "FPT", 1, 400000));
        this.listMyJob.insert(new MyJob("Thi???t k???", "GOOGLE", 0, 3000));
        this.loadTable();
        this.clearForm();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblMyJobMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMyJobMouseClicked
        ArrayList<MyJob> list = this.listMyJob.getList();

        int row = this.tblMyJob.getSelectedRow();

        if (row == -1) {
            return;
        }
        String nameJob = this.tblMyJob.getValueAt(row, 0).toString();
        String CompanysName = this.tblMyJob.getValueAt(row, 1).toString();
        String docter = this.tblMyJob.getValueAt(row, 2).toString();
        String income = this.tblMyJob.getValueAt(row, 3).toString();

        this.txtNameJob.setText(nameJob);
        this.cbbCompanysName.setSelectedItem(CompanysName);
        if (docter.equals("C??")) {
            this.rdoYes.setSelected(true);
        } else {
            this.rdoNo.setSelected(true);
        }
        this.txtInCome.setText(income);
    }//GEN-LAST:event_tblMyJobMouseClicked

    private void clearForm() {
        this.txtNameJob.setText("");
        this.cbbCompanysName.setSelectedIndex(0);
        this.rdoYes.setSelected(true);
        this.txtInCome.setText("");
    }

    private void loadTable() {
        ArrayList<MyJob> list = this.listMyJob.getList();
        DefaultTableModel dtm = (DefaultTableModel) this.tblMyJob.getModel();
        dtm.setRowCount(0);
        for (MyJob myJob : list) {
            Object[] row = new Object[]{
                myJob.getNameJob(),
                myJob.getCompanysName(),
                myJob.getDocter() == 1 ? "C??" : "Kh??ng",
                myJob.getIncome(),
                myJob.getConclusion(myJob.getIncome())
            };
            dtm.addRow(row);
        }
    }

    private MyJob GetFormDate() {
        String nameJob = this.txtNameJob.getText();
        String companysName = this.cbbCompanysName.getSelectedItem().toString();
        int docter = this.rdoYes.isSelected() ? 1 : 0;
        String income = this.txtInCome.getText();

        if (nameJob.trim().length() == 0 || income.trim().length() == 0) {
            JOptionPane.showMessageDialog(this, "Kh??ng ???????c ????? tr???ng");
            return null;
        }
        try {
            Double.parseDouble(income);
            if (Double.parseDouble(income) < 1) {
                JOptionPane.showMessageDialog(this, "Thu nh???p l???n h??n 1");
                return null;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Thu nh???p ph???i l?? s???");
            return null;
        }
        MyJob myJob = new MyJob(nameJob, companysName, docter, Double.parseDouble(income));
        return myJob;
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
            java.util.logging.Logger.getLogger(MyJobManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyJobManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyJobManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyJobManageFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyJobManageFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnWrite;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbCompanysName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblMyJob;
    private javax.swing.JRadioButton rdoNo;
    private javax.swing.JRadioButton rdoYes;
    private javax.swing.JTable tblMyJob;
    private javax.swing.JTextField txtInCome;
    private javax.swing.JTextField txtNameJob;
    // End of variables declaration//GEN-END:variables
}
