package model;

public class Tea {
    private String teaName;
    private int price;
    private String color;

    public Tea(String teaName, int price, String color) {
        this.teaName = teaName;
        this.price = price;
        this.color = color;
    }

    public void showInformation(){
        System.out.println("============");
        System.out.println("Tea Name: " + this.teaName);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
    }

    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
