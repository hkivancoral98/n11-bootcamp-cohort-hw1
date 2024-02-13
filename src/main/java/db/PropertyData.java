package db;

import entity.*;
import java.util.ArrayList;
import java.util.List;

public class PropertyData {

    private final List<House> houses = new ArrayList<>();
    private final List<Villa> villas = new ArrayList<>();
    private final List<Cottage> cottages = new ArrayList<>();

    public PropertyData() {

        House house1 = new House(200000, 3, 1, 120);
        House house2 = new House(250000, 4, 2, 150);
        House house3 = new House(220000, 3, 2, 150);

        Villa villa1 = new Villa(500000, 5, 2, 230);
        Villa villa2 = new Villa(700000, 6, 3, 310);
        Villa villa3 = new Villa(600000, 4, 2, 310);

        Cottage cottage1 = new Cottage(150000, 3, 1, 110);
        Cottage cottage2 = new Cottage(200000, 3, 2, 160);
        Cottage cottage3 = new Cottage(300000, 4, 2, 160);

        houses.add(house1);
        houses.add(house2);
        houses.add(house3);

        villas.add(villa1);
        villas.add(villa2);
        villas.add(villa3);

        cottages.add(cottage1);
        cottages.add(cottage2);
        cottages.add(cottage3);
    }

    public List<House> getHouseList(){
        return houses;
    }

    public List<Villa> getVillaList(){
        return villas;
    }

    public List<Cottage> getCottageList(){
        return cottages;
    }


}
