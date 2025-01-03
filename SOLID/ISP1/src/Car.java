public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("자동차가 앞으로 갑니다");
    }

    @Override
    public void fly() {
        System.out.println("??? 난 날지 못하는데요??");
    }
}
