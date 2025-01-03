import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("1", "kei", 38));
        personList.add(new Person("2", "Jihye", 36));
        personList.add(new Person("3", "Jua", 26));

        SortPersonByAge sortPersonByAge = new SortPersonByAge();
        Collections.sort(personList, sortPersonByAge);
        for (Person person : personList) {
            System.out.println("age:" + person.age + " name: " + person.name);
        }
    }
}