interface A {
    void display();
}

class B implements A {
    @Override
    public void display() {
        System.out.println("B's method");
    }
}

class C extends B {
    public void callMe() {
        System.out.println("C's method");
    }
}

class InterfaceDemo {
    public static void main(String[] args) {
        C c1 = new C();    // Create an object of class C
        c1.display();      // Calls the display method from class B
        c1.callMe();       // Calls the callMe method from class C
    }
}
