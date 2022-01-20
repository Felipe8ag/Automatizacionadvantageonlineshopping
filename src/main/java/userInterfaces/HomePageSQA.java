package userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;

public class HomePageSQA extends PageObject {

    public static final Target ELEMENTS = Target.the("Elements").locatedBy("//*[@id='app']/div/div/div[2]/div/div[1]");
    public static final Target WIDGETS = Target.the("Elements").locatedBy("//*[text()='Widgets']");

}
