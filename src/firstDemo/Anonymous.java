package firstDemo;

public class Anonymous implements Birthable {
    private String birthDate;

    public Anonymous(String birthDate) {
        setBirthDate(birthDate);
    }

    public void setBirthDate(String birthDate) {
        if (birthDate == null || birthDate.isEmpty()) {
            throw new IllegalArgumentException("Birth date cannot be empty");
        }
        this.birthDate = birthDate;
    }

    @Override
    public String getBitrhDate() {
        return null;
    }
}
