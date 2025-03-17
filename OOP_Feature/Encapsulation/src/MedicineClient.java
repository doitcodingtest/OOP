public class MedicineClient {
    public static void main(String[] args) {
        Medicine A = new MedicineA();
       // ((MedicineA) A).count = 10; 직접 count에 접근 불가 => 데이터 보호
        A.add();
        A.add();
        A.add(); // 내부 로직에 의해 약은 더 이상 추가 불가  => 데이터 은닉
        A.eat();
    }
}
