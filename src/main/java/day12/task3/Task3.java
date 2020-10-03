package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand = new MusicBand("Fall Out Boy", 2001);
        MusicBand musicBand1 = new MusicBand("Headspace", 2007);
        MusicBand musicBand2 = new MusicBand("Born From Pain", 1997);
        MusicBand musicBand3 = new MusicBand("Beach House", 2004);
        MusicBand musicBand4 = new MusicBand("EGOIST", 2011);
        MusicBand musicBand5 = new MusicBand("The Carters", 2018);
        MusicBand musicBand6 = new MusicBand("Secret Number", 2020);
        MusicBand musicBand7 = new MusicBand("CatCat", 1992);
        MusicBand musicBand8 = new MusicBand("Catamenia", 1995);
        MusicBand musicBand9 = new MusicBand("Madvillain", 2002);

        List<MusicBand> list = new ArrayList<>();
        list.add(musicBand);
        list.add(musicBand1);
        list.add(musicBand2);
        list.add(musicBand3);
        list.add(musicBand4);
        list.add(musicBand5);
        list.add(musicBand6);
        list.add(musicBand7);
        list.add(musicBand8);
        list.add(musicBand9);

        Collections.shuffle(list);
        System.out.println(groupsAfter2000(list));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        return bands.stream().filter(c -> c.getYear() > 2000).collect(Collectors.toList());
    }

}
