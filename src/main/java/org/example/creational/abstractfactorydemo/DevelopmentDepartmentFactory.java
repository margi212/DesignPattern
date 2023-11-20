package abstract2;

public class DevelopmentDepartmentFactory {

    public static Employee getDepartment(String type) {
        if (type == "ANDROID") {
            return new AndroidDeveloper();
        } else if (type == "WEB") {
            return new WebDeveloper();
        }
        return null;
    }
}