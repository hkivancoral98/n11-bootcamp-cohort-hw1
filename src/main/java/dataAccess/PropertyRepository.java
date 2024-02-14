package dataAccess;

import entity.Cottage;
import entity.House;
import entity.Villa;

import java.util.List;

public interface PropertyRepository {
    List<House> getHouseList();

    List<Villa> getVillaList();

    List<Cottage> getCottageList();
}
