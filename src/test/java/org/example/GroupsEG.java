package org.example;

import org.testng.annotations.Test;

public class GroupsEG
{
    @Test(groups = "regression")
    void method1()
    {
        System.out.println("test 1");
    }
    @Test(groups = "critical")
    void method2()
    {
        System.out.println("test 2");
    }
    @Test(groups = "critical")
    void method3()
    {
        System.out.println("test 3");
    }
    @Test(groups = "regression")
    void method4()
    {
        System.out.println("test 4");
    }
    @Test(groups = {"critical","regression"})
    void method5()
    {
        System.out.println("test 5");
    }
    @Test(groups = "critical")
    void method6()
    {
        System.out.println("test 6");
    }
}
