public class Overriding {
    public void print(){
        System.out.println("부모 클래스 입니다.");
    }

}
class A extends  Overriding{
    public void print(){
        System.out.println("A 클래스 입니다.");
    }
}
class B extends  Overriding{
    public void print(){
        System.out.println("B 클래스 입니다.");
    }
}
