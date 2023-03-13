public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee("Иванов Иван Иванович", 1, 60_000);
        employee[1] = new Employee("Петров Петр Петрович", 2, 70_000);
        employee[2] = new Employee("Сидоров Сидор Сидорович", 3, 80_000);
        employee[3] = new Employee("Семенов Семен Семенович", 4, 90_000);
        employee[4] = new Employee("Максимов Максим Максимович", 5, 100_000);
        employee[5] = new Employee("Алексеев Алексей Алексеевич", 1, 110_000);
        employee[6] = new Employee("Степанов Степан Степанович", 2, 120_000);
        employee[7] = new Employee("Федоров Федор Федорович", 3, 130_000);
        employee[8] = new Employee("Павлов Павел Павлович", 4, 140_000);
        employee[9] = new Employee("Александров Александр Александрович", 5, 150_000);

        System.out.println();
        printListDataAllEmployees(employee);
        System.out.println();

        calculateAllSalaries(employee);
        findMinSalary(employee);
        findMaxSalary(employee);
        calculateAverageSalary(employee);

        System.out.println();
        printAllEmployees(employee);
    }

    public static void printListDataAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateAllSalaries(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalaryStaff();
        }
        System.out.println("Сумма затрат на зарплаты в месяц = " + sum + " руб.");
        return sum;
    }

    public static void findMinSalary(Employee[] employees) {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (min.getSalaryStaff() > employee.getSalaryStaff())
                min = employee;
        }
        System.out.println("Cотрудник с минимальной зарплатой: " + min.getStaff() +
                " (зарплата = " + min.getSalaryStaff() + " руб, департамент №" + min.getDepartment() + ").");
    }

    public static void findMaxSalary(Employee[] employees) {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (max.getSalaryStaff() < employee.getSalaryStaff())
                max = employee;
        }
        System.out.println("Cотрудник с максимальной зарплатой: " + max.getStaff() +
                " (зарплата = " + max.getSalaryStaff() + " руб, департамент №" + max.getDepartment() + ").");
    }

    public static int calculateAverageSalary(Employee[] employees) {
        int sum = calculateAllSalaries(employees);
        int average = sum / employees.length;
        System.out.println("Среднее значение зарплат в месяц = " + average + " руб.");
        return average;
    }

    public static void printAllEmployees(Employee[] employees) {
        System.out.println("Ф.И.О. всех сотрудников:");
        for (Employee employee : employees) {
            System.out.println("* " + employee.getStaff());
        }
    }
}
