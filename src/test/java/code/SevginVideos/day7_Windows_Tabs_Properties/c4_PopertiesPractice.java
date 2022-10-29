package code.SevginVideos.day7_Windows_Tabs_Properties;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class c4_PopertiesPractice {

    @Test
    public void TC1_systemProperties(){
        //java has some ready properties that you can get system info
        //System.out.println("System.getProperties(\"os.name\") = " + System.getProperties(os.name));
        //System.out.println("System.getProperties(\"user.name\") = " + System.getProperties("user.name"));

    }

    @Test
    public void TC2_configurationProperties() throws FileNotFoundException {
         //to be able to make our code understand properties file i need to connect to my file
        Properties properties=new Properties();

        String pathForPropertiesFile="configuration.properties"; // copy-path
        //we need to get path of file either absulate or root

        //we need to tell compiler to open this file
        FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);

        try {
            properties.load(fileInputStream); ////file needs to be loaded in the automation
            //we use load method that comes from Properties class
        } catch (IOException e) {
            e.printStackTrace();
        }

        //now we can read the file
        System.out.println("properties.getProperty(\"SmartBear_url\") = " + properties.getProperty("SmartBear_url"));
        System.out.println("properties.getProperty(\"SmartBear_username\") = " + properties.getProperty("SmartBear_username"));

        //configuration.properties
        //you will need to store important data
        //also changeable data
        //common use for store paths or environment details etc.

    }


}
