package DesignPatterns.Pattern1.BetterCode.Solution2;

import java.util.List;

public class Builder {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    Builder(){

    }

    public String getName(){
        return this.name;
    }
    public int getPrice(){
        return this.price;
    }
    public String getDesc(){
        return this.desc;
    }
    // ....
    public void setPrice(int price){
        if(price<0) return;
        this.price = price;
    }
    public void setBrand(String brand){
        this.category = category;
    }
    //.....



}
