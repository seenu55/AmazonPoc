package Runnerclass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import BaseClass.BaseClassAmazon;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\Featureclass\\com.feature",glue ="StepDef", publish = true)

public class RunnerClass extends BaseClassAmazon {
	@BeforeClass
	public static void first() {
		BroswerLaunch();
	}
}
