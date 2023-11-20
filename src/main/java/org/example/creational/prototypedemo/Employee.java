package Prototype;

public class Employee {

    public String name;

    private  String email;

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee(Employee employee){
        this.name = employee.name;
        this.email = employee.email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Employee clone(){
        return new Employee(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
