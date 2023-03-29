class A {
    String name;
    int age;

    void speak() {
        System.out.println("My name is: + name");
    }
}

public class grv {

    public static void main(String[] args) {
        A A1 = new A();

        A1.name = "Roopa";
        A1.age = 22;

        A1.speak();
    }
    
}
