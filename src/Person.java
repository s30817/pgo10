import java.time.Year;

public abstract class Person {
    private String firstName;
    public String lastName;
    private int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    public int getAge(){
        return Year.now().getValue()-birthdayYear;
    }
}