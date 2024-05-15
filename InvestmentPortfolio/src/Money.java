public class Money {
    private enum Currency {
        STERLING("£"),
        DOLLAR("$"),
        EURO("c");
        private String moneyType;
        private Currency(String n) {
            moneyType = n;
        }
    }

    private int value;


    public Money(int value) {

        this.value = value;
    }


    public void addValue(int newmoney) {

        value += newmoney;
    }

    public void percentChange(int percent) {

        value += value * (percent / 100);
    }

    public int getValue() {

        return value;
    }

    public Money addToValue(Money a) {
        return (new Money(this.value+a.value));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money sterling = (Money) o;
        return value == sterling.value;
    }


}


