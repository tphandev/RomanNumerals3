public enum  RomanNumralsEnum {
    I("I",1), V("V",5), X("X",10), L("L",50),C("C",100),D("D",500),M("M",1000);

    private String symbol;
    private int value;

    private RomanNumralsEnum(String symbol,int value){
        this.setSymbol(symbol);
        this.setValue(value);
    }

    public static int getValuebySymbol(String symbol) {
        for (RomanNumralsEnum number : RomanNumralsEnum.values()) {
            if (number.symbol.equals(symbol)) {
                return number.getValue();
            }
        }
        return 0;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
