interface Myinterface {
    int x = 15;

    void m1();
}

interface Myinterface1 {
    int y = 20;

    void m2();
}

interface Myinterface2 extends Myinterface, Myinterface1 {
    static void m3() {
        System.out.println("third method");
    }
}

public class InterfaceDemo1 implements Myinterface2 {

    public void m1() {
        System.out.println("first method");
    }

    public void m2() {
        System.out.println("second method");
    }

    // public void m3() {
    // System.out.println("third method");
    // }

    public static void main(String[] args) {
        InterfaceDemo1 obj = new InterfaceDemo1();
        obj.m1();
        int x = 20;
        // System.out.println(x);
        System.out.println(x);
        obj.m2();
        System.out.println(obj.y);
        // obj.m3();
        // System.out.println(obj.y);
        Myinterface2.m3();

    }
}
