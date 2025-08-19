package Experiments;


public class CssSelectors {

    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorsHomePage() {
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        WebElement footer = driver.findElement(By.tagName("footer"));
        System.out.println(footer.getTagName());
        //WebElements divElements = driver.findElement(By.className("card-up"));
        //WebElements divElements = driver.findElement(By.cssSelector(".card-up"));
        //WebElements divElements = driver.findElement(By.className("*[class='card-up']"));
        WebElements divElements = driver.findElement(By.className("div[class='card-up']"));

        divElements.click();
        pause(5);

        //WebElement btnRadioButton = driver.findElement(By.id("item-2"));
        //WebElement btnRadioButton = driver.findElement(By.cssSelector("#item-2"));
        WebElement btnRadioButton = driver.findElement(By.cssSelector("*[id='[item-2']"));
        btnRadioButton.click();
        //WebElement btnImpressive = driver.findElement(By.id("impressiveRadio"));
        WebElement btnImpressive = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        btnImpressive.click();
        pause(5);

        WebElement btnButtons = driver.findElement(By.id("item-4"));
        btnButtons.click();
        //WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
        WebElement btnDoubleClick = driver.findElement(By.cssSelector("#doubleClickBtn"));
        btnDoubleClick.click();
        pause(5);


        //driver.close();
        driver.quit();
    }

    public void pause(int time) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
