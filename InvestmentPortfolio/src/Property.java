public class Property {

    private String ownerName;
    private String address;
    private int propertyValue;

    public Property(String ownerName, String address, int propertyValue) {
        this.ownerName = ownerName;
        this.address = address;
        this.propertyValue = propertyValue;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(int propertyValue) {
        this.propertyValue = propertyValue;
    }

}
