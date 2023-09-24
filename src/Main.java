public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Иванов Иван Иванович", 50000, 1);
        employees[1] = new Employee("Сидоров Петр Олегович", 60000, 1);
        employees[2] = new Employee("Петров Владимир Максимович", 100000, 2);
        employees[3] = new Employee("Леонидов Игорь Михайлович", 200000, 2);
        employees[4] = new Employee("Максимов Алексей Алексеевич", 220000, 3);
        employees[5] = new Employee("Денисов Дмитрий Денисович", 250000, 3);
        employees[6] = new Employee("Еремин Александр Дмитриевич", 250000, 3);
        employees[7] = new Employee("Маравецкий Олег Васильевич", 300000, 4);
        employees[8] = new Employee("Казанцев Вадим Юрьевич", 350000, 4);
        employees[9] = new Employee("Пономарев Алексей Макарович", 500000, 5);

        printEmployee(employees);

        checkTotalSalary(employees);

        Employee employeeMinSalary = checkMinSalary(employees);
        System.out.println("Минимальная зарплата: " + employeeMinSalary);

        Employee employeeMaxSalary = checkMaxSalary(employees);
        System.out.println("Максимальная зарплата: " + employeeMaxSalary);

        int mediumSalary = findMediumSalary(employees);
        System.out.println("Средняя зарплата " + mediumSalary);

        printFullName(employees);



    }

    private static void printEmployee(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int checkTotalSalary(Employee[] employees) {
        int salarySum = 0;
        for (Employee employee : employees) {
            salarySum += employee.getSalary();
        }
        System.out.println("Сумма зарплат " + salarySum);
        return salarySum;
    }

    private static Employee checkMinSalary(Employee[] employees) {
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < employees[index].getSalary()) {
                index = i;
            }
        }
        return employees[index];
    }

    private static Employee checkMaxSalary(Employee[] employees) {
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > employees[index].getSalary()) {
                index = i;
            }
        }
        return employees[index];
    }

    private static int findMediumSalary(Employee[] employees) {
        int sum = checkTotalSalary(employees);
        int mediumSalary = sum / employees.length;
        return mediumSalary;
    }

    private static void printFullName(Employee[] employees){
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}