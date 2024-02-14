package service;

import entity.*;

import java.util.ArrayList;
import java.util.List;

public class PropertyServiceImpl implements PropertyService {

    private final List<House> houses;
    private final List<Cottage> cottages;
    private final List<Villa> villas;

    public PropertyServiceImpl(List<House> houses, List<Cottage> cottages, List<Villa> villas) {
        this.houses = houses;
        this.cottages = cottages;
        this.villas = villas;
    }

    @Override
    public int getTotalHousePrice() {
        return houses.stream().mapToInt(House::getPrice).sum();
    }

    @Override
    public int getTotalVillaPrice() {
        return villas.stream().mapToInt(Villa::getPrice).sum();
    }

    @Override
    public int getTotalCottagePrice() {
        return cottages.stream().mapToInt(Cottage::getPrice).sum();
    }

    @Override
    public int getTotalPropertyPrice() {
        return getTotalHousePrice() + getTotalVillaPrice() + getTotalCottagePrice();
    }

    @Override
    public double getAverageHouseSize() {
        return houses.stream().mapToDouble(House::getSize).average().orElse(0);
    }

    @Override
    public double getAverageVillaSize() {
        return villas.stream().mapToDouble(Villa::getSize).average().orElse(0);
    }

    @Override
    public double getAverageCottageSize() {
        return cottages.stream().mapToDouble(Cottage::getSize).average().orElse(0);
    }

    @Override
    public double getTotalHouseSize() {
        return houses.stream().mapToDouble(House::getSize).sum();
    }

    @Override
    public double getTotalVillaSize() {
        return villas.stream().mapToDouble(Villa::getSize).sum();
    }

    @Override
    public double getTotalCottageSize() {
        return cottages.stream().mapToDouble(Cottage::getSize).sum();
    }

    @Override
    public double getAveragePropertySize() {
        return (getTotalHouseSize() + getTotalVillaSize() + getTotalCottageSize())
                / (houses.size() + villas.size() + cottages.size());
    }

    @Override
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
