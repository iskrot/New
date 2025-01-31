public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public Employee[] getEmployees() {
        return employees;
    }

    public boolean add(Employee employee){
        for (int i = 0; i < employees.length; i++){
            if (employees[i] == null){
                employees[i] = employee;
                return true;
            }

        }return false;
    }

    public String printEmployeeInfo() {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null){
                string += employees[i].toString() + " \n";
            }
        }
        return string;
    }

    public int fasteForSalary() {
        int faste = 0;
        for (int i = 0; i < employees.length; i++) {
            faste += employees[i].getSalary();
        }
        return faste;
    }

    public Employee searchMinSalary() {
        Employee b = new Employee();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < b.getSalary() || b.getSalary() == 0) {
                b = employees[i];
            }
        }
        return b;
    }

    public Employee searchMaxSalary() {
        Employee b = new Employee();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > b.getSalary()) {
                b = employees[i];
            }
        }
        return b;
    }

    public float middleSalary() {
        int x = 0;
        for (int i = 0; i < employees.length; i++){
            if (employees[i] != null){
                x++;
            }
        }
        if (x != 0){
            return fasteForSalary() / x  ;
        }else{
            return 0;
        }
    }

    public void printFioEmployees() {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            string += employees[i].getSurName() + " " + employees[i].getName() + " " + employees[i].getFatherName() + " \n";
        }
        System.out.println(string);

    }

    public void salaryUp() {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary((int) (employees[i].getSalary() * 1.1));
        }
    }

    public int fasteForSalaryDepartment(byte department) {
        int faste = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {

                faste += employees[i].getSalary();
            }
        }
        return faste;
    }

    public Employee searchMinSalaryDepartment(byte department) {
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

    public Employee searchMaxSalaryDepartment(byte department) {
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

    public float middleSalaryDepartment(byte department) {
        int y = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                y++;
            }
        }

        return fasteForSalaryDepartment(department) / y;
    }

    public void printFioEmployeesDepartment(byte department) {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                string += employees[i].getSurName() + " " + employees[i].getName() + " " + employees[i].getFatherName() + " \n";
            }
        }
        System.out.println(string);
    }

    public void startingSalaryLevel(int startingSalary) {
        String string = "";
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < startingSalary) {
                string += employees[i].toString() + " \n";
            }
        }
        System.out.println(string);
    }

    public void endingSalaryLevel(int endingSalary) {
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
            if (employees[i] != null){

                if (employees[i].getId() == id){
                    return employees[i];
                }
            }

        }return null;
    }


}
