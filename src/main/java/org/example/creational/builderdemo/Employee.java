package Builder;

public class Employee {

    private String firstName;
    private String lastName;
    private String email;

    private int accountNo;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Employee(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.accountNo = builder.accountNo;
    }

    public String getEmail(){
        return this.email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + this.firstName + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", email='" + this.email + '\'' +
                ", accountNo=" + this.accountNo +
                '}';
    }



    public static class Builder{
        private String firstName;
        private String lastName;
        private String email;
        private int accountNo;


        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setAccountNo(int accountNo){
            this.accountNo = accountNo;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }


    }

}
