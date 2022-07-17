package pageObjects;

import org.openqa.selenium.By;

public class ILabObjects {

    public static final By creatILabBtn = By.xpath("//ul[@id=\"menu-primary-right-menu\"]/li/a[contains(text(), 'CAREERS')]");
    public static final By selectCountry = By.xpath("//div[@class=\"vc_btn3-container vc_btn3-left\"]/a[contains(text(), 'South Africa')]");
    public static final By selectJobToApply = By.xpath("//div[@class=\"wpjb-line-major\"]/a[contains(text(), 'Software Test Engineer - Johannesburg')]");
    public static final By clickApplyBtn = By.xpath("//div[@class=\"wpjb-job-buttons\"]/a");

    public static final By typeToEnterName = By.xpath("//input[@id=\"applicant_name\"]");
    public static final By typeToEnterEmail = By.xpath("//input[@id=\"email\"]");
    public static final By enterPhoneNumber = By.xpath("//input[@id=\"phone\"]");
    public static final By validationError = By.xpath("//ul[@class=\"wpjb-errors\"]/li[contains(text(), 'You need to upload at least one file.')]");
    public static final By sendApplication = By.xpath("//input[@value=\"Send Application\"]");

}
