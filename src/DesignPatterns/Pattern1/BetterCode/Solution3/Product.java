package DesignPatterns.Pattern1.BetterCode.Solution3;
//import DesignPatterns.GFGExamples.BuilderDP.Example1.Builder;
import DesignPatterns.Pattern1.BetterCode.Solution2.Builder;

import java.util.List;
import java.util.Locale;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    private Product(Builder b){
        if(b.getPrice() > 0) {
            this.price = b.getPrice();
        }

        this.name = b.getName();
        this.price = b.getPrice();
//        this.brand = b.getBrand();
        this.desc = b.getDesc();
//        this.createdAt = b.getCreatedAt();
//        this.updatedAt = b.getUpdatedAt();
//        this.images = b.getImages();
    }
    // returning new Builder()
    public static Builder getBuilder(){
        return new Builder();
    }

    // Builder Class (public static)
    public static class Builder{
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
        public Product build(){
            return new Product(this);
        }

        public String getName() {
            return this.name;
        }

        public int getPrice() {
            return this.price;
        }

        public String getDesc() {
            return this.desc;
        }
        //        .....

        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setImages(List<String>images){
            this.images = images;
            return this;
        }
        public Builder setPrice(int price){
            if(price>0){
                this.price = price;
                return this;
            }
            return null;
        }
        public Builder setBrand(String brand){
            this.brand = brand;
            return this;
        }

        // .....
    }

}
