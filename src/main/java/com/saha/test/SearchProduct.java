package com.saha.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class SearchProduct extends BasePageUtil implements Constants  {

    public SearchProduct(AndroidDriver<MobileElement> driver){
        super(driver);

    }

    public void search(){


        clickTabHome(tabHome);
        txtSearchBoxClickAndSendKey(txtSearchBoxId,productName);
        sleep(3);
        pressSearch();
        sleep(3);
        swipeDown();
        sleep(3);
        swipeUp();
        sleep(2);
        clickProduct(productNamePath);
        sleep(2);
        swipeRight();
        sleep(2);
        swipeRight();
        sleep(2);
        swipeRight();
        sleep(2);
        swipeLeft();
        sleep(2);
        swipeLeft();
        sleep(2);
        swipeDown();
        sleep(3);

    }


}
