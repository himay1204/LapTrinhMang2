
package view;

import controller.Client;


public class DashboardFrm extends javax.swing.JFrame {

    
    private String adminName;
    
    public DashboardFrm() {
        this.adminName = Client.adminName;
        initComponents();
    }


    
    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        changePassButton = new javax.swing.JButton();
        findFloorButton = new javax.swing.JButton();
        findRoomButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deleteAccButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        changePassButton.setText("Đổi Password");
        changePassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassButtonActionPerformed(evt);
            }
        });

        findFloorButton.setText("Tìm Tầng");
        findFloorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findFloorButtonActionPerformed(evt);
            }
        });

        findRoomButton.setText("Tìm Phòng");
        findRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findRoomButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("admin: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Bảng Điều Khiển");

        deleteAccButton.setText("Xóa Tài Khoản");
        deleteAccButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccButtonActionPerformed(evt);
            }
        });

        logOutButton.setText("Đăng xuất");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(findFloorButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(findRoomButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changePassButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteAccButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(logOutButton))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addComponent(findFloorButton)
                .addGap(18, 18, 18)
                .addComponent(findRoomButton)
                .addGap(18, 18, 18)
                .addComponent(changePassButton)
                .addGap(18, 18, 18)
                .addComponent(deleteAccButton)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel1.setText("admin: " + this.adminName);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteAccButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccButtonActionPerformed
        // TODO add your handling code here:
        Client.CloseView(Client.View.DASHBOARD);
        Client.OpenView(Client.View.DELETEACCOUNT);
    }//GEN-LAST:event_deleteAccButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        // TODO add your handling code here:
        Client.CloseView(Client.View.DASHBOARD);
        Client.OpenView(Client.View.LOGIN);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void changePassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassButtonActionPerformed
        // TODO add your handling code here:
        Client.CloseView(Client.View.DASHBOARD);
        Client.OpenView(Client.View.CHANGEPASSSWORD);
    }//GEN-LAST:event_changePassButtonActionPerformed

    private void findFloorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findFloorButtonActionPerformed
        // TODO add your handling code here:
        Client.CloseView(Client.View.DASHBOARD);
        Client.OpenView(Client.View.FLOOR_SEARCH);
        Client.socketHandle.write("get-all-floor-request");
    }//GEN-LAST:event_findFloorButtonActionPerformed

    private void findRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findRoomButtonActionPerformed
        // TODO add your handling code here:
        Client.CloseView(Client.View.DASHBOARD);
        Client.OpenView(Client.View.ROOM_SEARCH);
        Client.socketHandle.write("open-search-room-frm");
    }//GEN-LAST:event_findRoomButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePassButton;
    private javax.swing.JButton deleteAccButton;
    private javax.swing.JButton findFloorButton;
    private javax.swing.JButton findRoomButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logOutButton;
    // End of variables declaration//GEN-END:variables

}
