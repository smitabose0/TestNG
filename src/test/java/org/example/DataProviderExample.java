package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample
{
    //@DataProvider(name="myLoginData")
    //public Object[][] getloginData()
    //{
    //    Object[][] data = {{11913062,"Smita","smitabose7826@gmail.com"},{11914321,"Bikash","bikashsharma02082000@gmail.com"}};
    //    return data;
    //}

    @Test(dataProvider = "myLoginData" , dataProviderClass = DataClass1.class)
    public void loginForm(int reg, String name, String email)
    {
        System.out.println(reg + " -> " + name + " -> " + email);
    }
}
