package DesignPatterns.GFGExamples.BuilderDP.Example2;

public class Client {
    public static void main(String[] args) {
//        Student s = new Student.Builder().setId(115).setName("Soumajit").setAddress("Bisarpara").build();
//        System.out.println(s.toString());
        Student s = Student.Builder.newInstance().setId(115).setName("Soumajit").setAddress("Bisarpara").build();
        System.out.println(s.toString());
    }
}
