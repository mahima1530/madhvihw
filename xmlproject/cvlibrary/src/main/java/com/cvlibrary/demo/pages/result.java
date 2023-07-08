public class ResultPage extends Utility {
    By resultMsg= By.cssSelector("h1[class='search-header__title']");



    public void verifyTheResult(String expected) {
        Reporter.log("Result Text: " + resultMsg.toString());

        String actualMsg = getTextFromElement(resultMsg);
        Assert.assertEquals(actualMsg,expected);
    }
