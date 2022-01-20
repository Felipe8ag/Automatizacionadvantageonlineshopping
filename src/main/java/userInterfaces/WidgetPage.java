package userInterfaces;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class WidgetPage extends PageObject {

    public static final Target DATE_PICKER = Target.the("Web_Table").locatedBy("//*[text()='Date Picker']");
    public static final Target SELECT_DATE = Target.the("Select_Date").locatedBy("id:datePickerMonthYearInput");
    public static final Target MONTH = Target.the("Age").locatedBy("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select");
    public static final Target MONTH_OPTION = Target.the("Month Option").locatedBy("//*[contains(text(), '{0}')]");
    public static final Target YEAR = Target.the("Year").locatedBy("//*[@id='datePickerMonthYear']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select");
    public static final Target YEAR_OPTION = Target.the("Year Option").locatedBy("//*[contains(text(), '{0}')]");
    public static final Target DAY_OPTION = Target.the("Day Option").locatedBy("//div[contains(@class,'react-datepicker__day react-datepicker__day--0{0}')]");

    public static final Target DATEANDTIME = Target.the("Date and Time").locatedBy("id:dateAndTimePickerInput");
    public static final Target MONTH2 = Target.the("Month 2").locatedBy("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/span[1]");
    public static final Target MONTH_OPTION2 = Target.the("Month Option 2").locatedBy("//div[contains(@class,'react-datepicker__month-option') and contains(.,'{0}')]");
    public static final Target YEAR2 = Target.the("Month 2").locatedBy("//*[@id='dateAndTimePicker']/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/div/span[2]");
    public static final Target YEAR_OPTION2 = Target.the("Year Option 2").locatedBy("//div[contains(@class,'react-datepicker__year-option') and contains(.,'{0}')]");
    public static final Target HOUR_OPTION = Target.the("Month 2").locatedBy("//li[contains(@class,'react-datepicker__time-list-item ') and contains(.,'{0}')]");

    public static final Target DATE_VALIDATE = Target.the("Texto para ser validado").locatedBy("id:datePickerMonthYearInput");

}
