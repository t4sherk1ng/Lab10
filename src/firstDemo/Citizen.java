package firstDemo;

public class Citizen extends AbstractPerson{
    public Citizen(String name, int age, String id, String birthDate){
        super(name, age, id, birthDate);
    }

    @Override
    public String getBitrhDate() {
        return null;
    }
    @Override
    public String getName(){
        return this.getClass().getSimpleName() + ": " + super.name;
    }
    @Override
    public String getID() {
        return null;
    }
}
