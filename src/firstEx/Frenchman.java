package firstEx;

public class Frenchman extends BasePerson{
    public Frenchman(String name) {
        super(name);
    }

    @Override
    public String getGreeting() {
        return "Bonjour";
    }

    @Override
    public String toString() {
        return getName() + ": " + getGreeting() + "!";
    }
}
