package de.zettsystems.java16_17.pminstanceof;

public class TestClass {
    public static void main(String[] args) {
        B b = new C();
        A a = b;
        if (a instanceof B b1){
            b1.b();
        }
        if (a instanceof C c1){
            c1.c();
        }
        if (a instanceof D d1){
            d1.d();
        }
    }

    static class A {
        void a() {
            System.out.println("a");
        }
    }

    static class B extends A {
        void b() {
            System.out.println("b");
        }
    }

    static class C extends B {
        void c() {
            System.out.println("c");
        }
    }

    static class D extends C {
        void d() {
            System.out.println("d");
        }
    }
}
