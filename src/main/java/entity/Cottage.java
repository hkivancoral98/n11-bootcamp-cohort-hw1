package entity;

public class Cottage extends Property{
    public Cottage(int price, int numOfRoom, int numOfSaloon, int size) {
        super(price, numOfRoom, numOfSaloon, size);
    }

    @Override
    public String toString(){
        return "Yazlık | Oda Sayisi:" + getNumOfRoom() + " Salon Sayısı:" + getNumOfSaloon() + " Metrekare:" +
                getSize() +  " Fiyat:" + getPrice();
    }
}
