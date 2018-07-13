package com.saha.test;

import org.junit.Test;

public class UserLogin_Test extends BaseTest{


    @Test
    public void login() {
        new UserLogin(driver).login();

    }



}
