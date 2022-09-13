public class Employee extends Person{
    private int employeeNo;

    public Employee(String name, int phone, String address, int employeeNo) {
        super(name, phone, address);
        this.employeeNo = employeeNo;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeNo=" + employeeNo +
                '}';
    }
}
