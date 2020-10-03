package day12.task4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand bandA = new MusicBand("BandA", 2005, Arrays.asList("Phill Barkley", "Bob Oakley"));
        MusicBand bandB = new MusicBand("BandB", 2010, Arrays.asList("Василий Металлюгин", "Эдуард Суровый"));

        MusicBand.transferMembers(bandA, bandB);
        bandB.printMembers(bandB);

    }
}
