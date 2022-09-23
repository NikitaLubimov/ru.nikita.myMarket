

public class Product {
    private String title;
    private int id;
    private float price;

    public Product(String title, int id, float price) {
        this.title = title;
        this.id = id;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Name: " + title + ". Id: " + id + ". Price: " + price + ".";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
