public class Overloading {
    void print(int num){
        System.out.println("print int: " + num);
    }

    void print(double num){
        System.out.println("print double: " + num);
    }

    void print(int numA, int numB){
        int sum = numA+numB;
        System.out.println("print plus: " + sum);
    }

}
