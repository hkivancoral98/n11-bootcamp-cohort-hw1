import java.util.List;

import dataAccess.PropertyRepository;
import dataAccess.PropertyRepositoryImpl;
import service.PropertyService;
import service.PropertyServiceImpl;

public class App {
    public static void main(String[] args) {
        PropertyRepository propertyRepository = new PropertyRepositoryImpl();
        PropertyService propertyService = new PropertyServiceImpl(propertyRepository);

        System.out.println("Toplam Ev Fiyatı: " + propertyService.getTotalHousePrice());
        System.out.println("Toplam Villa Fiyatı: " + propertyService.getTotalVillaPrice());
        System.out.println("Toplam Yazlık Fiyatı: " + propertyService.getTotalCottagePrice());
        System.out.println("Toplam Mülk Fiyatı: " + propertyService.getTotalPropertyPrice());

        System.out.println("\nOrtalama Ev Metrekaresi: " + propertyService.getAverageHouseSize());
        System.out.println("Ortalama Villa Metrekaresi: " + propertyService.getAverageVillaSize());
        System.out.println("Ortalama Yazlık Metrekaresi: " + propertyService.getAverageCottageSize());
        System.out.println("Ortalama Mülk Metrekaresi: " + propertyService.getAveragePropertySize());

        int roomCountFilter = 4;
        int saloonCountFilter = 2;

        List<Object> filteredProperties = propertyService.filterByRoomAndSaloon(roomCountFilter, saloonCountFilter);

        if(filteredProperties.isEmpty()){
            System.out.println("\nAradığınız kriterlere uygun bir mülk bulunamadı.");
        }
        else{
            System.out.println("\n" + roomCountFilter + " odalı ve " + saloonCountFilter + " salonlu mülkler: " + filteredProperties);
        }

    }
}