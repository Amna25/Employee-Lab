package management;

public class Director extends Manager{

    private int budget;

    public Director(String name, String niNumber, int salary, String deptName, int budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public int getBudget() {
        return budget;
    }

    public int payBonus(){
        return (this.salary/100) * 2;
    }
}
