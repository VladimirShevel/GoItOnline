package vshevel.goit.module8.task2;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

        //выкладываем товар на склад
        List<Instrument> guitarList = new ArrayList<>();
        guitarList.add(Instrument.guitar1);
        guitarList.add(Instrument.guitar2);
        guitarList.add(Instrument.guitar3);
        guitarList.add(Instrument.guitar4);
        guitarList.add(Instrument.guitar5);
        guitarList.add(Instrument.guitar6);
        guitarList.add(Instrument.guitar7);
        guitarList.add(Instrument.guitar8);
        guitarList.add(Instrument.guitar9);
        guitarList.add(Instrument.guitar10);
        guitarList.add(Instrument.guitar11);
        guitarList.add(Instrument.guitar12);
        guitarList.add(Instrument.guitar13);
        guitarList.add(Instrument.guitar14);
        guitarList.add(Instrument.guitar15);
        guitarList.add(Instrument.guitar16);

        List<Instrument> pianoList = new ArrayList<>();
        pianoList.add(Piano.piano1);
        pianoList.add(Piano.piano2);

        List<Instrument> trumpetList = new ArrayList<>();
        trumpetList.add(Instrument.trumpet1);
        trumpetList.add(Instrument.trumpet2);
        trumpetList.add(Instrument.trumpet3);
        trumpetList.add(Instrument.trumpet4);
        trumpetList.add(Instrument.trumpet5);
        trumpetList.add(Instrument.trumpet6);
        trumpetList.add(Instrument.trumpet7);

        //создал для модуля 8
        List<Instrument> allInstruments = new ArrayList<>();
        allInstruments.addAll(pianoList);
        allInstruments.addAll(trumpetList);
        allInstruments.addAll(guitarList);

        //создаем магазин
        MusicalShop shop = new MusicalShop();

        //создаем асортимент
        Map<String, Integer> instruments = new HashMap<>();
        instruments.put(Instrument.PIANO, pianoList.size());
        instruments.put(Instrument.GUITAR, guitarList.size());
        instruments.put(Instrument.TRUMPET, trumpetList.size());

        // Инициализируем магазин
        shop.setMusicalInstruments(instruments);
        shop.setPianoList(pianoList);
        shop.setGuitarList(guitarList);
        shop.setTrumpetList(trumpetList);

        //создаем заказ
        Map<String, Integer> order = new HashMap<>();
        order.put(Instrument.PIANO, 1);
        order.put(Instrument.GUITAR, 8);
        order.put(Instrument.TRUMPET, 7);

        //обрабатываем его
        try {
            //проверка метода печати коллекции
            System.out.print("All guitars \n");
            printCollection(guitarList);
            System.out.print("All trumpets \n");
            printCollection(trumpetList);
            System.out.print("All pianos \n");
            printCollection(pianoList);
            System.out.print("All instruments \n");
            printCollection(allInstruments);

            List<Instrument> list = shop.prepareInstruments(order);

            TreeSet<Instrument> productCodeSorted = new TreeSet<>(new ProductCodeComparator());
            for (int i = 0; i<allInstruments.size(); i++)
                productCodeSorted.add(allInstruments.get(i));

            TreeSet<Instrument> nameSorted = new TreeSet<>(new NameComparator());
            for (int i = 0; i<allInstruments.size(); i++)
                nameSorted.add(allInstruments.get(i));

            System.out.println("All instruments sorted by ProductCode");
            printCollection(productCodeSorted);

            System.out.println("All instruments sorted by Name");
            printCollection(nameSorted);

            System.out.print("Your order is:\n");
            printCollection(list);
        }
        catch (NoEnoughInstruments e) {
            System.out.println("No enought instruments on the store. " + e.getMessage());
        }
        allInstruments.clear();
        allInstruments.addAll(pianoList);
        allInstruments.addAll(trumpetList);
        allInstruments.addAll(guitarList);
        System.out.print("All instruments after your order\n");
        printCollection(allInstruments);
    }
    //метод печати
    public static void printCollection(Collection<Instrument> print){
        System.out.println("_____________________________________________________ \n" +
                "| instrument name  | instrument type | product code | \n----------------------------------------------------" );
        for (Instrument instrument : print) {
            System.out.println(instrument);}
        System.out.println("----------------------------------------------------\n");

    }



}


