package Interface;

public class SuperCar extends Car implements TurboMode, AutonomousDriving {
    @Override
    void go() {
        this.speed += 2;
        System.out.println("슈퍼카가 앞으로 갑니다.");
    }
    @Override
    void back() {
        this.speed = 0;
        this.speed -= 2;
        System.out.println("슈퍼카가 뒤로 갑니다.");
    }
    @Override
    public void ExecuteAutonomousDriving() {
        this.speed += 4;
        System.out.println("터보 모드가 설정되었습니다.");
    }

    @Override
    public void ExecuteTurboMode() {
        System.out.println("레벨3 자율 주행 모드로 전환합니다.");
    }
}
