package DesignPatterns.GFGExamples.BuilderDP.Example2;

public class Student {
    private int id;
    private String name;
    private String address;

    private Student(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }
    //override toString method
    @Override
    public String toString(){
        return name+" "+id+" "+address;
    }

    // static inner builder class

    public static class Builder {
        private int id;
        private String name;
        private String address;

        private Builder(){
            // Hide Constructor
        }
        public static Builder newInstance(){
            return new Builder();
        }

        public Builder setId(int id){
            this.id = id;
            return this;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setAddress(String address){
            this.address = address;
            return this;
        }
        public Student build(){
            return new Student(this);
        }


    }
}
