public class Airplane implements Flyable{
    @Override
    public void go() {
        System.out.println("비행기가 앞으로 갑니다");
    }

    @Override
    public void fly() {
        System.out.println("비행기가 하늘을 날아갑니다");
    }
}
