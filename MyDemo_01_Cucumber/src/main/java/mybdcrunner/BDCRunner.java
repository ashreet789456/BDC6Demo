package mybdcrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\a.ningayya.salimath\\Selenium week 3\\MyDemo_01_Cucumber\\Demo_01",glue="bdcstepdefinitions",
plugin= {"pretty","html:target/cucumber-html-report","json:target/SriniDemo-JSON-report"})
public class BDCRunner {

	

}
