package com.alura.spotify.principal;

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

        for (int i = 0; i < 200; i++) {
            mySong.iLike();
        }
        for (int i = 0; i < 500; i++) {
            mySong.plays();
        }
        System.out.println("Total de reproducciones " + mySong.getTotalReproductions());
        System.out.println("Ttotal de Likes " + mySong.getTotalLikes());
        System.out.println("+++++++++++");
    }
}