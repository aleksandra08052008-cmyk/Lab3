import java.util.Objects;


public class Cosmetic {

    private String name;
    private String brand;
    private double price;
    private int volume;
    private int rating;

    public Cosmetic(String name, String brand, double price, int volume, int rating) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.volume = volume;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cosmetic)) return false;
        Cosmetic cosmetic = (Cosmetic) o;
        return Double.compare(price, cosmetic.price) == 0 &&
                volume == cosmetic.volume &&
                rating == cosmetic.rating &&
                Objects.equals(name, cosmetic.name) &&
                Objects.equals(brand, cosmetic.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, brand, price, volume, rating);
    }

    @Override
    public String toString() {
        return name + " " + brand + " " + price + " " + volume + " " + rating;
    }
}
