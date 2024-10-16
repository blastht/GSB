package GSB_FRAIS;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.SecureRandom;


/**
 *
 * @author lrichier
 */
public class AddWindows extends javax.swing.JFrame {

    private Connection conn;

    public AddWindows() throws SQLException {
        initComponents();
        this.conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/gestutilisateur", "root", "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ModifierBTN = new javax.swing.JButton();
        AjouterBTN = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nomlabel = new javax.swing.JLabel();
        nominput = new javax.swing.JTextField();
        prenomlabel = new javax.swing.JLabel();
        prenominput = new javax.swing.JTextField();
        adresselabel = new javax.swing.JLabel();
        adresseinput = new javax.swing.JTextField();
        dateembinput = new javax.swing.JTextField();
        dateemblabel = new javax.swing.JLabel();
        villeinput = new javax.swing.JTextField();
        villelabel = new javax.swing.JLabel();
        cpinput = new javax.swing.JTextField();
        cplabel = new javax.swing.JLabel();
        RetourBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("AAAA-MM-DD");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel4.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ajouter un Utilisateur");

        ModifierBTN.setText("Ajouter un utilisateur");
        ModifierBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierBTNActionPerformed(evt);
            }
        });

        AjouterBTN.setText("Confirmer");
        AjouterBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(147, 147, 147))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(ModifierBTN)
                .addGap(49, 49, 49)
                .addComponent(AjouterBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifierBTN)
                    .addComponent(AjouterBTN))
                .addGap(200, 200, 200))
        );

        jPanel2.setBackground(new java.awt.Color(176, 229, 255));

        nomlabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nomlabel.setText("Nom : ");

        nominput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nominput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nominputActionPerformed(evt);
            }
        });

        prenomlabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        prenomlabel.setText("Prenom : ");

        prenominput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        prenominput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prenominputActionPerformed(evt);
            }
        });

        adresselabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        adresselabel.setText("Adresse : ");

        adresseinput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        adresseinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adresseinputActionPerformed(evt);
            }
        });

        dateembinput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dateembinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateembinputActionPerformed(evt);
            }
        });

        dateemblabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        dateemblabel.setText("Date Embauche : ");

        villeinput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        villeinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                villeinputActionPerformed(evt);
            }
        });

        villelabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        villelabel.setText("Ville : ");

        cpinput.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cpinput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpinputActionPerformed(evt);
            }
        });

        cplabel.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cplabel.setText("Code Postal : ");

        RetourBTN.setBackground(new java.awt.Color(102, 204, 255));
        RetourBTN.setForeground(new java.awt.Color(255, 255, 255));
        RetourBTN.setText("RETOUR");
        RetourBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourBTNActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("AAAA-MM-DD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(villelabel)
                            .addComponent(villeinput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cplabel)
                                    .addComponent(cpinput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomlabel)
                                    .addComponent(nominput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prenomlabel)
                                    .addComponent(prenominput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateemblabel)
                                    .addComponent(dateembinput, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adresselabel)
                            .addComponent(adresseinput, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RetourBTN)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RetourBTN)
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(prenomlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prenominput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(nomlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nominput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(dateemblabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateembinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cplabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cpinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(villelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(villeinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adresselabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adresseinput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ModifierBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierBTNActionPerformed
        RechercheWindows mainWindow = new RechercheWindows();
        mainWindow.setVisible(true);
    }//GEN-LAST:event_ModifierBTNActionPerformed

    private void AjouterBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterBTNActionPerformed
        try {
            // Retrieve the last ID from the table
            String lastIdQuery = "SELECT MAX(id) FROM utilisateurs";
            try (PreparedStatement lastIdStatement = conn.prepareStatement(lastIdQuery);  ResultSet resultSet = lastIdStatement.executeQuery()) {

                String lastId = "f0"; // Default prefix and initial numeric part
                if (resultSet.next()) {
                    lastId = resultSet.getString(1);
                }

                // Extract the numeric part, increment it, and format the new ID
                String prefix = lastId.replaceAll("[0-9]", "");
                int numericPart = Integer.parseInt(lastId.replaceAll("[^0-9]", ""));
                int newNumericPart = numericPart + 1;
                String newId = prefix + newNumericPart;

                // Continue with the insertion using the generated ID
                String nouveauPrenom = prenominput.getText();
                String nouveauNom = nominput.getText();
                String nouveauLogin = genererLogin(nouveauPrenom, nouveauNom);
                String nouveauCp = cpinput.getText();
                String nouvelleVille = villeinput.getText();
                String nouvelleDateEmbauche = dateembinput.getText();
                String nouvelleAdresse = adresseinput.getText();
                String nouveauMdp = genererMotDePasse();
                String insertQuery = "INSERT INTO utilisateurs (id, nom, prenom, login, mdp, cp, ville, dateEmbauche, adresse) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement insertStatement = conn.prepareStatement(insertQuery)) {
                    insertStatement.setString(1, newId);
                    insertStatement.setString(2, nouveauNom);
                    insertStatement.setString(3, nouveauPrenom);
                    insertStatement.setString(4, nouveauLogin);
                    insertStatement.setString(5, nouveauMdp);
                    insertStatement.setString(6, nouveauCp);
                    insertStatement.setString(7, nouvelleVille);
                    insertStatement.setString(8, nouvelleDateEmbauche);
                    insertStatement.setString(9, nouvelleAdresse);

                    int rowsInserted = insertStatement.executeUpdate();

                    if (rowsInserted > 0) {
                        System.out.println("Insertion réussie !");
                        JOptionPane.showMessageDialog(this, "Visiteur ajouté avec succès !", "Succès", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        System.out.println("Échec de l'insertion !");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_AjouterBTNActionPerformed

    private void RetourBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourBTNActionPerformed
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RetourBTNActionPerformed

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

    private void prenominputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prenominputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prenominputActionPerformed

    private void nominputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nominputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nominputActionPerformed

    private String genererLogin(String prenom, String nom) {
    String login = prenom.substring(0, 1).toLowerCase() + nom.toLowerCase().replaceAll("\\s", "_");
    return login;
}
    
private String genererMotDePasse() {
    int longueurMotDePasse = 8;
    String caracteresPossibles = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    SecureRandom random = new SecureRandom();
    StringBuilder motDePasseBuilder = new StringBuilder(longueurMotDePasse);
    for (int i = 0; i < longueurMotDePasse; i++) {
        int index = random.nextInt(caracteresPossibles.length());
        char caractere = caracteresPossibles.charAt(index);
        motDePasseBuilder.append(caractere);
    }
    String motDePasseAleatoire = motDePasseBuilder.toString();  // Ajoutez cette ligne pour assigner la valeur générée à la variable
    return motDePasseAleatoire;
}

    
    
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
            java.util.logging.Logger.getLogger(AddWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWindows.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AddWindows().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AddWindows.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nominput;
    private javax.swing.JLabel nomlabel;
    private javax.swing.JTextField prenominput;
    private javax.swing.JLabel prenomlabel;
    private javax.swing.JTextField villeinput;
    private javax.swing.JLabel villelabel;
    // End of variables declaration//GEN-END:variables
}
