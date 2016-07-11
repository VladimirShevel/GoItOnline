package vshevel.goit.module9;


public abstract class Instrument {
    public final static String PIANO = "Piano";
    public static final String GUITAR = "Guitar";
    public final static String TRUMPET = "Trumpet";
    private String name, instrumentType;
    private int productCode;

    public String getName() {
        return name;
    }
    public String getInstrumentType() {
        return instrumentType;
    }
    public int getProductCode() {
        return productCode;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    public Instrument(String name,String instrumentType, int productCode){
        this.name = name;
        this.instrumentType = instrumentType;
        this.productCode = productCode;
    }
    //прнимаем товар
    static Guitar guitar1 = new Guitar("guitar12", GUITAR, 1121);
    static Instrument guitar2 = new Guitar("guitar02", GUITAR, 4102);
    static Instrument guitar3 = new Guitar("guitar06", GUITAR, 1003);
    static Instrument guitar4 = new Guitar("guitar04", GUITAR, 3184);
    static Instrument guitar5 = new Guitar("guitar14", GUITAR, 1155);
    static Instrument guitar6 = new Guitar("guitar03", GUITAR, 1006);
    static Instrument guitar7 = new Guitar("guitar11", GUITAR, 2567);
    static Instrument guitar8 = new Guitar("guitar15", GUITAR, 1008);
    static Instrument guitar9 = new Guitar("guitar16", GUITAR, 4579);
    static Instrument guitar10 = new Guitar("guitar10", GUITAR, 1010);
    static Instrument guitar11 = new Guitar("guitar07", GUITAR, 1011);
    static Instrument guitar12 = new Guitar("guitar01", GUITAR, 1012);
    static Instrument guitar13 = new Guitar("guitar13", GUITAR, 5513);
    static Instrument guitar14 = new Guitar("guitar05", GUITAR, 5114);
    static Instrument guitar15 = new Guitar("guitar08", GUITAR, 9835);
    static Instrument guitar16 = new Guitar("guitar09", GUITAR, 1416);

    static Instrument trumpet1 = new Trumpet("trumpet1", TRUMPET, 6001);
    static Instrument trumpet2 = new Trumpet("trumpet2", TRUMPET, 5602);
    static Instrument trumpet3 = new Trumpet("trumpet3", TRUMPET, 3003);
    static Instrument trumpet4 = new Trumpet("trumpet4", TRUMPET, 8004);
    static Instrument trumpet5 = new Trumpet("trumpet5", TRUMPET, 3005);
    static Instrument trumpet6 = new Trumpet("trumpet6", TRUMPET, 3006);
    static Instrument trumpet7 = new Trumpet("trumpet7", TRUMPET, 3890);

    static Piano piano1 = new Piano("piano1", PIANO, 2981);
    static Piano piano2 = new Piano("piano2", PIANO, 2042);
}
