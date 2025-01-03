abstract  class Car {
    String name;
    int seatNumber;
    int speed;

    abstract void go();
    abstract void back();
    void stop(){
        System.out.println("멈춥니다.");
        this.speed = 0;
    };

    abstract void turboMode();
    abstract void autonomousDriving();
}

