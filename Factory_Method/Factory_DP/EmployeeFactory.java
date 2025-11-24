package Factory_DP;
public class EmployeeFactory {
    public static Employee getEmployee(String type){
        if(type.trim().equalsIgnoreCase("Android")){
            return new AndroidDeveloper();
        }
        else if(type.trim().equalsIgnoreCase("Web")){
            return new WebDeveloper();
        }
        else return null;
    }
}
/* 1. Main factory method for creating objects of emplyees based on the input. 
 * 2. It returns the object of the employee type.
 * 3. 
*/