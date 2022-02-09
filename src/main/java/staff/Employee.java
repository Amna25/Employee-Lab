package staff;

public class Employee {
    private String name;
    private String niNumber;
    private int salary;

    public Employee(String name, String niNumber, int salary){
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }
    public String getName(){
        return this.name;
    }

    public String getNiNumber(){
        return this.niNumber;
    }
    public int getSalary(){
        return this.salary;
    }
    public void raiseSalary(Double increase) {
        this.salary *=increase;
    }

    public int payBonus(){
        return (this.salary / 100);
    }
}
