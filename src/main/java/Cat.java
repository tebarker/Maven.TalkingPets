public class Cat extends Pet {

    public Cat (String name, double age, int howMany, String petType, String speak) {

        super(name, age, howMany, petType, speak);

    }
    @Override
    public String speak() {
        return "meow!";
    }


    }
