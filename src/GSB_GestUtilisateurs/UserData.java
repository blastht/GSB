/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSB_GestUtilisateurs;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UserData {
    public static String[] getUserInfo(String login) {
        String[] userInfo = new String[4]; // [0] = Nom, [1] = Prénom, [2] = Login, [3] = Mot de passe
        String query = "SELECT nom, prenom, login, mdp FROM admin WHERE login = ?";
        
        // Utilisation de try-with-resources pour assurer la fermeture des ressources
        try (java.sql.Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(query)) {

            // Préparation de la requête avec le login en paramètre
            stmt.setString(1, login);

            // Exécution de la requête
            ResultSet rs = stmt.executeQuery();

            // Si un résultat est trouvé, on récupère les informations
            if (rs.next()) {
                userInfo[0] = rs.getString("nom");
                userInfo[1] = rs.getString("prenom");
                userInfo[2] = rs.getString("login");
                userInfo[3] = rs.getString("mdp");
            } else {
                return null;
            }
            
           


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userInfo; 
        
    }
}

