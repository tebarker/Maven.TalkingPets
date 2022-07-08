
public class Bunny extends Pet {

    public Bunny(String name, double age, int howMany, String petType, String speak) {

        super(name, age, howMany, petType, speak);
    }

    @Override
    public String speak() {
        return "hum hum hum";
    }

    }
