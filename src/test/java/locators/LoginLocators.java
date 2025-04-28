package locators;

public class LoginLocators {
    public static final String USER_BUTTON = "//input[@id='user-name']";
    public static final String PASS_BUTTON = "//input[@id='password']";
    public static final String LOGIN_BUTTON = "//input[@data-test='login-button']";
    public static final String INVENTORY_BUTTON = "//div[contains(@class,'inventory_list')]";
    public static final String LOGIN_FAILED_BUTTON = "//*[text()='Epic sadface: Username and password do not match any user in this service']";
}
