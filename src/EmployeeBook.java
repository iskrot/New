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
        StringBuilder string = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null) {
                string.append(employee.toString()).append(" \n");
            }
        }
        return string.toString();
    }

    public int fasteForSalary() {
        int faste = 0;
        for (Employee employee : employees) {
            if (employee != null){
                faste += employee.getSalary();
            }
        }
        return faste;
    }

    public Employee searchMinSalary() {
        Employee b = new Employee();
        for (Employee employee : employees) {
            if (employee != null){
                if (employee.getSalary() < b.getSalary() || b.getSalary() == 0) {
                    b = employee;
                }
            }
        }
        return b;
    }

    public Employee searchMaxSalary() {
        Employee b = new Employee();
        for (Employee employee : employees) {
            if (employee != null){
                if (employee.getSalary() > b.getSalary()) {
                    b = employee;
                }
            }
        }
        return b;
    }

    public float getMiddleSalary() {
        int x = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                x++;
            }
        }
        if (x != 0){
            return (float) fasteForSalary() / x  ;
        }else{
            return 0;
        }
    }

    public void printFioEmployees() {
        StringBuilder string = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null){
                string.append(employee.getSurName()).append(" ").append(employee.getName()).append(" ").append(employee.getFatherName()).append(" \n");
            }
        }
        System.out.println(string);

    }

    public void salaryUp(float increase) {
        for (Employee employee : employees) {
            employee.setSalary((int) (employee.getSalary() * increase));
        }
    }

    public int fasteForSalaryDepartment(byte department) {
        int faste = 0;
        for (Employee employee : employees) {
            if (employee != null){
                if (employee.getDepartment() == department) {
                    faste += employee.getSalary();
                }
            }
        }
        return faste;
    }

    public Employee searchMinSalaryDepartment(byte department) {
        Employee b = new Employee();
        for (Employee employee : employees) {
            if (employee != null){

                if (employee.getDepartment() == department) {
                    if (employee.getSalary() < b.getSalary() || b.getSalary() == 0) {
                        b = employee;
                    }
                }
            }
        }
        return b;
    }

    public Employee searchMaxSalaryDepartment(byte department) {
        Employee b = new Employee();
        for (Employee employee : employees) {
            if (employee != null){

                if (employee.getDepartment() == department) {
                    if (employee.getSalary() > b.getSalary()) {
                        b = employee;
                    }
                }
            }
        }
        return b;
    }

    public float getMiddleSalaryDepartment(byte department) {
        int y = 0;
        for (Employee employee : employees) {
            if (employee != null){

                if (employee.getDepartment() == department) {
                    y++;
                }
            }
        }

        return (float) fasteForSalaryDepartment(department) / y;
    }

    public void printFioEmployeesDepartment(byte department) {
        StringBuilder string = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null){

                if (employee.getDepartment() == department) {
                    string.append(employee.getSurName()).append(" ").append(employee.getName()).append(" ").append(employee.getFatherName()).append(" \n");
                }
            }
        }
        System.out.println(string);
    }

    public void startingSalaryLevel(int startingSalary) {
        StringBuilder string = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null){
                if (employee.getSalary() < startingSalary) {
                    string.append(employee.toString()).append(" \n");
                }
            }
        }
        System.out.println(string);
    }

    public void endingSalaryLevel(int endingSalary) {
        StringBuilder string = new StringBuilder();
        for (Employee employee : employees) {
            if (employee != null){
                if (employee.getSalary() > endingSalary) {
                    string.append(employee.toString()).append(" \n");
                }
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
        for (Employee employee : employees) {
            if (employee != null) {

                if (employee.getId() == id) {
                    return employee;
                }
            }

        }
        return null;
    }


}
