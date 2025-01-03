public class OverridingClient {
    public static void main(String[] args) {
        Overriding overriding = new Overriding();
        overriding.print();
        Overriding overridingA = new A();
        overridingA.print();
        Overriding overridingB = new B();
        overridingB.print();
    }
}