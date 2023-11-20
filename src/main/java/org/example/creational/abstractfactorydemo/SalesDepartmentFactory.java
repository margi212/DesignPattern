package abstract2;

public class SalesDepartmentFactory {

    public static Employee getDepartment(String type){
        System.out.println("IN SALES FACTORY"+type);
        if(type=="ACT"){
            return new Accountant();
        }else if(type=="BDE"){
            System.out.println("IN FACTORY"+type);
            return new BDE();
        }

        return null;
    }
}