public class Shareholding extends Asset {

    private  int numHeld;

    public Shareholding(String name, Money price, int numHeld) {
        super(name, price);

        this.numHeld = numHeld;

    }

    public int getNumHeld() {
        return numHeld;
    }

    public void changeShareprice(Money changePrice) {

        price = changePrice;
    }

    public void changeNumHeld(int numHeld){

        this.numHeld = numHeld;
    }


}


