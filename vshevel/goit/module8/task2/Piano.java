package vshevel.goit.module8.task2;

public class Piano extends Instrument {
    private String name, instrumentType;
    private int productCode;

    @Override
    public int getProductCode() {
        return productCode;
    }

    @Override
    public String getInstrumentType() {
        return instrumentType;
    }

    @Override
    public String getName() {
        return name;
    }

    public Piano(String name, String instrumentType, int productCode){
        this.name = name;
        this.instrumentType = instrumentType;
        this.productCode = productCode;
    }


    static Piano piano1 = new Piano("piano1", PIANO, 2981);
    static Piano piano2 = new Piano("piano2", PIANO, 2042);

    @Override
        public String toString() {
        if (name != null && instrumentType != null && productCode != 0)
            return "|     " + name + "       |      " + instrumentType + "      |     " + productCode + "     |";
        return GUITAR;}
}
