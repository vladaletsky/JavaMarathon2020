package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        MusicBand musicBand1 = new MusicBand("Metallica", 1981);
        MusicBand musicBand2 = new MusicBand("Deep Purple", 1968);
        MusicBand musicBand3 = new MusicBand("Dream Theatre", 1985);
        MusicBand musicBand4 = new MusicBand("System Of A Down", 1992);
        MusicBand musicBand5 = new MusicBand("Nightwish", 1996);
        MusicBand musicBand6 = new MusicBand("Korpiklaani", 2003);
        MusicBand musicBand7 = new MusicBand("Dirty Loops", 2008);
        MusicBand musicBand8 = new MusicBand("Animals as Leaders", 2007);
        MusicBand musicBand9 = new MusicBand("Bobo Stenson Trio", 2010);
        MusicBand musicBand10 = new MusicBand("LRK Trio", 2018);

        List<MusicBand> musicBands = new ArrayList<>();
        musicBands.add(musicBand1);
        musicBands.add(musicBand2);
        musicBands.add(musicBand3);
        musicBands.add(musicBand4);
        musicBands.add(musicBand5);
        musicBands.add(musicBand6);
        musicBands.add(musicBand7);
        musicBands.add(musicBand8);
        musicBands.add(musicBand9);
        musicBands.add(musicBand10);

        System.out.println(musicBands);
        Collections.shuffle(musicBands);

        System.out.println(groupsAfter2000(musicBands));
    }

   public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
       List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
           if (band.getYear() > 2000){
               groupsAfter2000.add(band);
           }
       }
       return groupsAfter2000;
   }

}
