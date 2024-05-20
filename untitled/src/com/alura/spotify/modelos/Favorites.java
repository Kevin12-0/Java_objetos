package com.alura.spotify.modelos;

public class Favorites {
    public void adicion(Audio audio) {
        if (audio.getClassification() >= 8) {
            System.out.println(audio.getTitulo() + " Es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + " Otro de los favoritos");
        }
    }
}
