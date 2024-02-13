package entity;

public class Villa extends Property{
    public Villa(int price, int numOfRoom, int numOfSaloon, int size) {
        super(price, numOfRoom, numOfSaloon, size);
    }

    @Override
    public String toString(){
        return "Villa | Oda Sayısı:" + getNumOfRoom() + " Salon Sayısı:" + getNumOfSaloon() + " Metrekare:" +
                getSize() +  " Fiyat:" + getPrice();
    }
}
