package vshevel.goit.module6.task2;

public class Trumpet extends Instrument {
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

    public String getName() {
        return name;}

    public Trumpet(String name,String instrumentType, int productCode){
        this.name = name;
        this.instrumentType = instrumentType;
        this.productCode = productCode;
    }

    @Override
    public String toString() {
        if (name != null && instrumentType != null && productCode != 0)
        return "|     " + name + "     |      " + instrumentType + "    |     " + productCode + "     |";
        return TRUMPET;
    }
}
