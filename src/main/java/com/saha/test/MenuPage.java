package com.saha.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MenuPage extends BasePageUtil implements Constants {


    public MenuPage(AndroidDriver<MobileElement> driver) {
        super(driver);

    }

    public void menuPage() {

        clickMenu(btnMenu);
        sleep(3);
        clickMenuFemale(menuFemale);
        sleep(2);
        clickNavigationRightArrow(navigationRightArrow);
        sleep(2);
        clickivnavigationRightArrow(ivnavigationRightArrow);
        sleep(2);
        addProductFav(addProductFav);
        sleep(2);
        emailClickandSendKey(txtEmail,email);
        passwordClickandSendKey(txtPassword,password);
        clickLogin(btnTYLogin,btnNeverSavePassword);
        clickMyFavourites(btnFavourites);
    }

}
