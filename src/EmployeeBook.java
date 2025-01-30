public class EmployeeBook {
    private Employee[] employees = new Employee[10];


    public boolean add(Employee employee){
        for (int i = 0; i < employees.length; i++){
            if (employees[i] == null){
                employees[i] = employee;
                return true;
            }

        }return false;
    }

    public String toString(Employee[] employees) {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            string += employees[i].toString() + " \n";
        }
        return string;
    }

    public int fasteForSalary(Employee[] employees) {
        int faste = 0;
        for (int i = 0; i < employees.length; i++) {
            faste += employees[i].getSalary();
        }
        return faste;
    }

    public Employee minSalary(Employee[] employees) {
        Employee b = new Employee();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < b.getSalary() || b.getSalary() == 0) {
                b = employees[i];
            }
        }
        return b;
    }

    public Employee maxSalary(Employee[] employees) {
        Employee b = new Employee();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > b.getSalary()) {
                b = employees[i];
            }
        }
        return b;
    }

    public float middleSalary(Employee[] employees) {
        return fasteForSalary(employees) / employees.length;
    }

    public void printFioEmployees(Employee[] employees) {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            string += employees[i].getSurName() + " " + employees[i].getName() + " " + employees[i].getFatherName() + " \n";
        }
        System.out.println(string);

    }

    public void salaryUp(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary((int) (employees[i].getSalary() * 1.1));
        }
    }

    public int fasteForSalaryDepartment(Employee[] employees, byte department) {
        int faste = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {

                faste += employees[i].getSalary();
            }
        }
        return faste;
    }

    public Employee minSalaryDepartment(Employee[] employees, byte department) {
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

    public Employee maxSalaryDepartment(Employee[] employees, byte department) {
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

    public float middleSalaryDepartment(Employee[] employees, byte department) {
        int y = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                y++;
            }
        }

        return fasteForSalaryDepartment(employees, department) / y;
    }

    public void printFioEmployeesDepartment(Employee[] employees, byte department) {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                string += employees[i].getSurName() + " " + employees[i].getName() + " " + employees[i].getFatherName() + " \n";
            }
        }
        System.out.println(string);
    }

    public void startingSalaryLevel(Employee[] employees, int startingSalary) {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < startingSalary) {
                string += employees[i].toString() + " \n";
            }
        }
        System.out.println(string);
    }

    public void endingSalaryLevel(Employee[] employees, int endingSalary) {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > endingSalary) {
                string += employees[i].toString() + " \n";
            }
        }
        System.out.println(string);
    }

    public void delete(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    public Employee idSearch(int id){
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getId() == id){
                employees[i] = employee;
                return employees[i];
            }

        }return null;
    }


}
