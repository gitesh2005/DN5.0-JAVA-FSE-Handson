package WEEK1.AdvanceJunit5Testing.TestSuitesandCategories;

import WEEK1.AdvanceJunit5Testing.EvenChecker.EvenCheckerTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        SampleTestOne.class,
        SampleTestTwo.class,
        EvenCheckerTest.class
})
public class AllTests {
}