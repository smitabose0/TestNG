package org.example;
import org.testng.annotations.*;

public class Test
{
    @BeforeSuite
    void beforeSuite()
    {
        System.out.println("Before Suite");
    }
    void afterSuite()
    {
        System.out.println("After Suite");
    }
    @BeforeTest
    void beforeTest()
    {
        System.out.println("Before Test Method");
    }
    @AfterSuite
    void afterTest()
    {
        System.out.println("After Test Method");
    }
    @BeforeClass
    void beforeClass()
    {
        System.out.println("This will run before class");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("This will run after class");
    }
    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will run before every method");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("This will run after every method");
    }
    @org.testng.annotations.Test
    void test1()
    {
        System.out.println("This is Test 1");
    }
    @org.testng.annotations.Test
    void test2()
    {
        System.out.println("This is Test 2");
    }
    @org.testng.annotations.Test
    void test3()
    {
        System.out.println("This is Test 3");
    }
}
