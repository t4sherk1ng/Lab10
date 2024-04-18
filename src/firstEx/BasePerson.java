package firstEx;

public abstract class BasePerson implements Person {

    private String name;

    public BasePerson(String name) throws IllegalArgumentException {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Wrong value");
        } else {
            this.name = name;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public abstract String getGreeting();
}
