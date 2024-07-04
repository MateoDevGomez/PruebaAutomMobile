package com.nttdata.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ScrollActions extends UIInteractionSteps {

    private WebDriver driver;

    public ScrollActions(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollDown() {
        Dimension dimension = driver.manage().window().getSize();
        int startX = dimension.width / 2;
        int startY = (int) (dimension.height * 0.8);
        int endX = dimension.width / 2;
        int endY = (int) (dimension.height * 0.2);

        TouchAction touchAction = new TouchAction<>(getProxiedDriver());
        touchAction.press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }
}