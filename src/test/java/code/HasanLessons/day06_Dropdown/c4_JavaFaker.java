package code.HasanLessons.day06_Dropdown;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class c4_JavaFaker {

    @Test
    public void JavaFaker () {

        // in order to use Java Faker Library you need to create an instance of JavaFaker
        Faker faker= new Faker();
        System.out.println("name: "+faker.name().fullName());
        System.out.println("first name: "+faker.name().firstName());
        System.out.println("adress: "+faker.address().cityName());
        System.out.println(faker.gameOfThrones().dragon());
        System.out.println(faker.animal().name());


    }
}
