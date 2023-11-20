package Prototype;

public class Client {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sachin","sachin@gmail.com");

        Employee freelancer = e1.clone();

        System.out.println("Employee obj : "+ e1.toString());

        System.out.println("Freelance obj : "+ freelancer.toString());

        System.out.println("============================================");

        e1.setName("Sachin1");

        System.out.println("Employee obj : "+ e1.toString());

        System.out.println("Freelance obj : "+ freelancer.toString());
    }
}
