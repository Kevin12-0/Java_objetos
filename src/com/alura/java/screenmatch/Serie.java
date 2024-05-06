package src.com.alura.java.screenmatch;

public class Serie extends Titulo {
    int temporades;
    int episodeForSeason;
    int minutesForEpisodi;

    public int getEpisodeForSeason() {
        return episodeForSeason;
    }

    public int getMinutesForEpisodi() {
        return minutesForEpisodi;
    }

    public int getTemporades() {
        return temporades;
    }

    public void setEpisodeForSeason(int episodeForSeason) {
        this.episodeForSeason = episodeForSeason;
    }

    public void setMinutesForEpisodi(int minutesForEpisodi) {
        this.minutesForEpisodi = minutesForEpisodi;
    }

    public void setTemporades(int temporades) {
        this.temporades = temporades;
    }
}
