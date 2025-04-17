public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("자동차가 앞으로 갑니다");
    }
    // 더이상 필요 없는 fly 함수는 구현하지 않아도 됩니다
}
