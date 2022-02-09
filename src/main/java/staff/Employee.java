package staff;

public class Employee {
    public String name;
    private String niNumber;
    public  int salary;

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

    public String  raiseSalary(Double increase) {
        if(increase < 0){
            return "can not enter negative value";
        }
        this.salary *= increase;
        return null;
    }

    public int payBonus(){
        return (this.salary / 100);
    }

    public String inputName(String newName){
        if(newName == ""){
            return "can't be empty";
        }
        this.name = newName;
        return null;
    }
}
