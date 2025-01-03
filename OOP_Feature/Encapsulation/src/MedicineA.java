public class MedicineA implements Medicine {
    private int count;
    public MedicineA() {
        this.count = 0;
    }
    @Override
    public void eat() {
        System.out.println("A 알약을 "+count+"개 먹었습니다");
        count = 0;
    }
    @Override
    public void add() {
        if(count < 2){
            count++;
            System.out.println("A 알약을 추가합니다");
        }
        else{
            System.out.println("A 알약을 더 이상 추가 할 수 없습니다.");
        }
    }
}
