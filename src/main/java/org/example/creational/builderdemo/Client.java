package Builder;

public class Client {
    public static void main(String[] args) {
        Employee e1 = Employee.getBuilder().setEmail("test@test.com").setAccountNo(123).setFirstName("Sachin").build();
        System.out.println(e1.getEmail());
        System.out.println(e1);
    }
}
