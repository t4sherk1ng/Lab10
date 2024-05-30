package firstDemo;

public abstract class AbstractPerson implements Person, Birthable, Identifiable {
    protected String name;
    private int age;
    private String id;
    private String birthDate;

    protected AbstractPerson(String name, int age, String id, String birthDate) {
        setAge(age);
        setName(name);
        setId(id);
        setBirthDate(birthDate);
    }

    @Override
    public String getName() {
        return name;
    }

    protected void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public String getId() {
        return id;
    }

    protected void setId(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID cannot be empty");
        }
        this.id = id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    protected void setBirthDate(String birthDate) {
        if (birthDate == null || birthDate.isEmpty()) {
            throw new IllegalArgumentException("Birth date cannot be empty");
        }
        this.birthDate = birthDate;
    }
}
