public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иван Иванов", 350000);
        employees[1] = new Employee("Иван Тимуров", 200000);
        employees[2] = new Employee("Александр Иванов", 600000);
        employees[3] = new Employee("Алексей Росин", 300000);
        employees[4] = new Employee("Константин Головин", 150000);
        employees[5] = new Employee("Дмитрий Довлатов", 400000);
        employees[6] = new Employee("Фёдор Шариков", 450000);
        employees[7] = new Employee("Борис Жилков", 500000);
        employees[8] = new Employee("Эдуард Щетинин", 550000);
        employees[9] = new Employee("Ростислав Языков", 250000);
        allEmployees(employees);
        allExpensesForSalary(employees);
        minimalSalaryEmployee(employees);
        maximalSalaryEmployee(employees);
        avarageSalaryEmployees(employees);
        allFullNameEmployees(employees);
    }

    public static void allEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }

    public static int allExpensesForSalary(Employee[] employees) {
        int allExpenses = 0;
        for (int i = 0; i < employees.length; i++) {
            allExpenses += employees[i].getSalaryEmployee();
        }
        System.out.println("Сумма всех затрат на ЗП в месяц равна " + allExpenses);
        return allExpenses;
    }

    public static void minimalSalaryEmployee(Employee[] employees) {
        int minimalSalary = employees[0].getSalaryEmployee();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalaryEmployee() < minimalSalary) {
                minimalSalary = employees[i].getSalaryEmployee();
            }
        }
        System.out.println("Минимальная ЗП в месяц равна " + minimalSalary);
    }

    public static void maximalSalaryEmployee(Employee[] employees) {
        int maximalSalary = employees[0].getSalaryEmployee();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalaryEmployee() > maximalSalary) {
                maximalSalary = employees[i].getSalaryEmployee();
            }
        }
        System.out.println("Минимальная ЗП в месяц равна " + maximalSalary);
    }

    public static void avarageSalaryEmployees(Employee[] employees) {
        int allExpenses = allExpensesForSalary(employees);
        int avarageSalary = allExpenses / employees.length;
        System.out.println("Среднее значение ЗП в месяц равна " + avarageSalary);
    }

    public static void allFullNameEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }
    }

}