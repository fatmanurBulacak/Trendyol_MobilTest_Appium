package com.saha.test;

import org.openqa.selenium.By;

public interface Constants {


    String btnGender_Female="//android.widget.ImageView[@resource-id='trendyol.com:id/ivFemaleGenderIcon']";

    By btnStartShopping = By.id("trendyol.com:id/button_continue_shopping");

    By btnMyAccount = By.id("trendyol.com:id/tab_account");

    By btnBasketGuestLogin= By.id("trendyol.com:id/btnBasketGuestLogin");

    By txtEmail= By.id("trendyol.com:id/tyValidationTextEmail");
    String email = "fatmanur.bulacak@gmail.com";

    By txtPassword = By.id("trendyol.com:id/tyValidationTextPassword");
    String password = "123456";

    By btnTYLogin = By.id("trendyol.com:id/btnTYLogin");

    By btnNeverSavePassword = By.id("com.google.android.gms:id/credential_save_reject");

    By tabHome = By.id("trendyol.com:id/tab_home");

    By txtSearchBoxId = By.id("trendyol.com:id/edittext_search_view");
    String productName= "jean";

    String productNamePath="//android.widget.TextView[@resource-id='trendyol.com:id/tvCVProductGridBrand']";

    By btnMenu = By.id("trendyol.com:id/imageview_action_start");

    String menuFemale ="//android.widget.ImageView[@resource-id='trendyol.com:id/ivNavigationMenuItemImage']";

    String navigationRightArrow = "//android.widget.ImageView[@resource-id='trendyol.com:id/ivNavigationRightArrow']";

    String ivnavigationRightArrow = "//android.widget.ImageView[@resource-id='trendyol.com:id/ivNavigationRightArrow']";

    String addProductFav ="//android.widget.CheckBox[@resource-id='trendyol.com:id/cbCVProductGridFav']";

    By btnFavourites = By.id("trendyol.com:id/tab_favorites");
}