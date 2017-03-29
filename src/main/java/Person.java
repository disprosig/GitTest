/**
 * Created by kirill.ivankov on 3/28/2017.
 */
public class Person {

    private String name;
    private String lastName;
    private int age;

    public Person(String name, String lastName,int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }
}
