package com.github.achmadns.shopcart.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "src/test/features",
    glue = {"com.github.achmadns.shopcart.cucumber", "cucumber.api.spring"})
public class CucumberTest {
}
