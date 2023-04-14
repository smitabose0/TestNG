package org.example;

import org.testng.annotations.DataProvider;

public class DataClass1
{
    @DataProvider(name="myLoginData")
    public Object[][] getloginData()
    {
        Object[][] data = {{11913062,"Smita","smitabose7826@gmail.com"},{11914321,"Bikash","bikashsharma02082000@gmail.com"}};
        return data;
    }
}
