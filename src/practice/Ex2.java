package practice;

public class Ex2 {
    public static void main(String[] args) {
        A r = new C();
        B ref  = (B) r;
        System.out.println(ref.g());
    }
}

class A {
    public int g() {
        return 3;
    }

    private int f() {
        return 0;
    }
}
class B extends A {

    public int g() {
        return f();
    }
    private int f() {
        return 1;
    }
}
class C extends B {
    private int f() {
        return 2;
    }

}