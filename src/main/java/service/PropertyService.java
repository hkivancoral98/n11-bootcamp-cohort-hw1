package service;

import java.util.List;

public interface PropertyService {
    int getTotalHousePrice();

    int getTotalVillaPrice();

    int getTotalCottagePrice();

    int getTotalPropertyPrice();

    double getAverageHouseSize();

    double getAverageVillaSize();

    double getAverageCottageSize();

    double getTotalHouseSize();

    double getTotalVillaSize();

    double getTotalCottageSize();

    double getAveragePropertySize();

    List<Object> filterByRoomAndSaloon(int roomCount, int saloonCount);
}
