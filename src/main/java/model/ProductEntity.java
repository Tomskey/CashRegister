package model;

public class ProductEntity {

    String name;

    Double price;

    Integer barCode;


    public ProductEntity(String name, Double price, Integer barCode) {
        this.name = name;
        this.price = price;
        this.barCode = barCode;
    }

    public ProductEntity(){

    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
