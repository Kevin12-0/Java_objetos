package com.alura.spotify.modelos;

public class Songs extends Audio {
    private String album;
    private String band;
    private String genre;

    @Override
    public int getClassification(){
        if (getTotalReproductions() > 2000){
            return 8;
        } else {
            return 4;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
