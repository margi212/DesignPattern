package abstract2;

public class Client {

    public static void main(String args[]) {
        Employee emp = DepartmentFactory.getDepartmentAbstractFactory("BDE");
        emp.salary();
    }
}