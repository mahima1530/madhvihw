public class HomePage extends Utility {


    By JobTitle = By.id("keywords");
    By locationlink = By.id("location");
    By distanceDropDown = By.id("distance");

    By moreSearchOptionsLink =By.cssSelector("div.hp-search-more>#toggle-hp-search");

    By salaryMin = By.cssSelector("input#salarymin");
    By salaryMax = By.cssSelector("input#salarymax");
    By salaryType = By.cssSelector("select[id='salarytype']");
    By jobType = By.cssSelector("select#tempperm");
    By findJobsBtn =  By.cssSelector("input#hp-search-btn");
    private String jobTiles;
    public void enterJobTitle(String jobTitles) {
        Reporter.log("Enter Job Title");
        sendTextToElement(JobTitle,jobTitles);
    }

    public void enterLocation(String Location) {
        Reporter.log(" location"+ locationlink.toString());
        sendTextToElement(locationlink, Location);
    }

    public void distanceDropDown(String Distance) {
        Reporter.log("Select Distance" + Distance.toString());
        selectByVisibleTextFromDropDown(distanceDropDown,Distance);
    }

    public void moreSearchOptionslink() {
        Reporter.log("Select SearchOptions");
        clickOnElement(moreSearchOptionsLink);
    }

    public void enterSalaryMin(String SalaryMin) {
        Reporter.log("Enter Salary" + salaryMin.toString ());
        sendTextToElement(salaryMin,SalaryMin );
    }

    public void enterSalaryMax(String SalaryMax) {
        Reporter.log("Enter Salary" + salaryMax.toString());
        sendTextToElement(salaryMax, SalaryMax);
    }

    public void salaryTypeDropDown(String SalaryType) {
        Reporter.log(" Enter  Salary");
        selectByVisibleTextFromDropDown(salaryType, SalaryType);
    }


    public void jobTypeDropDown(String JobType) {
        Reporter.log("click Job type");
        selectByVisibleTextFromDropDown(jobType,JobType);

    }

    public void iframeHandle() throws InterruptedException {
        driver.switchTo().frame("gdpr-consent-notice");
        driver.findElement(By.xpath("//button[@id='save']")).click();
        driver.switchTo().defaultContent();
    }
    public void clickOnFindJobsButton() {

        clickOnElement(findJobsBtn);
    }


}

