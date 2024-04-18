package firstEx;

public class British extends BasePerson{
    public British(String name) {
        super(name);
    }

    @Override
    public String getGreeting() {
        return "Hello";
    }

    @Override
    public String toString() {
        return getName() + ": " + getGreeting() + "!";
    }
}
