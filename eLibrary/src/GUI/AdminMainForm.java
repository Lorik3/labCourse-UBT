
package GUI;

import javax.swing.JFrame;



/**
 *
 * @author Ylli
 */

public class AdminMainForm extends javax.swing.JFrame {


    public AdminMainForm() {
        initComponents();
        setLocationRelativeTo(null);
        
       
    }

    AdminMainForm(Integer roliId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        menuPanel = new javax.swing.JPanel();
        eLibraryIcon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPerdoruesi = new javax.swing.JButton();
        btnStudenti = new javax.swing.JButton();
        btnLiber = new javax.swing.JButton();
        btnAutor = new javax.swing.JButton();
        btnLloji = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        menubar = new javax.swing.JMenuBar();
        adminmenu = new javax.swing.JMenu();
        perdoruesimenu = new javax.swing.JMenuItem();
        studentimenu = new javax.swing.JMenuItem();
        liberimenu = new javax.swing.JMenuItem();
        autorimenu = new javax.swing.JMenuItem();
        llojimenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        huazomenu = new javax.swing.JMenuItem();
        librimenu = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuPanel.setBackground(new java.awt.Color(255, 111, 111));
        menuPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        menuPanel.setForeground(new java.awt.Color(211, 209, 215));

        eLibraryIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/eLibraryIcone.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(82, 76, 95));
        jLabel1.setText("eLibrary");

        btnPerdoruesi.setBackground(new java.awt.Color(253, 236, 236));
        btnPerdoruesi.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnPerdoruesi.setText("Shto Perdorues");
        btnPerdoruesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerdoruesiActionPerformed(evt);
            }
        });

        btnStudenti.setBackground(new java.awt.Color(253, 236, 236));
        btnStudenti.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnStudenti.setText("Shto Student");
        btnStudenti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentiActionPerformed(evt);
            }
        });

        btnLiber.setBackground(new java.awt.Color(253, 236, 236));
        btnLiber.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnLiber.setText("Shto Liber");
        btnLiber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLiberActionPerformed(evt);
            }
        });

        btnAutor.setBackground(new java.awt.Color(253, 236, 236));
        btnAutor.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnAutor.setText("Shto Autor");
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });

        btnLloji.setBackground(new java.awt.Color(253, 236, 236));
        btnLloji.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnLloji.setText("Lloji i Librit");
        btnLloji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLlojiActionPerformed(evt);
            }
        });

        btnLogOut.setBackground(new java.awt.Color(253, 236, 236));
        btnLogOut.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        btnLogOut.setText("Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Harlow Solid Italic", 1, 35)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(82, 76, 95));
        jLabel3.setText("Mir se vini ");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(eLibraryIcon)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, menuPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnPerdoruesi, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnStudenti)
                                .addGap(28, 28, 28)
                                .addComponent(btnLiber)
                                .addGap(34, 34, 34)
                                .addComponent(btnAutor)
                                .addGap(31, 31, 31)
                                .addComponent(btnLloji)
                                .addContainerGap())
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLogOut))))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eLibraryIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnStudenti, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLiber, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLloji, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPerdoruesi, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addComponent(btnLogOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel1))
        );

        desktopPane.setBackground(new java.awt.Color(255, 237, 237));
        desktopPane.setPreferredSize(new java.awt.Dimension(1001, 751));

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 698, Short.MAX_VALUE)
        );

        adminmenu.setText("Admin Options");

        perdoruesimenu.setText("Shto Perdorues");
        perdoruesimenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perdoruesimenuActionPerformed(evt);
            }
        });
        adminmenu.add(perdoruesimenu);

        studentimenu.setText("Shto Student");
        studentimenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentimenuActionPerformed(evt);
            }
        });
        adminmenu.add(studentimenu);

        liberimenu.setText("Shto Liber");
        liberimenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liberimenuActionPerformed(evt);
            }
        });
        adminmenu.add(liberimenu);

        autorimenu.setText("Shto Autor");
        autorimenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autorimenuActionPerformed(evt);
            }
        });
        adminmenu.add(autorimenu);

        llojimenu.setText("Lloji i librit");
        llojimenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                llojimenuActionPerformed(evt);
            }
        });
        adminmenu.add(llojimenu);

        menubar.add(adminmenu);

        jMenu2.setText("User Options");

        huazomenu.setText("Huazo Liber");
        huazomenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huazomenuActionPerformed(evt);
            }
        });
        jMenu2.add(huazomenu);

        librimenu.setText("Rezervo Liber");
        librimenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                librimenuActionPerformed(evt);
            }
        });
        jMenu2.add(librimenu);

        menubar.add(jMenu2);

        setJMenuBar(menubar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 698, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perdoruesimenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perdoruesimenuActionPerformed
    UserForm uf = new UserForm();
    desktopPane.add(uf);
    uf.show();
    }//GEN-LAST:event_perdoruesimenuActionPerformed

    private void liberimenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liberimenuActionPerformed
     LibriForm lf = new LibriForm();
     desktopPane.add(lf);
     lf.show();
    }//GEN-LAST:event_liberimenuActionPerformed

    private void librimenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_librimenuActionPerformed
      RezervoForm rf = new RezervoForm();
      desktopPane.add(rf);
      rf.show();
    }//GEN-LAST:event_librimenuActionPerformed

    private void btnStudentiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentiActionPerformed
     StudentiForm sf = new StudentiForm();
     desktopPane.add(sf);
     sf.show();
     
     
 
    }//GEN-LAST:event_btnStudentiActionPerformed

    private void btnPerdoruesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerdoruesiActionPerformed
    UserForm uf = new UserForm();
    desktopPane.add(uf);
    uf.show();
    }//GEN-LAST:event_btnPerdoruesiActionPerformed

    private void studentimenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentimenuActionPerformed
     StudentiForm sf = new StudentiForm();
     desktopPane.add(sf);
     sf.show();
    }//GEN-LAST:event_studentimenuActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
         LoginForm amf = new LoginForm();
                amf.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnLiberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiberActionPerformed
       LibriForm lf = new LibriForm();
       desktopPane.add(lf);
       lf.show();
    }//GEN-LAST:event_btnLiberActionPerformed

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed
       AutoriForm af = new AutoriForm();
       desktopPane.add(af);
       af.show();
    }//GEN-LAST:event_btnAutorActionPerformed

    private void btnLlojiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLlojiActionPerformed
        LlojiForm lf = new LlojiForm();
        desktopPane.add(lf);
        lf.show();
    }//GEN-LAST:event_btnLlojiActionPerformed

    private void autorimenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autorimenuActionPerformed
      AutoriForm af = new AutoriForm();
      desktopPane.add(af);
      af.show();
    }//GEN-LAST:event_autorimenuActionPerformed

    private void llojimenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_llojimenuActionPerformed
       LlojiForm llf = new LlojiForm();
       desktopPane.add(llf);
       llf.show();
    }//GEN-LAST:event_llojimenuActionPerformed

    private void huazomenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huazomenuActionPerformed
        HuazimiForm hf = new HuazimiForm();
        desktopPane.add(hf);
        hf.show();
    }//GEN-LAST:event_huazomenuActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminmenu;
    private javax.swing.JMenuItem autorimenu;
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnLiber;
    private javax.swing.JButton btnLloji;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnPerdoruesi;
    private javax.swing.JButton btnStudenti;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel eLibraryIcon;
    private javax.swing.JMenuItem huazomenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem liberimenu;
    private javax.swing.JMenuItem librimenu;
    private javax.swing.JMenuItem llojimenu;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem perdoruesimenu;
    private javax.swing.JMenuItem studentimenu;
    // End of variables declaration//GEN-END:variables
}
