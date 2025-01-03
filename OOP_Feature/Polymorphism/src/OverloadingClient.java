public class OverloadingClient {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        overloading.print(10);
        overloading.print(10.0);
        overloading.print(10, 10);
    }
}