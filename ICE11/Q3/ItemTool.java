import java.util.*;

public class ItemTool {
  
  public static List<InventoryItem> getAllInventoryItemsLighterThan(List<InventoryItem> items, double weight){
    List<InventoryItem> lightItems = new ArrayList<>();
    if (items == null || items.size() == 0){
      return lightItems;
    }
    for (InventoryItem item : items){
      if (item.getWeight() < weight){
        lightItems.add(item);
      }
    }
    return lightItems;
  }

  public static List<Magazine> getAllMagazines(InventoryItem[] items){
    List<Magazine> allMagazines = new ArrayList<>();

    if (items == null || items.length == 0){
      return allMagazines;
    }
    for (InventoryItem item : items){
      if (item instanceof Magazine){
        Magazine tempMagazine = (Magazine) item;
        allMagazines.add(tempMagazine);
      }
    }
    return allMagazines;
  }

  public static List<InventoryItem> getAllNonBooksOfCategory(InventoryItem[] items, char category){
    List<InventoryItem> nonBooksOfCategory = new ArrayList<>();

    if (items == null || items.length == 0){
      return nonBooksOfCategory;
    }

    for (InventoryItem item : items){
      if (!(item instanceof Book)){
        if (item.getCategory() == category){
          nonBooksOfCategory.add(item);
        }
      }
    }
    return nonBooksOfCategory;
  }

  public static Laptop[] getAllLaptopsWithNumCpuGreaterThan(Map<String, InventoryItem> map, int numCpu){
    if (map == null || map.size() == 0){
      return new Laptop[0];
    }
    List<Laptop> laptopList = new ArrayList<>();

    for (Map.Entry<String, InventoryItem> entry : map.entrySet()) {
    // System.out.println(entry.getKey() + "/" + entry.getValue());
      InventoryItem tempItem = entry.getValue();
      if (tempItem instanceof Laptop){
        Laptop tempLaptop = (Laptop) tempItem;
        if (tempLaptop.getNumCpu() > numCpu){
          laptopList.add(tempLaptop);
        }
      }
    }
    Laptop[] laptopArr = laptopList.toArray(new Laptop[0]);
    return laptopArr;
  }
}
