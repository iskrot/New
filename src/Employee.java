import java.util.Objects;

public class Employee {
    private byte id;
    private String name;
    private String surName;
    private String fatherName;
    private int salary;
    private byte department;

    public Employee() {

    }

    public Employee(byte id, String name, String surName, String fatherName, int salary, byte department) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.fatherName = fatherName;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{name: " + name + " surName: " + surName + " fatherName: " + fatherName + " salary: " + salary +
                " department: " + department +
                '}';
    }

    public byte getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getSalary() {
        return salary;
    }

    public byte getDepartment() {
        return department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && department == employee.department && Objects.equals(name, employee.name) && Objects.equals(surName, employee.surName) && Objects.equals(fatherName, employee.fatherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surName, fatherName, salary, department);
    }
}
