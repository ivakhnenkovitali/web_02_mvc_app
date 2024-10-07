package by.tasksLaba.stream.bigTask;

public class Flat {
    private int id;
    private String address;
    private double area;
    private int price;

    public Flat() {
    }

    public Flat(int id, String address, double area, int price) {
        this.id = id;
        this.address = address;
        this.area = area;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flat{");
        sb.append("id=").append(id);
        sb.append(", address='").append(address).append('\'');
        sb.append(", area=").append(area);
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
