package com.saha.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;

public class BasePageUtil {



    protected AndroidDriver<MobileElement> driver;

    public BasePageUtil(AndroidDriver<MobileElement> driver) {

        this.driver = driver;
    }

    //bekleme
    public void sleep(int waitTime){
        try {
            Thread.sleep(waitTime*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //Hesap açma
    public void openMyAccount(By btnMyAccount,By btnStartShopping, String btnGender_Female){


        Boolean popUpVarMi = driver.findElements(btnStartShopping).size() > 0;
        if (popUpVarMi) {

            WebElement popUpKapat = driver.findElement(By.xpath(btnGender_Female));
            popUpKapat.click();
            sleep(2);

        }



        WebDriverWait wait = new WebDriverWait(driver,20);

        wait.until(ExpectedConditions.presenceOfElementLocated(btnMyAccount)).click();

    }

    //Giriş
    public void guestLogin(By btnBasketGuestLogin){

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(btnBasketGuestLogin)).click();



    }

    //email girme
    public void emailClickandSendKey(By txtEmail, String email){

        WebDriverWait wait = new WebDriverWait(driver,20);
        driver.findElement(txtEmail).click();
        driver.findElement(txtEmail).sendKeys(email);

    }

    //şifre girme
    public void passwordClickandSendKey(By txtPassword, String password){

        WebDriverWait wait = new WebDriverWait(driver,20);
        driver.findElement(txtPassword).click();
        driver.findElement(txtPassword).sendKeys(password);

    }

    //Login işlemi
    public void clickLogin(By btnTYLogin, By btnNeverSavePassword){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(btnTYLogin)).click();

       Boolean popUpVarMi = driver.findElements(btnNeverSavePassword).size() > 0;
       if (popUpVarMi) {
           WebElement popUpKapat = driver.findElement(btnNeverSavePassword);
           popUpKapat.click();
          sleep(2);

       }


    }

    //Anasayfa butonuna tıklama
    public void clickTabHome(By tabHome){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(tabHome)).click();

    }

    //Ürün arama
    public void txtSearchBoxClickAndSendKey(By txtSearchBoxId, String productName){

        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.findElement(txtSearchBoxId).click();
        driver.findElement(txtSearchBoxId).sendKeys(productName);

    }

    //Arama butonuna basma
    public void pressSearch(){
            new TouchAction(driver).tap(991,1682).perform();

            //driver.tap(1,988,17127,1);
            //driver.pressKeyCode(AndroidKeyCode.KEYCODE_SEARCH);
    }

    //Aşağı kaydırma metodu
    public void swipeDown(){

        Dimension dimension = driver.manage().window().getSize();
        int height = dimension.height;
        int width = dimension.width;
        int swipeStartWidth = (width * 50) / 100;
        int swipeEndWidth = (width * 50) / 100;
        int swipeEndHeight = (height * 20) / 100;
        int swipeStartHeight = (height*80 )/100;


        driver.swipe(swipeStartWidth,swipeStartHeight,swipeStartWidth,swipeEndHeight,1000);



    }

    //Yukarı kaydırma metodu
    public void swipeUp(){

        Dimension dimension = driver.manage().window().getSize();
        int height = dimension.height;
        int width = dimension.width;
        int swipeStartWidth=(width*50)/100;
        int swipeEndWidth = (width*50)/100;
        int swipeStartHeight= (height*80)/100;
        int swipeEndHeight=(height*20)/100;


        driver.swipe(swipeStartWidth,swipeEndHeight,swipeStartWidth,swipeStartHeight,1000);

    }

    //Ürüne tıklama
    public void clickProduct(String productNamePath){
        WebDriverWait wait= new WebDriverWait(driver, 20);
        //Tıklanacak haberi 20 saniye aramak için bekleyecek

        List<WebElement> list = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(productNamePath)));
        list.get(1).click();

    }

    //Sağa kaydırma metodu
    public void swipeRight(){

        Dimension dimension = driver.manage().window().getSize();
        int height = dimension.height;
        int width = dimension.width;
        int swipeStartWidth=(width*90)/100;
        int swipeEndWidth = (width*10)/100;
        int swipeStartHeight=(height*50)/100;
        int swipeEndHeight=(height*50)/100;


        driver.swipe(swipeStartWidth,swipeStartHeight,swipeEndWidth,swipeStartHeight,1000);

    }

    //Sola kaydırma metodu
    public void swipeLeft(){

        Dimension dimension = driver.manage().window().getSize();
        int height = dimension.height;
        int width = dimension.width;
        int swipeStartWidth=(width*10)/100;
        int swipeEndWidth = (width*90)/100;
        int swipeStartHeight=(height*50)/100;
        int swipeEndHeight=(height*50)/100;


        driver.swipe(swipeStartWidth,swipeStartHeight,swipeEndWidth,swipeStartHeight,1000);

    }

    //Menu butonuna basma
    public void clickMenu(By btnMenu){

        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(btnMenu)).click();



    }

    //Menü kadın tıklama
    public void clickMenuFemale(String menuFemale){
        WebDriverWait wait= new WebDriverWait(driver, 20);
        //Tıklanacak haberi 20 saniye aramak için bekleyecek

        List<WebElement> list = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(menuFemale)));
        list.get(0).click();

    }

    //Menu kadın giyim tıklama
    public void clickNavigationRightArrow(String navigationRightArrow){
        WebDriverWait wait= new WebDriverWait(driver, 20);
        //Tıklanacak haberi 20 saniye aramak için bekleyecek

        List<WebElement> list = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(navigationRightArrow)));
        list.get(0).click();

    }

    public void clickivnavigationRightArrow(String ivnavigationRightArrow){

        WebDriverWait wait = new WebDriverWait(driver,20);
        List<WebElement> list = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(ivnavigationRightArrow)));
        list.get(0).click();

    }

    public void addProductFav(String addProductFav){

        WebDriverWait wait = new WebDriverWait(driver,20);
        List<WebElement> list = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(addProductFav)));
        list.get(0).click();

    }

    //Favoriler butonuna tıklama
    public void clickMyFavourites(By btnFavourites){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.presenceOfElementLocated(btnFavourites)).click();

    }


}
