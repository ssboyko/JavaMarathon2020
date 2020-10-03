package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        MusicBand bandA = new MusicBand();
        bandA.setName("BandA");
        bandA.setYear(2005);
        List<MusicArtist> bandlist1 = new ArrayList<>();
        bandlist1.add(new MusicArtist("Phill Barkley", 30));
        bandlist1.add(new MusicArtist("Bob Oakley", 35));
        bandA.setBandMembers(bandlist1);

        MusicBand bandB = new MusicBand();
        bandB.setName("bandB");
        bandB.setYear(2009);
        List<MusicArtist> bandlist2 = new ArrayList<>();
        bandlist2.add(new MusicArtist("Василий Металлюгин", 47));
        bandlist2.add(new MusicArtist("Эдуард Суровый", 84));
        bandB.setBandMembers(bandlist2);

        MusicBand.transferMembers(bandA, bandB);
        bandA.printMembers(bandA);
        bandB.printMembers(bandB);

    }
}
