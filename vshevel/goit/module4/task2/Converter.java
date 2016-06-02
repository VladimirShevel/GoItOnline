package vshevel.goit.module4.task2;

public class Converter {
    public static int convertTemp(int temperature, char convertTo){

        if (convertTo == 'F') {
                temperature = (temperature - 32) * 5/9;}
        else {
                temperature = temperature * 9/5 + 32;}

        return temperature;
        }

    public static void main(String[] args) {
        System.out.println("Converted temperarure is " + convertTemp(36, 'F'));

    }

    }
