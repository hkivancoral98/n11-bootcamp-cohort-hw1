import java.util.List;
import db.PropertyData;
import service.PropertyService;

public class App {
    public static void main(String[] args) {
        PropertyData propData = new PropertyData();
        PropertyService propService = new PropertyService(propData.getHouseList(), propData.getCottageList(), propData.getVillaList());

        System.out.println("Toplam Ev Fiyatı: " + propService.getTotalHousePrice());
        System.out.println("Toplam Villa Fiyatı: " + propService.getTotalVillaPrice());
        System.out.println("Toplam Yazlık Fiyatı: " + propService.getTotalCottagePrice());
        System.out.println("Toplam Mülk Fiyatı: " + propService.getTotalPropertyPrice());

        System.out.println("Ortalama Ev Metrekaresi: " + propService.getAverageHouseSize());
        System.out.println("Ortalama Villa Metrekaresi: " + propService.getAverageVillaSize());
        System.out.println("Ortalama Yazlık Metrekaresi: " + propService.getAverageCottageSize());
        System.out.println("Ortalama Mülk Metrekaresi: " + propService.getAveragePropertySize());

        int roomCountFilter = 3;
        int saloonCountFilter = 2;

        List<Object> filteredProperties = propService.filterByRoomAndSaloon(roomCountFilter, saloonCountFilter);
        System.out.println(roomCountFilter + " odalı ve " + saloonCountFilter + " salonlu mülkler: " + filteredProperties);
    }
}