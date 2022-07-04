
import org.junit.Assert;
import org.junit.Test;


public class CatTest {


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Arianna";
        Double givenAge = 5.5;
        Integer givenHowMany = 2;
        String givenPetType = "Maine Coon";
        String givenSpeak = "meow!";

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);

        // When (we retrieve data from the cat)
        String actualName = cat.getName();
        Double actualAge = cat.getAge();
        Integer actualHowMany = cat.getHowMany();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, actualName);
        Assert.assertEquals(givenAge, actualAge);
        Assert.assertEquals(givenHowMany, actualHowMany);
    }


    @Test
    public void testSetName(){
        //Given (cat data)
        String givenName = "Selena";
        double givenAge = 5.5;
        int givenHowMany = 2;
        String givenPetType = "Maine Coon";
        String givenSpeak = "meow!";

        // When (a cat is constructed, we set a new name for cat, and we retrieve data from said cat)
        Cat cat = new Cat(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        String newName = "Sarabi";
        String actualName = cat.getName();

        //Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, actualName);


    }

    @Test
    public  void testAge() {
        //Given (cat data)
        String givenName = "Bella";
        Double givenAge = 5.5;
        int givenHowMany = 2;
        String givenPetType = "Maine Coon";
        String givenSpeak = "meow!";

        // When
        Cat cat = new Cat(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        cat.setAge(givenAge);
        Double actualAge = cat.getAge();

        // Then
        Assert.assertEquals(givenAge, actualAge);
    }

    @Test
    public void testHowMany() {
        //Given (cat data)
        String givenName = "Taylor";
        double givenAge = 5.5;
        int givenHowMany = 2;
        String givenPetType = "Maine Coon Cat";
        String givenSpeak = "meow!";

        // When
        Cat cat = new Cat(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        cat.setHowMany(givenHowMany);
        int actualHowMany = cat.getHowMany();

        // Then
        Assert.assertEquals(givenHowMany, actualHowMany);
    }

    @Test
    public void testPetType() {
        //Given (cat data)
        String givenName = "Zula";
        double givenAge = 5.5;
        int givenHowMany = 2;
        String givenPetType = "Siamese Cat";
        String givenSpeak = "meow!";

        // When
        Cat cat = new Cat(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        String actualPetType = cat.getPetType();

        // Then
        Assert.assertEquals(givenPetType, actualPetType);
    }

    @Test
    public void testSpeak() {
        //Given (cat data)
        String givenName = "Zula";
        double givenAge = 5.5;
        int givenHowMany = 2;
        String givenPetType = "Bengal Cat";
        String givenSpeak = "meow!";

        //When
        Cat cat = new Cat(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        String actualSpeak = cat.getspeak();


        // Then
        Assert.assertEquals(givenSpeak, actualSpeak);
    }

    @Test
    public void testPetInheritance() {
        //Given (cat data)
        String givenName = "Zula";
        double givenAge = 5.5;
        int givenHowMany = 2;
        String givenPetType = "Maine Coon";
        String givenSpeak = "meow!";

        //When
        Cat cat = new Cat(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);

        // Then
        Assert.assertTrue(cat instanceof Pet);
    }

}

