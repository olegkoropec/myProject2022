interface MyInterface {
    public void eat() ;
}

//public class AbstractClass {
//    public static void main(String[] args) {
//        MyInterface myInterface = new MyInterface() {
//            @Override
//            public void eat() {
//                System.out.println("I eating");
//            }
//        };                  //  ; обовязкова
//      myInterface.eat();
//    }
//}

//------------------------------------------
// із lambda виразом
public class AbstractClass {
    public static void main(String[] args) {
        MyInterface myInterface = () -> System.out.println("I eating");
        myInterface.eat();
    }
}
