
package view;

import controller.Client;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;


public class FloorSearchFrm extends javax.swing.JFrame {

    /**
     * Creates new form FloorSearchFrm
     */
    private String adminName;
    private String floorName;
    private String moTa;

    public FloorSearchFrm() {
        this.adminName = Client.adminName;
//        this.floorName = floorName;
        initComponents();
        nameOfAdmin.setText("admin: " + adminName);
    }

    public void notify(String er) {
        JOptionPane.showMessageDialog(this, er, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }


    public void updateTable(String s) {
        DefaultTableModel model = (DefaultTableModel) floorTable.getModel();
        model.setRowCount(0);
        String[] lst = s.split(";");
        int size = lst.length;
        if (size == 1) {
            notify("Không có phòng cần tìm!!");
            return;
        }
        for (int i = 1; i < size; i += 2) {
            model.addRow(new Object[]{lst[i], lst[i + 1]});
        }

        // Lắng nghe sự kiện chọn hàng để lấy dữ liệu khi người dùng nhấp vào
        ListSelectionModel selectionModel = floorTable.getSelectionModel();
        selectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        selectionModel.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                int selectedRow = floorTable.getSelectedRow();
                if (selectedRow != -1) {
                    // Lấy dữ liệu từ hàng đã chọn
                    this.floorName = (String) floorTable.getValueAt(selectedRow, 0);
                    this.moTa = (String) floorTable.getValueAt(selectedRow, 1);

                    tangDaChon.setText("Bạn đã chọn tầng: " + floorName);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameOfAdmin = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tangDaChon = new javax.swing.JLabel();
        modifyFloorBtn = new javax.swing.JButton();
        deleteFloorBtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        floorSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        floorTable = new javax.swing.JTable();
        themTangBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameOfAdmin.setText("admin: ");

        backButton.setText("Quay lại");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Tên tầng:");

        tangDaChon.setText("Bạn hãy click vào một tầng trong bảng.");

        modifyFloorBtn.setText("Sửa tầng");
        modifyFloorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyFloorBtnActionPerformed(evt);
            }
        });

        deleteFloorBtn.setText("Xóa tầng");
        deleteFloorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteFloorBtnActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        floorSearch.setText("Tìm kiếm");
        floorSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorSearchActionPerformed(evt);
            }
        });

        floorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Tên tầng", "Mô tả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(floorTable);

        themTangBtn.setText("Thêm tầng");
        themTangBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themTangBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Tìm kiếm và sửa tầng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(tangDaChon)
                        .addGap(297, 297, 297))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addComponent(themTangBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(modifyFloorBtn)
                            .addGap(12, 12, 12)
                            .addComponent(deleteFloorBtn)
                            .addGap(42, 42, 42))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(floorSearch)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nameOfAdmin)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(25, 25, 25)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton)
                    .addComponent(nameOfAdmin))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(floorSearch))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(tangDaChon)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modifyFloorBtn)
                    .addComponent(deleteFloorBtn)
                    .addComponent(themTangBtn))
                .addGap(48, 48, 48))
        );

        nameOfAdmin.setText("admin: " + this.adminName);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        Client.CloseView(Client.View.FLOOR_SEARCH);
        Client.OpenView(Client.View.DASHBOARD);
    }//GEN-LAST:event_backButtonActionPerformed

    private void deleteFloorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteFloorBtnActionPerformed
        // TODO add your handling code here:
        if (floorName == null) {
            notify("Hãy click một tầng trong bảng!");
            return;
        }
        String matKhau = JOptionPane.showInputDialog(this, "Nhập mật khẩu tài khoản để xác nhận!", "Mật khẩu của bạn là!", JOptionPane.QUESTION_MESSAGE);
        Client.socketHandle.write("delete-floor-request;" + adminName + ";" + matKhau + ";" + floorName);
    }//GEN-LAST:event_deleteFloorBtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void floorSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorSearchActionPerformed
        // TODO add your handling code here:
        String floorFind = jTextField1.getText();
        if (floorFind.equals("")) {
            notify("Hãy nhập vào thanh tìm kiếm!!");
            Client.socketHandle.write("get-all-floor-request");
        } else {
            Client.socketHandle.write("find-floor-request;" + floorFind);
        }
    }//GEN-LAST:event_floorSearchActionPerformed

    private void themTangBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themTangBtnActionPerformed
        // TODO add your handling code here:
        Client.addFloorFrm = new AddFloorFrm();
        Client.addFloorFrm.setLocation(this.getLocation());
        Client.addFloorFrm.setVisible(true);
        Client.socketHandle.write("get-floor-close-request");
    }//GEN-LAST:event_themTangBtnActionPerformed

    private void modifyFloorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyFloorBtnActionPerformed
        // TODO add your handling code here:
        if (floorName == null) {
            notify("Hãy click vào một phòng!");
            return;
        }
        Client.modifyFloorFrm = new ModifyFloorFrm(this.floorName);
        Client.modifyFloorFrm.setLocation(this.getLocation());
        Client.modifyFloorFrm.setVisible(true);
    }//GEN-LAST:event_modifyFloorBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FloorSearchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FloorSearchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FloorSearchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FloorSearchFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FloorSearchFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton deleteFloorBtn;
    private javax.swing.JButton floorSearch;
    private javax.swing.JTable floorTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton modifyFloorBtn;
    private javax.swing.JLabel nameOfAdmin;
    private javax.swing.JLabel tangDaChon;
    private javax.swing.JButton themTangBtn;
    // End of variables declaration//GEN-END:variables

}
