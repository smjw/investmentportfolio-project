import java.util.HashMap;

public class Portfolio {
    private HashMap<String, Asset> assets = new HashMap();

    public void add(Asset s) {
        if (assets.containsKey(s.getName())) {
            if(assets.get(s.getName()) instanceof Shareholding && s instanceof Shareholding) {
                Shareholding old = (Shareholding) assets.get(s.getName());
                Shareholding newShare = (Shareholding) s;
                newShare.changeNumHeld(newShare.getNumHeld() + old.getNumHeld());
            }
        }
        assets.put(s.getName(), s);
    }

    public Asset getByName(String k) {
        return assets.get(k);
    }

    public Money getTotalValue() {
        Money total = new Money(0);
        for (Asset s : assets.values()) {
            total = total.addToValue(s.getPrice());
        }
        return total;
    }

 }
