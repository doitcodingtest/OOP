public class Bus extends Car{
    @Override
    void go() {
        this.speed++;
        System.out.println("버스는 천천히 앞으로 갑니다.");
    }

    @Override
    void back() {
        this.speed = 0;
        this.speed--;
        System.out.println("버스는 천천히 뒤로 갑니다.");
    }

    @Override
    void turboMode() {
        System.out.println("버스는 터보 모드가 없습니다.");
    }

    @Override
    void autonomousDriving() {
        System.out.println("버스는 자율 주행이 불가능 합니다.");
    }
}
