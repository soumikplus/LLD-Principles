package SingleResponsibilityPrinciple.Example1.BetterCode;

public class Employee {
    private final int employeeId;

    public Employee(int id){
        this.employeeId = id;
    }
    public int getEmployeeId(){
        return employeeId;
    }
}
