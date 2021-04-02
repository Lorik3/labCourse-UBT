

package GUI;

import BLL.Perdorusi;
import BLL.RoliL;
import DAL.RoliRepository;
import DAL.UserRepository;
import DAL.eLibraryException;
import Models.RoliComboBoxModel;
import Models.UserTableModel;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 *
 * @author Ylli
 */
public class UserForm extends javax.swing.JInternalFrame {
    
    UserRepository ur = new UserRepository();
    RoliRepository rr = new RoliRepository();
    UserTableModel utm = new UserTableModel();
    RoliComboBoxModel rcbm = new RoliComboBoxModel();
    

   
    public UserForm() {
        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        loadComboBox();
    }
      public void loadTable(){
    
        try{
            List<Perdorusi> lista =  ur.findAll();
            utm.addList(lista);
            tablePerdoruesi.setModel(utm);
            utm.fireTableDataChanged();
            
        }catch(eLibraryException  elx){
            Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE,null,elx);
        }
}
      
       public void tabelaSelectedIndexChange(){
        
        ListSelectionModel rowSM = tablePerdoruesi.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()){
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if(selectedIndex > -1){
                    Perdorusi perdorusi = utm.getPerdorusi(selectedIndex);
                    txtID.setText(perdorusi.getUsersid().toString());
                    txtPerdoruesi.setText(perdorusi.getUsername());
                    jPassword.setText(perdorusi.getPassword());

                }
            }
        });
    }
       
       public void loadComboBox(){
        try{
            List<RoliL> lista = rr.findAll();
            rcbm.add(lista);
            RoliComboBox.setModel(rcbm);
            RoliComboBox.repaint();
        }catch(eLibraryException elx){
            JOptionPane.showMessageDialog(this, elx.getMessage());
        }
    }
       
       public void clear(){
           tablePerdoruesi.clearSelection();
           txtID.setText("");
           txtPerdoruesi.setText("");
           jPassword.setText("");
       }
   
     
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        jPanel5 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtPerdoruesi = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablePerdoruesi = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        perdorusiLabel = new javax.swing.JLabel();
        RoliComboBox = new javax.swing.JComboBox();

        desktopPane.setBackground(new java.awt.Color(198, 182, 182));

        jPanel5.setBackground(new java.awt.Color(198, 182, 182));

        btnCreate.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(82, 76, 95));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(82, 76, 95));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(82, 76, 95));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(82, 76, 95));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(82, 76, 95));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(234, 228, 228));

        jLabel5.setFont(new java.awt.Font("Harlow Solid Italic", 1, 45)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(82, 76, 95));
        jLabel5.setText("Perdoruesi");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("_______________________________");

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel17.setText("Fjalkalimi: ");

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel18.setText("Perdoruesi: ");

        txtPerdoruesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPerdoruesiActionPerformed(evt);
            }
        });
        txtPerdoruesi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPerdoruesiKeyPressed(evt);
            }
        });

        tablePerdoruesi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tablePerdoruesi);

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel19.setText("Roli: ");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });

        perdorusiLabel.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        perdorusiLabel.setText("ID e Perdoruesit: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addComponent(jLabel5))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(perdorusiLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel19)
                                                .addGap(27, 27, 27))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(224, 224, 224)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6)
                                                    .addComponent(txtPerdoruesi, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)))
                                        .addComponent(RoliComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoliComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perdorusiLabel))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPerdoruesi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btnCreate)
                .addGap(63, 63, 63)
                .addComponent(btnUpdate)
                .addGap(62, 62, 62)
                .addComponent(btnCancel)
                .addGap(57, 57, 57)
                .addComponent(btnDelete)
                .addGap(56, 56, 56)
                .addComponent(btnExit)
                .addContainerGap(204, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate)
                    .addComponent(btnCancel)
                    .addComponent(btnDelete)
                    .addComponent(btnExit))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        desktopPane.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        
        Perdorusi p = new Perdorusi();
        
       
        
        try{
            
        
          
           p.setUsersid(Integer.parseInt(txtID.getText()));
           
            
            p.setUsername(txtPerdoruesi.getText());
            p.setPassword(new String(jPassword.getPassword()));
            p.setFkRoliId((RoliL)rcbm.getSelectedItem());
            ur.create(p);

            clear();
            loadTable();

            JOptionPane.showMessageDialog(this, "E dhëna u shtua me sukses");
            
            

        }catch(eLibraryException elx){
           JOptionPane.showMessageDialog(this, "E dhena ekziston: " );
        }
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int row = tablePerdoruesi.getSelectedRow();

        Perdorusi p = this.utm.getPerdorusi(row);
        p.setUsersid(Integer.parseInt(txtID.getText()));
        p.setUsername(txtPerdoruesi.getText());
        p.setPassword(new String(jPassword.getPassword()));
        p.setFkRoliId((RoliL)rcbm.getSelectedItem());
        try{
            ur.edit(p);
        }catch(eLibraryException elx){
            Logger.getLogger(UserForm.class.getName()).log(Level.SEVERE, null,elx);
        }

        clear();
        loadTable();
        JOptionPane.showMessageDialog(this, "E dhena u editua me sukses");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clear();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         int row = tablePerdoruesi.getSelectedRow();
        if(row != -1){
            Object[] ob = {"Po","Jo"};
            int i = JOptionPane.showOptionDialog(this,"A deshironi ta fshini?","Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if(i == 0){
                Perdorusi p = utm.getPerdorusi(row);
                try{
                    ur.delete(p);
                }catch(eLibraryException ex){
                    JOptionPane.showMessageDialog(this,ex.getMessage());
                }
                clear();
                loadTable();
            }else{
                clear();
            }
        }else{
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje per te fshire!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        char i = evt.getKeyChar();
        
        if(Character.isLetter(i)){
            txtID.setEditable(false);
            JOptionPane.showMessageDialog(this,"Nuk Lejohet tekst, vetem numer" );
        }else{
            txtID.setEditable(true);
        }
        
    }//GEN-LAST:event_txtIDKeyPressed

    private void txtPerdoruesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPerdoruesiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPerdoruesiActionPerformed

    private void txtPerdoruesiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPerdoruesiKeyPressed

    }//GEN-LAST:event_txtPerdoruesiKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox RoliComboBox;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel perdorusiLabel;
    private javax.swing.JTable tablePerdoruesi;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtPerdoruesi;
    // End of variables declaration//GEN-END:variables
}
