package Kapsülleme;

public class Product {
    private  int id;
    private  String name;
    private  double price;
    private String Des;

    public Product(String _name, int _id, double _price, String _des) {
        setName(_name);
        setId(id);
        setPrice(_price);
        setDes(_des);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



}
