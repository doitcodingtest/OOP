public class MedicineClient {
    public static void main(String[] args) {
        Medicine A = new MedicineA();
       // ((MedicineA) A).count = 10; 직접 count를 접근 할 수 없습니다. => 데이터 보호
        A.add();
        A.add();
        A.add(); //client에서는 add를 하였지만 은닉된 내부 로직에 의해 약은 더 추가 되지 않습니다 => 데이터 은닉
        A.eat();
    }
}
