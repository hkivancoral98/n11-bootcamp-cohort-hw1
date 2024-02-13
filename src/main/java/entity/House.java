package entity;

public class House extends Property {
    public House(int price, int numOfRoom, int numOfSaloon, int size) {
        super(price, numOfRoom, numOfSaloon, size);
    }

    @Override
    public String toString(){
        return "Ev | Oda Sayısı:" + getNumOfRoom() + " Salon Sayısı:" + getNumOfSaloon() + " Metrekare:" +
                getSize() +  " Fiyat:" + getPrice();
    }
}
