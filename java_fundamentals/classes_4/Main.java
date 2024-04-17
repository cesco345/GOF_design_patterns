package java_fundamentals.classes_4;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.getBaseSalary();
        employee.setHourlyRate(20);
        employee.getHourlyRate();

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }

}
