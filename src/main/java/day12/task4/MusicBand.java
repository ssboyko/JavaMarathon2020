package day12.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MusicBand {
    private String name;
    private int year;
    private List<String> bandMembers = new ArrayList<>();

    public MusicBand(String name, int year, List<String> bandMembers) {
        this.name = name;
        this.year = year;
        this.bandMembers = bandMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<String> getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(List<String> bandMembers) {
        this.bandMembers = bandMembers;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", bandMembers=" + bandMembers +
                '}';
    }

    public static void transferMembers(MusicBand bandA, MusicBand bandB) {
        bandB.bandMembers = Stream.concat(bandA.bandMembers.stream(), bandB.bandMembers.stream()).collect(Collectors.toList());
        bandA.bandMembers.clear();
    }

    public void printMembers(MusicBand musicBand) {
        musicBand.bandMembers.stream().forEach(System.out::println);
    }
}
