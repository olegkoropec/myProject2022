public class ClassAExtendB {
    public static void main(String[] args) {
        A a = new A();
        A aB = new B();
        B b = new B();
//        System.out.println("a i: " + a.i);
//        System.out.println("a metodMath(): " + a.metodMath());
//        System.out.println("a metodA(): " + a.metodA());

        System.out.println("aB metodMath(): " + aB.metodMath());
        System.out.println("aB metodA(): " + aB.metodA());
        System.out.println("aB y: " + aB.y);
        System.out.println("aB i: " + aB.i);

//        System.out.println("b: " + b.name);
//        System.out.println("b metodA(): " + b.metodA());
//        System.out.println("b metodMath(): " + b.metodMath());
//        System.out.println("b: " + b.i);

    }

}
class A {
    int i = 5;
    double y =  2.27;
    int metodA(){
        return 1999;
    }
    double metodMath(){
        return 1999;
    }
}

class B extends A {
    int i = 25;
    double y = 3.14;
    String name = "Oleh";

    int metodB(){
        return 2999;
    }
    String metodStringB(){
        return name;
    }
    double metodMath(){
        return 2999;
    }
}

