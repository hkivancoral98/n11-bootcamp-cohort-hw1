package service;

import entity.*;

import java.util.ArrayList;
import java.util.List;

public class PropertyService {

    private final List<House> houses;
    private final List<Cottage> cottages;
    private final List<Villa> villas;

    public PropertyService(List<House> houses, List<Cottage> cottages, List<Villa> villas) {
        this.houses = houses;
        this.cottages = cottages;
        this.villas = villas;
    }

    public int getTotalHousePrice() {
        return houses.stream().mapToInt(House::getPrice).sum();
    }

    public int getTotalVillaPrice() {
        return villas.stream().mapToInt(Villa::getPrice).sum();
    }

    public int getTotalCottagePrice() {
        return cottages.stream().mapToInt(Cottage::getPrice).sum();
    }

    public int getTotalPropertyPrice() {
        return getTotalHousePrice() + getTotalVillaPrice() + getTotalCottagePrice();
    }

    public double getAverageHouseSize() {
        return houses.stream().mapToDouble(House::getSize).average().orElse(0);
    }

    public double getAverageVillaSize() {
        return villas.stream().mapToDouble(Villa::getSize).average().orElse(0);
    }

    public double getAverageCottageSize() {
        return cottages.stream().mapToDouble(Cottage::getSize).average().orElse(0);
    }

    public double getTotalHouseSize() {
        return houses.stream().mapToDouble(House::getSize).sum();
    }

    public double getTotalVillaSize() {
        return villas.stream().mapToDouble(Villa::getSize).sum();
    }

    public double getTotalCottageSize() {
        return cottages.stream().mapToDouble(Cottage::getSize).sum();
    }

    public double getAveragePropertySize() {
        return (getTotalHouseSize() + getTotalVillaSize() + getTotalCottageSize())
                / (houses.size() + villas.size() + cottages.size());
    }

    public List<Object> filterByRoomAndSaloon(int roomCount, int saloonCount) {
        List<Object> filteredProperties = new ArrayList<>();

        filteredProperties.addAll(houses.stream()
                .filter(house -> house.getNumOfRoom() == roomCount && house.getNumOfSaloon() == saloonCount)
                .toList());

        filteredProperties.addAll(villas.stream()
                .filter(villa -> villa.getNumOfRoom() == roomCount && villa.getNumOfSaloon() == saloonCount)
                .toList());

        filteredProperties.addAll(cottages.stream()
                .filter(cottage -> cottage.getNumOfRoom() == roomCount && cottage.getNumOfSaloon() == saloonCount)
                .toList());

        return filteredProperties;
    }

}
