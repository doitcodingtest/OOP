public class NormalCar extends Car{
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
    void turboMode() {
        System.out.println("보통차는 터보 모드가 없습니다.");
    }
    @Override
    void autonomousDriving() {
        System.out.println("레벨2 자율주행 모드로 전환합니다.");
    }
}
