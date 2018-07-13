package com.saha.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserLogin extends BasePageUtil implements Constants {

    public UserLogin(AndroidDriver<MobileElement> driver){

        super(driver);

    }

    public void login(){

        openMyAccount(btnMyAccount,btnStartShopping, btnGender_Female);

        guestLogin(btnBasketGuestLogin);

        emailClickandSendKey(txtEmail,email);

        passwordClickandSendKey(txtPassword,password);

        clickLogin(btnTYLogin,btnNeverSavePassword);

        clickTabHome(tabHome);

    }

}
