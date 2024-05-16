import java.util.Objects;

import static java.util.Objects.hash;

public class Employee {
    private String fullName;
    private int salaryEmployee;
    private static int id;

    public Employee(String fullName, int salaryEmployee) {
        this.fullName = fullName;
        this.salaryEmployee = salaryEmployee;
        this.id = counterId();
    }

    private static int counterId() {
        id++;
        return id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getId() {
        return this.id;
    }

    public int getSalaryEmployee() {
        return this.salaryEmployee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalaryEmployee(int salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || this.getClass() != other.getClass()) {
            return false;
        }
        Employee e = (Employee) other;
        return Objects.equals(fullName, e.fullName) && Objects.equals(id, e.id) && Objects.equals(salaryEmployee, e.salaryEmployee);
    }

    @Override
    public int hashCode() {
        return hash(fullName, id, salaryEmployee);
    }

    @Override
    public String toString() {
        return this.fullName + ": " + this.id + ", " + this.salaryEmployee;
    }
}
