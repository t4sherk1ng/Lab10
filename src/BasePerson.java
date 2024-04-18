public class BasePerson implements Person {

    private String name;

    public BasePerson(String name) throws IllegalArgumentException {
        if (name.isBlank()) {
            throw new IllegalArgumentException("Wrong name");
        } else {
            this.name = name;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGreeting() {
        return null;
    }
}
