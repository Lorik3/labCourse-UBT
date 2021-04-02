package GUI;

import BLL.Perdorusi;
import BLL.Studenti;
import DAL.StudentiRepository;
import DAL.UserRepository;
import DAL.eLibraryException;
import Models.StudentiTableModel;
import Models.UserComboBoxModel;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Ylli
 */
public class StudentiForm extends javax.swing.JInternalFrame {

    StudentiRepository sr = new StudentiRepository();
    UserRepository ur = new UserRepository();
    StudentiTableModel stm = new StudentiTableModel();
    UserComboBoxModel ucbm = new UserComboBoxModel();

    public StudentiForm() {

        initComponents();
        loadTable();
        tabelaSelectedIndexChange();
        loadComboBox();
        groupButton();
        Kalendari();

    }

    private void groupButton() {

        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonM);
        bg.add(jRadioButtonF);
    }

    public void loadTable() {

        try {
            List<Studenti> lista = sr.findAll();
            stm.addList(lista);
            tableStudenti.setModel(stm);
            stm.fireTableDataChanged();

        } catch (eLibraryException elx) {
            Logger.getLogger(StudentiForm.class.getName()).log(Level.SEVERE, null, elx);
        }
    }

    public void tabelaSelectedIndexChange() {

        ListSelectionModel rowSM = tableStudenti.getSelectionModel();
        rowSM.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (e.getValueIsAdjusting()) {
                    return;
                }
                ListSelectionModel rowSM = (ListSelectionModel) e.getSource();
                int selectedIndex = rowSM.getAnchorSelectionIndex();
                if (selectedIndex > -1) {
                    Studenti studenti = stm.getStudenti(selectedIndex);
                    txtID.setText(studenti.getStudentId().toString());
                    txtEmri.setText(studenti.getEmri());
                    txtMbiemri.setText(studenti.getMbiemri());
                    txtAdresa.setText(studenti.getAdressa());
                    jRadioButtonM.setText(studenti.getGjinia());
                    jRadioButtonF.setText(studenti.getGjinia());
                    jDateChooser.setDate(studenti.getDataELindjes());
                    txtTel.setText(studenti.getNrTelefonit().toString());
                    txtEmail.setText(studenti.getEmail());

                }
            }
        });
    }

    public void loadComboBox() {
        try {
            List<Perdorusi> lista = ur.findAll();
            ucbm.add(lista);
            PerdoruesiComboBox.setModel(ucbm);
            PerdoruesiComboBox.repaint();
        } catch (eLibraryException elx) {
            JOptionPane.showMessageDialog(this, elx.getMessage());
        }
    }

    public void clear() {
        tableStudenti.clearSelection();
        txtID.setText("");
        txtEmri.setText("");
        txtMbiemri.setText("");
        txtAdresa.setText("");
        jRadioButtonM.setText("");
        jRadioButtonF.setText("");
        jDateChooser.setCalendar(null);
        txtTel.setText("");
        txtEmail.setText("");

    }
    public void Kalendari(){
        Date d = new Date();
       
     jDateChooser.setMaxSelectableDate(d);
    
    
    }
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        buttonGroup1 = new javax.swing.ButtonGroup();
        menubar = new javax.swing.JPanel();
        btncreate = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jmbiemri = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtEmri = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableStudenti = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        perdorusiLabel = new javax.swing.JLabel();
        PerdoruesiComboBox = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jRadioButtonM = new javax.swing.JRadioButton();
        jRadioButtonF = new javax.swing.JRadioButton();
        txtAdresa = new javax.swing.JTextField();
        txtMbiemri = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();

        menubar.setBackground(new java.awt.Color(198, 182, 182));

        btncreate.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btncreate.setForeground(new java.awt.Color(82, 76, 95));
        btncreate.setText("Create");
        btncreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreateActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(82, 76, 95));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        btncancel.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btncancel.setForeground(new java.awt.Color(82, 76, 95));
        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        btndelete.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btndelete.setForeground(new java.awt.Color(82, 76, 95));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        btnexit.setForeground(new java.awt.Color(82, 76, 95));
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        container.setBackground(new java.awt.Color(234, 228, 228));

        jLabel5.setFont(new java.awt.Font("Harlow Solid Italic", 1, 45)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(82, 76, 95));
        jLabel5.setText("Studenti");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("_______________________________");

        jmbiemri.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jmbiemri.setText("Mbiemri:");

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel18.setText("Emri:");

        txtEmri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmriActionPerformed(evt);
            }
        });
        txtEmri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmriKeyPressed(evt);
            }
        });

        tableStudenti.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tableStudenti);

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel19.setText("Perdoruesi:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIDKeyPressed(evt);
            }
        });

        perdorusiLabel.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        perdorusiLabel.setText("ID e Studentit: ");

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel20.setText("Gjinia: ");

        jLabel21.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel21.setText("Data e lindjes: ");

        jLabel22.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel22.setText("Adresa:");

        jLabel23.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel23.setText("Email: ");

        jLabel24.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel24.setText("Numri i Telefonit:");

        jDateChooser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jDateChooserKeyPressed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonM);
        jRadioButtonM.setText("Male");

        buttonGroup1.add(jRadioButtonF);
        jRadioButtonF.setText("Female");

        txtAdresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdresaActionPerformed(evt);
            }
        });
        txtAdresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAdresaKeyPressed(evt);
            }
        });

        txtMbiemri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMbiemriActionPerformed(evt);
            }
        });
        txtMbiemri.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMbiemriKeyPressed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        txtTel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabel6))
                            .addGroup(containerLayout.createSequentialGroup()
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(containerLayout.createSequentialGroup()
                                        .addComponent(perdorusiLabel)
                                        .addGap(33, 33, 33)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(containerLayout.createSequentialGroup()
                                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jmbiemri)
                                            .addComponent(jLabel20))
                                        .addGap(97, 97, 97)
                                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtonM)
                                            .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtEmri, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                                .addComponent(jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jRadioButtonF)
                                            .addComponent(txtMbiemri))))
                                .addGap(80, 80, 80)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel24))
                                .addGap(39, 39, 39)
                                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTel)
                                    .addComponent(txtAdresa)
                                    .addComponent(PerdoruesiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail))))
                        .addContainerGap(160, Short.MAX_VALUE))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(46, 46, 46)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perdorusiLabel)
                    .addComponent(jLabel22)
                    .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtEmri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jmbiemri)
                            .addComponent(jLabel23)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMbiemri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(PerdoruesiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(containerLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jRadioButtonM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonF)))
                .addGap(27, 27, 27)
                .addGroup(containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21)
                    .addComponent(jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menubarLayout = new javax.swing.GroupLayout(menubar);
        menubar.setLayout(menubarLayout);
        menubarLayout.setHorizontalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menubarLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btncreate)
                .addGap(63, 63, 63)
                .addComponent(btnupdate)
                .addGap(62, 62, 62)
                .addComponent(btncancel)
                .addGap(57, 57, 57)
                .addComponent(btndelete)
                .addGap(56, 56, 56)
                .addComponent(btnexit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        menubarLayout.setVerticalGroup(
            menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menubarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(menubarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncreate)
                    .addComponent(btnupdate)
                    .addComponent(btncancel)
                    .addComponent(btndelete)
                    .addComponent(btnexit))
                .addGap(18, 18, 18)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menubar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menubar, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreateActionPerformed

        Studenti s = new Studenti();

        try {
            if ((jRadioButtonF.isSelected() || jRadioButtonM.isSelected()) && !txtID.getText().equals("") ) {
                s.setStudentId(Integer.parseInt(txtID.getText()));
                s.setEmri(txtEmri.getText());
                s.setMbiemri(txtMbiemri.getText());

                if (jRadioButtonF.isSelected()) {
                    s.setGjinia(jRadioButtonF.getText().charAt(0) + "");
                } else {
                    s.setGjinia(jRadioButtonM.getText().charAt(0) + "");
                }

                s.setAdressa(txtAdresa.getText());
                s.setNrTelefonit(Integer.parseInt(txtTel.getText()));
                s.setEmail(txtEmail.getText());
                s.setFkUserId((Perdorusi) ucbm.getSelectedItem());
                s.setDataELindjes(jDateChooser.getDate());
                sr.create(s);
                clear();
                loadTable();

                JOptionPane.showMessageDialog(this, "E dhëna u shtua me sukses");
            } else {
                JOptionPane.showMessageDialog(this, "Plotesoni te dhenat paraprakisht");

            }

        } catch (eLibraryException elx) {
            JOptionPane.showMessageDialog(this, "E dhena ekziston: ");
        }
        
       

    }//GEN-LAST:event_btncreateActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed

        int row = tableStudenti.getSelectedRow();

        Studenti s = this.stm.getStudenti(row);
        s.setStudentId(Integer.parseInt(txtID.getText()));
        s.setEmri(txtEmri.getText());
        s.setMbiemri(txtMbiemri.getText());

        if (jRadioButtonF.isSelected() || jRadioButtonM.isSelected()) {
            if (jRadioButtonF.isSelected()) {
                s.setGjinia(jRadioButtonF.getText().charAt(0) + "");
            } else {
                s.setGjinia(jRadioButtonM.getText().charAt(0) + "");
            }
        }
        s.setDataELindjes(jDateChooser.getDate());
        s.setAdressa(txtAdresa.getText());
        s.setNrTelefonit(Integer.parseInt(txtTel.getText()));
        s.setEmail(txtEmail.getText());
        s.setFkUserId((Perdorusi) ucbm.getSelectedItem());

        clear();
        loadTable();
        try {
            sr.edit(s);
        } catch (eLibraryException elx) {
            Logger.getLogger(StudentiForm.class.getName()).log(Level.SEVERE, null, elx);
        }

        JOptionPane.showMessageDialog(this, "E dhena u editua me sukses");
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        clear();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
          int row = tableStudenti.getSelectedRow();
        if(row != -1){
            Object[] ob = {"Po","Jo"};
            int i = JOptionPane.showOptionDialog(this,"A deshironi ta fshini?","Fshirja", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, ob, ob[1]);
            if(i == 0){
                Studenti s = stm.getStudenti(row);
                try{
                    sr.delete(s);
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
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        dispose();
    }//GEN-LAST:event_btnexitActionPerformed

    private void txtEmriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmriActionPerformed

    private void txtEmriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmriKeyPressed
    char c = evt.getKeyChar();
    
    if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
        txtEmri.setEditable(true);
    }else{
        txtEmri.setEditable(false);
    }
    }//GEN-LAST:event_txtEmriKeyPressed

    private void txtIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyPressed
    char c = evt.getKeyChar();
    
    if(Character.isDigit(c)|| Character.isWhitespace(c)|| Character.isISOControl(c)) {
        txtID.setEditable(true);
    }else{
        txtID.setEditable(false);
    }

    }//GEN-LAST:event_txtIDKeyPressed

    private void txtAdresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdresaActionPerformed

    private void txtAdresaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAdresaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdresaKeyPressed

    private void txtMbiemriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMbiemriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMbiemriActionPerformed

    private void txtMbiemriKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMbiemriKeyPressed
    char c = evt.getKeyChar();
    
    if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
        txtMbiemri.setEditable(true);
    }else{
        txtMbiemri.setEditable(false);
    }
    }//GEN-LAST:event_txtMbiemriKeyPressed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
    
           
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtTelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelKeyPressed
    char c = evt.getKeyChar();
    
    if(Character.isLetter(c)){
        txtTel.setEditable(false);
        JOptionPane.showMessageDialog(this, "Ju lutem shkruani vetem numra");
        
    }else if(Character.isWhitespace(c)|| Character.isISOControl(c)){
        txtTel.setEditable(true);
    }
        
    
    if(txtTel.getText().length() != 9 || Character.isISOControl(c)){
      txtTel.setEditable(true);
    }else{
        txtTel.setEditable(false);
        JOptionPane.showMessageDialog(this, "Numri eshte gabim!");
        
    }
    }//GEN-LAST:event_txtTelKeyPressed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void jDateChooserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jDateChooserKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox PerdoruesiComboBox;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btncreate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel container;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButtonF;
    private javax.swing.JRadioButton jRadioButtonM;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jmbiemri;
    private javax.swing.JPanel menubar;
    private javax.swing.JLabel perdorusiLabel;
    private javax.swing.JTable tableStudenti;
    private javax.swing.JTextField txtAdresa;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmri;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMbiemri;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
