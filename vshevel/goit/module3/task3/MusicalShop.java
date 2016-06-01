package vshevel.goit.module3.task3;

import java.util.List;

public class MusicalShop {

    public List<MusicalInstruments> musicalInstrumentses;

    public List<MusicalInstruments> getMusicalInstrumentses() {
        return musicalInstrumentses;
    }

    public void setMusicalInstrumentses(List<MusicalInstruments> musicalInstrumentses) {
        this.musicalInstrumentses = musicalInstrumentses;
    }

    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano grandpiano = new Piano();
        Trumpet trumpet = new Trumpet();
        MusicalInstruments anotherInstrument = new MusicalInstruments();
        grandpiano.howDoesThisSound();
        guitar.howDoesThisSound();
        trumpet.howDoesThisSound();
    }
}
