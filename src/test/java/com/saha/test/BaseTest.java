package com.saha.test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    protected AndroidDriver<MobileElement> driver;

    @Before
    public void setup() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus");
        capabilities.setCapability("appPackage", "trendyol.com");
        capabilities.setCapability("appActivity", "trendyol.com.ui.startup.ActivitySplash");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);

        driver = new AndroidDriver<MobileElement>(new URL("http://0127.0.0.1:4723/wd/hub"), capabilities);
        //Serverın adresi ne ise onu yaz. Tarayıcının yerini tutuyor.
    }


    @After
    //Uygulamayı kapatıyor
    public void tearDown() {
      //  driver.quit();
    }



}
