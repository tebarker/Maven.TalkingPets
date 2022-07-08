import org.junit.Assert;
import org.junit.Test;

public class BunnyTest {

    @Test
    public void constructorTest() {
        // Given
        String givenName = "Ayrton";
        Double givenAge = 5.5;
        Integer givenHowMany = 2;
        String givenPetType = "English Lop";
        String givenSpeak = "hum hum hum";

        // When
        Bunny bunny = new Bunny(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);

        // When
        String actualName = bunny.getName();
        Double actualAge = bunny.getAge();
        Integer actualHowMany = bunny.getHowMany();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, actualName);
        Assert.assertEquals(givenAge, actualAge);
        Assert.assertEquals(givenHowMany, actualHowMany);
    }

    @Test
    public void testSetName() {
        //Given
        String givenName = "Louis";
        double givenAge = 3;
        int givenHowMany = 2;
        String givenPetType = "Holland Lop";
        String givenSpeak = "hum hum hum";

        // When
        Bunny bunny = new Bunny(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        String newName = "Benni";
        String actualName = bunny.getName();

        //Then
        Assert.assertEquals(givenName, actualName);
    }

    @Test
    public  void testGetAge() {
        //Given
        String givenName = "Bella";
        Double givenAge = 2.0;
        int givenHowMany = 2;
        String givenPetType = "American Fuzzy Lop";
        String givenSpeak = "hum hum hum";

        // When
        Bunny bunny = new Bunny(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        bunny.setAge(givenAge);
        Double actualAge = bunny.getAge();

        // Then
        Assert.assertEquals(givenAge, actualAge);
    }
    @Test
    public void testHowMany() {
        //Given
        String givenName = "Carlos";
        double givenAge = 7;
        int givenHowMany = 3;
        String givenPetType = "Lion Head";
        String givenSpeak = "hum hum hum";

        // When
        Bunny bunny = new Bunny(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        bunny.setHowMany(givenHowMany);
        int actualHowMany = bunny.getHowMany();

        // Then
        Assert.assertEquals(givenHowMany, actualHowMany);
    }
    @Test
    public void testSetPetType() {
        //Given
        String givenName = "Max";
        double givenAge = 1;
        int givenHowMany = 1;
        String givenPetType = "Angora Rabbit";
        String givenSpeak = "hum hum hum";

        // When
        Bunny bunny = new Bunny(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);
        String actualPetType = bunny.getPetType();

        // Then
        Assert.assertEquals(givenPetType, actualPetType);
    }

    @Test
    public void testSpeak() {
        //Given (dog data)
        String givenName = "Checko";
        double givenAge = 5.5;
        int givenHowMany = 2;
        String givenPetType = "Dwarf Hotot";
        String givenSpeak = "hum hum hum";

        //When
       Bunny bunny = new Bunny(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);

        String actualSpeak = bunny.getspeak();

        // Then
        Assert.assertEquals(givenSpeak, actualSpeak);
    }

    @Test
    public void testPetInheritance() {
        //Given (dog data)
        String givenName = "Zula";
        double givenAge = 5.5;
        int givenHowMany = 2;
        String givenPetType = "Polish Rabbit";
        String givenSpeak = "hum hum hum";

        //When
        Bunny bunny = new Bunny(givenName, givenAge, givenHowMany, givenPetType, givenSpeak);

        // Then
        Assert.assertTrue(bunny instanceof Pet);
    }

}
