package com.stepdefinition;

import com.utilities.Helper;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void before() {
		Helper.setDriver();
	}
	
	@After
	public void after() {
		Helper.tearDown();
	}

}
