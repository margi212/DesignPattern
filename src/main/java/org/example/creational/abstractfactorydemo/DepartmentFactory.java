package abstract2;

public class DepartmentFactory {

    public static Employee getDepartmentAbstractFactory(String type){
        if(type=="ANDROID" || type=="WEB"){
            return new DevelopmentDepartmentFactory().getDepartment(type);
        }
        if(type=="ACT" || type=="BDE"){
            return new SalesDepartmentFactory().getDepartment(type);
        }

        return null;
    }

}