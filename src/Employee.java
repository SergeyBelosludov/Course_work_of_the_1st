public class Employee {
    private String staff;
    private int department;
    // департамент от 1 до 5
    private int salaryStaff;
    private static int counter = 1;
    private int id;

    public Employee(String staff, int department, int salaryStaff) {
        this.staff = staff;
        this.department = department;
        this.salaryStaff = salaryStaff;
        this.id = counter;
        counter++;
    }

    public String getStaff() {
        return staff;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalaryStaff() {
        return salaryStaff;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalaryStaff(int salaryStaff) {
        this.salaryStaff = salaryStaff;
    }

    @Override
    public String toString() {
        return "Сотрудник " + staff + ", департамен №" + department +
                ", зарплата = " + salaryStaff + " руб, id = " + id;
    }
}