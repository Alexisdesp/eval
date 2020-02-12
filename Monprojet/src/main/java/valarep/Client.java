package valarep;

public class Client {
    private int idClient;
    private String prenom;
    private String nomDeFamille;

    public Client() {
        this.idClient = 0;
        this.prenom = "";
        this.nomDeFamille = "";
    }

    public Client(int idClient, String nom, String prenom) {
        this.idClient = idClient;
        this.prenom = nom;
        this.nomDeFamille = prenom;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public String getNom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.prenom = nom;
    }

    public String getPrenom() {
        return nomDeFamille;
    }

    public void setPrenom(String prenom) {
        this.nomDeFamille = prenom;
    }
}