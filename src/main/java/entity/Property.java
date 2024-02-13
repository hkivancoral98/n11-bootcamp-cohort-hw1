package entity;

public class Property {
    private final int price;
    private final int numOfRoom;
    private final int numOfSaloon;
    private final int size;

    public Property(int price, int numOfRoom, int numOfSaloon, int size) {
        this.price = price;
        this.numOfRoom = numOfRoom;
        this.numOfSaloon = numOfSaloon;
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public int getNumOfRoom() {
        return numOfRoom;
    }

    public int getNumOfSaloon() {
        return numOfSaloon;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Property{" +
                "price=" + price +
                ", numOfRoom=" + numOfRoom +
                ", numOfSaloon=" + numOfSaloon +
                ", size=" + size +
                '}';
    }
}
