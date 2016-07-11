package vshevel.goit.module9;

public class Trumpet extends Instrument {
        public Trumpet(String name,String instrumentType, int productCode){
        super(name,instrumentType,productCode);
    }

    @Override
    public String toString() {
        if (getName() != null && getInstrumentType() != null && getProductCode() != 0)
        return "|     " + getName() + "     |      " + getInstrumentType()+ "    |     " + getProductCode()+ "     |";
        return TRUMPET;
    }
}
