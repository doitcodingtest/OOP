package Interface;

public class NormalCar extends Car implements AutonomousDriving {
    @Override
    void go() {
        this.speed += 2;
        System.out.println("보통차가 앞으로 갑니다.");
    }
    @Override
    void back() {
        this.speed = 0;
        this.speed -= 2;
        System.out.println("보통차가 뒤로 갑니다.");
    }
    @Override
    public void ExecuteAutonomousDriving() {
        System.out.println("레벨2 자율 주행 모드로 전환합니다.");
    }
}
