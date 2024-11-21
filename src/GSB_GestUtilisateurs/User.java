/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GSB_GestUtilisateurs;

/**
 *
 * @author keiti
 */
public class User {
    private int id;
    private String nom;
    private String prenom;
    private String login;
    private int mdp;

    public User(int id, String nom, String prenom, String login, int mdp) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.mdp = mdp;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getLogin() {
        return login;
    }

    public int getMdp() {
        return mdp;
    }
    
    
}
