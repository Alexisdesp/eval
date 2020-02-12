package valarep;

import java.util.ArrayList;


public class Hotel {

    private int nbDeChambres;
    private ArrayList<Chambre> Chambres;

    public Hotel(int nbDeChambres, ArrayList<Chambre> chambres) {
        this.nbDeChambres = nbDeChambres;
        Chambres = chambres;
    }

    public int getnbDeChambres() {
        return nbDeChambres;
    }

    public void setnbDeChambres(int nbDeChambres) {
        this.nbDeChambres = nbDeChambres;
    }

    public void createChambre() {
        Chambre chambre = new Chambre();
        Chambres.add(chambre);
    }

}