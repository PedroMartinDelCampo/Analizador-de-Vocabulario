/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.vocabulario.tests.selenium;

import org.junit.Test;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Pedro
 */
public class VerificarInstalacion {
    
    @Test
    public void verificarRuta() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/instalacion");
        try {
            WebDriverWait waitForPage = new WebDriverWait(driver, 10);
        } catch (TimeoutException tex) {
            driver.quit();
        }
    }
    
}
