public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10);
        rectangle.setHeight(5);
        System.out.println(rectangle.getArea());

        Rectangle rectangle2 = new Square();
        rectangle2.setWidth(10);
        rectangle2.setHeight(5);
        System.out.println(rectangle2.getArea());
    }
}