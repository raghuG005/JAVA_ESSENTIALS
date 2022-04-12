package ComparableVsComparator;

import java.time.LocalDate;

public class User {

    private String firstName;
    private String lastName;
    private int age;
    private LocalDate dateOfBirth;
    private int cibilScore;

    public User(String firstName, String lastName, int age, LocalDate dateOfBirth, int cibilScore) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cibilScore = cibilScore;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCibilScore() {
        return cibilScore;
    }

    public void setCibilScore(int cibilScore) {
        this.cibilScore = cibilScore;
    }

    @Override
    public String toString() {
        return "User [age=" + age + ", dateOfBirth=" + dateOfBirth + ", firstName=" + firstName + ", lastName="
                + lastName + ", CibilScore =" + cibilScore + "]";
    }

}
