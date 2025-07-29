package SingleResponsibilityPrinciple.Example1.ProblematicCode;

public class Employee {
    private int id;
    public int getId(){
        return this.id;
    }
    public String fetchBioData(){
        return "Bio Data";
    }
    public double calculateSalary(){
        return 0;
    }
    public void printPerformanceData(){
        System.out.println("Performance related data");
    }
}
