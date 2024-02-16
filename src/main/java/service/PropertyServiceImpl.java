package service;

import dataAccess.PropertyRepository;
import entity.*;

import java.util.ArrayList;
import java.util.List;

public class PropertyServiceImpl implements PropertyService {

    PropertyRepository propertyRepository;

    public PropertyServiceImpl(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public int getTotalHousePrice() {
        return propertyRepository.getHouseList().stream().mapToInt(House::getPrice).sum();
    }

    @Override
    public int getTotalVillaPrice() {
        return propertyRepository.getVillaList().stream().mapToInt(Villa::getPrice).sum();
    }

    @Override
    public int getTotalCottagePrice() {
        return propertyRepository.getCottageList().stream().mapToInt(Cottage::getPrice).sum();
    }

    @Override
    public int getTotalPropertyPrice() {
        return getTotalHousePrice() + getTotalVillaPrice() + getTotalCottagePrice();
    }

    @Override
    public double getAverageHouseSize() {
        return propertyRepository.getHouseList().stream().mapToDouble(House::getSize).average().orElse(0);
    }

    @Override
    public double getAverageVillaSize() {
        return propertyRepository.getVillaList().stream().mapToDouble(Villa::getSize).average().orElse(0);
    }

    @Override
    public double getAverageCottageSize() {
        return propertyRepository.getCottageList().stream().mapToDouble(Cottage::getSize).average().orElse(0);
    }

    @Override
    public double getTotalHouseSize() {
        return propertyRepository.getHouseList().stream().mapToDouble(House::getSize).sum();
    }

    @Override
    public double getTotalVillaSize() {
        return propertyRepository.getVillaList().stream().mapToDouble(Villa::getSize).sum();
    }

    @Override
    public double getTotalCottageSize() {
        return propertyRepository.getCottageList().stream().mapToDouble(Cottage::getSize).sum();
    }

    @Override
    public double getAveragePropertySize() {
        return (getTotalHouseSize() + getTotalVillaSize() + getTotalCottageSize())
                / (propertyRepository.getHouseList().size() + propertyRepository.getVillaList().size() + propertyRepository.getCottageList().size());
    }

    @Override
    public List<Object> filterByRoomAndSaloon(int roomCount, int saloonCount) {
        List<Object> filteredProperties = new ArrayList<>();

        filteredProperties.addAll(propertyRepository.getHouseList().stream()
                .filter(house -> house.getNumOfRoom() == roomCount && house.getNumOfSaloon() == saloonCount)
                .toList());

        filteredProperties.addAll(propertyRepository.getVillaList().stream()
                .filter(villa -> villa.getNumOfRoom() == roomCount && villa.getNumOfSaloon() == saloonCount)
                .toList());

        filteredProperties.addAll(propertyRepository.getCottageList().stream()
                .filter(cottage -> cottage.getNumOfRoom() == roomCount && cottage.getNumOfSaloon() == saloonCount)
                .toList());

        return filteredProperties;
    }

}
