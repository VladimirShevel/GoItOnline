package vshevel.goit.module8.task2;

public class Guitar extends Instrument {

    private String name, instrumentType;
    private int productCode;

    public void setName(String name) {
        this.name = name;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    public Guitar(String name,String instrumentType, int productCode){
        this.name = name;
        this.instrumentType = instrumentType;
        this.productCode = productCode;
    }

        public String getName() {
        return name;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public int getProductCode() {
        return productCode;
    }

    @Override
    public String toString() {
        if (name != null && instrumentType != null && productCode != 0)
            return "|     " + name + "     |      " + instrumentType + "     |     " + productCode + "     |";
        return GUITAR;}
}
