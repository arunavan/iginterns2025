package com.insight;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ LoanTest.class, LoanTest2.class })
public class AllTests {

}
