/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.Libri;
import BLL.Rezervo;
import DAL.LibriRepository;
import DAL.RezervoRepository;
import DAL.eLibraryException;
import Models.LibriComboBoxModel;
import Models.RezervoTableModel;
import java.util.Date;
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
public class RezervoForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form RezervoForm
     */
    public RezervoForm() {
        initComponents();
        tabelaSelectedIndexChange();
        loadTable();
        loadComboBox();
        clear();
        Kalendari();
    }
    
    RezervoTableModel rtm = new RezervoTableModel();
    RezervoRepository rr = new RezervoRepository();
    LibriRepository lr = new LibriRepository();
    LibriComboBoxModel lcbm = new  LibriComboBoxModel();
    
     public void loadTable() {

        try {
            List<Rezervo> lista = rr.findAll();
            rtm.addList(lista);
            table.setModel(rtm);
            rtm.fireTableDataChanged();

        } catch (eLibraryException elx) {
            Logger.getLogger(RezervoForm.class.getName()).log(Level.SEVERE, null, elx);
        }
    }
      public void tabelaSelectedIndexChange() {
          
        ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if (selectedIndex > -1) {
                    Rezervo rezervo = rtm.getRezervo(selectedIndex);
                    txtID.setText(rezervo.getRezervoId().toString());
                    DataChooser.setDate(rezervo.getDataERezervimit());
                    

                }
            }

        });
      
      }
      
        public void loadComboBox() {
        try {
            List<Libri> lista = lr.findAll();
            lcbm.add(lista);
            LibriComboBox.setModel(lcbm);
            LibriComboBox.repaint();
        } catch (eLibraryException elx) {
            JOptionPane.showMessageDialog(this, elx.getMessage());
        }
    }
        public void clear() {
        table.clearSelection();
        txtID.setText("");   
        DataChooser.setCalendar(null);


    } 
        
        public void Kalendari(){
        Date d = new Date();
        DataChooser.setMinSelectableDate(d);

    }
        
 
        
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btneUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LibriComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        DataChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(198, 182, 182));

        btnCreate.setBackground(new java.awt.Color(153, 153, 255));
        btnCreate.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btneUpdate.setBackground(new java.awt.Color(153, 153, 255));
        btneUpdate.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btneUpdate.setText("UPDATE");
        btneUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneUpdateActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(153, 153, 255));
        btnCancel.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(153, 153, 255));
        btnDelete.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(153, 153, 255));
        btnQuit.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnQuit.setText("EXIT");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnCreate)
                .addGap(72, 72, 72)
                .addComponent(btneUpdate)
                .addGap(81, 81, 81)
                .addComponent(btnCancel)
                .addGap(73, 73, 73)
                .addComponent(btnDelete)
                .addGap(70, 70, 70)
                .addComponent(btnQuit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btneUpdate)
                    .addComponent(btnCancel)
                    .addComponent(btnQuit)
                    .addComponent(btnDelete))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(234, 228, 228));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("ID:");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 1, 45)); // NOI18N
        jLabel1.setText("  Lloji");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("_______________________________");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Libri:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Data e rezerimit  :");

        DataChooser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DataChooserKeyPressed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LibriComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel6))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4)))
                                        .addGap(36, 36, 36)
                                        .addComponent(DataChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(142, 142, 142))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(DataChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LibriComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        Rezervo r = new Rezervo();

        try {
            if ((!txtID.getText().equals("") )) {
                r.setRezervoId(Integer.parseInt(txtID.getText()));
                r.setDataERezervimit(DataChooser.getDate());
                r.setFkLibriId((Libri) lcbm.getSelectedItem());

                rr.create(r);
                clear();
                loadTable();

                JOptionPane.showMessageDialog(this, "E dhëna u shtua me sukses");
            } else {
                JOptionPane.showMessageDialog(this, "Plotesoni te dhenat paraprakisht");

            }

        } catch (eLibraryException elx) {
            JOptionPane.showMessageDialog(this, "E dhena ekziston: ");
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btneUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneUpdateActionPerformed

        int row = table.getSelectedRow();

        Rezervo r = this.rtm.getRezervo(row);
        r.setRezervoId(Integer.parseInt(txtID.getText()));
        r.setDataERezervimit(DataChooser.getDate());
        r.setFkLibriId((Libri) lcbm.getSelectedItem());
        

        clear();
        loadTable();
        try {
            rr.edit(r);
        } catch (eLibraryException elx) {
            Logger.getLogger(RezervoForm.class.getName()).log(Level.SEVERE, null, elx);
        }

        JOptionPane.showMessageDialog(this, "E dhena u editua me sukses");
    }//GEN-LAST:event_btneUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        

        clear();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int row = table.getSelectedRow();
        if (row != -1) {
            Object[] ob = {"PO", "JO"};
            int i = JOptionPane.showOptionDialog(this, "A deshironi ta fshini", "Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if (i == 0) {

                System.out.println("row : "+row);

                Rezervo r = rtm.getRezervo(row);

                try {
                    rr.delete(r);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e.getMessage());
                }
                clear();
                loadTable();
            } 
        } else {
            JOptionPane.showMessageDialog(this, "Nuk keni selektuar asgje");
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
        dispose();
    }//GEN-LAST:event_btnQuitActionPerformed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
        char c = evt.getKeyChar();
    
    if(Character.isDigit(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)) {
        txtID.setEditable(true);
    }else{
        txtID.setEditable(false);
    }
    }//GEN-LAST:event_txtIDKeyPressed

    private void DataChooserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DataChooserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataChooserKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DataChooser;
    private javax.swing.JComboBox LibriComboBox;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btneUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtID;
    // End of variables declaration//GEN-END:variables
}
