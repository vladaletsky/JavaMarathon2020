package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Tuomas Holopainen");
        members1.add("Emppu Vuorinen");
        members1.add("Marco Hietala");
        members1.add("Troy Donockley");
        members1.add("Floor Jansen");

        MusicBand musicBand1 = new MusicBand("Nightwish", 1996, members1);

        List<String> members2 = new ArrayList<>();
        members2.add("Jonah Nilsson");
        members2.add("Henrik Linder");
        members2.add("Aron Mellergård");

        MusicBand musicBand2 = new MusicBand("Dirty Loops", 2008, members2);

        musicBand1.printMembers();
        musicBand2.printMembers();

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();
        musicBand2.printMembers();
    }


}
