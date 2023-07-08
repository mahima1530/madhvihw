public class Registerpage extends Utility {


    By Registerlink = = By.cssSelector("input[type='submit']");
    By First name = By.text("First Name:");
    By Last name = By.text("Last Name:");
    By Address = By.cssSelector("div.hp-search-more>#toggle-hp-search");
    By City = By.cssSelector("input#city");
    By State= By.cssSelector("input#state");
    By Zip Code = By.cssSelector("select[id='Zip Code']");
    By Phone = By.cssSelector("select#tempperm");
    By SSN = By.cssSelector("input#hp-ssn");
    By Username = By.cssSelector("input#username");
    By Password  = By.cssSelector("select[id='password']");
    By Confirm = By.cssSelector("select#tempperm");
    By REGISTER button = By.cssSelector("input#hp-register-btn");
    By welcomeText = By.cssSelector("h1['welcometext']");

    public void Registerlink() {
        Reporter.log("Select Registerlink");
        clickOnElement(Registerlink);


    public void Enter Firstname(String firstnames ) {
        Reporter.log("Enter First name");
        sendTextToElement(Firstname, firstnames);
    }

    public void Enter Lastname(String lastnames) {
        Reporter.log("Enter Last name"));
        sendTextToElement(Lastname, lastnames);
    }

    public void Enter Address(String add) {
        Reporter.log("Enter Address");
        selectByVisibleTextFromDropDown(Address,add);
    }


    public void Enter City(String cty) {
        Reporter.log("Enter City");
        sendTextToElement(City, cty);
    }

    public void Enter State(String stat) {
        Reporter.log("Enter State");
        sendTextToElement(State, stat);
    }

    public void Enter ZipCode(String zcd) {
        Reporter.log(" Enter Zip Code");
        selectByVisibleTextFromDropDown(ZipCode,zcd);
    }


    public void Enter Phone(String phn) {
        Reporter.log("Enter Phone");
        selectByVisibleTextFromDropDown(Phone, phn);


    }
    public void Enter SSN(String ssnn) {
        Reporter.log("Enter SSN");
        selectByVisibleTextFromDropDown(SSN,ssnn);


    }
    public void Enter Username(String uname) {
        Reporter.log("Enter Username");
        selectByVisibleTextFromDropDown(Username, uname);


    }
    public void Enter Password(String pswd) {
        Reporter.log("Enter Password");
        selectByVisibleTextFromDropDown(Password, pswd);

    }
    public void Enter Confirm(String cnfm) {
        Reporter.log("Enter Confirm");
        selectByVisibleTextFromDropDown(Confirm, cnfm);
    }

    public void clickOnFindJobsButton() {

        clickOnElement(findJobsBtn);
    }
}