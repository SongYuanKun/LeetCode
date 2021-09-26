import java.io.Serializable;
import java.util.Locale;

public class Product implements Serializable {
    public Product() {
    }

    public Product(String name, float price, float weight, float volumn) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.volumn = volumn;
    }

    private String name;
    private float price;
    private float weight;
    private float volumn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getVolumn() {
        return volumn;
    }

    public void setVolumn(float volumn) {
        this.volumn = volumn;
    }

    @Override
    public String toString() {
        return String.format(Locale.ENGLISH, "name: %s, price: %.2f, weight: %.2f, volumn: %.2f",
                this.name, this.price, this.weight, this.volumn);
    }

}