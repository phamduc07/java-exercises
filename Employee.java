package bangluongnhanvien;

public class Employee {
    protected int id;
    protected String Name;
    protected double baseSalary;
    public Employee(int id, String Name , double baseSalary){
        this.id=id;
        this.Name=Name;
        this.baseSalary=baseSalary;
        
    }
    public String getName(){
        return Name;
    }
    public double salary(){
        return baseSalary;
        }
    }
    class FullTimeEmployee extends Employee{
        private double allowance;
        public FullTimeEmployee(int id, String Name, double baseSalary, double allowance){
            super(id,Name,baseSalary);
            this.allowance=allowance;
        }
        @Override
        public double salary(){
            return super.baseSalary +this.allowance;
            
        }
        @Override
        public String toString(){
            return "Id "+ this.id+" | "+"Name"+this.Name+" | "+"Salary "+this.salary();
        }
}
class Intern extends Employee{
    private String School;
    public Intern(int id, String Name, int baseSalary,String School) {
        super(id, Name, baseSalary);
        this.School=School;
    }
    @Override
    public double salary(){
        super.salary();
        return 0.7* super.baseSalary;
    }
    @Override
        public String toString(){
            return "Id "+ this.id+" | "+"Name "+this.Name+" | "+"Salary "+this.salary();
        }
}

