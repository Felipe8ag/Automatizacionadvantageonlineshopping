package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class ElementsPage extends PageObject {

    public static final Target WEBTABLE = Target.the("Web_Table").locatedBy("//*[text()='Web Tables']");
    public static final Target ADD = Target.the("Add").locatedBy(" //*[text()='Add']");
    public static final Target FIRST_NAME = Target.the("First_Name").locatedBy("id:firstName");

    public static final Target LAST_NAME = Target.the("Last_Name").locatedBy("id:lastName");
    public static final Target EMAIL = Target.the("Email").locatedBy("id:userEmail");
    public static final Target AGE = Target.the("Age").locatedBy("id:age");
    public static final Target SALARY = Target.the("Salary").locatedBy("id:salary");
    public static final Target DEPARTMENT = Target.the("Department").locatedBy("id:department");
    public static final Target SUBMIT = Target.the("Submit").locatedBy("id:submit");
    public static final Target SEARCHBOX = Target.the("Search Box").locatedBy("id:searchBox");
    public static final Target TRASH = Target.the("Trash").locatedBy("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[7]/div/span[2]");
    public static final Target TEXT_VALIDATE = Target.the("Texto para ser validado").locatedBy("//*[text()='{0}']");

}
