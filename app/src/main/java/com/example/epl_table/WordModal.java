package com.example.epl_table;

public class WordModal {
    private String clubName;
    private int played, won, drawn, lost, gF, gA, gD, points,clubImage;



    public WordModal(int clubImage, String clubName, int played, int won, int drawn, int lost, int gF, int gA, int gD, int points) {
//        this.position =position;
        this.clubImage =clubImage;
        this.clubName =clubName;
        this.played =played;
        this.won =won;
        this.drawn =drawn;
        this.lost =lost;
        this.gF =gF;
        this.gA =gA;
        this.gD =gD;
        this.points =points;

    }
    public WordModal()
    {
//        this.position =0;
        this.clubImage =0;
        this.clubName ="";
        this.played =0;
        this.won =0;
        this.drawn =0;
        this.lost =0;
        this.gF =0;
        this.gA =0;
        this.gD =0;
        this.points =0;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {

        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getDrawn() {
        return drawn;
    }

    public void setDrawn(int drawn) {
        this.drawn = drawn;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getgF() {
        return gF;
    }

    public void setgF(int gF) {
        this.gF = gF;
    }

    public int getgA() {
        return gA;
    }

    public void setgA(int gA) {
        this.gA = gA;
    }

    public int getgD() {

        return (gF -gA);
    }

    public void setgD(int gD) {
        this.gD = gD;
    }

    public int getPoints() {

        return ((won*3) +(drawn*1));
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getClubImage() {
        return clubImage;
    }

    public void setClubImage(int clubImage) {
        this.clubImage = clubImage;
    }
}
