package firstDemo;

import firstDemo.AbstractPerson;

public class Student extends AbstractPerson implements IdentifiableStudent {
    private String studentId;

    public Student(String name, Integer age, String id, String birthDate, String studentId) {
        super(name, age, id, birthDate);
        setStudentId(studentId);
    }

    @Override
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.isEmpty()) {
            throw new IllegalArgumentException("Student ID cannot be empty");
        }
        this.studentId = studentId;
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

    @Override
    protected void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        super.setName(name);
    }

    @Override
    protected void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        super.setAge(age);
    }

    @Override
    protected void setId(String id) {
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("ID cannot be empty");
        }
        super.setId(id);
    }

    @Override
    protected void setBirthDate(String birthDate) {
        if (birthDate == null || birthDate.isEmpty()) {
            throw new IllegalArgumentException("Birth date cannot be empty");
        }
        super.setBirthDate(birthDate);
    }
}
