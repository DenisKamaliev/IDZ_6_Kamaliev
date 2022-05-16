import java.util.Objects;

public class Human {

    String firstName;
    String secondName;
    String fatherName;
    int age;

    public Human(String firstName, String secondName, String fatherName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(firstName, human.firstName) && Objects.equals(secondName, human.secondName) && Objects.equals(fatherName, human.fatherName) && Objects.equals(age, human.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, fatherName, age);
    }
}
