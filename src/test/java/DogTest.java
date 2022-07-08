import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Arianna";
        Double givenAge = 5.5;
        Integer givenHowMany = 2;
        String givenPetType = "Boston Terrier";
        String givenSpeak = "meow!";

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);

        // When (we retrieve data from the cat)
        String actualName = dog.getName();
        Double actualAge = dog.getAge();
        Integer actualHowMany = dog.getHowMany();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, actualName);
        Assert.assertEquals(givenAge, actualAge);
        Assert.assertEquals(givenHowMany, actualHowMany);
    }


    @Test
    public void testSetName(){
        //Given (dog data)
        String givenName = "Charles";
        double givenAge = 3;
        int givenHowMany = 2;
        String givenPetType = "Afghan Hound";
        String givenSpeak = "woof!";

        // When (a dog is constructed, we set a new name for cat, and we retrieve data from said dog)
        Dog dog = new Dog(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        String newName = "Benni";
        String actualName = dog.getName();

        //Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, actualName);


    }

    @Test
    public  void testGetAge() {
        //Given (dog data)
        String givenName = "Bella";
        Double givenAge = 2.0;
        int givenHowMany = 2;
        String givenPetType = "Blood Hound";
        String givenSpeak = "woof";

        // When
        Dog dog = new Dog(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        dog.setAge(givenAge);
        Double actualAge = dog.getAge();

        // Then
        Assert.assertEquals(givenAge, actualAge);
    }

    @Test
    public void testHowMany() {
        //Given (dog data)
        String givenName = "Carlos";
        double givenAge = 7;
        int givenHowMany = 3;
        String givenPetType = "Labradoodle";
        String givenSpeak = "woof";

        // When
        Dog dog = new Dog(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        dog.setHowMany(givenHowMany);
        int actualHowMany = dog.getHowMany();

        // Then
        Assert.assertEquals(givenHowMany, actualHowMany);
    }

    @Test
    public void testPetType() {
        //Given (dog data)
        String givenName = "Max";
        double givenAge = 1;
        int givenHowMany = 1;
        String givenPetType = "Pit Bull";
        String givenSpeak = "woof!";

        // When
        Dog dog = new Dog(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        String actualPetType = dog.getPetType();

        // Then
        Assert.assertEquals(givenPetType, actualPetType);
    }

    @Test
    public void testSpeak() {
        //Given (dog data)
        String givenName = "Checko";
        double givenAge = 5.5;
        int givenHowMany = 2;
        String givenPetType = "Retriever";
        String givenSpeak = "woof!";

        //When
        Dog dog = new Dog(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);

        String actualSpeak = dog.getspeak();


        // Then
        Assert.assertEquals(givenSpeak, actualSpeak);
    }

    @Test
    public void testPetInheritance() {
        //Given (dog data)
        String givenName = "Zula";
        double givenAge = 5.5;
        int givenHowMany = 2;
        String givenPetType = "Labrador";
        String givenSpeak = "woof!";

        //When
        Dog dog = new Dog(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);

        // Then
        Assert.assertTrue(dog instanceof Pet);
    }

}



