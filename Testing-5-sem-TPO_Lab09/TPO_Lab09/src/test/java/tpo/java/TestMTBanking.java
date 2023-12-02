package tpo.java;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMTBanking {
    @Test
    public void CheckDataCorrect() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mybank.by/main_unauthorised");
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://mybank.by/main_unauthorised", currentUrl);
        Thread.sleep(500);

        WebElement buttonLogin = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/header/div[1]/div/span[2]/span"));
        buttonLogin.click();
        Thread.sleep(1000);

        WebElement inputFieldPhoneNumber = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
        inputFieldPhoneNumber.sendKeys("257411803");
        inputFieldPhoneNumber.sendKeys(Keys.ENTER);
        Thread.sleep(1000);


        WebElement inputFieldPassword = driver.findElement(By.xpath("//input[@name='password']"));
        inputFieldPassword.sendKeys("Ttrknvv7411803");
        inputFieldPassword.sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        WebElement storyOfOperation = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[1]/div[2]/div/div[1]/button[2]/div/div"));
        storyOfOperation.click();
        Thread.sleep(2000);

        WebElement dateFrom = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[1]/div/div[1]/div/input"));
        dateFrom.click();
        dateFrom.sendKeys("12/34/5678");
        Thread.sleep(1000);

        WebElement buttonShow = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[2]/button[1]"));
        buttonShow.click();
        buttonShow.click();
        Thread.sleep(1000);

        WebElement textException = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[1]/div/div[1]/div/div[3]"));
        String expectedText = "Значение поля должно соответствовать типу «Дата»";
        String actualText = textException.getText();
        Assert.assertEquals(expectedText, actualText);

        WebElement textException2 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/div/div[3]"));
        expectedText = "Поле обязательно для заполнения";
        actualText = textException2.getText();
        Assert.assertEquals(expectedText, actualText);
        Thread.sleep(1000);


        WebElement dateTo = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/div/input"));
        dateTo.click();
        dateTo.sendKeys("25/01/2026");
        Thread.sleep(1000);
        buttonShow.click();
        Thread.sleep(1000);
        String expectedTextSecond = "Значение поля не должно быть позже чем 02.12.2023";
        WebElement textExceptionSecond = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div/div/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/div/div[3]"));
        String actualTextSecond = textExceptionSecond.getText();
        Assert.assertEquals(expectedTextSecond, actualTextSecond);
        Thread.sleep(1000);
        /*WebElement heroesPageTitle = driver.findElement(By.xpath("//h1[contains(text(), 'Heroes')]"));
        Assert.assertTrue(heroesPageTitle.isDisplayed());
        Thread.sleep(500);

        WebElement buttonAbaddon = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[4]/section[2]/footer/div/a[1]"));
        buttonAbaddon.click();
        WebElement abaddonPageTitle = driver.findElement(By.xpath("//h1[contains(text(), 'Abaddon')]"));
        Assert.assertTrue(abaddonPageTitle.isDisplayed());
        Thread.sleep(500);

        WebElement buttonItems = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[3]/div[2]/div/nav/ul/li[3]/a"));
        buttonItems.click();
        String expectedTitle = "Abaddon - Items - DOTABUFF - Dota 2 Stats";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Thread.sleep(500);

        WebElement buttonCounters = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[3]/div[2]/div/nav/ul/li[4]/a"));
        buttonCounters.click();
        expectedTitle = "Abaddon - Counters - DOTABUFF - Dota 2 Stats";
        actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Thread.sleep(500);

        WebElement buttonAbilityBuilds = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[3]/div[2]/div/nav/ul/li[5]/ul/li[3]/a"));
        buttonAbilityBuilds.click();
        expectedTitle = "Abaddon - Abilities - DOTABUFF - Dota 2 Stats";
        actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Thread.sleep(500);

        WebElement buttonTrends = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[3]/div[2]/div/nav/ul/li[5]/ul/li[5]/a"));
        buttonTrends.click();
        expectedTitle = "Abaddon - Trends - DOTABUFF - Dota 2 Stats";
        actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        Thread.sleep(500);

        WebElement buttonDotabuff = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[2]/div/a[2]"));
        buttonDotabuff.click();
        String expectedUrl = "https://www.dotabuff.com/";
        String redirectedUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, redirectedUrl);
        Thread.sleep(500);*/

        Thread.sleep(500);
        driver.quit();
    }
}
