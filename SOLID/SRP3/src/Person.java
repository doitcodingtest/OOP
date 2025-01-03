import java.util.Comparator;

class Person {
    String id;
    String name;
    int age;

    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class SortPersonByAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}

