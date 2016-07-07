package vshevel.goit.module6.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MusicalShop {


    private List<Instrument> pianoList = new ArrayList<>();
    private List<Instrument> trumpetList = new ArrayList<>();
    private List<Instrument> guitarList = new ArrayList<>();
    private Map<String,Integer> musicalInstruments;

    public void setGuitarList(List<Instrument> guitarList) {
        this.guitarList = guitarList;
    }

    public void setTrumpetList(List<Instrument> trumpetList) {
        this.trumpetList = trumpetList;
    }

    public void setPianoList(List<Instrument> pianolist) {
        this.pianoList = pianolist;
    }

    public void setMusicalInstruments(Map<String, Integer> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }

    public List<Instrument> prepareInstruments(Map<String, Integer> order) throws NoEnoughInstruments {

       int cntPiano = order.get(Instrument.PIANO);
       int cntGuitar = order.get(Instrument.GUITAR);
       int cntTrumpet = order.get(Instrument.TRUMPET);

       int cntPianoShop = musicalInstruments.get(Instrument.PIANO);
       int cntGuitarShop = musicalInstruments.get(Instrument.GUITAR);
       int cntTrumpetShop = musicalInstruments.get(Instrument.TRUMPET);

       if (cntPiano > cntPianoShop){
           throw new NoEnoughInstruments("Not enought piano for this order");
       }
       if (cntGuitar > cntGuitarShop){
           throw  new NoEnoughInstruments("Not enought guitar for this order");
       }
       if (cntTrumpet > cntTrumpetShop){
           throw  new NoEnoughInstruments("Not enought trumpet for this order");
       }

       List<Instrument> result = new ArrayList<>();
       for (int i = 0; i < cntPiano; i++){
            result.add(0, pianoList.remove(cntPiano-1-i));
           }
       for (int i = 0; i < cntTrumpet; i++){
            result.add(0, trumpetList.remove(cntTrumpet-1-i));
       }
       for (int i = 0; i < cntGuitar; i++){
           result.add(0, guitarList.remove(cntGuitar-1-i));
       }
       musicalInstruments.put(Instrument.PIANO, cntPianoShop - cntPiano);
       musicalInstruments.put(Instrument.GUITAR, cntGuitarShop - cntGuitar);
       musicalInstruments.put(Instrument.TRUMPET, cntTrumpetShop - cntTrumpet);
       return result;
  }
}
