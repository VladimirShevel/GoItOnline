package vshevel.goit.module3.task3;

import java.util.List;

public class MusicalShop {

    public List<MusicalInstrument> musicalInstruments;

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }
   // public static void playall()

    public static void main(String[] args) {
        MusicalInstrument guitar = new Guitar();
        MusicalInstrument grandpiano = new Piano();
        MusicalInstrument trumpet = new Trumpet();
        guitar.howDoesThisSound();
        grandpiano.howDoesThisSound();
        trumpet.howDoesThisSound();
    }
}
