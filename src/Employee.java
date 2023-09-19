public class Employee {

    private String fullName;

    private int salary;

    private int departament;

    private int id;

    private static int generateId = 0;

    public Employee(String fullName, int salary, int departament) {
        this.fullName = fullName;
        this.salary = salary;
        this.departament = departament;

        id = generateId;
        generateId += generateId;
    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDepartament() {
        return departament;
    }

    public int getId() {
        return id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    public String toString() {
        return "fullmane " + fullName + " salary " + salary + " department " + departament + " id " + generateId;
    }
}
