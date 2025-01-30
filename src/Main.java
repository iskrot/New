public class Main {
    public static void main(String[] args) {
        String[] randomName = {"Nikita", "Dmitriy", "sergey", "ivan"};
        String[] randomSurName = {"Nikitov", "Dmitriev", "sergeev", "ivanov"};
        String[] randomFatherName = {"Nikitin", "Dmitrievich", "sergeevich", "ivanovich"};
        float department = 1;
        Employee[] employees = new Employee[10];

        for (byte i = 0; i < 10; i++) {
            employees[i] = new Employee(i, randomName[(byte) (Math.random() * 4)], randomSurName[(byte) (Math.random() * 4)], randomFatherName[(byte) (Math.random() * 4)], (int) (40_000 + 60_000 * Math.random()), (byte) department);
            department += 0.5;
        }

        System.out.println(toString(employees));
        System.out.println(fasteForSalary(employees));
        System.out.println(minSalary(employees));
        System.out.println(maxSalary(employees));
        System.out.println(middleSalary(employees));
        printFioEmployees(employees);
        System.out.println(fasteForSalaryDepartment(employees, (byte) 1));
        System.out.println(minSalaryDepartment(employees, (byte) 1));
        System.out.println(maxSalaryDepartment(employees, (byte) 1));
        System.out.println(middleSalaryDepartment(employees, (byte) 1));
        printFioEmployeesDepartment(employees, (byte) 1);


    }

    public static String toString(Employee[] employees) {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            string += employees[i].toString() + " \n";
        }
        return string;
    }

    public static int fasteForSalary(Employee[] employees) {
        int faste = 0;
        for (int i = 0; i < employees.length; i++) {
            faste += employees[i].getSalary();
        }
        return faste;
    }

    public static Employee minSalary(Employee[] employees) {
        Employee b = new Employee();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < b.getSalary() || b.getSalary() == 0) {
                b = employees[i];
            }
        }
        return b;
    }

    public static Employee maxSalary(Employee[] employees) {
        Employee b = new Employee();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > b.getSalary()) {
                b = employees[i];
            }
        }
        return b;
    }

    public static float middleSalary(Employee[] employees) {
        return fasteForSalary(employees) / employees.length;
    }

    public static void printFioEmployees(Employee[] employees) {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            string += employees[i].getSurName() + " " + employees[i].getName() + " " + employees[i].getFatherName() + " \n";
        }
        System.out.println(string);

    }

    public static void salaryUp(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary((int) (employees[i].getSalary() * 1.1));
        }
    }

    public static int fasteForSalaryDepartment(Employee[] employees, byte department) {
        int faste = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {

                faste += employees[i].getSalary();
            }
        }
        return faste;
    }

    public static Employee minSalaryDepartment(Employee[] employees, byte department) {
        Employee b = new Employee();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() < b.getSalary() || b.getSalary() == 0) {
                    b = employees[i];
                }
            }
        }
        return b;
    }

    public static Employee maxSalaryDepartment(Employee[] employees, byte department) {
        Employee b = new Employee();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                if (employees[i].getSalary() > b.getSalary()) {
                    b = employees[i];
                }
            }
        }
        return b;
    }

    public static float middleSalaryDepartment(Employee[] employees, byte department) {
        int y = 0;
        for (int i = 0; i<employees.length; i++){
            if (employees[i].getDepartment() == department){
                y++;
            }
        }

        return fasteForSalaryDepartment(employees, department) / y;
    }

    public static void printFioEmployeesDepartment(Employee[] employees, byte department) {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                string += employees[i].getSurName() + " " + employees[i].getName() + " " + employees[i].getFatherName() + " \n";
            }
        }
        System.out.println(string);
    }

    public static void startingSalaryLevel(Employee[] employees,int startingSalary){
        String string = "";
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getSalary() <startingSalary){
                string += employees[i].toString() + " \n";
            }
        }
        System.out.println(string);
    }

    public static void endingSalaryLevel(Employee[] employees,int endingSalary){
        String string = "";
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getSalary() > endingSalary){
                string += employees[i].toString() + " \n";
            }
        }
        System.out.println(string);
    }


}