public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private double price;

    public Smartphone() {

    }

    public Smartphone(String brand, String model, int storageCapacity, double price) {
        setModel(model);
        setBrand(brand);
        setPrice(price);
        setStorageCapacity(storageCapacity);
    }

    public Smartphone(Smartphone other) {
        this(other.brand, other.model, other.storageCapacity, other.price);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Storage Capacity: " + storageCapacity
                + "GB, Price: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        boolean s = false;
        if (brand.equals(((Smartphone) obj).getBrand()) 
                && model.equals(((Smartphone) obj).getModel())
                && storageCapacity == ((Smartphone) obj).getStorageCapacity()
                && price == ((Smartphone) obj).getPrice()) {
            s = true;
        }
        return s;
    }

}
