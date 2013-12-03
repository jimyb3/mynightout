/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mynightout.entity;

/**
 *
 * @author ioanna
 */
public class Cellar implements java.io.Serializable{
    private int clubId;
    private int vodka;
    private int whiskey;
    private int wine;
    private int liqueur;
    private int rum;
    private int tequila;
    private int beer;
    private Nightclub nightclub;

    public Cellar(int vodka, int whiskey, int wine, int liqueur, int rum, int beer) {
        this.vodka = vodka;
        this.whiskey = whiskey;
        this.wine = wine;
        this.liqueur = liqueur;
        this.rum = rum;
        this.beer = beer;
    }

    public Nightclub getNightclub() {
        return nightclub;
    }
    public void setNightclub(Nightclub nightclub) {
        this.nightclub = nightclub;
    }
    public void setClubId(int clubId) {
        this.clubId = clubId;
    }

    public void setVodka(int vodka) {
        this.vodka = vodka;
    }

    public void setWhiskey(int whiskey) {
        this.whiskey = whiskey;
    }

    public void setWine(int wine) {
        this.wine = wine;
    }

    public void setLiqueur(int liqueur) {
        this.liqueur = liqueur;
    }

    public void setRum(int rum) {
        this.rum = rum;
    }

    public void setTequila(int tequila) {
        this.tequila = tequila;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }
    

    public int getClubId() {
        return clubId;
    }

    public int getVodka() {
        return vodka;
    }

    public int getWhiskey() {
        return whiskey;
    }

    public int getWine() {
        return wine;
    }

    public int getLiqueur() {
        return liqueur;
    }

    public int getRum() {
        return rum;
    }

    public int getTequila() {
        return tequila;
    }

    public int getBeer() {
        return beer;
    }
    
    
    
}
