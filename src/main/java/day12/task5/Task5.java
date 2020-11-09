package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Tuomas Holopainen",45));
        members1.add(new MusicArtist("Emppu Vuorinen",50));
        members1.add(new MusicArtist("Marco Hietala",55));
        members1.add(new MusicArtist("Troy Donockley",44));
        members1.add(new MusicArtist("Floor Jansen",43));

        MusicBand musicBand1 = new MusicBand("Nightwish", 1996, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Jonah Nilsson",37));
        members2.add(new MusicArtist("Henrik Linder",30));
        members2.add(new MusicArtist("Aron Mellergård",35));

        MusicBand musicBand2 = new MusicBand("Dirty Loops", 2008, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }
}
