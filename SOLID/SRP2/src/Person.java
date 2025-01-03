class Person implements Comparable<Person>{
    String id;
    String name;
    int age;

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
