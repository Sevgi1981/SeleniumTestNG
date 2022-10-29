package code.HasanLessons.day09wimdowsAndTabs;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class c3_properties_practice {

    @Test
    public void TC1_System_properties(){
        //java has some properties that we can use as system info
        System.out.println(System.getProperty("os.name"));
    }

    @Test
    public void configurationProperties(){
        Properties properties=new Properties();

        //this is a path for properties file
        String pathForPropertiesFile="configuration.properties";
        try {
            //tell compiler to open the file
            FileInputStream fileInputStream=new FileInputStream(pathForPropertiesFile);
            //file need to be load in framework
            properties.load(fileInputStream);
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(properties.getProperty("SmartBear_url"));
        System.out.println(properties.getProperty("SmartBear_username"));

    }

}
