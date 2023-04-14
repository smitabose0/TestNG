package org.example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Test2
{
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
    void test4()
    {
        System.out.println("This is Test 4");
    }
    @org.testng.annotations.Test
    void test5()
    {
        System.out.println("This is Test 5");
    }
    @org.testng.annotations.Test
    void test6()
    {
        System.out.println("This is Test 6");
    }
}
