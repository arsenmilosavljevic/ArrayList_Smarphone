
//Importo la classe ArrayList
import java.util.ArrayList;

public class MagazzinoSmartphone {
    private ArrayList<Smartphone> smartphones = new ArrayList<>();
    private int count;

    public MagazzinoSmartphone() {
        smartphones = new ArrayList<>(10); // Assuming initial capacity of 10
        count = 0;
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
        this();
        smartphones.addAll(other.smartphones);
        count = other.count;
    }

    public void addSmartphone(Smartphone smartphone) {
        int i=0;
        boolean trovato=false;
        while(i<smartphones.size() && !trovato){
            if(smartphones.get(i).equals(smartphone)){
                trovato=true;

            }
            i++;
        }
        if(trovato==false){
            smartphones.add(smartphone);
            count++;
        }

    }

    /*public void removeSmartphone(Smartphone smartphone) {
        int i = 0;
        boolean trovato = false;
        while (i < getCount() && !trovato) {
            if (smartphones.get(i).equals(smartphone)) {
                smartphones.remove(i);
                trovato = true;
                count--;
            }
            i++;
        }
    }*/
    public void removeSmartphone(Smartphone smartphone){
        if(smartphone!=null){
        smartphones.remove(smartphone);
        }
    }

    public Smartphone[] getSmartphonesArray() {
        Smartphone[] smartphoneArray = new Smartphone[count];
        System.arraycopy(smartphones, 0, smartphoneArray, 0, count);
        return smartphoneArray;
    }

    public Smartphone getSmartphoneByBrand(String brand) {
        Smartphone smartphone = null;
        int i = 0;
        boolean trovato = false;
        while (i < smartphones.size() && !trovato) {
            if (smartphones.get(i).getBrand().toLowerCase().contains(brand.toLowerCase())) {
                smartphone = smartphones.get(i);
                trovato = true;
            }
            i++;
        }

        return smartphone;
    }

    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        int i = 0;
        boolean trovato = false;
        while (i < smartphones.size() && !trovato) {
            if (smartphones.get(i).getStorageCapacity() == storageCapacity) {
                magazzinoSmartphone.addSmartphone(smartphones.get(i));
                trovato = true;
            }
            i++;
        }
        return magazzinoSmartphone;
    }

    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        int i = 0;
        while (i < smartphones.size()) {
            if (smartphones.get(i).getPrice()<=maxPrice && smartphones.get(i).getPrice()>=minPrice) {
                magazzinoSmartphone.addSmartphone(smartphones.get(i));
            }
            i++;
        }
        return magazzinoSmartphone;
    }

    @Override
    public String toString() {
        String result = "\nMagazzinoSmartphone:\n";
        for (int i = 0; i < smartphones.size(); i++) {
            if (smartphones.get(i) != null) {
                result += "Brand: " + smartphones.get(i).getBrand() + ", Model: " + smartphones.get(i).getModel()
                        + ", Storage Capacity: " + smartphones.get(i).getStorageCapacity() + "GB, Price: "
                        + smartphones.get(i).getPrice() + "\n";
            }

        }
        return result;
    }

    public int getCount() {
        return count;
    }

    public boolean equals(Object obj) {
        boolean s = false;
        if (smartphones.equals(((MagazzinoSmartphone) obj).smartphones)) {
            s = true;
        }
        return s;
    }

}