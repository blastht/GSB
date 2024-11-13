package GSB_GestUtilisateurs;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EditWindows extends javax.swing.JFrame {

    private String selectedVisitorId;
    private Connection conn;

    public EditWindows(Connection connection, String visitorId) {
        initComponents();
        this.conn = connection;
        this.selectedVisitorId = visitorId;
        displayVisitorData();
    }

    private void displayVisitorData() {
        try {
            String query = "SELECT * FROM utilisateurs WHERE id = ?";
            try (PreparedStatement preparedStatement = conn.prepareStatement(query)) {
                preparedStatement.setString(1, selectedVisitorId);

                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    if (resultSet.next()) {
                        nominput.setText(resultSet.getString("nom"));
                        prenominput.setText(resultSet.getString("prenom"));
                        logininput.setText(resultSet.getString("login"));
                        mdpinput.setText(resultSet.getString("mdp"));
                        cpinput.setText(resultSet.getString("cp"));
                        villeinput.setText(resultSet.getString("ville"));
                        dateembinput.setText(resultSet.getString("dateEmbauche"));
                        adresseinput.setText(resultSet.getString("adresse"));
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        nomlabel = new javax.swing.JLabel();
        nominput = new javax.swing.JTextField();
        prenominput = new javax.swing.JTextField();
        prenomlabel = new javax.swing.JLabel();
        logininput = new javax.swing.JTextField();
        loginlabel = new javax.swing.JLabel();
        mdplabel = new javax.swing.JLabel();
        mdpinput = new javax.swing.JTextField();
        cplabel = new javax.swing.JLabel();
        cpinput = new javax.swing.JTextField();
        villelabel = new javax.swing.JLabel();
        villeinput = new javax.swing.JTextField();
        dateemblabel = new javax.swing.JLabel();
        dateembinput = new javax.swing.JTextField();
        adresseinput = new javax.swing.JTextField();
        adresselabel = new javax.swing.JLabel();
        RetourBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ModifierBTN = new javax.swing.JButton();
        AjouterBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(176, 229, 255));

        nomlabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nomlabel.setText("Nom : ");

        nominput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nominput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominputActionPerformed(evt);
            }
        });

        prenominput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        prenominput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenominputActionPerformed(evt);
            }
        });

        prenomlabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        prenomlabel.setText("Prenom : ");

        logininput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        logininput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logininputActionPerformed(evt);
            }
        });

        loginlabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        loginlabel.setText("Login : ");

        mdplabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        mdplabel.setText("Mot de passe : ");

        mdpinput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        mdpinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mdpinputActionPerformed(evt);
            }
        });

        cplabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cplabel.setText("Code Postal : ");

        cpinput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cpinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpinputActionPerformed(evt);
            }
        });

        villelabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        villelabel.setText("Ville : ");

        villeinput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        villeinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                villeinputActionPerformed(evt);
            }
        });

        dateemblabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dateemblabel.setText("Date Embauche : ");

        dateembinput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dateembinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateembinputActionPerformed(evt);
            }
        });

        adresseinput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        adresseinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresseinputActionPerformed(evt);
            }
        });

        adresselabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        adresselabel.setText("Adresse : ");

        RetourBTN.setBackground(new java.awt.Color(102, 204, 255));
        RetourBTN.setForeground(new java.awt.Color(255, 255, 255));
        RetourBTN.setText("RETOUR");
        RetourBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourBTNActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("AAAA-MM-DD");

        ModifierBTN.setText("Confirmer");
        ModifierBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierBTNActionPerformed(evt);
            }
        });

        AjouterBTN.setText("Ajouter un utilisateur");
        AjouterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterBTNActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Modifier un Visiteur");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loginlabel)
                                    .addComponent(logininput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prenomlabel)
                                    .addComponent(prenominput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomlabel)
                                    .addComponent(nominput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(villelabel)
                                    .addComponent(villeinput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateemblabel)
                                    .addComponent(dateembinput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addContainerGap(475, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cpinput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cplabel))
                                .addGap(64, 64, 64)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RetourBTN)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mdpinput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mdplabel))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(adresseinput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(275, 275, 275)
                                .addComponent(ModifierBTN)
                                .addGap(59, 59, 59)
                                .addComponent(AjouterBTN))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(adresselabel)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RetourBTN)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomlabel)
                                    .addComponent(cplabel)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nominput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenomlabel)
                    .addComponent(villelabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prenominput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(villeinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginlabel)
                    .addComponent(dateemblabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logininput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateembinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mdplabel)
                    .addComponent(adresselabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mdpinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adresseinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifierBTN)
                    .addComponent(AjouterBTN))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModifierBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierBTNActionPerformed
        try {
            String nouveauNom = nominput.getText();
            String nouveauPrenom = prenominput.getText();
            String nouveauLogin = logininput.getText();
            String nouveauMdp = mdpinput.getText();
            String nouveauCp = cpinput.getText();
            String nouvelleVille = villeinput.getText();
            String nouvelleDateEmbauche = dateembinput.getText();
            String nouvelleAdresse = adresseinput.getText();

            String updateQuery = "UPDATE utilisateurs SET nom=?, prenom=?, login=?, mdp=?, cp=?, ville=?, dateEmbauche=?, adresse=? WHERE id=?";
            try (PreparedStatement updateStatement = conn.prepareStatement(updateQuery)) {
                updateStatement.setString(1, nouveauNom);
                updateStatement.setString(2, nouveauPrenom);
                updateStatement.setString(3, nouveauLogin);
                updateStatement.setString(4, nouveauMdp);
                updateStatement.setString(5, nouveauCp);
                updateStatement.setString(6, nouvelleVille);
                updateStatement.setString(7, nouvelleDateEmbauche);
                updateStatement.setString(8, nouvelleAdresse);
                updateStatement.setString(9, selectedVisitorId);

                int rowsUpdated = updateStatement.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("Mise à jour réussie !");
                    JOptionPane.showMessageDialog(this, "Mise à jour du visiteur effectuée !", "Succès", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    System.out.println("Échec de la mise à jour !");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ModifierBTNActionPerformed

    private void AjouterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterBTNActionPerformed
        AddWindows mainWindow = null;
        try {
            mainWindow = new AddWindows();
        } catch (SQLException ex) {
            Logger.getLogger(EditWindows.class.getName()).log(Level.SEVERE, null, ex);
        }

            mainWindow.setVisible(true);    }//GEN-LAST:event_AjouterBTNActionPerformed

    private void nominputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nominputActionPerformed

    private void prenominputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenominputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenominputActionPerformed

    private void logininputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logininputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logininputActionPerformed

    private void mdpinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mdpinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mdpinputActionPerformed

    private void cpinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpinputActionPerformed

    private void villeinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_villeinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_villeinputActionPerformed

    private void dateembinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateembinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateembinputActionPerformed

    private void adresseinputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adresseinputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adresseinputActionPerformed

    private void RetourBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourBTNActionPerformed
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetourBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // Utilisez AddWindows au lieu de EditWindows
                    new AddWindows().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(EditWindows.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterBTN;
    private javax.swing.JButton ModifierBTN;
    private javax.swing.JButton RetourBTN;
    private javax.swing.JTextField adresseinput;
    private javax.swing.JLabel adresselabel;
    private javax.swing.JTextField cpinput;
    private javax.swing.JLabel cplabel;
    private javax.swing.JTextField dateembinput;
    private javax.swing.JLabel dateemblabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField logininput;
    private javax.swing.JLabel loginlabel;
    private javax.swing.JTextField mdpinput;
    private javax.swing.JLabel mdplabel;
    private javax.swing.JTextField nominput;
    private javax.swing.JLabel nomlabel;
    private javax.swing.JTextField prenominput;
    private javax.swing.JLabel prenomlabel;
    private javax.swing.JTextField villeinput;
    private javax.swing.JLabel villelabel;
    // End of variables declaration//GEN-END:variables
}
