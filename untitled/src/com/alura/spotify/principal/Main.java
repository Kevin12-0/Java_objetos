package com.alura.spotify.principal;

import com.alura.spotify.modelos.Favorites;
import com.alura.spotify.modelos.Podcast;
import com.alura.spotify.modelos.Songs;

public class Main {
    public static void main(String[] args) {
        Songs mySong = new Songs();
        mySong.setTitulo("Thank you Jesus");
        mySong.setBand("Hillsong");

        Podcast myPodcast = new Podcast();
        myPodcast.setTitulo("La pension");
        myPodcast.setPresenter("Fedelobo & CrissMartell");
        /* Song */
        for (int i = 0; i < 2000; i++) {
            mySong.iLike();
        }
        for (int i = 0; i < 5000; i++) {
            mySong.plays();
        }
        /* Podcast */
        for (int i = 0; i < 2000; i++) {
            myPodcast.iLike();
        }
        for (int i = 0; i < 5000; i++) {
            myPodcast.plays();
        }

        System.out.println("Total de reproducciones " + mySong.getTotalReproductions());
        System.out.println("Ttotal de Likes " + mySong.getTotalLikes());
        System.out.println("+++++++++++");

        Favorites favorites = new Favorites();
        favorites.adicion(myPodcast);
        favorites.adicion(mySong);

    }
}