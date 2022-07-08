public abstract class Pet {

    private String name;
    private double age;
    private String petType;
    private int howMany;

    String speak;


    public Pet (String name, double age, int howMany, String petType, String speak) {
        this.name = name;
        this.age = age;
        this.petType = petType;
        this.howMany = howMany;
        this.speak = speak;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }


    public Integer getHowMany() {
        return howMany;
    }

    public void setHowMany(int howMany) {
        this.howMany = howMany;
    }

    public void setPetType(String petType){
        this.petType = petType;
    }

    public String getPetType(){
        return petType;
    }

    public String getspeak() {
        return speak;
    }

    public abstract String speak();
}


