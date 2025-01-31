public class Main {
    public static void main(String[] args) {
        String[] randomName = {"Nikita", "Dmitriy", "sergey", "ivan"};
        String[] randomSurName = {"Nikitov", "Dmitriev", "sergeev", "ivanov"};
        String[] randomFatherName = {"Nikitin", "Dmitrievich", "sergeevich", "ivanovich"};

        EmployeeBook employees = new EmployeeBook();

        float department = 1;
        for (byte i = 0; i < 10; i++) {
            employees.add(new Employee(randomName[(byte) (Math.random() * 4)], randomSurName[(byte) (Math.random() * 4)], randomFatherName[(byte) (Math.random() * 4)], (int) (40_000 + 60_000 * Math.random()), (byte) department));
            department += 0.5;
        }

        System.out.println(employees.fasteForSalary());
        System.out.println(employees.searchMinSalary());
        System.out.println(employees.searchMaxSalary());
        System.out.println(employees.middleSalary());
        employees.printFioEmployees();
        System.out.println(employees.searchMinSalaryDepartment((byte) 1));
        System.out.println(employees.searchMaxSalaryDepartment((byte) 1));
        System.out.println(employees.middleSalaryDepartment((byte) 1));
        employees.printFioEmployeesDepartment((byte) 1);

        employees.delete(1);
        System.out.println(employees.toString());
        System.out.println(employees.idSearch(4));

    }

}