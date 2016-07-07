package vshevel.goit.module6.task2;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Runner {
    public static void main(String[] args) {
        //создаем магазин
        MusicalShop shop = new MusicalShop();
        //создаем асортимент
        Map<String, Integer> instruments = new HashMap<>();
        instruments.put(Instrument.PIANO, 2);
        instruments.put(Instrument.GUITAR, 16);
        instruments.put(Instrument.TRUMPET, 7);
        // Инициализируем магазин этим ассортиментом
        shop.setMusicalInstruments(instruments);
        //создаем заказ
        Map<String, Integer> order = new HashMap<>();
        order.put(Instrument.PIANO, 1);
        order.put(Instrument.GUITAR, 8);
        order.put(Instrument.TRUMPET, 7);

        try {
            List<Instrument> list = shop.prepareInstruments(order);
            for (Instrument instrument : list) {
                System.out.println("your order is: " + instrument);}
            System.out.println("We have " + instruments + " after your order.");
        }
        catch (NoEnoughInstruments e) {
            System.out.println("Not enought instruments on the store. " + e.getMessage());
        }
    }
}