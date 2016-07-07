package vshevel.goit.module8.task2;

public class NoEnoughInstruments extends Exception {

    private final String message;

    NoEnoughInstruments(String message){

        this.message = message;
    }
    public String getMessage() {

        return message;
    }

}
