package com.mindtree.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features=".//features",
	glue= {"com.mindtree.stepDefinations"}
)
public class HealthCareRunner 
{

	
	
}
