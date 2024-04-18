public class Russian extends BasePerson{
    public Russian(String name) {
        super(name);
    }

    @Override
    public String getGreeting() {
        return "Привет";
    }

    @Override
    public String toString() {
        return getName() + ": " + getGreeting() + "!";
    }
}
