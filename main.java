package bangluongnhanvien;
public class main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
    employees[0] = new FullTimeEmployee(1, "An", 10000000, 2000000);
    employees[1] = new Intern(2, "Binh", 5000000, "PTIT");      
        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println("Luong Tong = "+""+employees[0].salary()+employees[1].salary());
    }
    
}
