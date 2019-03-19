package Final;

public class Book {
    private String id;
    private String name;
    private Double price;

    public Book(String id, String name, Double price) {
        this.id= id;
        this.name = name;
        this.price = price;
    }

    public Book(int id, String name, int price) {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
